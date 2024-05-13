package com.satish.cricutassesment

fun main() {
    // Create an in-memory file system
    val fileSystem = InMemoryFileSystem()

    // Create a file
    fileSystem.createFile("/temp/example.txt", "Example".toByteArray())

    // Read the file
    val fileContent = fileSystem.readFile("/temp/example.txt")
}

class InMemoryFileSystem {
    private val rootDirectory = Directory("/")

    fun createFile(path: String, content: ByteArray) {
        val directory = getDirectory(path.substringBeforeLast("/"))
        val filename = path.substringAfterLast("/")
        directory.files[filename] = File(filename, content)
    }

    fun readFile(path: String): ByteArray? {
        val directory = getDirectory(path.substringBeforeLast("/"))
        val filename = path.substringAfterLast("/")
        return directory.files[filename]?.content
    }

    private fun getDirectory(path: String): Directory {
        var currentDirectory = rootDirectory
        for (directoryName in path.split("/")) {
            currentDirectory = currentDirectory.subDirectories[directoryName]
                ?: throw IllegalArgumentException("Directory not found: $path")
        }
        return currentDirectory
    }
}

class Directory(val name: String) {
    val files = mutableMapOf<String, File>()
    val subDirectories = mutableMapOf<String, Directory>()
}

class File(val name: String, val content: ByteArray)
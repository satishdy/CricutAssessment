package com.satish.cricutassesment

/*
 Sealed class ensures type safety.
 */
sealed class BinaryTree {
    // Represents any node
    data class Node(
        val value: Int,
        val leftNode: BinaryTree,
        val rightNode: BinaryTree
    ) : BinaryTree()

    // Represents empty node or end of tree
    data object EmptyTree : BinaryTree()
}

fun main() {
    // Example Usage
    val emptyTree = BinaryTree.EmptyTree
    val rootNode = BinaryTree.Node(
        10,
        BinaryTree.Node(
            20,
            emptyTree,
            emptyTree
        ),
        BinaryTree.Node(
            30,
            emptyTree,
            emptyTree
        )
    )

    println(rootNode.value)
    println(rootNode.leftNode.toString())
    println(rootNode.rightNode.toString())
}
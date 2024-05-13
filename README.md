
# Cricut Assessment

Test Assessment for Cricut

1. BinaryTree

   Refer BinaryTree.kt in com.satish.cricutassesment
   Uses a sealed class for Type Safety. Takes value as int parameter
   and two nodes for left and right.

2. FileSystem

   Refer InMemoryFileSystem.kt in com.satish.cricutassesment

   Data Structure:

        Directory - Stores names and meta data of files and subdirectories. It can be implemented using a HashMap.
        File - Stores actual content of a file. It can be implemented using a Byte array.


    Algorithm:

        File Allocation - Allocating memory for File Strorage can be done contiguous block of memory for small files, linked or indexed allocation into multiple blocks liked or indexed for large files.

        File Access: Files can be accessed providing index or keys.

        Traversing the Directory: The directory can be traversed level by level starting from root or recursively.

3. Tic Tac Toe Win
   
   Refer TicTacToe.kt in com.satish.cricutassesment

    * Assumptions - Tic Tac Toe has 9 avaiable slots for input.
    * Assign each slot a unique identification (for eg. row number and column number)
    * Create a lookup of all wining combinations. There will be 8 winning cobinations of slots. 3 for all rows same, 3 for all columns same and 2 for diagonal sots.
    * When user enters a slot store them in String array (for eg "01" represents 1st row and 2nd column).
    * Add the entry to array everytime user enter the inputs and sort the array each time.
    * Join the the array elements to form a string and compare if any value from winning combination exists in that string.
    * If the formed string matches the winning combination return true and exit the loop. 


# Selection Sort
- **Time Complexity**: O(n^2) - quadratic time.
- **Space Complexity**: O(1) - constant space.
- **Use Case**: Ideal for educational purposes and small datasets. Not recommended for large lists.
- **Algorithm**: Continuously finds the minimum element in an array and exchanges it with the first unsorted element. Repeat until the array is sorted. Great for understanding sorting concepts.


# Bubble Sort
- **Time Complexity**: O(n^2) - quadratic time.
- **Space Complexity**: O(1) - constant space.
- **Use Case**: Primarily for educational purposes and small datasets. Not recommended for large lists.
- **Algorithm**: Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order, gradually moving the largest elements to the end. This process continues until the entire array is sorted.
- **Details**: Bubble Sort is valuable for teaching sorting concepts and algorithmic analysis. However, it's not practical for real-world applications with large datasets.


# Insertion Sort
- **Time Complexity**: O(n^2) - quadratic time.
- **Space Complexity**: O(1) - constant space.
- **Use Case**: Primarily for educational purposes and small datasets. Not recommended for large lists.
- **Algorithm**: Insertion Sort builds the sorted portion of the array one element at a time. It iterates through the unsorted portion and repeatedly takes an element from there and inserts it into the correct position in the sorted portion. This process continues until the entire array is sorted.
- **Details**: Insertion Sort is a fundamental sorting algorithm often used for teaching sorting concepts and basic algorithmic analysis. It's simple to understand and implement, making it a valuable tool for educational purposes. However, like Bubble Sort, it's not efficient for sorting large datasets in real-world applications. It excels when dealing with nearly sorted data or small lists but becomes inefficient as the input size grows due to its quadratic time complexity.
- **note**: Swapping is not done here, shifting and inserting is done here .



# Merge Sort

- **Time Complexity**: O(n log n) - linearithmic time.
- **Space Complexity**: O(n) - linear space.
- **Use Case**: Suitable for both educational purposes and real-world applications, especially for large datasets.
- **Algorithm**: Merge Sort is a divide-and-conquer algorithm. It divides the unsorted array into smaller subarrays, recursively sorts each subarray, and then merges them to produce a sorted array.
- **Details**: Merge Sort is a highly efficient sorting algorithm with a time complexity of O(n log n). It is widely used for sorting large datasets in real-world applications. Merge Sort's divide-and-conquer approach and stable sorting make it a dependable choice when sorting efficiency is critical. While it consumes more memory compared to some other sorting algorithms, its performance benefits often outweigh this drawback, especially when dealing with sizable datasets. Merge Sort's efficiency makes it a staple in software development for various applications, including sorting, searching, and data manipulation tasks.

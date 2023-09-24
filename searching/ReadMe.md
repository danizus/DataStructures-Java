## Binary Search

Binary search is an efficient algorithm used for finding a specific element in a sorted collection (e.g., an array). It works by repeatedly dividing the search interval in half, eliminating half of the remaining elements in each step, until the target element is found or determined to be absent. Binary search has a time complexity of O(log n), making it significantly faster than linear search for large datasets.

### How Binary Search Works
**use start + (end - start)/2 to find the mid this function will not throw error if the start and end values are more than the integer limit**

1. Compare the target value with the middle element of the array.
2. If they are equal, the search is successful.
3. If the target value is less than the middle element, continue the search on the lower half of the array.
4. If the target value is greater than the middle element, continue the search on the upper half of the array.
5. Repeat the process until the target is found or the search interval becomes empty.

## Linear Search

Linear search, also known as sequential search, is a straightforward algorithm used to find a specific element in an unsorted or sorted collection of data. It works by iterating through the entire collection, checking each element one by one until the target element is found or the end of the collection is reached. Linear search has a time complexity of O(n).

### How Linear Search Works

1. Start from the beginning of the collection (array).
2. Compare the target value with the current element.
3. If they are equal, the search is successful.
4. If not, move to the next element in the collection.
5. Repeat steps 2-4 until the target is found or the end of the collection is reached.

## Implementation

In this repository, you will find sample implementations of both binary search and linear search in Java.

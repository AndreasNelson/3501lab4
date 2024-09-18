# 3501lab4

## How to Run the Code
To run the code, execute the `Main.java` file. You can provide the test input as an array using the scanner in the terminal.

## Efficiency Analysis
The provided code achieves polynomial efficiency primarily due to its core algorithm that pairs items for optimal bin packing. 

1. **Sorting Step**: 
   - The input array is first sorted, time complexity of O(n log n).

2. **Pairing Process**: 
   - It iteratively pairs the largest unpaired item with a suitable item from the middle of the array, to fit their sum within a bin. 
   - This pairing process has a worst-case time complexity of O(n^2).

Therefore, the overall time complexity is dominated by the sorting step, resulting in a polynomial efficiency of O(n log n + n^2).
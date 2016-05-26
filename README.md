# 자료구조 마지막 과제
마지막 버닝해봐요 ><
## 과제 가이드라인
1. Bubble sort
2. Selection sort
3. Insertion sort   // 서현
4. Shell sort: Marcin Ciura’s increment 1, 4, 10, 23, 57, 132, 301, 701, 1750
5. Shell sort: Hibbard’s increment: 1, 22-1, 23-1, ..., 2k-1 – 1, 2k-1
6. Shell sort: Knuth’s increment: 1, 4, 13, 40, 121, 364, ... // (3h+1)
7. Heap sort
8. Quick sort  //서현
9. Tuned1 quick sort
10. 3-Way Quick sort (Dutch flag version)
11. Recursive merge sort //서현
12. Tuned recursive merge sort
13. Iterative merge sort
14. Tuned iterative merge sort
15. Radix sort (Least Significant Digit) R=256, d=4
16. Radix sort (Most Significant Digit) R=256, d=4
For (9), (12), and (14), you should determine the CUT_SIZE for each test case empirically.


##input
[Input]
Type 1 - Generate 20 test cases for each of sizes 10,000, 100,000, and 1,000,000 using the Knuth’s Random Shuffling method. (No duplicates in this type)
1 “TunedTunedTunedTuned ” means that you use means that you use means that you use means that you use means that you use means that you use means that you use means that you use all improvement methods all improvement methodsall improvement methods all improvement methodsall improvement methodsall improvement methodsall improvement methods all improvement methodsall improvement methods all improvement methods all improvement methodsall improvement methodsall improvement methods for sorting.for sorting.for sorting.for sorting.for sorting.for sorting.for sorting.for sorting. for sorting.for sorting.for sorting.
2
Type 2 - Generate randomly 20 test cases for each of sizes 10,000, 100,000, and 1,000,000 with lots of duplicate keys using the Knuth’s Random Shuffling method.
Type 3 - Generate 20 test cases for each of sizes 10,000, 100,000, and 1,000,000, each of which is almost sorted, by adding clogn unordered elements to the already sorted subarray, where n is the input size and c is a constant. . (No duplicates in this type)
Type 4 - Generate 1 test case for each of sizes 10,000, 100,000, and 1,000,000, each of which is reversely sorted.
Type 5 - Generate 1 test case for each of sizes 9,999, 99,999, and 999,999, each of which is the pipe organ input; that is, 1, 2, 3, 4, …, n-1, n, n-1, …, 4, 3, 2, 1.

For each type of input, measure the average CPU times for all the test cases for each size.

** not sorting 해야해요!

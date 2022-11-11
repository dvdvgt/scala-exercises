# scala-exercises

Below you can find the problem descriptions for the three given problems. They are roughly ordered by increasing difficulty. Solve one problem of your liking, create a new branch and open a pull request on the Github repository with your solution. You can check whether your solution is correct by starting `sbt` and running `testOnly BstTest`, for example, if you want to check your solution for the binary search tree. You can also let the tests run continiously after each change to the file with `~testOnly BstTest`.

# Collatz Conjecture

The Collatz Conjecture or 3x+1 problem can be summarized as follows:

Take any positive integer n. If n is even, divide n by 2 to get n / 2. If n is odd, multiply n by 3 and add 1 to get 3n + 1. Repeat the process indefinitely. The conjecture states that no matter which number you start with, you will always reach 1 eventually.

Given a number n, return the number of steps required to reach 1.

### Example

Starting with n = 12, the steps would be as follows:

1. 12
2. 6
3. 3
4. 10
5. 5
6. 16
7. 8
8. 4
9. 2
10. 1

Resulting in 9 steps. So for input n = 12, the return value would be 9.

---

# Luhn 

Given a number determine whether or not it is valid per the Luhn formula.

The Luhn algorithm is a simple checksum formula used to validate a variety of identification numbers, such as credit card numbers and Canadian Social Insurance Numbers.

The task is to check if a given string is valid.

### Validating a Number

Strings of length 1 or less are not valid. Spaces are allowed in the input, but they should be stripped before checking. All other non-digit characters are disallowed.

### Example 1: valid credit card number

`4539 3195 0343 6467`

The first step of the Luhn algorithm is to double every second digit, starting from the right. We will be doubling

`4_3_ 3_9_ 0_4_ 6_6_`

If doubling the number results in a number greater than 9 then subtract 9 from the product. The results of our doubling:

`8569 6195 0383 3437`

Then sum all of the digits:

`8+5+6+9+6+1+9+5+0+3+8+3+3+4+3+7 = 80`

If the sum is evenly divisible by 10, then the number is valid. This number is valid!

### Example 2: invalid credit card number


`8273 1232 7352 0569`

Double the second digits, starting from the right

`7253 2262 5312 0539`

Sum the digits

`7+2+5+3+2+2+6+2+5+3+1+2+0+5+3+9 = 57`

57 is not evenly divisible by 10, so this number is not valid.

---

# Binary Search Tree

A binary search tree consists of a series of connected nodes. Each node contains a piece of data (e.g. the number 3), a variable named `left`, and a variable named `right`. The `left` and `right` variables point at nil, or other nodes. Since these other nodes in turn have other nodes beneath them, we say that the `left` and `right` variables are pointing at subtrees. All data in the left subtree is less than or equal to the current node's data, and all data in the right subtree is greater than the current node's data.

### Example

For example, if we had a node containing the data 4, and we added the data 2, our tree would look like this:

```
  4
 /
2
```

If we then added 6, it would look like this:

```
  4
 / \
2   6
```

If we then added 3, it would look like this

```
   4
 /   \
2     6
 \
  3
```

And if we then added 1, 5, and 7, it would look like this

```
      4
    /   \
   /     \
  2       6
 / \     / \
1   3   5   7
```

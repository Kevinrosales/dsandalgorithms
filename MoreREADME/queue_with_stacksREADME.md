# Implement a Queue using two Stacks.
Code challenge for 12/10/2018 401 Java
## Challenge
For this code challenge we where tasked with creating two stack lists and mimicking a queue but with using the methods
from stacks.
## Approach & Efficiency
My approach to this problem was to have one of my stacked list be a regular one and then have another on that would be a
copy of the original one but in reverse. that way it would seem when they push to the first one it would also push to
reversed one and then return the reversed list and it would seem as it is a queue instead of a stack. the Big O for
space & time on this approach is O(1).

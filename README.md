stackandqueue
=============

University of New Orleans Software Design I Homework 7 – Stacks and Queues

#### Class Stack:
Everything added will be pushed onto the top of the stack and everything removed will be popped from the top. The underlying data structure for this stack is an Array. The array will store Strings. Stack has five methods: push, pop, peek, isEmpty, and size. Push accepts as a parameter a String and adds it to the top of the stack. Pop removes the element from the top of the stack and returns it. Peek returns the element at the top of the stack without removing it. isEmpty returns a Boolean that is true is there are no element in the stack. Size returns the number of elements in the stack. The array dynamically expands as you push more elements onto the stack.

#### Class Queue:
Everything is added to the back of the queue and everything is removed from the front. As above, the underlying data structure is an Array that stores Strings. Queue has five methods: add remove, peek, isEmpty, and size. Add accepts as a parameter a String and adds it to the back of the queue. Remove removes and returns the element at the front of the queue. Peek returns the element at the front of the queue without removing it. isEmpty and size are the same as they are in Stack.

#### Testing:
StackAndQueue.java is a test program that ensures every method is working properly. It tests normal cases, boundary cases, what happens during an attempt to pop an element off an empty stack, what happens during an attempt to add more elements to the queue than the default size of the array, and ensures everything is working.

# codingTestforFossil

**16-Feb-2020**
Author: **Hoang Nguyen**
Project: **Coding Test**

Java: JDK-8
IDE: NetBeans 8.1

# Exercise 1: Using as many as principles from OOP, design program and call run() of two cars.

- Branch: **Exercise1**
- Pull request: https://github.com/hoangnguyen1810/codingTestforFossil/pull/1
> Description: 
> Create class Car to encapsulate 4 attributes (wheels, doors, seats, maxSpeed) and 2 methods run(loops 10 times print out maxSpeed), showInfo(list out all chracteristics of the car)

# Exercise 2: Using Runnable interface

- Branch: **Exercise2**
- Pull request: https://github.com/hoangnguyen1810/codingTestforFossil/pull/2
> Description: 
> Implement Runnable interface and override method run(). Put 2 cars in the thread.

# Exercise 3: Why the output of Exercise 2 different Exercise 1. Produce the order like Exercise 1.

- Branch: **Exercise3**
- Pull request: https://github.com/hoangnguyen1810/codingTestforFossil/pull/3
> Description: 
> + The results of exercise 2 will be different after each run. Because of running asynchronustly using thread. 
> + Use Thread.join# Exercise 4: Flip-flop output maxSpeed of 2 cars

- Branch: **Exercise4**
- Pull request: https://github.com/hoangnguyen1810/codingTestforFossil/pull/4
> Description: 
> Set LOCK variable to control order output of thread.
    + TOYOTA_RUNNING: LOCK = 0
    + BMW_RUNNING: LOCK = 1
    Using while loop for waiting for execute turn.
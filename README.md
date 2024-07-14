# Project Five: BFS and DFS Algorithms
* Austin Howard
* 2024U_CSCI251_VA - Data Structures
* July 13, 2024
* Instructor: Leticia Rabor

## Project Description
In this project, students are required to implement two methods for MyGraph: Breadth-first Search and 
Depth-first Search. The main class, CSCI463ProjFive, is already implemented by the professor and has not been modified. 
Similarly, constructors and other methods not required for implementing BFS or DFS in MyGraph remain unchanged from what
was provided by the instructor.

The goal of this project is to implement and interact with user-defined Graphs using Java. It demonstrates the 
importance theoretical concepts (as opposed to focusing on the practical side) of computer science.

The instructor has provided a rigid class and method structures that I must work within. I have defined these to match
the project requirements listed below.

## Lecturer's Notes
### Project Requirements
The purpose of this project is to reinforce the students’ knowledge on graphs. The students will implement the Breadth 
First Search and Depth First Search for the graph.

The graph will be a directed weighted graph represented in an adjacency matrix form. We assume that all weights are 
positive integers. The graph will be initialized from the keyboard. When the students input the graph of n vertices, 
the students actually input an n by n matrix.

The matrix represents a simple directed weighted graph. There is no loop at any vertex. No more than one edge from one 
vertex to another vertex. The vertices are numbered as 1, 2, ..., n. The graph with n vertices is represented by an 
(n+1) by (n+1) matrix with row 0 and column 0 unused.

The entry on row i and column j is the weight of the edge from vertex i to vertex j. For instance, if there is an edge 
of weight 8 from vertex i to vertex j (i != j), then the entry on row i column j of the matrix will be 8. We assume 
that all weights are positive integers. If there is no edge from vertex i to vertex j (i != j), then the user will 
input 0 for the entry on row i column j of the matrix. However, the given code will automatically change that entry to 
be Integer.MAX_VALUE.

Two files are given. The one named CSCI463ProjFive.java cannot be modified. However, the students should understand it. 
The one named MyGraph needs to be implemented. In fact, there are only two methods in this file that need to be 
implemented. The students shall read the description of each method and implement the method accordingly. No method 
declarations can be changed. No other public interfaces can be added.

The students may run the executable jar file to see how the finished project should run. In this implementation, when 
there is more than one choice of the vertices, it chooses the one marked with a lower number first.

### Example Run
Suppose the graph is following: [NOT SHOWN]  

For this graph, the student can view it as a directed weighted graph. Each edge has two directions. On each direction, 
the weight is 1. So the array input will be:

    0 1 0 0 1 0
    1 0 1 0 1 0
    0 1 0 1 0 0
    0 0 1 0 1 1
    1 1 0 1 0 0
    0 0 0 1 0 0

* If we run the BFS algorithm with startVertex 6, then the output should be 6, 4, 3, 5, 2, 1.  
* If we run the DFS algorithm with startVertex 6, then the output should be 6, 4, 3, 2, 1, 5.

## License
Uses GNU GPL v3.0  
Please see license in main branch.
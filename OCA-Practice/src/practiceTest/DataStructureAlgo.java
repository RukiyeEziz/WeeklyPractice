package practiceTest;

public class DataStructureAlgo {
	//sum of first n natural numbers 
	// constant, log, linear, log-linear, quadratic, exponential, factorial
	int solution1(int n) {
		// O(n^2)
		//f(n)=
		int sum = 0;						// int sum // sum = 0
		for(int i = 1; i <= n; i++) {		// int i // i = 1 // i <= n //
			for(int j = 1; j <= i; j++) {	//int j // j = 1 // j <= i
				sum++;						// sum++ // j++ // i++
			}
		}
		return sum;
	}
	
	int solution2(int n) {
		// O(n)
		//f(n) = 3n+4
		int sum = 0;						// int sum // sum = 0
		for(int i = 1; i <= n; i++) {		// int i // i = 1 // i <= n //
				sum = sum + i;;				// sum + i  // sum += i // i++		
		}
		return sum;
	}
	
	int solution3(int n) {
		//f(n) = 3;
		return n * (n + 1) / 2;				// addition // then multiplication  // then division
	}

	public static void main(String[] args) {				
		// type of algorithm - recursive, greedy, divide and conquer, branch and bound, backtracking
		// data structure
		// linear structure - arrays, list, stacks
		// tree strtucture - binary tree, heaps, ties
		// hashed strusture - hashlist, hashmap, hashtable, hashset
		// graphs - adjacency matrix, adjacency list
		
		//Arrays - has fixed number of elements, accessed by its index, elements are same type, 
		//LinkedList - nodes, has a references to the next node and previous node, (singly linkedList, doubly linkedList, circular LinkedList
		//Stacks - LIFO, push (insert), pop(remove)
		//Queues - FIFO, enque, deque
		//trees - root node, one or more subtree of nodes, parent-child relationship, (Vocabulary: Root, Key, Subtree, Edge, Leaf
		//BinaryTree - a tree where each node has at most 2 children, BinarySerachTree, BinarySpacePartitions, Heaps, HashTrees, BinaryTries
		//Binary Search Tree - sorted tree, a type of binary tree, a node values is greater than it's left child value but less than its right chiled value, O(n) for searching, inserting, and deleting
		//Heaps - a type of binary tree, not necessarily sorted, used in the implementation of a priority, type of heap (Max-Heap, Min-Heap,
		//Hashed fuction - 
		//HashMap,HshTbale - key-value pairs, values are stored in an array of buckets or slots, collision, linear probing, chaining with linkedList
		//Graphs - abstract datatype
		
		
		
	}
	
	

}

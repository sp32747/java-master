package com.sree.leet.tree.datastructure;

public class LinkedListTut {
	
	class Node{
		 int data;
		 Node next;
		 
		 public Node(int data) {
			 this.data=data;
			 this.next=null;
			
		}
		
		
	}
	
	Node head=null;
	Node tail=null;
	
	public void addNodes(int newData) {
		
		Node node= new Node(newData);
		
		if(head==null) {
			head=node;
			tail=node;		
		}
		
		else {
			
			tail.next=node;
			tail=tail.next;
			
		}
		
	}
	
	public void printLinkedList(){
		Node temp=head;
		
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("NULL");
		
	}
	
	
	public static void main(String[] args) {
		LinkedListTut linkedListTut=new LinkedListTut();
		
		linkedListTut.addNodes(1);
		linkedListTut.addNodes(2);
		linkedListTut.addNodes(3);
		
		
		
		linkedListTut.printLinkedList();
		
	}
}

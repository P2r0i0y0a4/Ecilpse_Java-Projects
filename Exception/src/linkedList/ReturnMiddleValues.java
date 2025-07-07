package linkedList;

import linkedList.SinglyLL.Node;

public class ReturnMiddleValues {
	Node head;
	Node tail;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public int middleValuee() {
		Node temp1=head;
		Node temp2=head;
		while(temp2.next!=null && temp1.next!=null) {
			temp1=temp1.next;
			temp2=temp2.next.next;
		}
		return temp1.data;
	}

}

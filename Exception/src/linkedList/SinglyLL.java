package linkedList;

public class SinglyLL {
	Node head;
	Node tail;
	private int size;
	
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		if(head==null && tail==null) {
			return true;
		}
		return false;
	}
	public boolean append(int val) {
		Node n=new Node(val);
		if(isEmpty()) {
			head=tail=n;
			size++;
			return true;
		}
		tail.next=n;
		tail=tail.next;
		size++;
		return true;
	}
	public boolean prepend(int val) {
		Node n=new Node(val);
		if(isEmpty()) {
			tail=n;
			head=n;
			size++;
			return true;
		}
		n.next=head;
		head=n;
		size++;
		return true;
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

	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.next==null?temp.data:temp.data+"--->");
			temp=temp.next;
		}
		System.out.println();
	}
	public boolean deleteStart() {
		if(isEmpty()) return false;
		head=head.next;
		size--;
		return true;
	}
	public boolean deleteEnd() {
		if(isEmpty())
			return false;
		if(head==tail) {
			head=tail=null;
			size--;
			return true;
		}
		Node temp=head;
		while(temp.next!=tail) {
			temp=temp.next;
		}
		tail=temp;
		temp.next=null;
		size--;
		return true;
	}
	public boolean delete(int index) {
		if(isEmpty()) return false;
		if(size==1 && index==0) {
			head=tail=null;
			size--;
			return true;
		}
		if(size<=index) return false;
		Node temp=head;
		int i=0;
		while(i!=index-1) {
			temp=temp.next;
			i++;
		}
		temp.next=temp.next.next;
		size--;
		return true;
	}
	public int search(int val) {
		Node temp=head;
		int index=0;
		while(temp!=null) {
			if(temp.data==val) {
				return index;
			}
			temp=temp.next;
			index++;
		}
		return -1;
	}
	public static void main(String[] args) {
		SinglyLL s =new SinglyLL();
		/*System.out.println("Appended the new node at end :");
		System.out.println(s.append(40));
		System.out.println("Appended the new node at beginning :");
		System.out.println(s.prepend(50));
		System.out.println("There is any node:"+s.isEmpty());
		System.out.println(s.isEmpty());*/
		s.append(40);
		s.prepend(50);
		s.prepend(17);
		s.prepend(310);
		s.prepend(288);
		s.append(57);
		s.prepend(218);
		s.append(100);
		s.deleteStart();
		//s.deleteStart();
		s.delete(5);
		s.display();
		/*System.out.println(s.deleteEnd());
		s.deleteEnd();*/
		//System.out.println(s.deleteStart());
		//System.out.println(s.deleteStart());
		//System.out.println(s.deleteStart());
		System.out.println(s.middleValuee());
		//System.out.println(s.search(20));
		//System.out.println(s.size());
	}
}

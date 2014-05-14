package LinkedListDemo;

public class LinkedListDemo {
	public static void main (String[] args){
		StringLinkedList list =new StringLinkedList();
		list.addANodeToStart("Jack");
		list.addANodeToStart("Andy");
		list.addANodeToStart("Karl");
		list.deleteHeadNode();
		list.showList();
		System.out.println(list.find("Jack"));
		System.out.println(list.length());
		
	}	
		
	}


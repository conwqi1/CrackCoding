public class ListNode{
	public String data;
	public ListNode next;
	public ListNode(){
		data=null;
		next=null;
	}
	
	
	public ListNode(String newString, ListNode newNode){
		data=newString;
		next=newNode;
		}
	public ListNode head;
	public ListNode tail;

public boolean deleteMiddle(ListNode N){
	if (N==null || N.next==null){
		return false;
	}
	ListNode Jack=N.next;
	N.data=Jack.data;
	N.next=Jack.next;
	return true;
}
public void printList() {
	ListNode jack=head;
	while (jack != null) {
		System.out.println(jack.data);
		jack = jack.next;
	}
	
}

public void addDataBack(String str){
	ListNode TL=new ListNode(str, null);
	if (head==null){
		head=TL;
		tail=TL;
	}else{
		tail.next=TL;
		tail=tail.next;
	}
	
}


public static void main (String[] args){
     	ListNode Jack=new ListNode();
     	Jack.addDataBack("a");
    	Jack.addDataBack("b");
    	Jack.addDataBack("c");
    	Jack.addDataBack("d");
    	Jack.deleteMiddle(Jack.head.next);
    	Jack.printList();
}
}
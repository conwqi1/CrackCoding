package rev;
public class removeDup {
	public ListNode head;
	public ListNode tail;
	
	public void removeDuplicate() {
		if (head == null)
			return;

		ListNode current = head;
		while (current != null) {
			ListNode runner = current;
			while (runner.next != null) {
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}

	public void printList() {
		ListNode jack=head;
		while (jack != null) {
			System.out.println(jack.data);
			jack = jack.next;
		}
		
	}
	public void addData(String str){
		ListNode HD=new ListNode(str, head);
		if (head==null){
			tail = HD;
		}
		head = HD;
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
	

}

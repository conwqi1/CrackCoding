package rev;
public class removeDup {
	public ListNode current;
	public ListNode head;

	public void removeDuplicate() {
		if (head == null)
			return;

		current = head;
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
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
	public void addData(String str){
		head=new ListNode(str,head);
	}

}

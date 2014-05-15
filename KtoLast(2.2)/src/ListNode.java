
public class ListNode {
	public int data;
	public ListNode next;

	public ListNode() {
		data = 0;
		next = null;
	}

	public ListNode(int newInt, ListNode newNode) {
		data = newInt;
		next = newNode;
	}

	public ListNode head;
	public ListNode tail;

	public static int nthToLast(ListNode head, int k) {
		
		ListNode p1 = new ListNode();
		ListNode p2 = new ListNode();
		p1 = head;
		p2 = head;
		if (p1 == null) {
			return 0;
		} else {
			for (int i = 0; i < k - 1; i++) {
				p1 = p1.next;
			}
			
		}
		if (p2 == null) {
			return 0;
		} else {
			while (p1 != null) {
				p2 = p2.next;
				p1 = p1.next;
			}
			return p2.data;
		}
	}

	public void addInt(int num) {
		ListNode TL = new ListNode(num, null);
		if (head == null) {
			head = TL;
			tail = TL;
		} else {
			tail.next = TL;
			tail = tail.next;
		}
	}

	public void print() {
		ListNode current=head;
		if (current == null) {
			System.out.println("Empty");
		} else {
			while (current != null) {
				System.out.println(current.data);
				current = current.next;
			}
		}
	}

	public static void main(String[] args) {
		ListNode jack = new ListNode();
		jack.addInt(1);
		jack.addInt(2);
		jack.addInt(3);
		jack.addInt(5);
		jack.print();
		System.out.println(nthToLast(jack.head, 3));
	}
}

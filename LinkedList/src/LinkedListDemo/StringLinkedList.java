package LinkedListDemo;
public class StringLinkedList {
	private ListNode head;

	public StringLinkedList() {
		head = null;
	}

	// display data on the list
	public void showList() {
		ListNode position = head;
		while (position != null) {
			System.out.println(position.getData());
			position = position.getLink();
		}
	}

	// return number of nodes on the list
	public int length() {
		int count = 0;
		ListNode position = head;
		while (position != null) {
			count++;
			position = position.getLink();
		}
		return count;
	}

	// add a node containing data to the start of the list
	public void addANodeToStart(String addData) {
		head = new ListNode(addData, head);
	}

	// delete the first node
	public void deleteHeadNode() {
		if (head != null) {
			head = head.getLink();
		} else {
			System.out.println("Delete from a empty list");
			System.exit(0);
		}
	}

	// see whether a target is on the list
	public boolean onList(String Target) {
		return find(Target) != null;
	}

	public ListNode find(String Target) {
		boolean found = false;
		ListNode position = head;
		while ((position != null) && found == false) {
			String DataPosition = position.getData();
			if (DataPosition == Target) {
				found = true;
			} else {
				position = position.getLink();
			}
		}
		return position;
	}
}

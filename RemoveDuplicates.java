//Leet code #83: removing duplicates from a sorted linked list
//Gnonlounfoun Jessica Pierette VUG/SEN/24/12169

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Skip the duplicate node
                current.next = current.next.next;
            } else {
                // Move to the next distinct node
                current = current.next;
            }
        }
        return head;
    }

    // example
    public static void main(String[] args) {
        // Example: 1 -> 1 -> 2 -> 3 -> 3
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        RemoveDuplicates rd = new RemoveDuplicates();
        ListNode result = rd.deleteDuplicates(head);

        // Print result: should be 1 -> 2 -> 3
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

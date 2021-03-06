package list;

//递归方法：
/* 1-3-5-7
 * 2-4-6-8
 * 链表1的头结点的值小于链表2的头结点的值，因此链表1的头结点是合并后链表的头结点。
 * 在剩余的结点中，链表2的头结点的值小于链表1的头结点的值，因此链表2的头结点是剩余结点的头结点，把这个结点和之前已经合并好的链表的尾结点链接起来。
 * 继续合并两个链表中剩余的结点（图中虚线框所示）。在两个链表中剩下的结点依然是排序的，因此合并这两个链表的步骤和前面的步骤是一样的。我们还是比较两个头结点的值。
 * 此时链表2的头结点的值小于链表1的头结点的值，因此链表2的头结点的值将是合并剩余结点得到的链表的头结点。我们把这个结点和前面合并链表时得到的链表的尾结点（值为1的结点）链接起来
 * 当我们得到两个链表中值较小的头结点并把它连接到已经合并的链表之后，两个链表剩余的结点依然是排序的，因此合并的步骤和之前的步骤是一样的。这就是典型的递归的过程，可以定义递归函数来完成者以合并过程。
 * 每当代码试图访问空指针指向的内存时程序就会崩溃，从而导致鲁棒性问题。在本题中，当第一个链表是空链表，也就是它的头结点是一个空指针时，那么把它和第二个链表合并，显然合并的结果是第二个链表。
 * 同样，当输入的第二个链表的头结点是空指针时，我们把它和第一个链表合并得到的结果就是第一个链表。如果两个链表都是空链表，合并的结果是得到一个空链表。
 * */
public class MergeTwoLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1==null)
			return l2;
		if(l2==null)
			return l1;
		ListNode l3=null;
		if(l1.val<=l2.val){
			l3=l1;
			l3.next=mergeTwoLists(l1.next, l2);
		}
		else {
			l3=l2;
			l3.next=mergeTwoLists(l1, l2.next);
		}
			

		return l3;

	}

	public static void main(String[] args) {

	}
}

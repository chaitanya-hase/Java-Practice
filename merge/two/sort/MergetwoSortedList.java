package merge.two.sort;
class ListNode{
	int val;
	ListNode next;
	ListNode(int val){
		this.val=val;
	}
	ListNode(int val,ListNode next){
		this.val=val;
		this.next=next;
	}
}
class Solution{
	public ListNode MergetwoList(ListNode list1,ListNode list2) {
		ListNode dummy=new ListNode(-1);
		ListNode tail=dummy;
		
		while(list1 !=null && list2 !=null) {
			if(list1.val<list2.val) {
				tail.next=list1;
				list1=list1.next;
			}else {
				tail.next=list2;
				list2=list2.next;
			}
			tail=tail.next;
		}
		if(list1 !=null) tail.next=list1;
		else tail.next=list2;
		
		return dummy.next;
		
	}
}

public class MergetwoSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		ListNode list1=new ListNode(1,new ListNode(2,new ListNode(4)));
		ListNode list2=new ListNode(1,new ListNode(3,new ListNode(4)));
		
		ListNode m=s.MergetwoList(list1, list2);
		
		while(m !=null) {
			System.out.println(m.val+" ");
			m=m.next;
		}
	}

}


public class LinkedListCreation {
	ListNode head = null;
	class ListNode{
		int val;
		ListNode next=null;
		ListNode(int val) {
			this.val=val;
		}
	}
	//添加节点
	public  void addNode(int key) {
		ListNode newNode = new ListNode(key);
		if (head == null) {
			System.out.println("Create a head!");
			head = newNode; 
			return;
		}
		ListNode tmp = head;
		//往下遍历节点
		while(tmp.next!=null){
			tmp = tmp.next;
		}
	
		tmp.next = newNode;	
		System.out.println("Insert :"+tmp.next.val);
		
	}
	//删除链表
	public boolean deleteNode(int index) {
        if (index < 1 || index > length()) {
            return false;
        }
        if (index == 1) {
            head = head.next;
            return true;
        }
        int i = 1;
        ListNode preNode = head;
        ListNode curNode = preNode.next;
        while (curNode != null) {
            if (i == index) {
            	System.out.println("Remove index: "+i+"'th Node! Value is : "+curNode.next.val );
                preNode.next = curNode.next;
                return true;
            }
            preNode = curNode;
            curNode = curNode.next;
            i++;
        }
        return false;
    }
	
	
	//打印链表
	public void printList() {
		ListNode tmp = head;
		System.out.println();
		while (tmp.next!= null) {
			System.out.print(tmp.val+" ");
			tmp = tmp.next;
		}
		System.out.print(tmp.val+" ");
	}
	//链表长度
	public int length() {
		int length= 0 ;
		ListNode tmp = head;
		while(tmp.next!=null) {
			length++;
			tmp=tmp.next;
		}
		return length;
	}
	
	
	
}

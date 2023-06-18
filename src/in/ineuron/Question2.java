package in.ineuron;

public class Question2 {
	
	public static void main(String[] args) {
		
		LinkedListNode head1= new LinkedListNode();
		LinkedListNode head2=new LinkedListNode();
		
		head1.add(2);
		head1.add(4);
		head1.add(3);
		head2.add(5);
		head2.add(6);
		head2.add(4);
		
		Node ans=addTwoNumbers(head1.head, head2.head);
		while(ans!=null) {
			System.out.print(ans.data+" ");
			ans=ans.next;
		}
	}
	
	public static Node addTwoNumbers(Node head1, Node head2) {
        // Write your code here.
        
        int r=0;
        Node temp=head1;
        Node temp1=head1;
        while(temp!=null && head2!=null ){
            int x=temp.data+head2.data;
            temp.data=(r+x)%10;
            r=(x+r)/10;
            if(temp!=temp1)
                temp1=temp1.next;
            temp=temp.next;
            head2=head2.next;
        }
        if(r==1 && temp==null && head2==null){
            temp1.next=new Node(1);
        }
        while(temp!=null){
            int x=(temp.data+r)%10;
            r=(temp.data+r)/10;
            temp.data=x;
            temp=temp.next;
        }
        if(head2!=null){
            head2.data+=r;
            temp1.next=head2;
        }
        
        return head1;
    }
}

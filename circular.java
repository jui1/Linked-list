public class circular {
    private Node head;
    private Node tail;

    public  circular(){
        this.head= null;
        this.tail=null;
    }
    public class Node{
        int val;
        Node next;

        public Node(int val)
{
    this.val = val;
}  

public void insert(int val){
    Node node = new Node(val);
    if(head==null){
        tail= node;
        head=node;
    }
    tail.next=node;
    node.next=head;
    tail=node;
}

public void display(){
   Node node= head;
   if(head !=null){
    do{
        System.out.println(node.next);
    }
    while(node!=head);
        
    

   }
   System.out.println();
}

public void delete(int val){
 Node node = head;
 if(node==null){
    return;
 }
 if(node.val==val){
    head=head.next;
    tail.next=head;
    return;
 }

 do{
    Node n = node.next;
    if(n.val==val){
        node.next=n.next;
        break;
    }
    node= node.next;
 } while(node != head);

}

    
}

}


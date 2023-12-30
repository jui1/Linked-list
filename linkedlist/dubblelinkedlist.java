public class dubblelinkedlist {
   
     Node head;

    public void insertfirst(int value){
Node node =new Node(value);
 node.next=head;
 node.prev=null;
 if(head !=null){
    head.prev = node;
 }
 head= node;

    }

    public void insertlast(int value){
        Node node = new Node(value);
        Node last = head;
        // last.next = node;
        node.next = null;
        // node.prev = last;



        if(head==null){
            node.prev= null;
            head=node;
            return;
        }

        while(last.next !=null){
            last = last.next;
        }
        last.next= node;
        node.prev= last;
    }
    public void display(){
        Node last = null;
    Node node = head;
    while(node!=null){
        System.out.println(node.value+"----->");
         last= node;
        node = node.next;
    }
    System.out.println();

    while(last != null){
        System.out.println(last.value);
        last= last.prev;
    }
    System.out.println();
    }
    
public void insertany(int value,int index){
    Node p = find(value);
    if(p ==null){
        System.out.println("no bbe");
        return;
    }
    Node node = new Node(value);
    node.next=p.next;
    p.next=node;
    node.prev=p;
    if(node.next !=null){
    node.next.prev =node;
    }
    
}

public Node find(int value){
    Node node = head;
    while(node !=null){
        if(node.value==value){
          return node;
        }
        node = node.next;
    }
    return null;
}

    private class Node {
        int value;
        Node next;
        Node prev;


        public Node(int value){
            this.value =value;
        }
        public Node(int value , Node next,Node prev){
            this.value =value;
            this.prev= prev;
            this.next = next;
        }
    }
    
}

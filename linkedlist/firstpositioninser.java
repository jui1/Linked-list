public class firstpositioninser {
    private Node head;
    private Node tail;
    private int size;
    public firstpositioninser(){
    this.size=0;
   }
 public void firstpositioninsert(int val){
  Node node = new Node(val);
  node.next =head;
  head= node;
  if(tail==null){
    tail=head;

  }
  size++;
   }
   public void insert(int val , int index){
 if(index==0){
    firstpositioninsert(val);
    return;
}
if(index==size){
    lastindex(val);
    return;
}
Node temp = head;
for(int i = 1;i<index;i++){
    temp = temp.next;
}
 Node node = new Node(val , temp.next);
    temp.next = node;
 size++;
   }
    public void display(){
    Node temp = head;
    while(temp !=null){
        System.out.println(temp.value +"->");
        temp=temp.next;
    }

   }

   public int delete(){
      int val = head.value;
      head = head.next;
      if(head==null){
        tail=null;
      }
      size--;
      return val;

   }

   public int deletelast(){
    if(size<=1 ){
        return delete();
    }
    Node secoundlast = get(size-2);
    int val =tail.value;
    tail.next=null;
    return val;
   }
     public Node find(int value){
   Node node = head;
    while(node != null){
        if(node.value==value){
            return node;
        }
        node = node.next;
    }
    return null;
  }

  public Node get(int index){
   Node node = head;
    for(int i = 0;i<index;i++){
        node= node.next;
    }
    return node;
  }
  public int  anyper(int index){
    if(index==0){
        return delete();
    }
    if(index== size-1){
        return deletelast();
    }
  Node  prev = get(index-1);
  int val = prev.next.value;
  prev.next= prev.next.next;

return val;

  }
   public void lastindex(int val){
    if(tail==null){
        firstpositioninsert(val);
        return;
    }
    Node node = new Node(val);
    tail.next=node;
    tail=node;
    size++;
   }




    private class  Node {
    private int value;
    private Node next; 
        

    private Node(int value){
        this.value=value;
    }
    private Node(int value ,Node next){
   this.value=value;
   this.next=next;
    }
    }
}

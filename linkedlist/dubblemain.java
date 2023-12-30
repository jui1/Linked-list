public class dubblemain {
    public static void main(String[] args) {
        dubblelinkedlist list = new dubblelinkedlist();
        list.insertfirst(45);
        list.insertfirst(85);
        list.insertfirst(74);
        list.insertfirst(12);
        list.insertfirst(10);
        list.insertfirst(79);
        list.insertfirst(100);
        list.display();
        list.insertlast(23);
        list.display();
    }
    
}

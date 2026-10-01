public class LinkedListUse {
    public static void main(String[] args) {

        Node<Integer> head=createLinkedList(); 
       /*  Node<Integer> n1=new Node<>(10);//calling the construtor
        System.out.println(n1);//it is giveing the memory of the n1
        System.out.println(n1.data);
        System.out.println(n1.next);//it will give the memor of the next*/
    }
    public static Node<Integer> createLinkedList(){
        Node<Integer> n1=new Node<>(30);
        System.out.println("n1"=n1+"data"=n1.data+"next"=n1.next);
        Node<Integer> n2=new Node<>(40);
        Node<Integer> n3=new Node<>(50);
        Node<Integer> n4=new Node<>(60);
        Node<Integer> n5=new Node<>(70);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        return n1;
    }
    
}

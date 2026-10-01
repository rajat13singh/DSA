public class Node<T>{
    T data;//here all t are genereic datatype that accepts some seleceted datatype
    Node<T> next;
    Node(T data){/*constructor */
        this.data=data;
        next=null;//not required as default value is also null
    }
}
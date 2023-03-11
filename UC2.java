package Com.Day14_RFP;

public class UC2 {
    UC2.Node head;
    class Node{
        Integer data;
        UC2.Node next;
        Node(Integer data){
            this.data = data;
            this.next = null;
        }
    }
    //add first element
    public void addFirst(Integer data){
        UC2.Node newNode = new UC2.Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //add last element
    public void addLast(Integer data){
        UC2.Node newNode = new UC2.Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        UC2.Node currentNode = head;
        while(currentNode.next !=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
    }
    //print linked list
    public void printList(){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        UC2.Node currentNode = head;
        while(currentNode !=null){
            System.out.print(currentNode.data + "->");
            currentNode=currentNode.next;
        }
        // System.out.println("NULL");
    }
    public static void main(String[] args) {
        UC2 list = new UC2();
        list.addFirst(30);
        list.addFirst(56);
        list.addLast(70);
        list.printList();       //output  56->30->70
    }
}

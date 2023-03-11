package Com.Day14_RFP;

public class UC3 {
    UC3.Node head;
    class Node{
        Integer data;
        UC3.Node next;
        Node(Integer data){
            this.data = data;
            this.next = null;
        }
    }
    //add first element
    public void addFirst(Integer data){
        UC3.Node newNode = new UC3.Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //add last element
    public void addLast(Integer data){
        UC3.Node newNode = new UC3.Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        UC3.Node currentNode = head;
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
        UC3.Node currentNode = head;
        while(currentNode !=null){
            System.out.print(currentNode.data + "->");
            currentNode=currentNode.next;
        }
        // System.out.println("NULL");
    }
    public static void main(String[] args) {
        UC3 list = new UC3();
        list.addFirst(30);
        list.addFirst(56);
        list.addLast(70);
        list.printList();       // appends
    }
}

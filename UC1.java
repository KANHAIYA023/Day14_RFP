package Com.Day14_RFP;
import java.util.*;
public class UC1 {
    Node head;
    class Node{
        Integer data;
        Node next;
        Node(Integer data){
            this.data = data;
            this.next = null;
        }
    }
    //add first element
    public void addFirst(Integer data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //add last element
    public void addLast(Integer data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
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
        Node currentNode = head;
        while(currentNode !=null){
            System.out.print(currentNode.data + "->");
            currentNode=currentNode.next;
        }
       // System.out.println("NULL");
    }
    public static void main(String[] args) {
        UC1 list = new UC1();
        list.addFirst(56);
        list.addFirst(30);
        list.addLast(70);
        list.printList();       // simple linked list
    }
}

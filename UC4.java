package Com.Day14_RFP;

import java.util.LinkedList;

public class UC4 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(56);
        list.addFirst(30);
        list.addLast(70);
        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + "->");
            System.out.print(" ");
        }
        System.out.println();

        //remove first element
        list.removeFirst();
        System.out.println(list);
    }
}

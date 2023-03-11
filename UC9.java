package Com.Day14_RFP;

import java.util.LinkedList;

public class UC9 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(40);
        list.addFirst(30);
        list.addFirst(56);
        list.addLast(70);
        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + "->");
            System.out.print(" ");
        }
        System.out.println();

        //remove the 40
        list.remove(2);
        System.out.println(list);
    }
}

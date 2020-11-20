package com.datastructures.linked_list;

public class Reverse_pair_wise {

    public static void main(String[] args) {

        System.out.println("ihds");

        // create A SLL

        Print_SLL sll = new Print_SLL();
        SLL_node head = sll.addstart("10");
        sll.addlast("20",head);
        sll.addlast("30",head);
        sll.addlast("40",head);
        sll.addlast("50",head);
        sll.addlast("60",head);
        sll.addlast("70",head);
        sll.addlast("80",head);

        sll.print_Sll(head);


        revesePairwaise(head);

        System.out.println("/////////////");

        sll.print_Sll(head);

    }

    private static void revesePairwaise(SLL_node head) {

    SLL_node temp = head ;

    while ( temp != null && temp.getNext() != null ){

           temp = temp.getNext();
           if( temp.getNext() != null  && temp.getNext().getNext() != null ) {

               SLL_node current = temp.getNext();
               temp.setNext(current.getNext());
               SLL_node nxt = current.getNext().getNext();
               current.setNext(nxt);
               temp.getNext().setNext(current);
               temp = nxt;

           }
    }



    }


}
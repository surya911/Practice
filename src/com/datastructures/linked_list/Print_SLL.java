package com.datastructures.linked_list;

public class Print_SLL {

       public static void main(String[] args) {

           Print_SLL sll = new Print_SLL();
           SLL_node head = null ;
           head = sll.addlast("30", head);
           // SLL_node head  =
           sll.addstart("20" );

            sll.addlast("40", head);
            SLL_node p = sll.addlast("50", head);
           sll.addlast("60", head);

           sll.print_Sll(head);
           System.out.println( "/////////////");
           sll.afterNode("90",p,head);
           sll.print_Sll(head);
       }

    public static  SLL_node addlast(String data  , SLL_node haead){
        SLL_node temp  = haead ;

        if ( temp == null) {
            return  addstart(data);
        }

        while ( temp.getNext() != null ){
            temp =  temp.getNext() ;
        }

        SLL_node node = new SLL_node(data);
        temp.setNext(node);
        return  node ;
    }


    public static SLL_node addstart(String data){
        SLL_node node = new SLL_node(data);
        return node ;
    }

    public static SLL_node afterNode(String data , SLL_node node , SLL_node head){
        SLL_node temp  = head ;

        if ( temp == null ) {
            return  addstart(data) ;
        }

        while( temp != node){
            temp = temp.getNext() ;
        }

        SLL_node sll = new SLL_node(data);
        sll.setNext(node.getNext()) ;
        node.setNext(sll);
        return sll ;
    }

    public static  void  print_Sll(SLL_node head){
        SLL_node temp = head ;
        while( temp != null ){
            System.out.println( temp.getData());
            temp = temp.getNext() ;
        }
    }
}

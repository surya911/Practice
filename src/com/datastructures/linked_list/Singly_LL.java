package com.datastructures.linked_list;

public class Singly_LL {

     private String data = null ;
     private Singly_LL next = null ;


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Singly_LL getNext() {
        return next;
    }

    public void setNext(Singly_LL next) {
        this.next = next;
    }


    public Singly_LL addlast(String data ){
        Singly_LL sll = new Singly_LL();
        sll.setData(data) ;
        sll.setNext(null) ;
        return sll ;
    }


    public Singly_LL addstart(String data){
        Singly_LL sll = new Singly_LL();
        sll.setData(data) ;
        sll.setNext(null) ;
        return sll;
    }

    public Singly_LL afterNode(String data , Singly_LL prev ){
        Singly_LL sll = new Singly_LL();
        sll.setData(data) ;
        sll.setNext(prev.getNext()) ;
        prev.setNext(sll);
        return sll ;
    }
}

package com.datastructures.linked_list;

public class SLL_node {

     private String data = null ;
     private SLL_node next = null ;


    public  SLL_node(String data){
        this.data = data ;
        this.next = null ;
    }


    public void setData(String data) {
        this.data = data;
    }

    public void setNext(SLL_node next) {
        this.next = next;
    }

    public String getData() {
        return data;
    }



    public SLL_node getNext() {
        return next;
    }

}

package com.fideljose.DataStructureAndAlgorithm.LinkedList;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.LinkedList;

@Component
public class LinkedListTraining {

    LinkedList<String> ll = new LinkedList<String>();

    public LinkedList<String> list(){
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("F");
        ll.add("G");
        ll.add("H");
        return ll;
    }

    public LinkedList<String> insertFront(String data){
        ll.add(0, data);
        return ll;
    }

    public LinkedList<String> removeFromIndex(String data){
        ll.remove(data);
        return ll;
    }

}

package com.fideljose.DataStructureAndAlgorithm.LinkedList.controller;

import com.fideljose.DataStructureAndAlgorithm.LinkedList.LinkedListTraining;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinkedListController {

    @Autowired
    private LinkedListTraining linkedListTraining;

    @GetMapping("/list")
    public ResponseEntity<?> listData(){
        return ResponseEntity.ok(linkedListTraining.list());
    }

    @GetMapping("/begin/{data}")
    public ResponseEntity<?> setBeginData(@PathVariable("data") String data){
        return ResponseEntity.ok(linkedListTraining.insertFront(data));
    }

    @GetMapping("/remove/{data}")
    public ResponseEntity<?> removeData(@PathVariable("data") String data){
        return ResponseEntity.ok(linkedListTraining.removeFromIndex(data));
    }

}

package com.fideljose.DataStructureAndAlgorithm.MatrixOrGrid.controller;

import com.fideljose.DataStructureAndAlgorithm.MatrixOrGrid.Matrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatrixController {

    @Autowired
    private Matrix matrix;

    @GetMapping("/list-matrix")
    public ResponseEntity<?> listData(){
        matrix.showMatrixElements();
        return ResponseEntity.ok("Fine!");
    }

}

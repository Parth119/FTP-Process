package com.htrap.procedure.Controller;

import com.htrap.procedure.Model.StudInfo;
import com.htrap.procedure.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pro")
public class StudController {

    @Autowired
    UserService userService;
    @GetMapping("/get")
    public ResponseEntity<List<StudInfo>> getAllData(@RequestParam(name = "schema", required = false) String schema,@RequestParam(name = "table", required = false) String table,@RequestParam(name = "id", required = false) Integer id, @RequestParam(name = "marks", required = false) Float marks){
        List<StudInfo> si = userService.getAllData(schema,table,id,marks);
        return new ResponseEntity<>(si, HttpStatus.OK);
    }
}

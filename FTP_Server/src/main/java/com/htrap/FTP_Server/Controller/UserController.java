package com.htrap.FTP_Client.Controller;

import com.htrap.FTP_Client.Service.UserService;
import com.htrap.FTP_Client.model.LoginCred;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping("/readAll")
    public List<LoginCred> readall(){
        return userService.readAll();
    }

    @PostMapping("/add")
    public LoginCred add(@RequestBody LoginCred lc){
        return userService.addData(lc);
    }

    @PutMapping("/update")
    public String update(@RequestParam("id") Integer id, @RequestBody LoginCred lc){
        return userService.updateData(id, lc);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam("id") Integer id){
        return userService.deleteData(id);
    }
}

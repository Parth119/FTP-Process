package com.htrap.FTP_Client.Service;

import com.htrap.FTP_Client.model.LoginCred;
import com.htrap.FTP_Client.repository.LoginCredRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    LoginCredRepository loginCredRepository;

    public LoginCred addData(LoginCred loginCred){
        return loginCredRepository.save(loginCred);
    }

    public List<LoginCred> readAll(){
        return loginCredRepository.findAll();
    }

    public String updateData(Integer id,LoginCred l){
        LoginCred c = loginCredRepository.findById(id).get();
        c.setUserName(l.getUserName());
        c.setPassword(l.getPassword());
        loginCredRepository.save(c);
        return "Updated";
    }

    public String deleteData(Integer id){
        loginCredRepository.deleteById(id);
        return "Deleted";
    }
}

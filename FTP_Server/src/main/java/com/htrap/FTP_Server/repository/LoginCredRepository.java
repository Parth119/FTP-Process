package com.htrap.FTP_Client.repository;

import com.htrap.FTP_Client.model.LoginCred;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginCredRepository extends JpaRepository<LoginCred, Integer> {
}
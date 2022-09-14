package com.example.SpringBootSoapWebservices.service;

import com.example.spring_boot_soap_webservices.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private static final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialize(){
        User wanindu = new User();
        wanindu.setName("Wanindu");
        wanindu.setEmpId(49);
        wanindu.setSalary(550000);

        User chamika = new User();
        chamika.setName("Chamika");
        chamika.setEmpId(29);
        chamika.setSalary(450000);

        User mendis = new User();
        mendis.setName("Mendis");
        mendis.setEmpId(13);
        mendis.setSalary(750000);

        users.put(wanindu.getName(), wanindu);
        users.put(chamika.getName(), chamika);
        users.put(mendis.getName(), mendis);

    }

    public User getUsers(String name) {
        return users.get(name);
    }
}

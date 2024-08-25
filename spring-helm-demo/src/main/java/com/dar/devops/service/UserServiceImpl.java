package com.dar.devops.service;

import com.dar.devops.pojo.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl {


    public List<User> getAllUsers(){
        List<User> list = new ArrayList<>();
        User user1 = new User("Dimpu","Darshan",32,"Chowlahiriyur");
        User user2 = new User("MS","Sachin",42,"Ranchi");
        User user3 = new User("Yuvi","Yuvraj",39,"Punjab");
        User user4 = new User("KL","Rahul",38,"Bangalore");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        return list;
    }
}

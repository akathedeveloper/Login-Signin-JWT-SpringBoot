package com.loginSigninJWT.services;

import com.loginSigninJWT.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();
    public UserService(){
    store.add(new User(UUID.randomUUID().toString(),"Adhiraj Singh","adhirajsingh@gmail.com"));
    store.add(new User(UUID.randomUUID().toString(),"Varun Pareek","varunpareek@gmail.com"));
    store.add(new User(UUID.randomUUID().toString(),"Kanishk Tiwari","kanishktiwari@gmail.com"));
    store.add(new User(UUID.randomUUID().toString(),"Paras Goyal","parasgoyal@gmail.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }
}

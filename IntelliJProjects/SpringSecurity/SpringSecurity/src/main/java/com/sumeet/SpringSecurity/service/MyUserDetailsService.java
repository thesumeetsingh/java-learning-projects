package com.sumeet.SpringSecurity.service;

import com.sumeet.SpringSecurity.model.User;
import com.sumeet.SpringSecurity.model.UserPrincipal;
import com.sumeet.SpringSecurity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user= repo.findByName(username);
//        if(user==null){
//            System.out.println("user not found");
//            throw new UsernameNotFoundException("user not found");
//        }
//        return new UserPrincipal(user);
//    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        System.out.println("USERNAME RECEIVED = [" + username + "]");

        User user = repo.findByName(username);

        System.out.println("USER FROM DATABASE = " + user.toString());

        if (user == null) {
            System.out.println("USER NOT FOUND");
            throw new UsernameNotFoundException("user not found");
        }

        return new UserPrincipal(user);
    }
}

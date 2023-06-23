package com.sachin.Student_Management_System.configuration;

import com.sachin.Student_Management_System.model.Type;
import com.sachin.Student_Management_System.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {
@Bean
   public List<User> getInitializedList()
    {
        User initUser = new User(0,"John","Varansi","9876543201", Type.ADMIN);
       List<User> initList = new ArrayList<>();
       initList.add(initUser);
       return initList;
    }
}

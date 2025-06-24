package com.innovation.Innovation.ai.Controller;

import com.innovation.Innovation.ai.Model.User;
import com.innovation.Innovation.ai.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/allUser")
    public ResponseEntity<List<User>> getAllUser(){
        List<User> user = userService.getUser();
        return ResponseEntity.ok(user);
    }

    @PostMapping("/saveUser")
   public ResponseEntity<User> saveUser(@RequestBody User user){
        return ResponseEntity.ok(userService.saveUser(user));
    }

    @PutMapping("/editUser/{id}")
    public ResponseEntity<User> updateUser(@PathVariable String Id, @RequestBody User user){
        return ResponseEntity.ok(userService.updateUser(Id, user));
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable String id){
        userService.deleteUser(id);
    }

}

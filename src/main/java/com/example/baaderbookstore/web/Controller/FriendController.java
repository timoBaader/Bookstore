package com.example.baaderbookstore.web.Controller;

import com.example.baaderbookstore.web.Model.Friend;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FriendController {

    @GetMapping("/friends")
    public String friendList(Model model){
        List<Friend> friendList = new ArrayList<Friend>();
        friendList.add(new Friend("Timo baader"));
        friendList.add(new Friend("Amal Suleiman"));
        friendList.add(new Friend("Hans Hansen"));

        model.addAttribute(friendList);

        model.addAttribute("friend", new Friend());
        return "friends.html";
    }


    @PostMapping("/friends")
    public String listBooks(@ModelAttribute Friend name, Model model){
        model.addAttribute("name", name);


        //result??
        return "redirect:/result";
    }
}

package com.codeup.blogapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String posts() {

        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postID(@PathVariable String id) {
        return id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "view the form for creating a post";
    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String postCreate(){
        return "create a new post";
    }
}

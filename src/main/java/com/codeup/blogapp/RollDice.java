package com.codeup.blogapp;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Random;

@Controller
public class RollDice {

    @GetMapping("/roll-dice")
    public String rollDice() {
        return "dice";
    }

    @GetMapping("/roll-dice/{guess}")
    public String rollDice(@PathVariable int guess, Model model) {
        Random rand = new Random();
        int roll = rand.nextInt(6) + 1;
        String message;
        if (guess == roll) {
            message = "You guessed it!";
        } else {
            message = "The roll was " + roll + ". Try again next time.";
        }
        model.addAttribute("roll", roll);
        model.addAttribute("guess", guess);
        model.addAttribute("message", message);
        return "dice";
    }

}

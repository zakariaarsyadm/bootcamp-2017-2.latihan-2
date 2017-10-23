/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tabeldata.pln.controller;

import com.tabeldata.pln.model.TokenListrik;
import com.tabeldata.pln.repository.TokenListrikController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Controller
@RequestMapping("/token")
public class TokenController {
    
    @Autowired
    private TokenListrikController tokenListrikController;
    
    @GetMapping("/update")
    public String getDataToken(
            @RequestParam(name="kode",required = true)
            TokenListrik tokenListrik,
            Model model) {
        model.addAttribute("tkn",tokenListrik);
        return "/token/editToken";
    }
    
    @PostMapping("/update")
    public String submitUpdateToken(TokenListrik tokenListrik) {
        tokenListrikController.save(tokenListrik);
        return "redirect:/token/list"; 
    }
    
    @GetMapping("/list")
    public String getListToken(Model model) {
        model.addAttribute("listToken",tokenListrikController.findAll());
        return "token/listToken";
    }

}

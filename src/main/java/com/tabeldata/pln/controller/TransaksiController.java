/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tabeldata.pln.controller;

import com.tabeldata.pln.model.TokenListrik;
import com.tabeldata.pln.model.Transaksi;
import com.tabeldata.pln.repository.TokenListrikController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Controller
@RequestMapping("/transaksi")
public class TransaksiController {
    
    @Autowired
    private TokenListrikController tokenListrikController;
    
    
    @GetMapping("/add")
    public String newTransaksi(TokenListrik tokenListrik,Transaksi transaksi, Model model) {
        model.addAttribute("tkn",tokenListrikController.findAll());
        model.addAttribute("trnsk",transaksi);
        return "/transaksi/addTransaksi";
    }

}

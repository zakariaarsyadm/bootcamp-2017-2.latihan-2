/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tabeldata.pln.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */

@Entity
@Table(name="transaksi")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Transaksi {
    
    @Id
    @GeneratedValue
    private Integer id;
    
    @Column(nullable = false)
    private Timestamp waktuBeli;
    
    @Column(nullable=false)
    @GeneratedValue
    private String stroom;
    
    @ManyToOne
    @JoinColumn(name="id_token")
    private TokenListrik tokenListrik;
    
   
    

}

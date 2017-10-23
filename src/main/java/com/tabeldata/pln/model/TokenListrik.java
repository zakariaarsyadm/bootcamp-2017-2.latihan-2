/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tabeldata.pln.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */

@Entity
@Table(name="token_listrik")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class TokenListrik {
 
    @Id
    private Integer kode;
    
    @Column(nullable = false)
    private BigDecimal namaProduk;
    
    @Column(nullable = false)
    private String harga;
    
    @OneToMany(mappedBy = "tokenListrik")
    private List<Transaksi> listTransaksi = new ArrayList<>();

}

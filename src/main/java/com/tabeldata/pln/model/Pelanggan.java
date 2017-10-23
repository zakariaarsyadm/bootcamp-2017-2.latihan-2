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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Entity
@Table(name="pengunjung")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)

public class Pelanggan extends User {
    
    @Column(nullable = false)
    private Integer noPelanggan;
    
    @Column(nullable = false)
    private String nama;
    
    @Column(nullable = false)
    private BigDecimal saldo;
    
    @OneToMany(mappedBy = "pelanggan")
    private List<Meter> daftarMeter = new ArrayList<>();
    
}

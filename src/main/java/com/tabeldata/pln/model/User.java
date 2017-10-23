/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tabeldata.pln.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Entity
@Table(name="t_user")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    
    @Id
    @GenericGenerator(name="gen_user", strategy = "uuid")
    @GeneratedValue(generator = "gen_user")
    private Integer id;
    
    @Column(nullable = false)
    private String username;
    
    @Column(nullable = false)
    private String password;
    
    @Column(name = "is_active", nullable = false)
    private boolean active;
    
    @OneToOne
    @JoinColumn(name="id_pelanggan")
    private Pelanggan pelanggan;
    
}

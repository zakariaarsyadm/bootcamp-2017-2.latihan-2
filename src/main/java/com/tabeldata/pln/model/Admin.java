/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tabeldata.pln.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */

@Entity
@Table(name="admin")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Admin extends User{
    
    @Column(nullable = false)
    private String nama;

}

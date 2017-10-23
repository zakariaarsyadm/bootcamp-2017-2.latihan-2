/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.pln.model;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "meter")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Meter {

    @Id
    @Column(nullable = false)
    private Integer noMeter;

    @ManyToOne
    @JoinColumn(name = "id_pelanggan")
    private Pelanggan pelanggan;

}

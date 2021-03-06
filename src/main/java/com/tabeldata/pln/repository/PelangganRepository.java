/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tabeldata.pln.repository;

import com.tabeldata.pln.model.Pelanggan;
import java.io.Serializable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface PelangganRepository extends PagingAndSortingRepository<Pelanggan, Integer> {
        Pelanggan findByUsername(String username);
}

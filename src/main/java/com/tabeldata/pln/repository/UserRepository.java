/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.pln.repository;

import java.io.Serializable;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.tabeldata.pln.model.User;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface UserRepository extends PagingAndSortingRepository<User, Integer> {
    User findByUsername(String username);
}

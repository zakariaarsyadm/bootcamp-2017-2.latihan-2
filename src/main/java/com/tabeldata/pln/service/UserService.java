///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.tabeldata.pln.service;
//
//import com.tabeldata.pln.model.Admin;
//import com.tabeldata.pln.model.Pelanggan;
//import com.tabeldata.pln.model.User;
//import com.tabeldata.pln.repository.AdminRepository;
//import com.tabeldata.pln.repository.PelangganRepository;
//import com.tabeldata.pln.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Arrays;
//import java.util.Collection;
//
///**
// *
// * @author Sammy Guergachi <sguergachi at gmail.com>
// */
//@Service
//public class UserService implements UserDetailsService {
//
//    @Autowired
//    private AdminRepository adminRepository;
//
//    @Autowired
//    private PelangganRepository pelangganRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username)
//            throws UsernameNotFoundException {
//
//        Pelanggan pelanggan = pelangganRepository.findByUsername(username);
//        Admin admin = adminRepository.findByUsername(username);
//
//        if (pelanggan != null) {
//            return new UserPrincipal(pelanggan, false);
//        } else if (admin != null) {
//            return new UserPrincipal(admin, true);
//        } else {
//            User user = new User();
//            user.setActive(false);
//            return new UserPrincipal(user, false);
//        }
//    }
//
//    public class UserPrincipal implements UserDetails {
//
//        private boolean admin;
//        private User user;
//
//        public UserPrincipal(User user, boolean isAdmin) {
//            this.user = user;
//            this.admin = isAdmin;
//        }
//
//        @Override
//        public Collection<? extends GrantedAuthority> getAuthorities() {
//            return this.admin
//                    ? Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"))
//                    : Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
//        }
//
//        @Override
//        public String getPassword() {
//            return user.getPassword();
//        }
//
//        @Override
//        public String getUsername() {
//            return user.getUsername();
//        }
//
//        @Override
//        public boolean isAccountNonExpired() {
//            return true;
//        }
//
//        @Override
//        public boolean isAccountNonLocked() {
//            return true;
//        }
//
//        @Override
//        public boolean isCredentialsNonExpired() {
//            return true;
//        }
//
//        @Override
//        public boolean isEnabled() {
//            return this.user.isActive();
//        }
//    }
//
//}

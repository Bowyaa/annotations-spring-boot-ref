package com.trans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class serv {
	@Autowired
	userrepo repo;
	@Transactional
    public user adduser(user u) throws Exception {
        user us = this.repo.save(u);
        return us;
}
}

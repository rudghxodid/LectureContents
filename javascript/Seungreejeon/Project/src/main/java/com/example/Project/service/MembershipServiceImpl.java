package com.example.Project.service;

import com.example.Project.entity.Membership;
import com.example.Project.repository.MemberShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MembershipServiceImpl implements MembershipService{

    @Autowired
    private MemberShipRepository repository;

    @Override
    public void M_register(Membership membership) throws Exception {
        repository.create(membership);
    }
}

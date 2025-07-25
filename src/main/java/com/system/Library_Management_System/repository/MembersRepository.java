package com.system.Library_Management_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.Library_Management_System.entity.Members;

import java.util.Optional;



@Repository
public interface MembersRepository extends JpaRepository<Members,Long>{

    Optional<Members> findByEmail(String email);
    Optional<Members> findByPhoneNumber(String phoneNumber);

}


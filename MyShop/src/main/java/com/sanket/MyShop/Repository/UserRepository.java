package com.sanket.MyShop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanket.MyShop.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

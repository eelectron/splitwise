package com.example.splitwise.repositories;

import com.example.splitwise.models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findUsersByUsernameContainingAndPhoneNumberIs(String text, String phoneNumber);
    User save(User save);
}

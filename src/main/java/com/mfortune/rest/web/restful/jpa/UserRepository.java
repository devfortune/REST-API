package com.mfortune.rest.web.restful.jpa;

import com.mfortune.rest.web.restful.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}

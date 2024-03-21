package com.mfortune.rest.web.restful.jpa;

import com.mfortune.rest.web.restful.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {

}

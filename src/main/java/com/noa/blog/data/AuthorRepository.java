package com.noa.blog.data;


import org.springframework.data.jpa.repository.JpaRepository;
import com.noa.blog.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
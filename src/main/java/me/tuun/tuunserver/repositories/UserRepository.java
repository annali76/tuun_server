package me.tuun.tuunserver.repositories;

import org.springframework.data.repository.CrudRepository;

import me.tuun.tuunserver.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}

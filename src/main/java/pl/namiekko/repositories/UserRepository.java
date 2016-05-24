package pl.namiekko.repositories;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import pl.namiekko.entities.User;

public interface UserRepository extends CrudRepository<User, BigInteger>{

}
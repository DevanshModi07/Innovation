package com.innovation.Innovation.ai.Repository;

import com.innovation.Innovation.ai.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {
}

package com.gyejoon.webflux.repository;

import com.gyejoon.webflux.model.User;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;

import java.util.UUID;

public interface UserRepository extends ReactiveCassandraRepository<User, UUID> {
}

package com.gyejoon.webflux.repository;

import com.gyejoon.webflux.model.Board;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;

import java.util.UUID;

public interface BoardRepository extends ReactiveCassandraRepository<Board, UUID> {
}

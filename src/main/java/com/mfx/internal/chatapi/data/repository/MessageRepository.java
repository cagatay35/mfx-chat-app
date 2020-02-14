package com.mfx.internal.chatapi.data.repository;

import com.mfx.internal.chatapi.data.entity.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * TTCGOKCEL
 **/
@Repository
public interface MessageRepository extends MongoRepository<Message, String> {
}

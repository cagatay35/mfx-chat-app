package com.mfx.internal.chatapi.data.repository;

import com.mfx.internal.chatapi.data.entity.User;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ReactiveSortingRepository<User, String> {
}

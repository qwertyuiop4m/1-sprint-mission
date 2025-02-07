package com.sprint.mission.discodeit.repository;

import com.sprint.mission.discodeit.entity.ReadStatus;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ReadStatusRepository {
    void saveReadStatus(List<ReadStatus> readStatus);
    List<UUID> findMembersByChannelId(UUID id);
    void deleteByChannelId(UUID id);
    boolean isUserMemberOfChannel(UUID userId, UUID channelId);
    Optional<ReadStatus> findById(UUID id);
    List<ReadStatus> findAllByUserId(UUID userId);
    void deleteById(UUID id);
}

package io.tral909.camunda.artifact.access.repository;

import io.tral909.camunda.artifact.access.domain.AccessRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccessRequestRepository extends JpaRepository<AccessRequest, Long> {

    Optional<AccessRequest> findOneByEntityId(Long entityId);
}

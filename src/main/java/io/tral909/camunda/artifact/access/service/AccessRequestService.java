package io.tral909.camunda.artifact.access.service;

public interface AccessRequestService {

    Long create(Long entityId, String username, String comment);

    void update(Long id, String approver, Boolean isApproved);
}

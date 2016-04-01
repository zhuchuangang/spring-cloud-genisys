package com.szss.genisys.auth.domain.user;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by zcg on 16/3/16.
 */
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long>,JpaSpecificationExecutor<User> {
    User findByUsername(String username);
}

package com.szss.genisys.auth.domain.authority;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by zcg on 16/3/16.
 */
@RepositoryRestResource(collectionResourceRel = "authorities", path = "authorities")
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    @Query(value = "select distinct a.* from users_has_roles ur,roles r,roles_has_authorities ra,authorities a " +
            "where ur.role_id=r.id and r.id=ra.role_id and ra.authority_id=a.id and ur.user_id =?1 " +
            "and r.deleted=0 and a.deleted=0 and a.enabled = 1 and r.enabled = 1", nativeQuery = true)
    List<Authority> findByUserId(Long userId);
}

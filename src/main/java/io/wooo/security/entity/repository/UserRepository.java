package io.wooo.security.entity.repository;

import io.wooo.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * @author: wushuaiping
 * @date: 2018-10-31 16:39
 * @description:
 */
public interface UserRepository extends CrudRepository<User, Long>, JpaRepository<User, Long> {
}

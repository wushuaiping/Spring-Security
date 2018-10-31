package io.wooo.security.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author: wushuaiping
 * @date: 2018-10-31 16:37
 * @description:
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    // username is telephone or email
    private String username;

    private String password;
}

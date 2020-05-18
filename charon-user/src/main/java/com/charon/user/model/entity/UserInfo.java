package com.charon.user.model.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author by sl
 * @ todo TODO
 * @ date 2020/5/14 16:46
 */
@Data
@Entity
@Table(name = "user_info")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String telephone;

    private String username;

    private String email;

    private Integer countryCode;
}

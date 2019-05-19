package com.haochh.chen.poseidon.bean;

import lombok.*;

import javax.persistence.*;

/**
 * Created by admin on 2019/5/18.
 */
@Entity
@Getter
@Setter
@Table(name = "user")
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private final String name;
    @Column(name = "email")
    private final String email;
    @Column(name = "passwd")
    private final String passwd;

}

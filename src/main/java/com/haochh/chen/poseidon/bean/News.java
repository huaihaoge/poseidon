package com.haochh.chen.poseidon.bean;

import lombok.*;

import javax.persistence.*;

/**
 * Created by admin on 2019/5/26.
 */

@Entity
@Getter
@Setter
@Table(name = "news")
@NoArgsConstructor(force = true)
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "title")
    private String title;
    @Column(name = "date")
    private String date;
    @Column(name = "category")
    private String category;
    @Column(name = "author_name")
    private String author_name;
    @Column(name = "url")
    private String url;
    @Column(name = "thumbnail_pic_s")
    private String thumbnail_pic_s;
}

package com.haochh.chen.poseidon.repository;

import com.haochh.chen.poseidon.bean.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

/**
 * Created by admin on 2019/5/26.
 */
public interface NewsRepository extends JpaRepository<News, Long>{
}

package com.haochh.chen.poseidon.repository;

import com.haochh.chen.poseidon.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

/**
 * Created by admin on 2019/5/18.
 */
public interface UserRepository  extends CrudRepository<User, Long>, QueryByExampleExecutor<User> {

}

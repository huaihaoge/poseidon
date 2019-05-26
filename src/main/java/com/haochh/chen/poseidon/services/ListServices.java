package com.haochh.chen.poseidon.services;

import com.haochh.chen.poseidon.bean.ListFish;
import com.haochh.chen.poseidon.bean.ListNews;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2019/5/26.
 */
@Service
public interface ListServices {

    public ListNews getListNews();

    public ListFish getListFish();


}

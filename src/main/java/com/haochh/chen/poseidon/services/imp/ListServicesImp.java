package com.haochh.chen.poseidon.services.imp;

import com.haochh.chen.poseidon.bean.Fishs;
import com.haochh.chen.poseidon.bean.ListFish;
import com.haochh.chen.poseidon.bean.ListNews;
import com.haochh.chen.poseidon.bean.News;
import com.haochh.chen.poseidon.repository.FishsRepository;
import com.haochh.chen.poseidon.repository.NewsRepository;
import com.haochh.chen.poseidon.services.ListServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2019/5/26.
 */

@Service
public class ListServicesImp implements ListServices {


    @Autowired
    private NewsRepository newsRepository;

    @Autowired
    private FishsRepository fishsRepository;

    @Override
    public ListNews getListNews() {

        ListNews listNews = new ListNews();
        ListNews.ResultEntity resultEntity = new ListNews.ResultEntity();
        List<News> listN = newsRepository.findAll();
        resultEntity.setData(listN);
        listNews.setResult(resultEntity);
        return listNews;

    }

    @Override
    public ListFish getListFish() {
        ListFish listFish = new ListFish();
        ListFish.ResultEntity resultEntityFish = new ListFish.ResultEntity();
        List<Fishs> listF = fishsRepository.findAll();
        resultEntityFish.setData(listF);
        listFish.setResult(resultEntityFish);
        return listFish;
    }


}

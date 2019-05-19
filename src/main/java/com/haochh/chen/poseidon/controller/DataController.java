package com.haochh.chen.poseidon.controller;

import com.haochh.chen.poseidon.bean.Datas;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2019/5/19.
 */
@RestController
@RequestMapping("/data")
@JsonComponent
public class DataController {

    @GetMapping(path = "/list")
    public Datas getDatas() {
        Datas datas = new Datas();
        datas.setCode("1");
        Datas.DataBean dataBean = new Datas.DataBean();
        dataBean.setAid(1);
        dataBean.setCreatetime("1");
        List<Datas.DataBean> dataBeans = new ArrayList<Datas.DataBean>();
        dataBeans.add(dataBean);
        datas.setData(dataBeans);
        datas.setMsg("msg");
        Datas.MiaoshaBean miaoshaBean = new Datas.MiaoshaBean();
        miaoshaBean.setName("Nmae");
        miaoshaBean.setTime(1);
        Datas.MiaoshaBean.ListBeanX listBeanX = new Datas.MiaoshaBean.ListBeanX();
        listBeanX.setTitle("title");
        listBeanX.setBargainPrice(123);
        listBeanX.setBargainPrice(123);
        listBeanX.setDetailUrl("123");
        List<Datas.MiaoshaBean.ListBeanX> listBeanXES = new ArrayList<>();
        listBeanXES.add(listBeanX);
        miaoshaBean.setList(listBeanXES);
        datas.setMiaosha(miaoshaBean);
        Datas.TuijianBean tuijianBean = new Datas.TuijianBean();
        Datas.TuijianBean.ListBean listBean = new Datas.TuijianBean.ListBean();
        listBean.setTitle("title");
        listBean.setBargainPrice(123);
        listBean.setBargainPrice(123);
        listBean.setDetailUrl("123");
        List<Datas.TuijianBean.ListBean> listBeans = new ArrayList<>();
        listBeans.add(listBean);
        tuijianBean.setList(listBeans);
        datas.setTuijian(tuijianBean);
        return datas;
    }
}

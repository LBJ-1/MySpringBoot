package com.lbj.vip.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.github.pagehelper.PageInfo;
import com.lbj.vip.model.ResultVo;
import com.lbj.vip.model.VipInfo;
import com.lbj.vip.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VipControllerPage {
    @Autowired
    private VipService vipService;

    @GetMapping("/getVipsByPage")
    public ResultVo findVipsByPage(@RequestParam(required = false,defaultValue = "1") int page,
                                   @RequestParam(required = false,defaultValue = "10") int limit,
                                   @RequestParam(required = false,defaultValue = "") String userName,
                                   @RequestParam(required = false,defaultValue = "") String cardNo){
        ResultVo rv = new ResultVo();
        PageInfo<VipInfo> pageInfo = new PageInfo<VipInfo>();
        try{
            String userName1 = userName.replaceAll("\\s*", "");// 替换大部分空白字符， 不限于空格
            String cardNo1 = cardNo.replaceAll("\\s*", "");// 替换大部分空白字符， 不限于空格
            pageInfo = vipService.getVipsPage(page, limit, userName1,cardNo1);
            //long count =pageInfo.getTotal();
            //int count = vipService.getVipsTotal();
            //System.out.println("----------getVipsTotal()-----------"+count);
            long totalNum = pageInfo.getTotal();;
            System.out.println("----------VIP totalNum-----------"+totalNum);
            rv.setCount(totalNum);
            // 往分页封装类存入数据
            rv.setData(pageInfo.getList());
        }catch(Exception e){
            e.printStackTrace();
        }
        return rv;
    }

    @PostMapping("/updateVip")
    public JSONObject updateVipInfo(@RequestBody JSONObject request){
        JSONObject result = new JSONObject();
        result = vipService.updateVipInfo(request);
        return result;
    }
}

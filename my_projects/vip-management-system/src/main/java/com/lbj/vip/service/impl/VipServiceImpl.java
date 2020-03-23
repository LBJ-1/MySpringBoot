package com.lbj.vip.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lbj.vip.mapper.VipMapper;
import com.lbj.vip.model.VipInfo;
import com.lbj.vip.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Liu.B.J
 */
@Service
public class VipServiceImpl implements VipService {
    @Autowired
    private VipMapper vipMapper;

    @Override
    public Integer getVipsTotal() {
        return vipMapper.getVipsTotal();
    }

    /**
     * @param page 页码
     * @param limit 每页数量
     * @return
     */
    @Override
    public PageInfo<VipInfo> getVipsPage(int page, int limit, String userName, String cardNo) {
        // 使用分页插件,重点！自动给sql加上limit分页了
        PageHelper.startPage(page,limit);
        /*int start = (int)(page-1)*limit+1;
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("pstart",start);
        paramMap.put("psize",limit);
        System.out.println("-------pstart:"+start+"-----psize:"+limit);*/
        Map<String, Object> paramMap = new HashMap<String, Object>();
        if(null != userName && !userName.isEmpty()){
            paramMap.put("sUserName","%"+userName+"%");
        }else{
            paramMap.put("sUserName","");
        }
        if(null != cardNo && !cardNo.isEmpty()){
            paramMap.put("sCardNo","%"+cardNo+"%");
        }else{
            paramMap.put("sCardNo","");
        }
        // 这里不需要传分页参数了...插件会自动拦截和添加 limit 分页...
        List<VipInfo> listVips = vipMapper.selectVipsByPage(paramMap);
        System.out.println("-------listVips--------"+listVips.toString());
        PageInfo<VipInfo> pageinfo = new PageInfo<VipInfo>(listVips);
        return pageinfo;
    }

    /**
     * 修改信息
     * @param request
     * @return
     */
    @Override
    public JSONObject updateVipInfo(JSONObject request) {
        JSONObject result = new JSONObject();
        int rv = vipMapper.updateInfo(request);
        if(1 == rv){
            result.put("code","0");
            result.put("msg", "编号为 "+request.get("cardNo")+" 的会员修改成功");
        }else{
            result.put("code","500");
            result.put("msg", "编号为 "+request.get("cardNo")+" 的会员修改发生异常！");
        }
        return result;
    }
}

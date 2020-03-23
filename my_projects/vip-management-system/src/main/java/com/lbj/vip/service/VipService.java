package com.lbj.vip.service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.lbj.vip.model.VipInfo;

/**
 * @Author Liu.B.J
 */
public interface VipService {
    // 获取总数
    public Integer getVipsTotal();

    // 获取分页数据
    public PageInfo<VipInfo> getVipsPage(int page, int limit, String userName,String cardNo);

    // 编辑修改数据
    public JSONObject updateVipInfo(JSONObject request);
}

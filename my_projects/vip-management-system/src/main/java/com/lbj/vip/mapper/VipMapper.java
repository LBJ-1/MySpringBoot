package com.lbj.vip.mapper;

import com.alibaba.fastjson.JSONObject;
import com.lbj.vip.model.VipInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

/**
 * @Author Liu.B.J
 */
@Mapper
public interface VipMapper {
    // 获取VIP总数
    public Integer getVipsTotal();

    // 获取分页VIP信息
    public List<VipInfo> selectVipsByPage(Map<String,Object> map);

    // 修改
    @Update("update vip_info set vip_status=#{vipStatus}, isPermanent=#{isPermanent},userName=#{userName}" +
            " where id=#{id}")
    int updateInfo(JSONObject request);
}

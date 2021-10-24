package com.zyx.init.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zyx.init.demo.entity.po.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper extends BaseMapper<UserInfo> {
}

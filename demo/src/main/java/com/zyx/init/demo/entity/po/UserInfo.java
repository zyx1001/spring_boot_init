package com.zyx.init.demo.entity.po;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserInfo {
    /**
     * 主键id
     */
    @TableId
    private Integer id;
    /**
     * 名字
     */
    private String userName;
    /**
     * 修改时间
     */
    private String password;
    /**
     * 修改时间
     */
    private LocalDateTime createTime;
    /**
     * 修改时间
     */
    private String updateTime;
    /**
     * 逻辑删除
     */
    private Boolean isDeleted;
}

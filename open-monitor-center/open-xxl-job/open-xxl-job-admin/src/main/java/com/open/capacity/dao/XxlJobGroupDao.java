package com.open.capacity.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.open.capacity.core.model.XxlJobGroup;

/**
 * Created by xuxueli on 16/9/30.
 */
 @Mapper
public interface XxlJobGroupDao {

    public List<XxlJobGroup> findAll();

    public List<XxlJobGroup> findByAddressType(@Param("addressType") int addressType);

    public int save(XxlJobGroup xxlJobGroup);

    public int update(XxlJobGroup xxlJobGroup);

    public int remove(@Param("id") int id);

    public XxlJobGroup load(@Param("id") int id);
}

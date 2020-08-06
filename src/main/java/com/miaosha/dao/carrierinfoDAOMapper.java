package com.miaosha.dao;

import com.miaosha.dataobject.carrierinfoDAO;

public interface carrierinfoDAOMapper {
     //删除方法
    int deleteByPrimaryKey(Long id);
    //插入方法
    int insert(carrierinfoDAO record);

    int insertSelective(carrierinfoDAO record);

    carrierinfoDAO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(carrierinfoDAO record);

    int updateByPrimaryKey(carrierinfoDAO record);
}
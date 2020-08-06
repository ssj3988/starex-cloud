package com.miaosha.dao;

import com.miaosha.dataobject.carrierinfoDAO;

public interface carrierinfoDAOMapper {

    int deleteByPrimaryKey(Long id);

    int insert(carrierinfoDAO record);

    int insertSelective(carrierinfoDAO record);

    carrierinfoDAO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(carrierinfoDAO record);

    int updateByPrimaryKey(carrierinfoDAO record);
}
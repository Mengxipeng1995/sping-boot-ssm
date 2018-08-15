package com.mxp.spingbootssm.mapper;

import com.mxp.spingbootssm.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user1 WHERE id=#{id}")
    User getUser(Integer id);

}

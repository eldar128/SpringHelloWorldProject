package com.yela.mapper;

import com.yela.model.Message;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface  MessageRepository {

    @Select("SELECT text FROM message WHERE id = #{id}")
    public Message findById(int id);

    @Update("UPDATE message SET text = #{text} WHERE id = #{id}")
    int update(Message message);

}

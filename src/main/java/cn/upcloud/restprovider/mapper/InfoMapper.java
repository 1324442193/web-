package cn.upcloud.restprovider.mapper;

import cn.upcloud.restprovider.model.Info;
import org.apache.ibatis.annotations.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Mapper
public interface InfoMapper{
    @Select("select * from ditan")
    List<Info> getallinfo();
    @Update("update * from ditan")
    List<Info> updateinfo();
    @Delete("delete * from ditan where username=#{username}")
    void deleteinfo();
    @Select("select * from ditan where username=#{username}")
    Info checkinfo(String username);
    @Update("update ditan (username,type,area,place,people) values(#{username},#{type},#{area},#{place},#{people})")
    void updateinfo1(String username,String type,String area,String place,String people);
    @Insert("insert into ditan (username,type,area,place,people,status,licence) values(#{username},#{暂无},#{暂无},#{暂无},#{0},#{暂无},#{暂无})")
    void addinfo(String username);
    @Insert("insert into ditan (username,type,area,place,people) values (#{username},#{type},#{area},#{place},#{people})")
    void addinfo1(String username, String type, String area, String place, String people);
}

package cn.upcloud.restprovider.mapper;

import cn.upcloud.restprovider.model.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PersonMapper {
    @Select("select * from person")
    List<Person> getperson();
}

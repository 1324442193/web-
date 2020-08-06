package cn.upcloud.restprovider.mapper;


import cn.upcloud.restprovider.model.Place;
import cn.upcloud.restprovider.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PlaceMapper {
    @Select("select * from place")
    List<Place> getallplace();
    @Select("select * from product")
    List<Product> getallproduct();


}

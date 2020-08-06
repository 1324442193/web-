package cn.upcloud.restprovider.mapper;

import cn.upcloud.restprovider.model.Amount;
import cn.upcloud.restprovider.model.Info;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface AmountMapper {

    @Select("select amount.* from amount order by amount.num")
    List<Amount> getAmountByOrder();
    @Select("select * from amount")
    List<Amount> getByOrder();
}

package cn.upcloud.restprovider.controller;

import cn.upcloud.restprovider.mapper.AmountMapper;
import cn.upcloud.restprovider.model.Amount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AmountController {
    @Autowired
    private AmountMapper amountMapper;

    @RequestMapping("/amount/getamount")
    public List<Amount> getAmountByOrder(){

        List<Amount> amountList= amountMapper.getAmountByOrder();
        return amountList;
    }
    @RequestMapping("/amount/getamount1")
    public List<Amount> getByOrder(){
        List<Amount> amountList= amountMapper.getByOrder();
        return amountList;
    }
}

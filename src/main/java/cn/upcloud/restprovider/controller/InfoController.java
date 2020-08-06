package cn.upcloud.restprovider.controller;
import cn.upcloud.restprovider.mapper.InfoMapper;
import cn.upcloud.restprovider.model.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InfoController {

        @Autowired
        private InfoMapper infoMapper;
//        @RequestMapping("user/test")
//        public String test(){
//            return "test it";
//        }

        @RequestMapping("/info/getallinfo")
        public List<Info> getallinfos(){

            List<Info> infos= infoMapper.getallinfo();
            return infos;
        }
//        @GetMapping("/findAll")
//        public List<Info> findAll(){
//            Pageable pageable = PageResult.of
//        }
        @RequestMapping("/info/checkinfo")
        public Info checkinfo(String username){
            Info info = infoMapper.checkinfo(username);
            return info;
        }
        @RequestMapping("/info/addinfo")
        public String  addinfo(String username,String type,String area,String place,String people){
            infoMapper.addinfo1(username, type, area, place, people);
            return "添加成功";
        }

}

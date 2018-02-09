package top.kkzhixia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.kkzhixia.modle.Demo;
import top.kkzhixia.service.DemoService;

@RestController  
public class DemoController {

       @Autowired

       private DemoService demoService;

      

       @RequestMapping("/likeName")

       public List<Demo> likeName(String name){

              return demoService.likeName(name);

       }

       
       @RequestMapping("/findAllDemo")
       public List<Demo> findAll(){

              return demoService.findAll();

       }
      

}
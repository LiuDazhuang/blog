package top.kkzhixia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.kkzhixia.mapper.DemoMappper;
import top.kkzhixia.modle.Demo;

@Service
public class DemoService {

   @Autowired
   private DemoMappper demoMappper;

      

   public List<Demo> likeName(String name){

        return demoMappper.likeName(name);

   }

   
   public List<Demo> findAll(){

       return demoMappper.getAllDemo();

  }
}
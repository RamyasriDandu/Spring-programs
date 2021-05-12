package com.boots;

 

import java.util.List;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

 

import com.boots.model.AlienSpace;
@Controller
public class AlienController {
    @Autowired
    AlienSpaceRepo repo;
    
    @GetMapping("alien")
    @ResponseBody
    public String getAlien() {
        
    //we want to fetch the data of aliens
    	
        List<AlienSpace> alien = repo.findAll();
        
        //we dont need model here bcoz when we use model it means it works with session we send jsp so we dont need model.
       // we are returning here but what ever we return is consudered as jsp name so instead of considering it as jsp name it says i am sending actual data
        //Inorder make it as actual data it should be represented with annotation @Responsebody
        return alien.toString();
        
        //here alien is a list object we are sending data to a string we dont want that
        //we will convert into toString
    }
    @PostMapping("/addAlien") 
    @ResponseBody
    public String addAl(@RequestBody AlienSpace addAlien) {
    repo.save(addAlien);
        return addAlien.toString();
    }
    

 

}
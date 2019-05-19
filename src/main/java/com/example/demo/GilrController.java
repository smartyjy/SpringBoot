package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(value = "/girlController")
public class GilrController {

    private static final Logger logger = LoggerFactory.getLogger(GilrController.class);

    @Autowired
    private GirlRepository girlRepository;

    @RequestMapping(value = "/helloGirls", method = RequestMethod.GET)
    public String say() {
        return "helloGirls";
    }

    @GetMapping(value = "/girls")
    public List<Girl> girlList() {
        return girlRepository.findAll();
    }

    @PostMapping(value = "/saveGirl")
    public Girl girlAdd(@RequestParam("name") String name, @RequestParam("cupSize") String cupSize,
                        @RequestParam("age") int age) {
        Girl girl = new Girl();
        girl.setName(name);
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository.save(girl);
    }

    @GetMapping(value = "/findGirl/{id}")
    public Girl girlFindOne( @PathVariable("id") Integer id){
        return girlRepository.findById(id).get();
    }

    @DeleteMapping(value = "/deleteGirl/{id}")
    public void girlDeleteOne ( @PathVariable("id") Integer id){
        girlRepository.deleteById( id );
    }

    @PutMapping(value = "/updateGirl/{id}")
    public Girl updateGirl (@PathVariable("id") Integer id,@RequestParam("name") String name,
                            @RequestParam("cupSize") String cipSzie,@RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setId( id );
        girl.setCupSize( cipSzie );
        girl.setName( name );
        girl.setAge( age );
        return girlRepository.save( girl );
    }

    @GetMapping(value = "/findAgeGirls/{age}")
    public List<Girl> findAgeGirls(@PathVariable("age") Integer age){
        logger.error("findAgeGirls:::" + String.valueOf( age) );
        return girlRepository.findByAge( age );
    }
}

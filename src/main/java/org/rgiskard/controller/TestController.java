package org.rgiskard.controller;

import com.google.common.collect.ImmutableSet;
import java.math.BigDecimal;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.rgiskard.model.Module;
import org.rgiskard.model.Result;

/**
 * A REST controller used to create a json string representing Module + composite
 * Result objects
 * 
 * @author rgiskard
 */
@RestController
@RequestMapping(value="/module")
public class TestController {
    
    @RequestMapping(value="/{moduleId}", method=RequestMethod.GET)
    public ResponseEntity<Module> saveModuleChoices(@PathVariable("moduleId") String moduleId) {
        
        Module module =
            new Module(
                moduleId, 
                "Module Description for ".concat(moduleId), 
                "ONE",
                ImmutableSet.<Result>of(
                    new Result(new BigDecimal("30.0"), Boolean.TRUE),
                    new Result(new BigDecimal("40.0"), Boolean.TRUE),
                    new Result(new BigDecimal("5.0"), Boolean.FALSE)
                )
            );
        
        return new ResponseEntity<Module>(module, HttpStatus.OK);
    }

}

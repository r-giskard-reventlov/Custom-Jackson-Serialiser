/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.rgiskard.jackson;

import org.rgiskard.model.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * Simple class which directs Jackson to use custom serialisers when dealing with
 * object of a defined type.
 * 
 * @author rgiskard
 */
public class CustomObjectMapper extends ObjectMapper {
    public CustomObjectMapper() {
        SimpleModule advisingModule = new SimpleModule("AdvisingModule");
        advisingModule.addSerializer(Module.class, new ModuleJsonSerializer());
        this.registerModule(advisingModule);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.rgiskard.jackson;

import org.rgiskard.model.Result;
import org.rgiskard.model.Module;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;


/**
 * Custom serialiser used to demonstrate the serialisation of only certain
 * properties of an object
 * 
 * @author rgiskard
 */
public class ModuleJsonSerializer extends JsonSerializer<Module> {

    @Override
    public void serialize(Module module, JsonGenerator jg, SerializerProvider sp) throws IOException, JsonProcessingException {
        jg.writeStartObject();
        jg.writeStringField("code", module.getCode());
        jg.writeFieldName("results");
        jg.writeStartArray();
        jg.writeStartObject();
        for(Result result : module.getResults()) {
            jg.writeNumberField("grade", result.getGrade());
        }
        jg.writeEndObject();
        jg.writeEndArray();
        jg.writeEndObject();
    }
    
    @Override
    public Class<Module> handledType() {
        return Module.class;
    }
    
    

}

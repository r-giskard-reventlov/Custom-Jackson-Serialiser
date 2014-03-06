package org.rgiskard.model;

import com.google.common.collect.ImmutableSet;

/**
 * Represents a module which can be taken during study 
 * 
 * @author rgiskard
 */
public class Module {
    
    private final String code;
    private final String description;
    private final String level;
    private final ImmutableSet<Result> results;

    public Module(String code, String description, String level, ImmutableSet<Result> results) {
        this.code = code;
        this.description = description;
        this.level = level;
        this.results = results;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String getLevel() {
        return level;
    }

    public ImmutableSet<Result> getResults() {
        return results;
    }
    
}

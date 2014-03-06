package org.rgiskard.model;

import java.math.BigDecimal;

/**
 * Represents a result for a module
 * 
 * @author rgiskard
 */
public class Result {
    
    private final BigDecimal grade;
    private final Boolean passed;

    public Result(BigDecimal grade, Boolean passed) {
        this.grade = grade;
        this.passed = passed;
    }

    public BigDecimal getGrade() {
        return grade;
    }

    public Boolean isPassed() {
        return passed;
    }
    
}

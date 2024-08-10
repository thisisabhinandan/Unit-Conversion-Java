package com.example.conversion;

public class ConversionInput {
    private String fromUnit;
    private String toUnit;
    private double value;

    // Constructor
    public ConversionInput(String fromUnit, String toUnit, double value) {
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.value = value;
    }

    // Getters and setters
    public String getFromUnit() {
        return fromUnit;
    }

    public void setFromUnit(String fromUnit) {
        this.fromUnit = fromUnit;
    }

    public String getToUnit() {
        return toUnit;
    }

    public void setToUnit(String toUnit) {
        this.toUnit = toUnit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}

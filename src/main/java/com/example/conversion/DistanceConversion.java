package com.example.conversion;

public class DistanceConversion implements Converter {

    @Override
    public double convert(ConversionInput input) {
        String fromUnit = input.getFromUnit();
        String toUnit = input.getToUnit();
        double value = input.getValue();

        if (fromUnit.equalsIgnoreCase("Kilometer") && toUnit.equalsIgnoreCase("Miles")) {
            return value * 0.621371;
        } else if (fromUnit.equalsIgnoreCase("Miles") && toUnit.equalsIgnoreCase("Kilometer")) {
            return value * 1.60934;
        } else if (fromUnit.equalsIgnoreCase("Meters") && toUnit.equalsIgnoreCase("Feet")) {
            return value * 3.28084;
        } else if (fromUnit.equalsIgnoreCase("Feet") && toUnit.equalsIgnoreCase("Meters")) {
            return value * 0.3048;
        } else if (fromUnit.equalsIgnoreCase("Centimeters") && toUnit.equalsIgnoreCase("Inches")) {
            return value * 0.393701;
        } else if (fromUnit.equalsIgnoreCase("Inches") && toUnit.equalsIgnoreCase("Centimeters")) {
            return value * 2.54;
        }
        // Add more distance conversions as needed

        throw new IllegalArgumentException("Conversion from " + fromUnit + " to " + toUnit + " not supported.");
    }
}

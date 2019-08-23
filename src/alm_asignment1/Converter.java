package alm_asignment1;

public class Converter {
    
    public double fToC(double fahrenheit) {
        
        double celsius = (fahrenheit -32) / 1.8;
        
        return celsius;
    }
    
    public double cToF(double celsius) {
        
        double fahrenheit = celsius * 1.8 + 32;
        
        return fahrenheit;
    }
}
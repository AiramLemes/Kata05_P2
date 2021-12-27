

package Controller;

import java.util.HashMap;
import java.util.Map;
import View.*;
import Model.*;


public class Kata5 {

   
    public static void main(String[] args) {
        
        execute();
        
        
    }
    
    
    public static void execute() {
        
        output();
        
    }
    
    
    
    public static MailListReader input() {
        
        MailListReader correos = new MailListReader();
        return correos;
        
        
        
    }
    
    
    public static MailHistogramBuilder process() {
        
        MailHistogramBuilder histogramBuilder = new MailHistogramBuilder();
        return histogramBuilder;
        
    }
    
    
    
    public static void output() {
        new HistogramDisplay(process().builder(input().read("email.txt"))).execute();
    }
}

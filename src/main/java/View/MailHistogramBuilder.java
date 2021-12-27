/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Model.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

/**
 *
 * @author universidad
 */
public class MailHistogramBuilder {
     
    
    public static Histogram<String> builder (List<Mail> lista) {
        
        
        Histogram<String> histogram = new Histogram();
        
        
        for (Mail mail: lista) {
            histogram.increment(mail.getDomain());
        }
   
    
        return histogram;
    
    
    }

    
}

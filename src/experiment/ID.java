
package experiment;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Chamod
 */
public class ID {
    
    public static void main(String[] args) {
                
                String temp= "199521802366";
            
                Calendar instance = Calendar.getInstance();
                instance.setLenient(true);
                if (temp.length() == 10) {
                    int year = Integer.parseInt("19" + temp.substring(0, 2));
                    boolean isLeapYear = ((GregorianCalendar) GregorianCalendar.getInstance()).isLeapYear(year);
                    int otherOne = Integer.parseInt(temp.substring(2, 5));
                    if (!isLeapYear && ((otherOne > 59 && otherOne < 501) || otherOne > 559)) {
                        otherOne--;
                    }
                    if (otherOne > 499) {
                        
                        otherOne -= 500;
                    } else {                       
                        //male
                    }
                    
                    instance.set(year, 0, otherOne);
                    System.out.println(instance.getTime());
                   

                } else {
                    int year = Integer.parseInt(temp.substring(0, 4));
                    boolean isLeapYear = ((GregorianCalendar) GregorianCalendar.getInstance()).isLeapYear(year);
                    int otherOne = Integer.parseInt(temp.substring(4, 7));
                    if (!isLeapYear && ((otherOne > 59 && otherOne < 501) || otherOne > 559)) {
                        otherOne--;
                    }
                    if (otherOne > 499) {
                        //female                        
                        otherOne -= 500;
                    } else {
                        //male
                    }
                    
                    instance.set(year, 0, otherOne);                    
                    System.out.println(instance.getTime());
                }
            }
    }
    


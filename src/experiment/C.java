/**
 *
 * @author Chamod Thanthiriwaththage
 */

package experiment;

 class C {  
    
    public static void main(String[] args) {
        //Methanata Oyata One parameter eka pass Karaganna
       System.out.println(GetAnswer(210));
      //  byte c=(byte) 1200000;
        
        
        
       // System.out.println(c);
    }
    
     static int incrementing_number=1;
     static int answer=1;
    
     static int GetAnswer(int i){ 
        if (i<0) {
            answer=0;
            //rina nam answer eka 0
        }
        else if (i==0) {
            answer=1;            
        }
        else{         
            if (incrementing_number <= i) {
               answer=answer*incrementing_number;   
                
                if (incrementing_number == i) {
                    return (int)answer; 
                }
                else{
                    incrementing_number++;
                    GetAnswer(i);
                }               
            }
        }
        return answer;    
    } 
}


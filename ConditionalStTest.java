public class ConditionalStTest {
    public static void main(String[] args) {
 /*  
        int i = 0;
        if(i>0) 
        if(i>1000) System.out.println("IF_1");
        else if(i<-10) System.out.println("ELSE_IF_1");
        else System.out.println("ELSE");

        else System.out.println("ELSE_2"); // 1st if er else
*/
        // Nested ifs 
        int ii =10;
        if(ii == 10)
        {
            if(ii < 20) System.out.println("IF_1");
    
                if(ii > 20) System.out.println("IF_2"); // this if if 
            else System.out.println("ELSE_1");  /// associated with this else
           //  else System.out.println("ELSE_2"); // error Because this else doesnot refer any if
        }
        else System.out.println("ELSE_3");  // this else refers to if(ii==10)

        // Nested ifs

        int iii=100;
        if(iii ==10)
        if(iii < 20)
        if(iii> 100) System.out.println("IF_1");
        else System.out.println("ELSE_1"); // this else refers to if(iii > 100)
        else System.out.println("ELSE_2"); // this else refers to if(iii < 20)
        else System.out.println("ELSE_3"); // this else refers to if(iii==10)


        // Nested ifs

        int iiii=100;
        if(iiii< 20) System.out.println("IF_1");
        if(iiii>100) System.out.println("IF_2");
        else System.out.println("ELSE_1"); // this else refers to if(iiii>100)
        //else System.out.println("ELSE_2"); // Error!! /// this else doesnot refer any if


/* 
        int[] v = {-1,10,1100,5};
        for(int i:v)

        if(i>0) 
        if(i>1000) System.out.println("IF_1");
        else if(i<-10) System.out.println("ELSE_IF_1");
        else System.out.println("ELSE");

        else if(i==-100) System.out.println("ELSE_IF_2");
        else System.out.println("ELSE_2");

        double d = 2.578; boolean b = true;
        if(d==2.578) System.out.println("Double Matched.");
        if(b==true) System.out.println("bool Matched.");
        if(b) System.out.println("bool matched");
*/

        // Traditional Switch

        int i=0;

        switch(i){
            case 0: System.out.println("CASE_0"); 
            switch (i) {
                case 0: System.out.println("Nested_Case_0"); break;
            
                default: break;
            }
            break;
            // System.out.println("ERROR"); // Ureachable code
            case -100: System.out.println("CASE_-100");

            case 100: System.out.println("CASE_100");

            // case 100: // ERROR!!    // duplicate case value are not allowed
            default: System.out.println("CASE_Default");
            
        }

        
    }
    
}

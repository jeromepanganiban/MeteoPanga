import javax.servlet.http.*;
import java.io.*;


public class Meteo extends HttpServlet{
   
    public void doGet(HttpServletRequest request,HttpServletResponse response){
      String[] settimana=new String[7];
      int nr;
      for(int i=0;i<7;i++)
        {nr=(int)(Math.random()*100);
        if(nr<20)
        {
            settimana[i]="Soleggiato";
        }
        else if(nr<40)
        {
          settimana[i]="Piovoso";
        }
         else if(nr<60)
        {
          settimana[i]="Nuvoloso";
        }
         else if(nr<80)
        {
          settimana[i]="Nevoso";
        }
        else
        {
         settimana[i]="Nebbioso";  
        }
        }
      try{
		  response.getOutputStream().println("Lunedi:"+settimana[0]);
		  response.getOutputStream().println("Martedi:"+settimana[1]);
		  response.getOutputStream().println("Mercoledi:"+settimana[2]);
		  response.getOutputStream().println("Giovedi:"+settimana[3]);
		  response.getOutputStream().println("Venerdi:"+settimana[4]);
		  response.getOutputStream().println("Sabato:"+settimana[5]);
		  response.getOutputStream().println("Domenica:"+settimana[6]);
		}catch(Exception e){}
    }
    
}

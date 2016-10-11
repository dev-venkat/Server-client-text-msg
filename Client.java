import java.io.*;
import java.net.*;
class Client
{
        public static void main(String args[])
        {
                try
                {
					
				Socket s=new Socket("127.0.0.1",1500);
				System.out.println("Connection Established");
				
				//Handllng Incoming msg
				BufferedReader msgrcvd = 
					new BufferedReader(new InputStreamReader(s.getInputStream()));	
						
				//reading from keyboard
				BufferedReader br=new BufferedReader
					(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(s.getOutputStream(),true); 
								
				while(true){
																	
						String msgin=msgrcvd.readLine();
						System.out.println("From server:"+msgin);
																		
						System.out.println("Enter text:");
						String msgout=br.readLine();
						pw.print(msgout);
					//	pw.close();	                        									
						
					}
                 }
                 catch(UnknownHostException e1){}
                 catch(IOException e2){}
        }
}

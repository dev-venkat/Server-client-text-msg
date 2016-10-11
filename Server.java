import java.io.*;
import java.net.*;
class Server
{
        public static void main(String args[])
        {
                try
                {
                     
						ServerSocket ss=new ServerSocket(1500);
                        Socket s=ss.accept();
                        System.out.println("Connection Established");
						
						//Handllng Incoming msg
						BufferedReader Srvmsgrcvd = 
							new BufferedReader(new InputStreamReader(s.getInputStream()));						
						
						//reading from keyboard
						BufferedReader br=new BufferedReader
							(new InputStreamReader(System.in));
						PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
						
						
					while(true){ 						
						
						System.out.println("Enter text:");
						String msgout=br.readLine();
                        pw.print(msgout);
					//	pw.close();
						System.out.println("Waiting for msg..");
						
						
						String Srvmsgin = Srvmsgrcvd.readLine();
						System.out.println("From Client:"+Srvmsgin);
						pw.close();						
					}
					
						
                }
                catch(UnknownHostException e1){}
                catch(IOException e2){}

        }
}

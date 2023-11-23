import java.io.*;
class LaunchBRFR
{
    public static void main(String args[]) throws Exception
    {
        File dir=new File("PW");
        File file=new File("Pw.txt");
        
        FileReader fd=new FileReader(file);
        BufferedReader bf=new BufferedReader(fd);
        
         String line=br.readLine();
         While(line!=null)
         {
             System.out.println(line);
             line=br.readLine();
         }
    }
}
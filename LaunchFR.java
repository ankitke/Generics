import java.io.*;
class LaunchFR
{
    public static void main(String args[]) throws Exception
    {
        File dir=new File("Pw");
        File file=new File(dir, "Pw.txt");
        
        FileReader fd=new FileReader(file);
        int i=fd.read();
        System.out.println((char)i);
        
        while(i!=-1)
        {
            System.out.print(i+"------------>");
            System.out.println((char)i);
            i=fd.read();
        }
    }
}
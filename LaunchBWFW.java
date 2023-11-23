import java.io.*;
class LaunchBWFW
{
    public static void main(String args[]) throws Exception
    {
        File dir=new File("PW");
        File file=new File("Pw.txt");
        
        FileWriter fw=new FileWriter(file);
        BufferedWriter bw=new BufferedWriter(fw);
        
        bw.write("Java");
        bw.newLine();
        bw.write(65);
        bw.newLine();
        char []ch= {'P','w','s','j'};
        bw.write(ch);
        
        bw.flush();
        bw.close();
        System.out.println("Ankit");
    }
}
import java.io.*;
class LaunchFW
{
    public static void main(String args[]) 
    {
        File dir=new File("PW");
        File file=new File(dir, "Pw.txt");
        try
        {
            file.createNewFile();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        FileWriter fw=new FileWriter(file, true);
        fw.write("Java");
        fw.write(97);
        fw.write(65);
        char [] ch={'J', 'a','v', 'a'};
        fw.write(ch);
        fw.close();
    }
}
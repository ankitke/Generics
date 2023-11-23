import java.io.*;
class LaunchFile2
{
    public static void main(String args[])
    {
        File dir=new File("PWJava");
        System.out.println(dir.isDirectory());
        dir.mkdir();
        
        File file=new File("PWSkills");
        try
        {
            file.createNewFile();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println(file.isFile());
        
        int count=0;
        File f=new File("PWJava");
        String str[]= f.list();
        for(String name: str)
        {``
            count++;
            System.out.println(name);
        }
        System.out.println("No of files are= "+count);
        
    }
}
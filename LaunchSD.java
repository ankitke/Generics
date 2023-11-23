import java.io.Serializable;
class Cricketer implements Serializable
{
    private String name;
    private int age;
    private int runs;
    
    public Cricketer(String name, int age, int runs)
    {
        this.name=name;
        this.age=age;
        this.runs=runs;
    }
}
class LaunchSD
{
    public static void main(String args[])
    {
        Cricketer c=new Cricketer("Kohli", 34, 56);
        FileOutputStream fos=new FileOutputStream("pw.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        oos.WriteObject(c);
        oos.flush();
        oos.close();
    }
}
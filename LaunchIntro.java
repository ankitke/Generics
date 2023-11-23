class Student
{
    private String name;
    private int age;
    private String city;
    public Student(String name, int age, String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;
    }
    public String toString()
    {
        return "Name: "+name+ "| Age: "+age+ "|City: "+city;
    }
}
class LaunchIntro
{
    public static void main(String args[])
    {
        Student s1=new Student("Ankit", 21, "Forbesganj");
        System.out.println(s1);
        Student s2=new Student("Rohit", 23, "Delhi");
        System.out.println(s2);
    }
}
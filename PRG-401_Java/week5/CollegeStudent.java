package week5;

public class CollegeStudent {
    
    private String name;
    private int rollno, age = 0;
    
    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getRoll()
    {
        return rollno;
    }

    public void setRoll(int rollno)
    {
        if(rollno < 1)
        {
            rollno = 1;
            return;
        }

        this.rollno = rollno;
    }

    public void setAge(int age)
    {
        if(age < 0)
        {
            age = 0;    
            return ;
        }

        this.age = age;
    }
}

public class Student {
    protected String name;
    protected String surname;
    protected String gender;
    protected int age;
    protected String EducationalInst;


    //constructors
    public Student(String name,String surname,
                   String gender,int age ) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    public Student() {
        name = "Дима";
        surname = "Мазуро";
        gender = "мужской";
        age = 18;
    }

    //get methods
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String EducationalInst() {
        return EducationalInst;
    }
}

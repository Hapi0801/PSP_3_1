public class SchoolBoy extends Student {
    private  int classNumber;
    private String classLetter;

    public SchoolBoy (String name,String surname,
                      String gender,int age, int classNumber,
                      String classLetter) {
        super(name, surname, gender,age);
        this.classNumber = classNumber;
        this.classLetter = classLetter;
    }

    public SchoolBoy (String name,String surname,
                      String gender,int age) {
        super(name, surname, gender,age);
        classNumber = 10;
        classLetter = "A";
    }

    public SchoolBoy() {
        super();
        classNumber = 11;
        classLetter = "A";
    }

    public int getClassNumber(){
        return classNumber;
    }

    public String getClassLetter() {
        return classLetter;
    }

    @Override
    public String EducationalInst() {
        EducationalInst = "Гимназия 20";
        return EducationalInst;
    }
}

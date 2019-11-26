public class StudentPerson extends Student {
    private String faculty;
    private int groupNumber;
    private String specialization;

    public StudentPerson(String name,String surname,
                         String gender,int age,
                         String faculty, int groupNumber,
                         String specialization) {
        super(name, surname, gender,age);
        this.faculty = faculty;
        this.groupNumber = groupNumber;
        this.specialization = specialization;
    }

    public StudentPerson(String name,String surname,
                         String gender,int age) {
        super(name, surname, gender,age);
        faculty = "IEF";
        groupNumber = 772302;
        specialization = "ISIT";
    }

    public StudentPerson() {
        super();
        faculty = "FITU";
        groupNumber = 760001;
        specialization = "ASOI";
    }



    public String getFaculty() {
        return faculty;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String EducationalInst() {
        EducationalInst = "Бгуир";
        return EducationalInst;
    }
}

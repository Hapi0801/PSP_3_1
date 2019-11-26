public class Aspirant extends Student {
    private String sWork;
    private String sTeacher;

    public Aspirant(String name,String surname,
                    String gender,int age,
                    String sWork, String sTeacher) {
        super(name, surname, gender,age);
        this.sWork = sWork;
        this.sTeacher = sTeacher;
    }

    public Aspirant(String name,String surname,
                    String gender,int age) {
        super(name, surname, gender,age);
        sWork = "Научная работа";
        sTeacher = "Луцик";
    }

    public Aspirant() {
        super();
        sWork = "ММЭ";
        sTeacher = "Шкода";
    }

    public String getsWork() {
        return sWork;
    }

    public String getsTeacher() {
        return sTeacher;
    }

    @Override
    public String EducationalInst() {
        EducationalInst = "БГУ";
        return EducationalInst;
    }
}

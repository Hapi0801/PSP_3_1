public class Aspirant implements Object, Student {
    private String sWork;
    private String sTeacher;

    public Aspirant(String sWork,String sTeacher) {
        this.sWork = sWork;
        this.sTeacher = sTeacher;
    }

    public String getsWork() {
        return sWork;
    }

    public String getsTeacher() {
        return sTeacher;
    }


    @Override
    public void printInfo() {
        System.out.println("Аспирант - Научная работа: " + getsWork()
        + "\n" + "Научный руководитель: " + getsTeacher() + "\n"
        + "Статус: " + Status() + "\n");
    }

    @Override
    public String Status() {
        return (String) "Отличник";
    }
}

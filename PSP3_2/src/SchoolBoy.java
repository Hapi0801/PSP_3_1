public class SchoolBoy implements  Object, Student {

    private  int classNumber;
    private String classLetter;

    public SchoolBoy(int classNumber, String classLetter) {
        this.classNumber = classNumber;
        this.classLetter = classLetter;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public String getClassLetter() {
        return classLetter;
    }

    @Override
    public void printInfo() {
        System.out.println("Школьник - Класс: " + getClassNumber() +
                "\n" + "Буква: " + getClassLetter() + "\n" +
                "Статус: " + Status() + "\n");
    }

    @Override
    public String Status() {
        return (String) "Хорошист";
    }
}

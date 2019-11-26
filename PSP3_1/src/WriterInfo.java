public class WriterInfo {
    public static void main(String[] args) {

        SchoolBoy schoolboy1 = new SchoolBoy("Dimka", "Mazuro", "мужской", 17, 11, "А");
        System.out.println("Ученик 1 - Имя: " + schoolboy1.getName() + "\n" +
                "Фамилия: " + schoolboy1.getSurname() + "\n" +
                "Пол: " + schoolboy1.getGender() + "\n" +
                "Возраст: " + schoolboy1.getAge() + "\n" +
                "Класс: " + schoolboy1.getClassNumber() + "\n" +
                "Буква: " + schoolboy1.getClassLetter() + "\n" +
                "Учебное заведение: " + schoolboy1.EducationalInst() + "\n");

        SchoolBoy schoolboy2 = new SchoolBoy("Толя", "Толий", "мужской", 17);
        System.out.println("Ученик 2 - Имя: " + schoolboy2.getName() + "\n" +
                "Фамилия: " + schoolboy2.getSurname() + "\n" +
                "Пол: " + schoolboy2.getGender() + "\n" +
                "Возраст: " + schoolboy2.getAge() + "\n" +
                "Класс: " + schoolboy2.getClassNumber() + "\n" +
                "Буква: " + schoolboy2.getClassLetter() + "\n" +
                "Учебное заведение: " + schoolboy2.EducationalInst() + "\n");

        StudentPerson sp1 = new StudentPerson("Dzmitry", "Mazura", "мужской", 19);
        System.out.println("Студент 1 - Имя: " + sp1.getName() + "\n" +
                "Фамилия: " + sp1.getSurname() + "\n" +
                "Пол: " + sp1.getGender() + "\n" +
                "Возраст: " + sp1.getAge() + "\n" +
                "Факультет: " + sp1.getFaculty() + "\n" +
                "Группа: " + sp1.getGroupNumber() + "\n" +
                "Специальность: " + sp1.getSpecialization() + "\n" +
                "Учебное заведение: " + sp1.EducationalInst() + "\n");

        Aspirant asp1= new Aspirant("Zmiter", "Mazura", "мужской", 23);
        System.out.println("Аспирант 1 - Имя: " + asp1.getName()+ "\n" +
                "Фамилия: " + asp1.getSurname() + "\n" +
                "Пол: " + asp1.getGender() + "\n" +
                "Возраст: " + asp1.getAge() + "\n" +
                "Научная работа: " + asp1.getsWork() + "\n" +
                "Научный руководитель: " + asp1.getsTeacher() + "\n" +
                "Учебное заведение: " + asp1.EducationalInst() + "\n");
    }
}

public class Ochnik extends StudentPerson {

    public Ochnik(String faculty, int groupNumber,
                  String specialization, String favoriteSbj) {
        super(faculty, groupNumber, specialization, favoriteSbj);
    }

    @Override
    public String getFavoriteSubj() {
        return favoriteSubj;
    }


    @Override
    public void printInfo() {
        System.out.println("Очник - Факультет: " + getFaculty() +
                "\n" + "Номер группы: " + getGroupNumber() +
                "\n" + "Специальность: " + getSpecialization() +
                "\n" + "Любимый предмет: " + getFavoriteSubj() + "\n");
    }

    @Override
    public String Status() {
        return (String) "Середняк";
    }
}

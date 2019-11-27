public abstract class StudentPerson implements Object, Student {
    private String faculty;
    private int groupNumber;
    private String specialization;
    protected  String favoriteSubj;

    public StudentPerson(String faculty, int groupNumber, String specialization, String favoriteSubj) {
        this.faculty = faculty;
        this.groupNumber = groupNumber;
        this.specialization = specialization;
        this.favoriteSubj = favoriteSubj;
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

    public abstract String getFavoriteSubj();
}

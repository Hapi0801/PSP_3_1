public class WriterInfo {
    public static void main(String[] args) {
        SchoolBoy sb1 = new SchoolBoy(11, "A");
        sb1.printInfo();

        Aspirant asp1 = new Aspirant("Начная работа", "Луцик");
        asp1.printInfo();

        Zaochnik z1 = new Zaochnik("IEF", 772303,"ISIT", "Maths");
        z1.printInfo();

        Ochnik och1 = new Ochnik("FITU",772302,"ASOI","Economics");
        och1.printInfo();
    }
}

public class RavenclawStudent extends HogwartsStudent {

    private int wise;
    private int witty;
    private int creativity;

    public RavenclawStudent(String name, int magic, int transgression, int wise, int witty, int creativity) {
        super(name, magic, transgression);
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return super.toString() + "RavenclawStudent{" +
                "wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity +
                '}';
    }
    public int countTotalScoreRavenclaw () {
        int total = countTotalScore() + getCreativity() + getWise() + getWitty();
        return total;
    }
    public static void printTotalScore (RavenclawStudent ravenclawStudent) {
        System.out.println(ravenclawStudent.getName() + " = " + ravenclawStudent.countTotalScoreRavenclaw());
    }

    public static void compareTwoStudents (RavenclawStudent ravenclawStudentOne, RavenclawStudent ravenclawStudentTwo) {
        if (ravenclawStudentOne.countTotalScoreRavenclaw () > ravenclawStudentTwo.countTotalScoreRavenclaw()) {
            System.out.println(ravenclawStudentOne.getName() + " лучше Рейвенклавец, чем " + ravenclawStudentTwo.getName());
        } else {
            System.out.println(ravenclawStudentTwo.getName() + " лучше Рейвенклавец, чем " + ravenclawStudentOne.getName());
        }
    }
}

public class HufflepuffStudent extends HogwartsStudent{

    private int hardworking;
    private int loyal;
    private int honest;

    public HufflepuffStudent(String name, int magic, int transgression, int hardworking, int loyal, int honest) {
        super(name, magic, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }
    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return super.toString() + "HufflepuffStudent{" +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                '}';
    }
    public int countTotalScoreHufflepuff () {
        int total = countTotalScore() + getHardworking() + getLoyal() + getHonest();
        return total;
    }
    public static void printTotalScore (HufflepuffStudent hufflepuffStudent) {
        System.out.println(hufflepuffStudent.getName() + " = " + hufflepuffStudent.countTotalScoreHufflepuff());
    }
    public static void compareTwoStudents (HufflepuffStudent hufflepuffStudentOne, HufflepuffStudent hufflepuffStudentTwo) {
        if (hufflepuffStudentOne.countTotalScoreHufflepuff () > hufflepuffStudentTwo.countTotalScoreHufflepuff ()) {
            System.out.println(hufflepuffStudentOne.getName() + " лучше Хафлпафец, чем " + hufflepuffStudentTwo.getName());
        } else {
            System.out.println(hufflepuffStudentTwo.getName() + " лучше Хафлпафец, чем " + hufflepuffStudentOne.getName());
        }
    }
}

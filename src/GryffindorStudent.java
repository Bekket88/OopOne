public class GryffindorStudent extends HogwartsStudent {

    private int nobility;
    private int honour;
    private int bravery;

    public GryffindorStudent(String name, int magic, int transgression, int nobility, int honour, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() + "GryffindorStudent{" +
                "nobility=" + nobility +
                ", honour=" + honour +
                ", bravery=" + bravery +
                '}';
    }
    public int countTotalScoreGryffindor () {
        int total = countTotalScore() + getNobility() + getHonour() + getBravery();
        return total;
    }
    public static void printTotalScore (GryffindorStudent gryffindorStudent) {
        System.out.println(gryffindorStudent.getName() + " = " + gryffindorStudent.countTotalScoreGryffindor());
    }
    public static void compareTwoStudents (GryffindorStudent gryffindorStudentOne, GryffindorStudent gryffindorStudentTwo) {
        if (gryffindorStudentOne.countTotalScoreGryffindor() > gryffindorStudentTwo.countTotalScoreGryffindor()) {
            System.out.println(gryffindorStudentOne.getName() + " лучшие Гриффиндорец, чем " + gryffindorStudentTwo.getName());
        } else {
            System.out.println(gryffindorStudentTwo.getName() + " лучшие Гриффиндорец, чем " + gryffindorStudentOne.getName());
        }
    }
}

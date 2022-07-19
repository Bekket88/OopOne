public class SlytherinStudent extends HogwartsStudent {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public SlytherinStudent(String name, int magic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() + "SlytherinStudent{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                '}';
    }
    public int countTotalScoreSlytherin () {
        int total = countTotalScore() + getAmbition() + getCunning() + getDetermination() + getLustForPower() + getResourcefulness();
        return total;
    }
    public static void printTotalScore (SlytherinStudent slytherinStudent) {
        System.out.println(slytherinStudent.getName() + " = " + slytherinStudent.countTotalScoreSlytherin());
    }
    public static void compareTwoStudents (SlytherinStudent slytherinStudentOne, SlytherinStudent slytherinStudentTwo) {
        if (slytherinStudentOne.countTotalScoreSlytherin () > slytherinStudentTwo.countTotalScoreSlytherin()) {
            System.out.println(slytherinStudentOne.getName() + " лучше Слизеринец, чем " + slytherinStudentTwo.getName());
        } else {
            System.out.println(slytherinStudentTwo.getName() + " лучше Слизеринец, чем " + slytherinStudentOne.getName());
        }
    }
}



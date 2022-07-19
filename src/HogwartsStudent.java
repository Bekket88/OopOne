public abstract class HogwartsStudent {
    private String name;
    private int magic;
    private int transgression;

    public HogwartsStudent(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "HogwartsStudent{" +
                "name='" + name + '\'' +
                ", magic=" + magic +
                ", transgression=" + transgression +
                '}';
    }
    public int countTotalScore () {
        int total = getMagic() + getTransgression();
        return total;
    }
    public static void compareTwoHogwartsStudents (HogwartsStudent hogwartsStudenOne, HogwartsStudent hogwartsStudentTwo) {
        if (hogwartsStudenOne.countTotalScore() > hogwartsStudentTwo.countTotalScore()) {
            System.out.println(hogwartsStudenOne.getName() + " обладает бОльшей мощностью магии, чем " + hogwartsStudentTwo.getName());
        } else {
            System.out.println(hogwartsStudentTwo.getName() + " обладает бОльшей мощностью магии, чем " + hogwartsStudenOne.getName());
        }
    }
}


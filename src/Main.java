public class Main {

    public static void main(String[] args) {
        GryffindorStudent harryPotter = new GryffindorStudent("Гарри Поттер", 15, 20, 51, 80, 78);
        GryffindorStudent hermioneGranger = new GryffindorStudent("Гермиона Грейнджер", 21, 18, 50, 75, 70);
        GryffindorStudent ronWeasley = new GryffindorStudent("Рон Узли", 12, 18, 50,31, 45);
        HufflepuffStudent zachariasSmith = new HufflepuffStudent( "Захария Смит", 12, 7, 15, 35, 60);
        HufflepuffStudent cedricDiggory = new HufflepuffStudent( "Седрик Диггори", 20, 18, 27, 48, 60);
        HufflepuffStudent justinFinchFletchley = new HufflepuffStudent("Джастин Финч-Флетчли", 27,19,30,31,29);
        RavenclawStudent choChang = new RavenclawStudent("Джоу Чанг", 22, 16 ,30, 40, 55);
        RavenclawStudent padmaPatil = new RavenclawStudent("Падма Патил", 16, 13, 15, 55, 55);
        RavenclawStudent marcusBelby = new RavenclawStudent("Маркус Белби", 12, 21,40,22,25);
        SlytherinStudent dracoMalfoy = new SlytherinStudent("Драко Малфой", 15, 19,14,15,16,17,18);
        SlytherinStudent grahamMontague = new SlytherinStudent("Грэхем Монтегю", 15, 19,15,19,16,17,18);
        SlytherinStudent gregoryGoyle = new SlytherinStudent("Грегори Гоил", 10,10,10,10,10,10,10);

        GryffindorStudent.printTotalScore(harryPotter);
        GryffindorStudent.printTotalScore(ronWeasley);
        GryffindorStudent.compareTwoStudents(harryPotter, ronWeasley);
        System.out.println();
        HufflepuffStudent.printTotalScore(zachariasSmith);
        HufflepuffStudent.printTotalScore(cedricDiggory);
        HufflepuffStudent.compareTwoStudents(zachariasSmith, cedricDiggory);
        System.out.println();
        RavenclawStudent.printTotalScore(choChang);
        RavenclawStudent.printTotalScore(padmaPatil);
        RavenclawStudent.compareTwoStudents(choChang, padmaPatil);
        System.out.println();
        SlytherinStudent.printTotalScore(dracoMalfoy);
        SlytherinStudent.printTotalScore(gregoryGoyle);
        SlytherinStudent.compareTwoStudents(dracoMalfoy,gregoryGoyle);
        System.out.println();
        HogwartsStudent.compareTwoHogwartsStudents(hermioneGranger, cedricDiggory);
    }
}
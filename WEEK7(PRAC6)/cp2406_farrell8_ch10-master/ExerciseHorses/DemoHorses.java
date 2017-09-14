//Write an application that demonstrates using objects of each class

public class DemoHorses {
    public static void main(String[] args) {

        Horse alex = new Horse();
        RaceHorse randy = new RaceHorse();

        alex.setName("Henrietta");
        alex.setColor("Bay");
        alex.setBirthYear(1986);

        randy.setName("Rosetta");
        randy.setColor("Tan");
        randy.setBirthYear(1990);
        randy.setRaces(3);

        System.out.println( "[Horse]");
        System.out.println( "Name:\t\t\t" + alex.getName());
        System.out.println( "Color:\t\t\t" + alex.getColor());
        System.out.println( "Birth Year:\t\t" + alex.getBirthYear());

        System.out.println( "\n[RaceHorse]");
        System.out.println( "Name:\t\t\t" + randy.getName());
        System.out.println( "Color:\t\t\t" + randy.getColor());
        System.out.println( "Birth Year:\t\t" + randy.getBirthYear());
        System.out.println( "Races:\t\t\t" + randy.getRaces());
    }
}


public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Anna")
                .setSurname("Wolf")
                .setAge(31)
                .setAddress("Sydney")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Anton")
                .build();
        System.out.println(" " + mom + " have son, " + son);

        mom.happyBirthday();
        son.happyBirthday();

        System.out.println();
        System.out.println(" " + mom + " have son, " + son);


        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
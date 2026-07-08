public class Lab04Main {

    public static void main(String[] args) {

        Lecturer lecturer =
                new Lecturer(
                        "Nimal Perera",
                        "L001",
                        "IT",
                        4,
                        50000
                );

        lecturer.displayLecturerDetails();

        System.out.println("Monthly Payment: "
                + lecturer.calculateMonthlyPayment());
    }
}
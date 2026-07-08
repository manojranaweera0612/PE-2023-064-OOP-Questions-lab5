public class Lab04Main4 {

    public static void main(String[] args) {

        Lecturer lecturer =
                new Lecturer(
                        "Nimal",
                        "L001",
                        "IT",
                        4,
                        50000
                );

        LabAssistant assistant =
                new LabAssistant(
                        "Kamal",
                        "A001",
                        "Science",
                        100,
                        1000
                );

        UniversityPolicy.showPolicyHeader();

        System.out.println(
                UniversityPolicy.UNIVERSITY_NAME);

        System.out.println("Lecturer Bonus: "
                + UniversityPolicy.calculateBonus(
                        lecturer.calculateMonthlyPayment()));

        System.out.println("Assistant Bonus: "
                + UniversityPolicy.calculateBonus(
                        assistant.calculateMonthlyPayment()));
    }
}
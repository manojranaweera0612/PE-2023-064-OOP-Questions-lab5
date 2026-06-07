public class Lab04Main2 {

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

        lecturer.displayLecturerDetails();

        System.out.println();

        assistant.displayLabAssistantDetails();
    }
}
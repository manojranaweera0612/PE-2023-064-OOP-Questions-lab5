public class Lab04Main5 {

    public static void main(String[] args) {

        // Show system name
        StaffMember.showSystemName();

        // Create 3 staff objects
        Lecturer lecturer1 =
                new Lecturer(
                        "Nimal",
                        "L001",
                        "IT",
                        4,
                        50000
                );

        Lecturer lecturer2 =
                new Lecturer(
                        "Sunil",
                        "L002",
                        "Management",
                        3,
                        45000
                );

        LabAssistant assistant =
                new LabAssistant(
                        "Kamal",
                        "A001",
                        "Science",
                        100,
                        1000
                );

        // Print total staff count
        System.out.println(
                "Total Staff Count: "
                + StaffMember.getStaffCount()
        );
    }
}
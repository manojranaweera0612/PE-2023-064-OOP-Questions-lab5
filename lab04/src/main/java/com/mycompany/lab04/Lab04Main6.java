public class Lab04Main6 {

    public static void main(String[] args) {

        // System Name
        StaffMember6.showSystemName();

        // University Header
        UniversityPolicy.showPolicyHeader();

        // Create objects
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

        // Change department
        lecturer2.changeDepartment(
                "Business");

        // Display all staff
        lecturer1.displayLecturerDetails();

        System.out.println();

        lecturer2.displayLecturerDetails();

        System.out.println();

        assistant.displayLabAssistantDetails();

        // Payments
        double payment1 =
                lecturer1.calculateMonthlyPayment();

        double payment2 =
                lecturer2.calculateMonthlyPayment();

        double payment3 =
                assistant.calculateMonthlyPayment();

        System.out.println();
        System.out.println(
                "Lecturer 1 Payment: "
                + payment1);

        System.out.println(
                "Lecturer 2 Payment: "
                + payment2);

        System.out.println(
                "Assistant Payment: "
                + payment3);

        // Total Payment
        double totalPayment =
                payment1 + payment2 + payment3;

        System.out.println(
                "Total Monthly Payment: "
                + totalPayment);

        // Staff Count
        System.out.println(
                "Total Staff Count: "
                + StaffMember6.getStaffCount());

        // Common Notice
        lecturer1.showCommonNotice();
        lecturer2.showCommonNotice();
        assistant.showCommonNotice();
    }
}
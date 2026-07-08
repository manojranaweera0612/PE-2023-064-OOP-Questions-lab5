abstract class StaffMember1 {

    // Attributes
    private String fullName;
    private final String staffId;
    protected String department;

    // Static Variable
    private static int staffCount = 0;

    // Constructor
    public StaffMember1(String fullName,
            String staffId,
            String department) {

        this.fullName = fullName;
        this.staffId = staffId;
        this.department = department;

        // Increase count
        staffCount++;
    }

    // Getters
    public String getFullName() {
        return fullName;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getDepartment() {
        return department;
    }

    // Final Method
    public final void displayBasicDetails() {

        System.out.println("Full Name: "
                + fullName);

        System.out.println("Staff ID: "
                + staffId);

        System.out.println("Department: "
                + department);
    }

    // Static Method
    public static void showSystemName() {

        System.out.println(
                "Campus Staff Payment System");
    }

    // Get Staff Count
    public static int getStaffCount() {

        return staffCount;
    }

    // Abstract Method
    public abstract double calculateMonthlyPayment();
}

/*
staffCount is static because it is shared
among all staff objects.
*/
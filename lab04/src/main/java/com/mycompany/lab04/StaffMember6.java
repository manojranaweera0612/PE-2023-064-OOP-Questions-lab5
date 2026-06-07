abstract class StaffMember6 {

    private String fullName;
    private final String staffId;
    protected String department;

    private static int staffCount = 0;

    // Constructor
    public StaffMember6(String fullName,
            String staffId,
            String department) {

        this.fullName = fullName;
        this.staffId = staffId;
        this.department = department;

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

    // Change Department
    public void changeDepartment(
            String newDepartment) {

        if (!newDepartment.isEmpty()) {

            department = newDepartment;
        }
    }

    // Notice
    public final void showCommonNotice() {

        System.out.println(
                "University staff payment processed.");
    }

    // Display Details
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

    public static int getStaffCount() {

        return staffCount;
    }

    // Abstract Method
    public abstract double calculateMonthlyPayment();
}

/*
changeDepartment() is useful because
it allows controlled updates instead of
direct external access.
*/
abstract class StaffMember {

    // Attributes
    private String fullName;
    private final String staffId;
    protected String department;

    // Constructor
    public StaffMember(String fullName, String staffId, String department) {
        this.fullName = fullName;
        this.staffId = staffId;
        this.department = department;
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
        System.out.println("Full Name: " + fullName);
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + department);
    }

    // Abstract Method
    public abstract double calculateMonthlyPayment();
}

/*
StaffMember is abstract because it is a parent class
and objects should not be created directly from it.
*/
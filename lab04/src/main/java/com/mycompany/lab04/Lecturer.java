class Lecturer extends StaffMember {

    private int courseCount;
    private double paymentPerCourse;

    // Constructor
    public Lecturer(String fullName, String staffId,
            String department, int courseCount,
            double paymentPerCourse) {

        super(fullName, staffId, department);

        this.courseCount = courseCount;
        this.paymentPerCourse = paymentPerCourse;
    }

    // Implement Abstract Method
    @Override
    public double calculateMonthlyPayment() {
        return courseCount * paymentPerCourse;
    }

    // Display Details
    public void displayLecturerDetails() {

        displayBasicDetails();

        System.out.println("Course Count: " + courseCount);
        System.out.println("Payment Per Course: "
                + paymentPerCourse);
    }
}
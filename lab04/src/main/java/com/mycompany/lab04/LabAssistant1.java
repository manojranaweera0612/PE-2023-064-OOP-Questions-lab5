class LabAssistant1 extends StaffMember {

    private int hoursWorked;
    private double hourlyRate;

    // Constructor
    public LabAssistant1(String fullName,
            String staffId,
            String department,
            int hoursWorked,
            double hourlyRate) {

        super(fullName, staffId, department);

        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Calculate Payment
    @Override
    public double calculateMonthlyPayment() {

        return hoursWorked * hourlyRate;
    }

    // Display Details
    public void displayLabAssistantDetails() {

        displayBasicDetails();

        System.out.println("Hours Worked: "
                + hoursWorked);

        System.out.println("Hourly Rate: "
                + hourlyRate);
    }
}
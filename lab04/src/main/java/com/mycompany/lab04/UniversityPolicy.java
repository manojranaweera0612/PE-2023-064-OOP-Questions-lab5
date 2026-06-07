final class UniversityPolicy {

    public static final String UNIVERSITY_NAME =
            "ABC University";

    public static final double BONUS_RATE = 0.10;

    // Header
    public static void showPolicyHeader() {
        System.out.println("University Policy");
    }

    // Bonus
    public static double calculateBonus(
            double monthlyPayment) {

        return monthlyPayment * BONUS_RATE;
    }
}

/*
A final class should not be inherited
because its behavior should not be changed.
*/
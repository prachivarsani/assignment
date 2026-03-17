public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    try {
        // ===== CLIENT INPUT =====
        System.out.print("Enter client name: ");
        String cname = input.nextLine();

        System.out.print("Enter client age: ");
        int cage = input.nextInt();
        input.nextLine();

        System.out.print("Enter illness: ");
        String illness = input.nextLine();

        Client c1 = new Client(cname, cage, illness);

        System.out.println("----------------");

        // ===== SPECIALIST INPUT =====
        System.out.print("Enter doctor name: ");
        String dname = input.nextLine();

        System.out.print("Enter doctor age: ");
        int dage = input.nextInt();

        System.out.print("Enter basic salary: ");
        double salary = input.nextDouble();
        input.nextLine();

        System.out.print("Enter specialization: ");
        String field = input.nextLine();

        Specialist s1 = new Specialist(dname, dage, salary, field);

        System.out.println("----------------");

        // ===== PAYMENT INPUT =====
        System.out.print("Enter payment amount: ");
        double amount = input.nextDouble();

        Payment pay1 = new Payment(amount);

        Schedule sc1 = new Schedule();

        System.out.println("\n===== OUTPUT =====");

        c1.showInfo();
        System.out.println("----------------");

        s1.showInfo();
        s1.computePay();
        System.out.println("----------------");

        pay1.printReceipt();
        sc1.reserveSlot();

    } catch (InputMismatchException e) {
        System.out.println("Error: Invalid input type! Please enter correct values.");
    } catch (Exception e) {
        System.out.println("Something went wrong. Please try again.");
    } finally {
        input.close();
        System.out.println("Program ended safely.");
    }
}

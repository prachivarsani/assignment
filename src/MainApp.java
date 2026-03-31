import java.util.*;
import java.io.*;

public class MainApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ===== COLLECTIONS =====
        ArrayList<Client> clients = new ArrayList<>();
        ArrayList<Specialist> specialists = new ArrayList<>();
        ArrayList<Payment> payments = new ArrayList<>();

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
            clients.add(c1);

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
            specialists.add(s1);

            System.out.println("----------------");

            // ===== PAYMENT INPUT =====
            System.out.print("Enter payment amount: ");
            double amount = input.nextDouble();

            Payment pay1 = new Payment(amount);
            payments.add(pay1);

            Schedule sc1 = new Schedule();

            // ===== OUTPUT =====
            System.out.println("\n===== OUTPUT =====");

            for (Client c : clients) {
                c.showInfo();
            }

            System.out.println("----------------");

            for (Specialist s : specialists) {
                s.showInfo();
                s.computePay();
            }

            System.out.println("----------------");

            for (Payment p : payments) {
                p.printReceipt();
            }

            sc1.reserveSlot();

            // ===== FILE CREATION =====
            File file = new File("hospital.txt");

            if (file.createNewFile()) {
                System.out.println("New file created!");
            } else {
                System.out.println("File already exists.");
            }

            System.out.println("File path: " + file.getAbsolutePath());

            // ===== WRITE TO FILE =====
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            for (Client c : clients) {
                writer.write("Client: " + c.getFullName() +
                        ", Age: " + c.getYears() +
                        ", Illness: " + illness);
                writer.newLine();
            }

            for (Specialist s : specialists) {
                writer.write("Doctor: " + s.getFullName() +
                        ", Age: " + s.getYears() +
                        ", Salary: " + s.getBasicPay() +
                        ", Field: " + s.getField());
                writer.newLine();
            }

            for (Payment p : payments) {
                writer.write("Payment: " + amount);
                writer.newLine();
            }

            writer.close();
            System.out.println("Data saved to file!");

            // ===== READ FROM FILE =====
            System.out.println("\nReading from file:");

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input type!");
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        } finally {
            input.close();
            System.out.println("Program ended safely.");
        }
    }
}
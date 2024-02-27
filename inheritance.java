import java.util.Scanner;

class Employee {
    String Emp_name, Emp_id, Address, Mail_id, Mobile_no;

    Employee(String name, String id, String address, String mail, String mobile) {
        this.Emp_name = name;
        this.Emp_id = id;
        this.Address = address;
        this.Mail_id = mail;
        this.Mobile_no = mobile;
    }

    void generatePaySlip() {
        System.out.println("\nEmployee Name: " + Emp_name);
        System.out.println("Employee ID: " + Emp_id);
        System.out.println("Address: " + Address);
        System.out.println("Mail ID: " + Mail_id);
        System.out.println("Mobile Number: " + Mobile_no);
    }
}

class Programmer extends Employee {
    double basicPay;

    Programmer(String name, String id, String address, String mail, String mobile, double basicPay) {
        super(name, id, address, mail, mobile);
        this.basicPay = basicPay;
    }

    double calculateDA() {
        return 0.97 * basicPay;
    }

    double calculateHRA() {
        return 0.10 * basicPay;
    }

    double calculatePF() {
        return 0.12 * basicPay;
    }

    double calculateStaffClubFund() {
        return 0.001 * basicPay;
    }

    double calculateGrossSalary() {
        return basicPay + calculateDA() + calculateHRA() + calculatePF() + calculateStaffClubFund();
    }

    double calculateNetSalary() {
        return calculateGrossSalary() - calculatePF();
    }

    @Override
    void generatePaySlip() {
        super.generatePaySlip();
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("DA: " + calculateDA());
        System.out.println("HRA: " + calculateHRA());
        System.out.println("PF: " + calculatePF());
        System.out.println("Staff Club Fund: " + calculateStaffClubFund());
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

class TeamLead extends Employee {
    double basicPay;

    TeamLead(String name, String id, String address, String mail, String mobile, double basicPay) {
        super(name, id, address, mail, mobile);
        this.basicPay = basicPay;
    }

    @Override
    void generatePaySlip() {
        super.generatePaySlip();
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
    }

    double calculateDA() {
        return 0.12 * basicPay;
    }

    double calculateHRA() {
        return 0.15 * basicPay;
    }

    double calculatePF() {
        return 0.12 * basicPay;
    }

    double calculateStaffClubFund() {
        return 0.001 * basicPay;
    }

    double calculateGrossSalary() {
        return basicPay + calculateDA() + calculateHRA() + calculatePF() + calculateStaffClubFund();
    }

    double calculateNetSalary() {
        return calculateGrossSalary() - calculatePF();
    }
}

class AssistantProjectManager extends Employee {
    double basicPay;

    AssistantProjectManager(String name, String id, String address, String mail, String mobile, double basicPay) {
        super(name, id, address, mail, mobile);
        this.basicPay = basicPay;
    }

    @Override
    void generatePaySlip() {
        super.generatePaySlip();
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
    }

    double calculateDA() {
        return 0.15 * basicPay;
    }

    double calculateHRA() {
        return 0.18 * basicPay;
    }

    double calculatePF() {
        return 0.12 * basicPay;
    }

    double calculateStaffClubFund() {
        return 0.001 * basicPay;
    }

    double calculateGrossSalary() {
        return basicPay + calculateDA() + calculateHRA() + calculatePF() + calculateStaffClubFund();
    }

    double calculateNetSalary() {
        return calculateGrossSalary() - calculatePF();
    }
}

class ProjectManager extends Employee {
    double basicPay;

    ProjectManager(String name, String id, String address, String mail, String mobile, double basicPay) {
        super(name, id, address, mail, mobile);
        this.basicPay = basicPay;
    }

    @Override
    void generatePaySlip() {
        super.generatePaySlip();
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
    }

    double calculateDA() {
        return 0.20 * basicPay;
    }

    double calculateHRA() {
        return 0.22 * basicPay;
    }

    double calculatePF() {
        return 0.12 * basicPay;
    }

    double calculateStaffClubFund() {
        return 0.001 * basicPay;
    }

    double calculateGrossSalary() {
        return basicPay + calculateDA() + calculateHRA() + calculatePF() + calculateStaffClubFund();
    }

    double calculateNetSalary() {
        return calculateGrossSalary() - calculatePF();
    }
}

class inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create instances of Programmer, TeamLead, AssistantProjectManager, and ProjectManager
        Programmer programmer = createProgrammer(scanner);
        TeamLead teamLead = createTeamLead(scanner);
        AssistantProjectManager assistantProjectManager = createAssistantProjectManager(scanner);
        ProjectManager projectManager = createProjectManager(scanner);

        // Generate pay slips for each employee
        programmer.generatePaySlip();
        teamLead.generatePaySlip();
        assistantProjectManager.generatePaySlip();
        projectManager.generatePaySlip();

        scanner.close();
    }

    // Helper methods to create instances of different employees
    static Programmer createProgrammer(Scanner scanner) {
        System.out.println("Enter Programmer details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Mail ID: ");
        String mail = scanner.nextLine();
        System.out.print("Mobile Number: ");
        String mobile = scanner.nextLine();
        System.out.print("Basic Pay: ");
        double basicPay = scanner.nextDouble();
        return new Programmer(name, id, address, mail, mobile, basicPay);
    }

    static TeamLead createTeamLead(Scanner scanner) {
        System.out.println("Enter Team Lead details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        scanner.nextLine(); // Consume newline
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Mail ID: ");
        String mail = scanner.nextLine();
        System.out.print("Mobile Number: ");
        String mobile = scanner.nextLine();
        System.out.print("Basic Pay: ");
        double basicPay = scanner.nextDouble();
        return new TeamLead(name, id, address, mail, mobile, basicPay);
    }

    static AssistantProjectManager createAssistantProjectManager(Scanner scanner) {
        System.out.println("Enter Assistant Project Manager details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        scanner.nextLine(); // Consume newline
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Mail ID: ");
        String mail = scanner.nextLine();
        System.out.print("Mobile Number: ");
        String mobile = scanner.nextLine();
        System.out.print("Basic Pay: ");
        double basicPay = scanner.nextDouble();
        return new AssistantProjectManager(name, id, address, mail, mobile, basicPay);
    }

    static ProjectManager createProjectManager(Scanner scanner) {
        System.out.println("Enter Project Manager details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        scanner.nextLine(); // Consume newline
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Mail ID: ");
        String mail = scanner.nextLine();
        System.out.print("Mobile Number: ");
        String mobile = scanner.nextLine();
        System.out.print("Basic Pay: ");
        double basicPay = scanner.nextDouble();
        return new ProjectManager(name, id, address, mail, mobile, basicPay);
    }
}

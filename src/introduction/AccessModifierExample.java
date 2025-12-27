// Superclass
class Company {
    public String companyName = "TechCorp";   // accessible everywhere
    protected int employeeCount = 500;        // accessible in subclass & package
    String location = "Mumbai";               // default (package-private)
    private double revenue = 1_000_000;       // accessible only within class

    // public method
    public void displayCompany() {
        System.out.println("Company: " + companyName);
    }

    // protected method
    protected void displayEmployeeCount() {
        System.out.println("Employees: " + employeeCount);
    }

    // default method
    void displayLocation() {
        System.out.println("Location: " + location);
    }

    // private method
    private void displayRevenue() {
        System.out.println("Revenue: $" + revenue);
    }

    // Public method to access private data
    public void showRevenue() {
        displayRevenue(); // accessing private method inside class
    }
}


class Branch extends Company {
    void displayBranchInfo() {
        System.out.println("Branch Info:");
        System.out.println("Company Name (public): " + companyName);
        System.out.println("Employee Count (protected): " + employeeCount);
        System.out.println("Location (default): " + location);
        showRevenue();
    }
}


public class AccessModifierExample {
    public static void main(String[] args) {
        Company comp = new Company();
        comp.displayCompany();     // public → accessible
        comp.displayEmployeeCount(); // protected → accessible in same package
        comp.displayLocation();      // default → accessible in same package
        comp.showRevenue();          // public → can access private data via method
        // comp.displayRevenue();    // private → NOT accessible

        System.out.println("\nBranch Example:");
        Branch branch = new Branch();
        branch.displayBranchInfo();
    }
}


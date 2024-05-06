
/* Main class of the project */

import com.cfloresh.employees.*;

public class mainEmployees {
    public static void main(String[] args) {
        Manager newManager = new Manager("Luis", "Cruz", "123", "Florida, 67", 1200.2, 23245, 354000);
        newManager.salaryRise(15);
        newManager.setBudget(400000);
        System.out.println(newManager);
    }
}

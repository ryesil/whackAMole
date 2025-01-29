package javaPractice.ry;

import java.util.ArrayList;
import java.util.List;

public class UniversityRY{
    private List<UniversityEmployeeRY> employees = new ArrayList<>();

    public void addEmployee(UniversityEmployeeRY employee) {
        this.employees.add(employee);
    }

    public double getTotalSalaries() {
        double total = 0;
        for(UniversityEmployeeRY employee: employees) {
            total += employee.getSalary();
        }
        return total;
    }



}

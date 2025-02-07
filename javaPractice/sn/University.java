package javaPractice.sn;

import java.util.ArrayList;
import java.util.List;

public class University {
    List<NewEmployeeSn> newEmployeeSns;

    public University() {
        this.newEmployeeSns = new ArrayList<>();
    }

    public void addEmployee(NewEmployeeSn employeeSn){
        newEmployeeSns.add(employeeSn);
    }

    public double getTotalSalaries(){
        return newEmployeeSns.stream().mapToDouble(NewEmployeeSn::getSalary).sum();
    }
}


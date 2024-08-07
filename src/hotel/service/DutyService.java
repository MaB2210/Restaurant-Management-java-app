package hotel.service;

import hotel.employee.Employee;

import java.util.List;

public class DutyService {

    public void performDutyService(List<Employee> employees){
        for(Employee emp: employees){
            emp.performDuty();
        }
        System.out.println(employees.size());
    }
}

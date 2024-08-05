package hotel.service;

import hotel.entity.Employee;

import java.util.List;

public class DutyService {

    public void performDutyService(List<Employee> employees){
        for(Employee emp: employees){
            emp.performDuty();
        }
    }
}

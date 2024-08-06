import hotel.employee.Employee;
import hotel.service.DutyService;
import hotel.service.HireService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        HireService hireService = new HireService();

        List<Employee> employees = hireService.HireAndProvideEmployees();

        DutyService dutyService = new DutyService();

        dutyService.performDutyService(employees);
    }
}
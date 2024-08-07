package hotel.service;

import hotel.employee.*;
import hotel.employee.builder.*;

import java.util.ArrayList;
import java.util.List;

public class HireService {

    public List<Employee> HireAndProvideEmployees(){
        List<Employee> employees = new ArrayList<Employee>();
      Employee cookEmployee = new Cook("John", "1", "12345", "Korean", true);
      employees.add(cookEmployee);

      Employee managerEmployee = new ManagerBuilder()
              .withName("Rakesh")
              .build();
      employees.add(managerEmployee);

      Employee receptionistEmployee = new Receptionist("Jack", "3", "78979", new String[]{"English", "French"});
      employees.add(receptionistEmployee);

      Employee roomServiceEmployee = new RoomService("Kristie", "4", "678678", true);
      employees.add(roomServiceEmployee);

      return employees;
    }
}

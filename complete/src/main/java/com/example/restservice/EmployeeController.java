package com.example.restservice;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employees")

public class EmployeeController {

    // @Autowired
    // private EmployeeManager employee_manager;

    @GetMapping(
        path = "/",
        produces = "application/json"
    )
    public Employees getEmployees() {
        return EmployeeManager.getAllEmployees();
    }

    // @PostMapping (
    //     path = "/",
    //     consumes = "application/json",
    //     produces = "application/json"
    // )
    // public ResponseEntity<Object> addEmployee( @RequestBody Employee employee) {

    // }

}

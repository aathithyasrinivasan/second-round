package Collections1;
import java.util.Scanner;
import java.util.*;
import java.util.stream.Collectors;
public class MainOfEmployee 
{
	public static void main(String[] args) 
	{
		
		String col_name="Hash_Aathithya";
		Employee.createCollection(col_name);
        
		 Map<String, String> emp1 = new HashMap<>();
	     emp1.put("EmployeeId", "E02001");
	     emp1.put("Name", "John");
	     emp1.put("Department", "IT");
	     emp1.put("Gender", "Male");
	     Employee.addEmployee(col_name, emp1);

	     Map<String, String> emp2 = new HashMap<>();
	     emp2.put("EmployeeId", "E02002");
	     emp2.put("Name", "Jane");
	     emp2.put("Department", "HR");
	     emp2.put("Gender", "Female");
	     Employee.addEmployee(col_name, emp2);

	     Map<String, String> emp3 = new HashMap<>();
	     emp3.put("EmployeeId", "E02003");
	     emp3.put("Name", "Alice");
	     emp3.put("Department", "IT");
	     emp3.put("Gender", "Female");
	     Employee.addEmployee(col_name, emp3);
	     
	     Employee.getDepFacet("Hash_Aathithya");
		 Employee.indexData("Hash_Aathithya","Department");
		 Employee.searchByColumn("Hash_Aathithya", "Department", "IT");
		 Employee.getEmpCount("Hash_Aathithya");
		 Employee.delEmpById("Hash_Aathithya", "1234");
		 
		   
	}
}



package Collections1;

import java.util.*;
import java.util.stream.Collectors;

public class Employee 
{
	static Map<String,List<Map<String,String>>> collections=new HashMap<>();
	public static void addEmployee(String p_collection_name, Map<String, String> employee)
	{
	        collections.get(p_collection_name).add(employee);
	}
	public static void createCollection(String p_collection_name)
	{
		collections.put(p_collection_name,new ArrayList<>());
		System.out.println("The collection is Created");
	}
	public static void indexData(String p_collection_name,String p_exclude_column)
	{
		List<Map<String,String>> collection=collections.get(p_collection_name);
		for(Map<String,String> employee :collection)
		{
			employee.remove(p_exclude_column);
		}
	}
	public static void getEmpCount(String p_collection_name)
	{
		List<Map<String,String>> collection=collections.get(p_collection_name);
		System.out.println("The Employee Count is :"+collection.size());
	}
	public static void delEmpById(String p_collection_name,String p_employee_id)
	{
		List<Map<String,String>> collection=collections.get(p_collection_name);
		collection.removeIf(emp->
		(p_collection_name.equals(emp.get("EmpId"))));
		System.out.println("The Employee details is deleted :"+p_collection_name);
	}
	public static void getDepFacet(String p_collection_name)
	{
		List<Map<String,String>> collection=collections.get(p_collection_name);
		Map<String, Long> departmentcount = collection.stream().collect(Collectors.groupingBy(emp -> 
                emp.get("Department"), Collectors.counting()));

        System.out.println("Department facet: " + departmentcount);
	}
	public static void searchByColumn(String p_collection_name,String p_column_name,String p_column_value)
	{
		List<Map<String,String>> collection=collections.get(p_collection_name);
		List<Map<String, String>> result = collection.stream().filter(emp ->
		p_column_value.equals(emp.get(p_column_name)))
                .collect(Collectors.toList());

        System.out.println("Result is :" + result);
	}
}

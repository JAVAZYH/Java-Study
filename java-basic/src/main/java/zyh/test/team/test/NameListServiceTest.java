package zyh.test.team.test;

import zyh.test.team.domain.Employee;
import zyh.test.team.service.NameListService;
import org.junit.Test;

public class NameListServiceTest {

	@Test
	public void getAllEmployees(){
		
		NameListService service = new NameListService();
		
		Employee[] allEmployees = service.getAllEmployees();

		for (int i = 0; i < allEmployees.length; i++) {

			System.out.println(allEmployees[i].getName());
		}
	}
}

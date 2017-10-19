package exercise1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FixedSalaryEmployeeTest {
	@Test
	public void computeSalary() {
		Employee employee = Exercise1.buildFixedSalaryEmployee(2500);
		assertThat(employee.computeSalary()).isEqualTo(2500);
	}

	@Test
	public void computeSalary_with_work_hours() {
		Employee employee = Exercise1.buildFixedSalaryEmployee(2625);
		for (int i = 0; i < 160; i++) {
			employee.workOneHour();
		}
		assertThat(employee.computeSalary()).isEqualTo(2625);
	}

	@Test
	public void computeSalary_with_sales() {
		Employee employee = Exercise1.buildFixedSalaryEmployee(2750);
		for (int i = 0; i < 5; i++) {
			employee.sell();
		}
		assertThat(employee.computeSalary()).isEqualTo(2750);
	}

}

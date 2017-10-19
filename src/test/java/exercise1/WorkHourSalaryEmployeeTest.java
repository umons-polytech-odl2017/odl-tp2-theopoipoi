package exercise1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WorkHourSalaryEmployeeTest {
	@Test
	public void computeSalary_with_work_hours() {
		Employee employee = Exercise1.buildWorkHourSalaryEmployee(80);
		for (int i = 0; i < 160; i++) {
			employee.workOneHour();
		}
		assertThat(employee.computeSalary()).isEqualTo(80 * 160);
	}

	@Test
	public void computeSalary_with_no_work_hours() {
		Employee employee = Exercise1.buildWorkHourSalaryEmployee(80);
		assertThat(employee.computeSalary()).isEqualTo(0);
	}

	@Test
	public void computeSalary_with_sales() {
		Employee employee = Exercise1.buildWorkHourSalaryEmployee(65);
		for (int i = 0; i < 160; i++) {
			employee.workOneHour();
		}
		for (int i = 0; i < 5; i++) {
			employee.sell();
		}
		assertThat(employee.computeSalary()).isEqualTo(65 * 160);
	}

}

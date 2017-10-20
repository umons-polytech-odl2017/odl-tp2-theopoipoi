package exercise1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseSalaryPlusCommissionEmployeeTest extends AbstractEmployeeTest {

	private final Exercise1 exercise1 = new Exercise1();

	@Test
	public void computeSalary_with_base_salary_commission_and_sales() {
		Employee employee = exercise1.buildBaseSalaryPlusCommissionEmployee("Alpha", 2200, 100);
		for (int i = 0; i < 13; i++) {
			employee.sell();
		}
		assertThat(employee.computeSalary()).isEqualTo(3500);
	}

	@Test
	public void computeSalary_with_no_salary_and_no_sale() {
		Employee employee = exercise1.buildBaseSalaryPlusCommissionEmployee("Bravo", 0, 500);
		assertThat(employee.computeSalary()).isEqualTo(0);
	}

	@Test
	public void computeSalary_with_no_salary() {
		Employee employee = exercise1.buildBaseSalaryPlusCommissionEmployee("Charlie", 0, 500);
		for (int i = 0; i < 14; i++) {
			employee.sell();
		}
		assertThat(employee.computeSalary()).isEqualTo(7000);
	}

	@Test
	public void computeSalary_with_no_sale() {
		Employee employee = exercise1.buildBaseSalaryPlusCommissionEmployee("Echo", 2500, 100);
		assertThat(employee.computeSalary()).isEqualTo(2500);
	}

	@Test
	public void computeSalary_with_no_commission() {
		Employee employee = exercise1.buildBaseSalaryPlusCommissionEmployee("Foxtrot", 4000, 0);
		for (int i = 0; i < 14; i++) {
			employee.sell();
		}
		assertThat(employee.computeSalary()).isEqualTo(4000);
	}

	@Test
	public void computeSalary_with_work_hours() {
		Employee employee = exercise1.buildBaseSalaryPlusCommissionEmployee("Golf", 2500, 100);
		for (int i = 0; i < 10; i++) {
			employee.sell();
		}
		for (int i = 0; i < 160; i++) {
			employee.workOneHour();
		}
		assertThat(employee.computeSalary()).isEqualTo(3500);
	}

	@Override
	protected Employee buildEmployee(String name) {
		return exercise1.buildBaseSalaryPlusCommissionEmployee(name, 3000, 50);
	}
}

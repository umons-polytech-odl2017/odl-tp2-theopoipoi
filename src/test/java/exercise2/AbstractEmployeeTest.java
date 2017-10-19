package exercise2;

import exercise1.Employee;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractEmployeeTest {
	@Test
	public void employeeIsPayavble() {
		Employee employee = buildEmployeeAndEarnSomeMoney();
		assertThat(employee).isInstanceOf(Payable.class);
	}

	@Test
	public void computeSalary() {
		Payable payable = (Payable) buildEmployeeAndEarnSomeMoney();
		assertThat(payable.computeSalary()).isEqualTo(getExpectedSalary());
	}

	protected abstract Employee buildEmployeeAndEarnSomeMoney();

	protected abstract int getExpectedSalary();
}

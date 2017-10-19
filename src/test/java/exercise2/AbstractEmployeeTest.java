package exercise2;

import exercise1.Employee;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractEmployeeTest {
	@Test
	public void employeeIsPayavble() {
		Employee employee = buildEmployee();
		assertThat(employee).isInstanceOf(Payable.class);
	}

	protected abstract Employee buildEmployee();

}

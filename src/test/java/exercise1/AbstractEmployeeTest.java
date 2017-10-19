package exercise1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractEmployeeTest {
	@Test
	public void getName_with_Albert() {
		Employee albert = buildEmployee("Albert");
		assertThat(albert.getName()).isEqualTo("Albert");
	}

	@Test
	public void getName_with_Charlie() {
		Employee charlie = buildEmployee("Charlie");
		assertThat(charlie.getName()).isEqualTo("Charlie");
	}


	protected abstract Employee buildEmployee(String name);

}

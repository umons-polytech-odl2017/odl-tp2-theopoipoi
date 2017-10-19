package exercise2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductiveWorkerTest {
	private Exercise2 exercise2 = new Exercise2();

	@Test
	public void computeSalary() {
		ProductiveWorker productiveWorker = exercise2.buildProductiveWorker(20);
		for (int i = 0; i < 100; i++) {
			productiveWorker.produceOnePiece();
		}
		Payable payable = (Payable) productiveWorker;
		assertThat(productiveWorker.computeSalary()).isEqualTo(2000);
	}

	@Test
	public void productiveWorkerIsPayable() {
		ProductiveWorker productiveWorker = exercise2.buildProductiveWorker(25);
		assertThat(productiveWorker).isInstanceOf(Payable.class);
	}

	@Test
	public void productiveWorkerIsNotAnEmployee() {
		ProductiveWorker productiveWorker = exercise2.buildProductiveWorker(25);
		assertThat(productiveWorker).isNotInstanceOf(Payable.class);
	}
}

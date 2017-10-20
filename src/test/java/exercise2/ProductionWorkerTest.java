package exercise2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductionWorkerTest {
	private Exercise2 exercise2 = new Exercise2();

	@Test
	public void computeSalary() {
		ProductionWorker productionWorker = exercise2.buildProductiveWorker(20);
		for (int i = 0; i < 100; i++) {
			productionWorker.produceOnePiece();
		}
		Payable payable = (Payable) productionWorker;
		assertThat(payable.computeSalary()).isEqualTo(2000);
	}

	@Test
	public void productionWorkerIsPayable() {
		ProductionWorker productionWorker = exercise2.buildProductiveWorker(25);
		assertThat(productionWorker).isInstanceOf(Payable.class);
	}

	@Test
	public void productionWorkerIsNotAnEmployee() {
		ProductionWorker productionWorker = exercise2.buildProductiveWorker(25);
		assertThat(productionWorker).isNotInstanceOf(Payable.class);
	}
}

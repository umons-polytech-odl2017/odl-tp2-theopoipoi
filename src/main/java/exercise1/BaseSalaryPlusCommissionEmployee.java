package exercise1;

public class BaseSalaryPlusCommissionEmployee extends Employee {
	public int SalaireComplet;
	public int ventes;

	public BaseSalaryPlusCommissionEmployee(String name, int baseSalary, int commission) {
		this.Name=name;
		this.SalaireComplet = baseSalary + commission * ventes;
	}
	public void sell() {
		ventes++;
	}
}


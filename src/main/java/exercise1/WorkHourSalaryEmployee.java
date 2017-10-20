package exercise1;

public class WorkHourSalaryEmployee extends Employee {
	public int SalaireComplet;
	public int heures;
	public WorkHourSalaryEmployee(String name, int hourRate) {
		this.Name = name;
		this.SalaireComplet = hourRate * heures;

	}
	public void workOneHour() {
		heures++;
	}
}

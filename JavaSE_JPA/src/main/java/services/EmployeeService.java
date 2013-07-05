package services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Employee;

public class EmployeeService {
	protected EntityManager em;

	public EmployeeService(EntityManager em) {
		this.em = em;
	}

	public EntityManager getEm() {
		return em;
	}

	public Employee createEmployee(int id, String name, long salary) {
		Employee emp = new Employee(id);
		emp.setName(name);
		emp.setSalary(salary);
		getEm().persist(emp);
		return emp;
	}

	public void removeEmployee(int id) {
		Employee emp = findEmployee(id);
		if (emp != null) {
			getEm().remove(emp);
		}
	}

	public Employee raiseEmployeeSalary(int id, long raise) {
		Employee emp = getEm().find(Employee.class, id);
		if (emp != null) {
			emp.setSalary(emp.getSalary() + raise);
		}
		return emp;
	}

	public Employee findEmployee(int id) {
		return getEm().find(Employee.class, id);
	}

	public List<Employee> findAllEmployees() {
		TypedQuery<Employee> query = getEm().createQuery(
				"SELECT e FROM Employee e", Employee.class);
		return query.getResultList();
	}
}
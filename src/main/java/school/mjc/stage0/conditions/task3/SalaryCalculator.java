package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double taxed;
        if (salary > 0 && salary <= 10000) {
            taxed = salary - salary*0.15;
            System.out.println(taxed);
        } else if (salary > 10000 && salary <= 20000) {
            taxed = salary - salary*0.18;
            System.out.println(taxed);
        } else if (salary > 20000) {
            taxed = salary - salary*0.20;
            System.out.println(taxed);
        } else {
            System.out.println("wrong input!");
        }

    }
}

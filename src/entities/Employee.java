package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double salaryUpdate;
    public double tax;


    public double netSalary(){
        return this.salaryUpdate = this.grossSalary - this.tax;
    }

    public void increaseSalary(double porcentage){
        grossSalary = ((this.grossSalary / 100) * porcentage) + this.grossSalary ;

    }

    public String toString(){
        return "\nNome: " + this.name +
                "\n" +
                "Salário: " + this.grossSalary +
                "\n" +
                "Taxa: " + this.tax +
                "\n" +
                "\n \n" +
                "Funcionário: " + this.name + ", " + netSalary();


    }


}
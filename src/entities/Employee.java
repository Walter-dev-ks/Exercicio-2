package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;


    public double netSalary(){
        return this.grossSalary -= this.tax;
    }

    public void increaseSalary(double porcentage){
        double r = ((this.grossSalary / 100) * porcentage) + this.grossSalary ;
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
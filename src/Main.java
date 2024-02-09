/*

    Fazer um programa para ler os dados de um funcionário (nome,
    salário bruto e imposto). Em seguida, mostrar os dados do funcionário
    (nome, e salário líquido). Em seguida, aumentar o salário do
    funcionário com base em uma porcentagem dada (somente o salário
    bruto) e mostrar novamente os dados do funcionário. Use classe
    projetada abaixo:

    Employee

    -Name: string
    -GrossSalary: double
    -Tax: double

    +NetSalary(): double
    +IncreaseSalary(percentage: double): void
    
    ----

    Exemplo:

    Name: João silva
    Gross salary: 6000.00
    Tax: 1000.00

    Employee: João silva, $ 5000.00

    Which percentage to increase salary? 10.0
    Updated data: João silva, $ 5600.00


 */

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee;
        employee = new Employee();

        String aumento = "N";

        System.out.println("Entre com os dados de funcionário");
        System.out.println("Nome do Funcionário: ");
        employee.name = sc.next();

        System.out.print("Salário do funcionário: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Qual o valor do imposto? ");
        employee.tax = sc.nextDouble();






        sc.close();

    }
}
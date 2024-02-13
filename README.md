# Employee Management System

Este é um sistema em Java desenvolvido com o propósito de ler os dados de um funcionário (nome, salário bruto e imposto), mostrar os dados do funcionário (nome e salário líquido), aumentar o salário do funcionário com base em uma porcentagem dada e mostrar novamente os dados do funcionário.

## Classe Employee

A classe `Employee` possui os seguintes atributos e métodos:

### Atributos

- `Name`: string
- `GrossSalary`: double
- `Tax`: double

### Métodos

- `NetSalary(): double`: Calcula e retorna o salário líquido do funcionário.
- `IncreaseSalary(percentage: double): void`: Aumenta o salário do funcionário com base na porcentagem fornecida.

## Exemplo de Uso

Segue um exemplo de como utilizar a classe `Employee`:

1. Crie um objeto `Employee`.
2. Defina o nome, salário bruto e imposto do funcionário.
3. Exiba os dados do funcionário (nome, salário bruto e imposto).
4. Pergunte ao usuário qual porcentagem deseja aumentar o salário.
5. Aumente o salário do funcionário com base na porcentagem fornecida.
6. Exiba novamente os dados atualizados do funcionário.

Este é um sistema em Java criado para fins de estudo e prática.


## Código do projeto

``` bash
  /*

    Employee

    -Name: string
    -GrossSalary: double
    -SalaryUpadate: double
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
  import java.util.Objects;
  import java.util.Scanner;
  
  public class Main {
      public static void main(String[] args) {
  
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
  
          Employee employee;
          employee = new Employee();
  
          System.out.println("Entre com os dados de funcionário");
          System.out.println("Nome do Funcionário: ");
          employee.name = sc.next();
  
          System.out.print("Salário do funcionário: ");
          employee.grossSalary = sc.nextDouble();
  
          System.out.print("Qual o valor do imposto? ");
          employee.tax = sc.nextDouble();
  
          System.out.println(employee.toString());
  
          System.out.println("Deseja dar aumento para o funciário " + employee.name + " ? Y/N");
          String aumento = sc.next();
  
          while(Objects.equals(aumento, "y") || Objects.equals(aumento, "Y")){
              System.out.print("Qunatos porcento o funcionário " + employee.name + " vai receber?" );
              double p = sc.nextDouble();
              employee.increaseSalary(p);
              aumento = "N";
  
              System.out.println("\nSalário atualizado!");
          }
  
  
          System.out.println(employee.toString());
  
  
  
  
  
          sc.close();
  
      }
  }

  ```
  ### Classe

  ```bash
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

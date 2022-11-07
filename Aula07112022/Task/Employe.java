package Aula07112022.Task;

import Aula07112022.Domain.*;

public class Employe extends People {
    
    private String cargo;
    private double salario;

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

}

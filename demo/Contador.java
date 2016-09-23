package demo;

public class Contador extends Empleado {
  
  public Contador(){
    
    }

    @Override
    public void setSalario(double salario) {
        super.setSalario(salario); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getSalario() {
        salario=(super.getSalario()*.35)+super.getSalario();
        return salario; //To change body of generated methods, choose Tools | Templates.
    }

}

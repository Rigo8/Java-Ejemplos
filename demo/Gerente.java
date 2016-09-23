package demo;

public class Gerente extends Empleado {
  
  private  double salario;
  public Gerente(){

}

    @Override
    public void setSalario(double salario) {
               
        super.setSalario(salario); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getSalario() {
        salario=(super.getSalario()*.50)+super.getSalario();
        return this.salario; //To change body of generated methods, choose Tools | Templates.
    }

}

package com.fundamentos.springboot.fundamentos.bean;

public class MmyBenWithDependenciaImplement implements MyBeanWithDependency{

    private MyOperation myOperation;

    public MmyBenWithDependenciaImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int numero =1;

        System.out.println(myOperation.suma(numero));
        System.out.println("hola desde la implementacion de un bean con dependencia");
    }
}

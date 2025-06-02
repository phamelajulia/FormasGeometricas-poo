package br.edu.figurasgeometricasplanas;
public class Triangulo {
   
	private double base;
    private double altura;
    private double area;

    public Triangulo() {
    	base = 0;
    	altura = 0;
    	area = 0;
    	
    } public void setBase(double Base) {
        base = Base;
        
    } public double getBase() {
        return base;
        
    } public void setAltura(double Altura) {
        altura = Altura;
        
    } public double getAltura() {
        return altura;
        
    } public void calcArea() {
        area = (base * altura) / 2;
        
    } public void mostrarArea() {
        System.out.println("Área: " + area);
        
    } public double getArea() {
        System.out.println("Área com retorno: " + area);
        return area;
    }
}
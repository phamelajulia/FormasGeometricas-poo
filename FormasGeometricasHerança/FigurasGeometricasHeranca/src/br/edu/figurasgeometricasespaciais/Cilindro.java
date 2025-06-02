
package br.edu.figurasgeometricasespaciais;
public class Cilindro extends figuraEspacial{
    private double raio;
    private double altura;
    
    public Cilindro() {
    	raio = 0;
    	altura = 0;
    	
    }
    
    public void setRaio(double Raio) {
		raio = Raio;
	} 
    
    public double getRaio() {
		return raio;
	} 
    
    public void setAltura(double Altura) {
		altura = Altura;
	} 
    
    public double getAltura() {
		return altura;
	} 
    
    public void calcAreaBase() {
		double areaBase = Math.PI * (raio * raio);
	} 
    public void calcAreaTotalBase() {
		double areaTotalBase = 2 * Math.PI * (raio * raio);
	} 
    public void calcAreaLateral() {
		double areaLateral = Math.PI * raio * altura;
	} 
    
    public void calcAreaTotal() {
		double areaTotal = 2 * Math.PI * raio * (raio * altura);
	} 
    
    public void calcVolume() {
		double volume = Math.PI * (raio * raio) * altura;
	} 
    
    public void calcArea (double Area) {
		double area = Area;
	} 
    
    public void calcDiagonal(  double Diagonal) {
		diagonal = Diagonal;
	}
    
    public void calcAltura(double Altura) {
		altura = Altura;
	}
}

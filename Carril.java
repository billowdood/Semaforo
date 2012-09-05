public class Carril{
   
    private boolean prioridad,quitarCarro = false;
    private int numVehiculos;
    private int outCar,inCar,restCar;
    //Vinculo con la GUI
    private SemaforoGUI gui;


    public Carril(int vehiculos,boolean prioridad,int numCarril,SemaforoGUI gui){
	numVehiculos = vehiculos;
	this.prioridad = prioridad;
    this.gui = gui;
    gui.setText(numCarril,numVehiculos);
    }
    
    //Metodo para darle el valor de los numeros de vehiculos
    public void setNumVehiculos(int vehiculos){
	numVehiculos = vehiculos;
	if(numVehiculos <= 0)
	    numVehiculos = 0;
    }

    //Metodo para obtener el numero de vehiculos
    public int getNumVehiculos(){
	return numVehiculos;
    }
    
    //setters
    public void setOutCar(int outCar){
	this.outCar = outCar;
    }
    
    public void setInCar(int inCar){
	this.inCar = inCar;
    }

    public void setRestCar(int restCar){
	this.restCar = restCar;
    }

    public void setQuitarCarro(boolean quitarCarro){
	this.quitarCarro = quitarCarro;
    }
    
    //getters
    
    public boolean getPrioridad(){
	return prioridad;
    }
    
    //??
    public int getOutCar(){
	return outCar;
    }

    public int getInCar(){
	return inCar;
    }

    public int getRestCar(){
	return restCar;
    }
}

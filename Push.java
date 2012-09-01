import java.util.Random;

public class Push extends Thread{

    //Ver si modifico para que ada cierto tiempo llegen carros a todos los carriles o si solo a alguno en especifico
    
    //Array de los carriles
    private Carril[] carriles = new Carril[4];
    //int donde se guarda que carril se eligio random
    private int elegirCarril;
    //random object
    private Random random = new Random();

    public void setPush(Carril carrilA){
	carriles[0] = carrilA;
    }

    //Setter de la clase donde se tienen los 4 carriles
    public void setPush(Carril carrilA,Carril carrilB,Carril carrilC,Carril carrilD){
	carriles[0] = carrilA;
	carriles[1] = carrilB;
	carriles[2] = carrilC;
	carriles[3] = carrilD;
 }

    public void run(){
	while(true){
	    try{
		//random que elige el carril
		elegirCarril = random.nextInt(10000) % 5;
		//Si es el que carril con mas afluencia,de o a 10 carros
		if(carriles[elegirCarril].getPrioridad()){
		    carriles[elegirCarril].setNumVehiculos(carriles[elegirCarril].getNumVehiculos() + random.nextInt(10000) % 11);
		}
		//si no,de 0 a 5 carros
		else{
		    carriles[elegirCarril].setNumVehiculos(carriles[elegirCarril].getNumVehiculos() + random.nextInt(10000) % 6);
		}
		//Cada 5 segundos llegan vehiculos a algun carril
		sleep(5000);
	    }catch(Exception e){
		System.out.println("Exception"+e.getMessage());
	    }
	}//end while(true)
    }//end run
    
}

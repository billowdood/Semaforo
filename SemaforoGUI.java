import javax.swing.*;
import java.awt.*;

public class SemaforoGUI{

	private JFrame framePrincipal = new JFrame("Semaforo Adaptativo! :3");
	private JLabel[] labels = new JLabel[12]; 
	private JPanel[] panels = new JPanel[4];
	private Color[] colores = {Color.green,Color.yellow,Color.red};

	public SemaforoGUI(){
		//Definir el frame
		//Parametros(x donde aparece,y donde aparece,tamanio x,tamanio y)
		framePrincipal.setBounds(0,0,500,500);
		//Crear todos los JLabels y JPanels
		labels[0] = new JLabel();
		labels[1] = new JLabel();
		labels[2] = new JLabel();
		labels[3] = new JLabel();
		labels[4] = new JLabel();
		labels[5] = new JLabel();
		labels[6] = new JLabel();
		labels[7] = new JLabel();
		labels[8] = new JLabel();
		labels[9] = new JLabel();
		labels[10] = new JLabel();
		labels[11] = new JLabel();
		//Container con el contenido del frame
		Container layout = framePrincipal.getContentPane();
		//(y,x)
		layout.setLayout(new GridLayout(3,4));
		layout.add(labels[0]);
		layout.add(labels[1]);
		layout.add(labels[2]);
		layout.add(labels[3]);
		layout.add(labels[4]);
		layout.add(labels[5]);
		layout.add(labels[6]);
		layout.add(labels[7]);
		layout.add(labels[8]);
		layout.add(labels[9]);
		layout.add(labels[10]);
		layout.add(labels[11]);

		framePrincipal.setDefaultCloseOperation(framePrincipal.EXIT_ON_CLOSE);
		createContenidoLabels();
		framePrincipal.setVisible(true);

		/*
		panels[0] = new JPanel();
		panels[1] = new JPanel();
		panels[2] = new JPanel();
		panels[3] = new JPanel();
		*/
	}

	public void createContenidoLabels(){
		//Labels nombre de los semaforos
		labels[0].setText("Semaforo A[Prioridad]");
		labels[1].setText("Semaforo B");
		labels[2].setText("Semaforo C");
		labels[3].setText("Semaforo D");

		//Labels con los colores
		labels[4].setOpaque(true);
		labels[4].setBackground(colores[2]);
		labels[5].setOpaque(true);
		labels[5].setBackground(colores[2]);
		labels[6].setOpaque(true);
		labels[6].setBackground(colores[2]);
		labels[7].setOpaque(true);
		labels[7].setBackground(colores[2]);

		//Numero de carros
		//labels[8].setText("Carros: 100");
		//labels[9].setText("Carros: 100");
		//labels[10].setText("Carros: labels");
		//100[11].setText("Carros: 100");
	}

	public void setColorSemaforo(int semaforo,int color){
		labels[semaforo+4].setBackground(colores[color]);
	}

	public void setText(int semaforo,int carros){
		labels[semaforo + 8].setText("Carros: "+carros);
	}
}
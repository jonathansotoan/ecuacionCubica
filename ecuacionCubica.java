/**
 * @(#)ecuacionCubica.java
 *
 * ecuacionCubica Applet application
 *
 * The Cubic Ecuation Software!: TCES!
 *
 * @Jonathan Soto (theja29@hotmail.com)
 * @version 1.00 2012/4/27
 */

import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.math.*;

public class ecuacionCubica extends Applet implements ActionListener{

	//Declaraci�n de los componentes
	Panel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22;
	Label la,lb,lc,ld,lButton,ljkl,lp,lq,lz1,lz2,lz3,lx1,lx2,lx3;
	TextArea tajkl,tap,taq,taz1,taz2,taz3,tax1,tax2,tax3;
	TextField tfa,tfb,tfc,tfd,tfi;
	Button b;

	public void init() {
		this.setSize(1000,650);
		//Explicaci�n
		tajkl.setText("\n---------------INSTRUCCIONES---------------\n\nLa ecuaci�n c�bica tiene la forma:\nax^3 + bx^2 + cx + d = 0,"
			+" d�nde 'a' es\ndiferente de 0. Este programa le va a\nayudar a encontrar lo(s) interceptos del\neje X (X,0) por donde p"
			+"asa la funci�n;\nprimero, debe ingresar los n�meros\nequivalentes a 'a', 'b', 'c' y 'd' en sus\ncorrespondientes campos"
			+"de texto,\ndespu�s de dar click en el bot�n\n'Calcular' se van a mostrar las 'X' en los\ncampos correspondientes (Proce"
			+"so de\nobtenci�n de la variable X1, X2, y X3).\nPara poder comprender bien el proceso\nllevado a cabo, lea las siguient"
			+"es\ninstrucciones:\nPara encontrar X1, X2 y X3 se utiliz� el\nm�todo del matem�tico italiano\nGerolamo Cardano(1501-157"
			+"6); en la\ncual primero se deben hallar las\nvariables J, K y L que son prerrequisito\npara poder encontrar p y q; las "
			+"cuales\nson prerrequisito para encontrar Z1, Z2\ny Z3; y estas a su vez son prerrequisito\npara encontrar X1, X2 y X3."
			+"\nPara entender esto mejor veamos las\nf�rmulas, las cuales est�n en el �rea de\ntexto donde posteriormente ser�n\ndesa"
			+"rrolladas paso a paso.\n\n                              J = b/a\n\n                              K = c/a\n\n           "
			+"                   L = d/a\n\n*Si en cualquiera de los campos de\ntexto da como resultado 'NaN'(Not\na Number), signifi"
			+"ca que no es posible\nencontrar su soluci�n.");
		tap.setText("\n\n\n\n                         p= K-((J^2)/3)");
		taq.setText("\n\n\n\n                         q= (2(J^3)/27)");
		taz1.setText("La f�rmula general para encontrar esta variable es:\nZ1= ((-q/2)+((q^2/4)+(p^3/27))^(1/2))^(1/3)+((-q/2) - ((q^"
			+"2/4)+(p^3/27))^(1/2))^(1/3)\n\nPero cuando (q^2/4)+(p^3/27) es menor a cero; se debe operar con n�meros comple-\njos, p"
			+"or los tanto se ha llegado a una f�rmula espec�ficamente para estos casos:\n\nZ1= 2  (-p/3)^(1/2)  cos(�/3),   d�nde � "
			+"es: \n�= arctan( (-q^2/4-p^3/27)^(1/2) / (-q/2)");
		taz2.setText("La f�rmula general para encontrar esta variable es:\nZ2= (-Z1/2) + (((Z1^2)/4) + (q/Z1))^(1/2)\n\nPero cuando ("
			+"q^2/4)+(p^3/27) es menor a cero; se debe operar con n�meros comple-\njos, por los tanto se ha llegado a una f�rmula esp"
			+"ec�ficamente para estos casos:\n\nZ2= 2  (-p/3)^(1/2)  cos( ( � + 2 � ) / 3),   d�nde � es:\n�= arctan( (-q^2/4-p^3/27)"
			+"^(1/2) / (-q/2)");
		taz3.setText("La f�rmula general para encontrar esta variable es:\nZ3= (-Z1/2) - (((Z1^2)/4) + (q/Z1))^(1/2)\n\nPero cuando ("
			+"q^2/4)+(p^3/27) es menor a cero; se debe operar con n�meros comple-\njos, por los tanto se ha llegado a una f�rmula esp"
			+"ec�ficamente para estos casos:\n\nZ3= 2  (-p/3)^(1/2)  cos( ( � + 4 � ) / 3),   d�nde � es:\n�= arctan( (-q^2/4-p^3/27)"
			+"^(1/2) / (-q/2)");
		tax1.setText("\n\n\n\n                        X1= Z1-(J/3)");
		tax2.setText("\n\n\n\n                        X2= Z2-(J/3)");
		tax3.setText("\n\n\n\n                        X3= Z3-(J/3)");
	}

	public ecuacionCubica(){

		//Parte Gr�fica
		   //Utilizaci�n de los componentes
		la=new Label("Ingrese a");
		lb=new Label("Ingrese b");
		lc=new Label("Ingrese c");
		ld=new Label("Ingrese d");
		ljkl=new Label("Proceso obtenci�n de las variables J,K y L");
		lButton=new Label("");
		lp=new Label("Proceso obtenci�n de la variable p");
		lq=new Label("Proceso obtenci�n de la variable q");
		lz1=new Label("Proceso obtenci�n de la variable Z1");
		lz2=new Label("Proceso obtenci�n de la variable Z2");
		lz3=new Label("Proceso obtenci�n de la variable Z3");
		lx1=new Label("Proceso obtenci�n de la variable X1");
		lx2=new Label("Proceso obtenci�n de la variable X2");
		lx3=new Label("Proceso obtenci�n de la variable X3");
		Label lz=new Label("E C U A C I � N     C � B I C A",Label.CENTER);
		Label lm=new Label("");
		Label lo=new Label("");
		Label lw=new Label("---------------------------------------------",Label.RIGHT);
		Label lr=new Label("---------------------------------------------");
		tfb=new TextField(5);
		tfa=new TextField(5);
		tfc=new TextField(5);
		tfd=new TextField(5);
		tajkl=new TextArea(5,5);
		tap=new TextArea(5,5);
		taq=new TextArea(5,5);
		taz1=new TextArea(5,5);
		taz2=new TextArea(5,5);
		taz3=new TextArea(5,5);
		tax1=new TextArea(5,5);
		tax2=new TextArea(5,5);
		tax3=new TextArea(5,5);
		tajkl.setEditable(false);
		tap.setEditable(false);
		taq.setEditable(false);
		taz1.setEditable(false);
		taz2.setEditable(false);
		taz3.setEditable(false);
		tax1.setEditable(false);
		tax2.setEditable(false);
		tax3.setEditable(false);
		b=new Button("Calcular");
		b.addActionListener(this);

		      //Organizaci�n de los componentes
		setLayout(new BorderLayout(20,20));
		p1=new Panel(new GridLayout(3,5,10,10));
		p1.add(lm);
		p1.add(lw);
		p1.add(lz);
		p1.add(lr);
		p1.add(lo);
		p1.add(la);
		p1.add(lb);
		p1.add(lc);
		p1.add(ld);
		p1.add(lButton);
		p1.add(tfa);
		p1.add(tfb);
		p1.add(tfc);
		p1.add(tfd);
		p1.add(b);
		add(p1,BorderLayout.NORTH);
		p6=new Panel(new GridLayout(3,2,10,10));
		p3=new Panel(new BorderLayout());
		p2=new Panel(new GridLayout(1,1,10,10));
		p3.add(ljkl,BorderLayout.NORTH);
		p3.add(tajkl,BorderLayout.CENTER);
		p2.add(p3);
		p6.add(p2);
		p4=new Panel(new BorderLayout());
		p5=new Panel(new GridLayout(1,1,10,10));
		p4.add(lp,BorderLayout.NORTH);
		p4.add(tap,BorderLayout.CENTER);
		p5.add(p4);
		p6.add(p5);
		p7=new Panel(new GridLayout(1,1,10,10));
		p8=new Panel(new BorderLayout());
		p8.add(lq,BorderLayout.NORTH);
		p8.add(taq,BorderLayout.CENTER);
		p7.add(p8);
		p6.add(p7);
		add(p6,BorderLayout.WEST);
		p9=new Panel(new GridLayout(1,1,10,10));
		p10=new Panel(new BorderLayout());
		p11=new Panel(new GridLayout(3,1,10,10));
		p10.add(lz1,BorderLayout.NORTH);
		p10.add(taz1,BorderLayout.CENTER);
		p9.add(p10);
		p11.add(p9);
		p12=new Panel(new GridLayout(1,1,10,10));
		p13=new Panel(new BorderLayout());
		p13.add(lz2,BorderLayout.NORTH);
		p13.add(taz2,BorderLayout.CENTER);
		p12.add(p13);
		p11.add(p12);
		p14=new Panel(new GridLayout(1,1,10,10));
		p15=new Panel(new BorderLayout());
		p15.add(lz3,BorderLayout.NORTH);
		p15.add(taz3,BorderLayout.CENTER);
		p14.add(p15);
		p11.add(p14);
		add(p11,BorderLayout.CENTER);
		p16=new Panel(new GridLayout(3,1,10,10));
		p17=new Panel(new GridLayout(1,1,10,10));
		p18=new Panel(new BorderLayout());
		p18.add(lx1,BorderLayout.NORTH);
		p18.add(tax1,BorderLayout.CENTER);
		p17.add(p18);
		p16.add(p17);
		p19=new Panel(new GridLayout(1,1,10,10));
		p20=new Panel(new BorderLayout());
		p20.add(lx2,BorderLayout.NORTH);
		p20.add(tax2,BorderLayout.CENTER);
		p19.add(p20);
		p16.add(p19);
		p21=new Panel(new GridLayout(1,1,10,10));
		p22=new Panel(new BorderLayout());
		p22.add(lx3,BorderLayout.NORTH);
		p22.add(tax3,BorderLayout.CENTER);
		p21.add(p22);
		p16.add(p21);
		add(p16,BorderLayout.EAST);
	}

	public void paint(Graphics g) {
	}

	public void actionPerformed(ActionEvent ae){
		//Cuerpo
		   //Variables
		double a,b,c,d,j,k,l,p,q,z1,z2,z3,x1,x2,x3,x1R,x2R,x3R,A,theta,centinela;
		String solz1,solz2,solz3,nal;

		   //Input
		a=Double.parseDouble(tfa.getText());
		b=Double.parseDouble(tfb.getText());
		c=Double.parseDouble(tfc.getText());
		d=Double.parseDouble(tfd.getText());

		   //Parte Matem�tica
		      //F�rmulas
		         //J,K,L,P,Q
		j=interceptoCubico.getJ(a,b,c,d);
		k=interceptoCubico.getK(a,b,c,d);
		l=interceptoCubico.getL(a,b,c,d);
		p=interceptoCubico.getP(a,b,c,d);
		q=interceptoCubico.getQ(a,b,c,d);

		         //Z1,Z2,Z3
		z1=interceptoCubico.getZ1(a,b,c,d);
		z2=interceptoCubico.getZ2(a,b,c,d);
		z3=interceptoCubico.getZ3(a,b,c,d);

		A=Math.round((-q/2)*100)/100.0;
		if(A<0)
			nal="-2";
		else
			nal="2";

		centinela=Math.pow(interceptoCubico.getQ(a,b,c,d),2)/4+Math.pow(interceptoCubico.getP(a,b,c,d),3)/27;
		theta=interceptoCubico.getTheta(a,b,c,d);
		if(centinela<0){
			     //Soluci�n Z1,Z2,Z3
			solz1=("�= arctan( (-q^2/4-p^3/27)^(1/2) / (-q/2) )\n\n   = arctan( ("+(-q)+"^2/4-("+p+")^3/27)^(1/2) / ("+(-q)
				+"/2) )\n\n   = arctan( ("+(Math.pow(q,2)/-4)+" - ("+(Math.pow(p,3)/27)+") )^(1/2) / ("+(-q/2)+") )\n\n   = arctan("
					+(Math.round((Math.sqrt(centinela*-1))*100)/100.0)/A+")\n\n   = "+theta+"\n\nZ1= "
						+nal+"  (-p/3)^(1/2)  cos(�/3)\n\n      = "+nal+"  ("+(-p)+"/3)^(1/2)  cos("+theta+"/3)\n\n      = "+nal+"  ("+Math.sqrt(-p/3)+")  ("+Math.cos(theta/3)+")\n\n      = "+z1);
			solz2=("Z2= "+nal+"  (-p/3)^(1/2)  cos( ( � + 2 � ) / 3)\n\n      = "+nal+"  ("+(-p)+"/3)^(1/2)  cos( ("+theta
						+"+2 � ) /3)\n\n      = "+nal+" ("+(-p/3)+")^(1/2)  cos("+(theta+2*Math.PI)/3+")\n\n      = "+nal+"  ("
							+Math.sqrt(-p/3)+")  ("+Math.cos((theta+2*Math.PI)/3)+")\n\n      = "+z2);
			solz3=("Z3= "+nal+"  (-p/3)^(1/2)  cos( ( � + 4 � ) / 3)\n\n      = "+nal+"  ("+(-p)+"/3)^(1/2)  cos( ("+theta
						+"+4 � ) /3)\n\n      = "+nal+" ("+(-p/3)+")^(1/2)  cos("+(theta+4*Math.PI)/3+")\n\n      = "+nal+"  ("
							+Math.sqrt(-p/3)+")  ("+Math.cos((theta+4*Math.PI)/3)+")\n\n      = "+z3);
		}else{
			     //Soluci�n Z1,Z2,Z3
		    solz1=("Z1= ((-q/2)+((q^2/4)+(p^3/27))^(1/2))^(1/3)+((-q/2) - ((q^2/4)+(p^3/27))^(1/2))^(1/3)\n\n     = (("+(-q/2)
			+")+(("+Math.pow(q,2)/4+")+("+Math.pow(p,3)/27+"))^(1/2))^(1/3)+(("+(-q/2)+") - (("+Math.pow(q,2)/4+")+("+Math.pow(p,3)/27
				+"))^(1/2))^(1/3)\n\n     = ("+(-(q/2)+(Math.sqrt(((Math.pow(q,2))/4)+(Math.pow(p,3))/27)))+")^(1/3) + ("
					+(-(q/2)-(Math.sqrt(((Math.pow(q,2))/4)+(Math.pow(p,3))/27)))+")^(1/3)\n\n     = ("+raiz.impar((-q/2)+Math.sqrt(Math.pow(q,2)/4+Math.pow(p,3)/27),3)+") + ("+raiz.impar(-(q/2)-Math.sqrt(Math.pow(q,2)/4+Math.pow(p,3)/27),3)+")\n\n     = "+z1);

			solz2=("Z2= (-Z1/2) + (((Z1^2)/4) + (q/Z1))^(1/2)\n\n     = (-"+z1+"/2) + ((("+z1+"^2)/4) + ("+q+"/"+z1+
			"))^(1/2)\n\n     = ("+(-z1/2)+") + (("+Math.pow((z1/2),2)+") + ("+q/z1+"))^(1/2)\n\n     = ("+(-z1/2)+") + ("
				+Math.sqrt((Math.round((Math.pow(z1/2,2))*1000)/1000.0)+(Math.round((q/z1)*1000)/1000.0))+")\n\n     = "+z2);

			solz3=("Z3= (-Z1/2) - (((Z1^2)/4) + (q/Z1))^(1/2)\n\n     = (-"+z1+"/2) - ((("+z1+"^2)/4) + ("+q+"/"+z1+
			"))^(1/2)\n\n     = ("+(-z1/2)+") - (("+Math.pow((z1/2),2)+") + ("+q/z1+"))^(1/2)\n\n     = ("+(-z1/2)+") - ("
				+Math.sqrt((Math.round((Math.pow(z1/2,2))*1000)/1000.0)+(Math.round((q/z1)*1000)/1000.0))+")\n\n     = "+z3);
		}

		         //X1,X2,X3
		x1=interceptoCubico.getX1(a,b,c,d);
		x2=interceptoCubico.getX2(a,b,c,d);
		x3=interceptoCubico.getX3(a,b,c,d);

		      //Procedimientos
		         //J,K,L
		tajkl.setText("-------Variable J-------\nJ= b/a= ("+b+")/("+a+")= "+j+"\n\n\n-------Variable K-------\nK= c/a= ("+c+")/("+a
			+")= "+k+"\n\n\n-------Variable L-------\nL= d/a= ("+d+")/("+a+")= "+l);

		         //P
		tap.setText("\np= K-((J^2)/3)\n\n   = "+k+"-(("+j+"^2)/3)\n\n   = "+k+"-("+Math.pow(j,2)/3+")\n\n   = "+p);

		         //Q
		taq.setText("q= (2(J^3)/27) - (K*J/3)+L\n\n   = (2("+j+"^3)/27) - ("+k+"*"+j+"/3) + ("+l+")\n\n   = ("+2*Math.pow(j,3)+"/27) - ("+k*j+"/3) + ("+l+")\n\n   = ("
			+2*Math.pow(j,3)/27+") - ("+k*j/3+") + ("+l+")\n\n   = "+q);

		         //Z1
		taz1.setText(solz1);

		         //Z2
		taz2.setText(solz2);

                 //Z3
		taz3.setText(solz3);

		         //X1,X2,X3(and X1,X2,X3 Redondeadas)
		if(Double.isNaN(x1)==true){
		    tax1.setText("X1= Z1-(J/3)\n\n     = ("+z1+") - ("+j+"/3)\n\n     = ("+z1+") - ("+j/3+")\n\n     = "+x1);
		}else{
			x1R=(double)Math.round((z1-j/3)*1000)/1000;
		    tax1.setText("X1= Z1-(J/3)\n\n     = ("+z1+") - ("+j+"/3)\n\n     = ("+z1+") - ("+j/3+")\n\n     = "+x1+"\n\n     = "+x1R);
		}

		if(Double.isNaN(x2)==true){
		    tax2.setText("X1= Z1-(J/3)\n\n     = ("+z2+") - ("+j+"/3)\n\n     = ("+z2+") - ("+j/3+")\n\n     = "+x2);
		}else{
			x2R=(double)Math.round((z2-j/3)*1000)/1000;
			tax2.setText("X2= Z2-(J/3)\n\n     = ("+z2+") - ("+j+"/3)\n\n     = ("+z2+") - ("+j/3+")\n\n     = "+x2+"\n\n     = "+x2R);
		}

		if(Double.isNaN(x3)==false){
		    x3R=(double)Math.round((z3-j/3)*1000)/1000;
			tax3.setText("X3= Z3-(J/3)\n\n     = ("+z3+") - ("+j+"/3)\n\n     = ("+z3+") - ("+j/3+")\n\n     = "+x3+"\n\n     = "+x3R);
		}else{
			tax3.setText("X3= Z3-(J/3)\n\n     = ("+z3+") - ("+j+"/3)\n\n     = ("+z3+") - ("+j/3+")\n\n     = "+x3);
		}

		//Condiciones para ingresar datos
		if(a==0){
			tajkl.setText("\n\n\n\n               No es posible ingresar\n               cero en el par�metro a");
			tap.setText("\n\n\n\n               No es posible ingresar\n               cero en el par�metro a");
			taq.setText("\n\n\n\n               No es posible ingresar\n               cero en el par�metro a");
			taz1.setText("\n\n\n\n                                                                 No es posible ingresar\n                                                                 cero en el par�metro a");
			taz2.setText("\n\n\n\n                                                                 No es posible ingresar\n                                                                 cero en el par�metro a");
			taz3.setText("\n\n\n\n                                                                 No es posible ingresar\n                                                                 cero en el par�metro a");
			tax1.setText("\n\n\n\n            No es posible ingresar\n             cero en el par�metro a");
			tax2.setText("\n\n\n\n            No es posible ingresar\n             cero en el par�metro a");
			tax3.setText("\n\n\n\n            No es posible ingresar\n             cero en el par�metro a");
		}
	}

	public static void main (String[] args){
		Frame ventana=new Frame("TECS! - The Ecuation Cubic Software!");
		ecuacionCubica applet=new ecuacionCubica();
		ventana.add(applet);
		applet.init();
		ventana.setSize(1000,730);
		ventana.setVisible(true);
		//System.exit(0);
	}
}
/**
 * @(#)interceptoCubico.java
 *
 *
 * @Jonathan Soto (theja29@hotmail.com)
 * @version 1.00 2012/6/4
 */


public class interceptoCubico {

    public interceptoCubico() {
    }

    public static double getJ(double a,double b,double c,double d){
    	return b/a;
    }

    public static double getJ(int a,int b,int c,int d){
    	return b/a;
    }

    public static double getK(double a,double b,double c,double d){
    	return c/a;
    }

    public static double getK(int a,int b,int c,int d){
      	return c/a;
    }

    public static double getL(double a,double b,double c,double d){
    	return d/a;
    }

    public static double getL(int a,int b,int c,int d){
    	return d/a;
    }

    public static double getP(double a,double b,double c,double d){
    	return getK(a,b,c,d)-((Math.pow(getJ(a,b,c,d),2))/3);
    }

    public static double getP(int a,int b,int c,int d){
    	return getK(a,b,c,d)-((Math.pow(getJ(a,b,c,d),2))/3);
    }

    public static double getQ(double a,double b,double c,double d){
    	return ((2*(Math.pow(getJ(a,b,c,d),3)))/27)-((getK(a,b,c,d)*getJ(a,b,c,d))/3)+getL(a,b,c,d);
    }

    public static double getQ(int a,int b,int c,int d){
    	return ((2*(Math.pow(getJ(a,b,c,d),3)))/27)-((getK(a,b,c,d)*getJ(a,b,c,d))/3)+getL(a,b,c,d);
    }

    public static double getTheta(int a,int b,int c,int d){
    	double A,B;

    	A=Math.round((-getQ(a,b,c,d)/2)*100)/100.0;
		B=Math.round((Math.sqrt((Math.pow(getQ(a,b,c,d),2)/4+Math.pow(getP(a,b,c,d),3)/27)*-1))*100)/100.0;
		return Math.round((Math.atan(B/A))*100000)/100000.0;
    }

    public static double getTheta(double a,double b,double c,double d){
    	double A,B;

    	A=Math.round((-getQ(a,b,c,d)/2)*100)/100.0;
		B=Math.round((Math.sqrt((Math.pow(getQ(a,b,c,d),2)/4+Math.pow(getP(a,b,c,d),3)/27)*-1))*100)/100.0;
		return Math.round((Math.atan(B/A))*100000)/100000.0;
    }

    public static double getZ1(double a,double b,double c,double d){
    	double A,B,centinela,theta,z1;

		centinela=Math.pow(getQ(a,b,c,d),2)/4+Math.pow(getP(a,b,c,d),3)/27;
		if(centinela<0){
    		A=Math.round((-getQ(a,b,c,d)/2)*100)/100.0;
			B=Math.round((Math.sqrt(centinela*-1))*100)/100.0;
			theta=Math.round((Math.atan(B/A))*100000)/100000.0;
			z1=2*Math.sqrt(-getP(a,b,c,d)/3)*Math.round((Math.cos(theta/3))*100)/100.0;
			if(A<0){
				z1*=-1;
			}
		}else{
			z1=(raiz.impar((-getQ(a,b,c,d)/2)+Math.sqrt(Math.pow(getQ(a,b,c,d),2)/4+Math.pow(getP(a,b,c,d),3)/27),3))+(raiz.impar(-(getQ(a,b,c,d)/2)-Math.sqrt(Math.pow(getQ(a,b,c,d),2)/4+Math.pow(getP(a,b,c,d),3)/27),3));
		}
		return z1;
    }

    public static double getZ1(int a,int b,int c,int d){
    	double A,B,centinela,theta,z1;

		centinela=Math.pow(getQ(a,b,c,d),2)/4+Math.pow(getP(a,b,c,d),3)/27;
		if(centinela<0){
    		A=Math.round((-getQ(a,b,c,d)/2)*100)/100.0;
			B=Math.round((Math.sqrt(centinela*-1))*100)/100.0;
			theta=Math.round((Math.atan(B/A))*100000)/100000.0;
			z1=2*Math.sqrt(-getP(a,b,c,d)/3)*Math.round((Math.cos(theta/3))*100)/100.0;
			if(A<0){
				z1*=-1;
			}
		}else{
			z1=(raiz.impar((-getQ(a,b,c,d)/2)+Math.sqrt(Math.pow(getQ(a,b,c,d),2)/4+Math.pow(getP(a,b,c,d),3)/27),3))+(raiz.impar(-(getQ(a,b,c,d)/2)-Math.sqrt(Math.pow(getQ(a,b,c,d),2)/4+Math.pow(getP(a,b,c,d),3)/27),3));
		}
		return z1;
    }

    public static double getZ2(double a,double b,double c,double d){
    	double A,B,centinela,theta,z2;

		centinela=Math.pow(getQ(a,b,c,d),2)/4+Math.pow(getP(a,b,c,d),3)/27;
		if(centinela<0){
    		A=Math.round((-getQ(a,b,c,d)/2)*100)/100.0;
			B=Math.round((Math.sqrt(centinela*-1))*100)/100.0;
			theta=Math.round((Math.atan(B/A))*100000)/100000.0;
			z2=2*Math.sqrt(-getP(a,b,c,d)/3)*Math.cos((theta+2*Math.PI)/3);
			if(A<0){
				z2*=-1;
			}
		}else{
			z2=(-getZ1(a,b,c,d)/2)+(Math.sqrt(Math.round(Math.pow((getZ1(a,b,c,d)/2),2)*100)/100.0+(Math.round((getQ(a,b,c,d)/getZ1(a,b,c,d))*100)/100.0)));
		}
		return z2;
    }

    public static double getZ2(int a,int b,int c,int d){
    	double A,B,centinela,theta,z2;

		centinela=Math.pow(getQ(a,b,c,d),2)/4+Math.pow(getP(a,b,c,d),3)/27;
		if(centinela<0){
    		A=Math.round((-getQ(a,b,c,d)/2)*100)/100.0;
			B=Math.round((Math.sqrt(centinela*-1))*100)/100.0;
			theta=Math.round((Math.atan(B/A))*100000)/100000.0;
			z2=2*Math.sqrt(-getP(a,b,c,d)/3)*Math.cos((theta+2*Math.PI)/3);
			if(A<0){
				z2*=-1;
			}
		}else{
			z2=(-getZ1(a,b,c,d)/2)+(Math.sqrt(Math.round(Math.pow((getZ1(a,b,c,d)/2),2)*100)/100.0+(Math.round((getQ(a,b,c,d)/getZ1(a,b,c,d))*100)/100.0)));
		}
		return z2;
    }

    public static double getZ3(double a,double b,double c,double d){
    	double A,B,centinela,theta,z3;

		centinela=Math.pow(getQ(a,b,c,d),2)/4+Math.pow(getP(a,b,c,d),3)/27;
		if(centinela<0){
    		A=Math.round((-getQ(a,b,c,d)/2)*100)/100.0;
			B=Math.round((Math.sqrt(centinela*-1))*100)/100.0;
			theta=Math.round((Math.atan(B/A))*100000)/100000.0;
			z3=2*Math.sqrt(-getP(a,b,c,d)/3)*Math.cos((theta+4*Math.PI)/3);
			if(A<0){
				z3*=-1;
			}
		}else{
			z3=(-getZ1(a,b,c,d)/2)-(Math.sqrt(Math.round(Math.pow((getZ1(a,b,c,d)/2),2)*100)/100.0+(Math.round((getQ(a,b,c,d)/getZ1(a,b,c,d))*100)/100.0)));
		}
		return z3;
    }

    public static double getZ3(int a,int b,int c,int d){
    	double A,B,centinela,theta,z3;

		centinela=Math.pow(getQ(a,b,c,d),2)/4+Math.pow(getP(a,b,c,d),3)/27;
		if(centinela<0){
    		A=Math.round((-getQ(a,b,c,d)/2)*100)/100.0;
			B=Math.round((Math.sqrt(centinela*-1))*100)/100.0;
			theta=Math.round((Math.atan(B/A))*100000)/100000.0;
			z3=2*Math.sqrt(-getP(a,b,c,d)/3)*Math.cos((theta+4*Math.PI)/3);
			if(A<0){
				z3*=-1;
			}
		}else{
			z3=(-getZ1(a,b,c,d)/2)-(Math.sqrt(Math.round(Math.pow((getZ1(a,b,c,d)/2),2)*100)/100.0+(Math.round((getQ(a,b,c,d)/getZ1(a,b,c,d))*100)/100.0)));
		}
		return z3;
    }

    public static double getX1(double a,double b,double c,double d){
    	return getZ1(a,b,c,d)-getJ(a,b,c,d)/3;
    }

    public static double getX1(int a,int b,int c,int d){
    	return getZ1(a,b,c,d)-getJ(a,b,c,d)/3;
    }

    public static double getX2(double a,double b,double c,double d){
    	return getZ2(a,b,c,d)-getJ(a,b,c,d)/3;
    }

    public static double getX2(int a,int b,int c,int d){
    	return getZ2(a,b,c,d)-getJ(a,b,c,d)/3;
    }

    public static double getX3(double a,double b,double c,double d){
    	return getZ3(a,b,c,d)-getJ(a,b,c,d)/3;
    }

    public static double getX3(int a,int b,int c,int d){
    	return getZ3(a,b,c,d)-getJ(a,b,c,d)/3;
    }

}
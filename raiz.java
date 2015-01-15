/**
 * @(#)raices.java
 *
 *
 * @Jonathan Soto (theja29@hotmail.com)
 * @version 1.00 2012/5/1
 */


public class raiz{
	private double x;

    public raiz(){
    }

    public static double impar(double x,int y){

    	if(x<0){
    		x*=-1;
    		x=Math.pow(x,1.0/y);
    		x*=-1;
    	}else{
    		x=Math.pow(x,1.0/y);
    	}

    		return x;
    }

    public static double impar(double x,double y){

    	if(x<0){
    		x*=-1;
    		x=Math.pow(x,1.0/y);
    		x*=-1;
    	}else{
    		x=Math.pow(x,1.0/y);
    	}

    		return x;
    }

    public static double impar(int z,int y){

    	double x=(double)(z);
    	if(x<0){
    		x*=-1;
    		x=Math.pow(x,1.0/y);
    		x*=-1;
    	}else{
    		x=Math.pow(x,1.0/y);
    	}

    		return x;
    }

    public static double impar(int z,double y){

    	double x=(double)(z);
    	if(x<0){
    		x*=-1;
    		x=Math.pow(x,1.0/y);
    		x*=-1;
    	}else{
    		x=Math.pow(x,1.0/y);
    	}

    		return x;
    }
}
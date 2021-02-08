
package pe.egcc.mnapp2.service;

import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.JEP;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

public class MyMath {
    
    public MyMath(){
    }
    
    JEP j = new JEP();
    
    public MyMath(String def){
        j.addVariable("x", 0);
        j.addStandardConstants();
        j.addStandardFunctions();
        j.parseExpression(def);
        if (j.hasError()) {
            System.out.println(j.getErrorInfo());
        }
    }
    public double evaluar(double x){
        double r;
        j.addVariable("x", x);
        r = j.getValue();
        if (j.hasError()) {
            System.out.println(j.getErrorInfo());   
        }
        return r;
    }
    public String derivar(String funcion){
        String derivada = "";
        DJep derivar = new DJep();
        derivar.addStandardFunctions();
        derivar.addStandardConstants();
        derivar.addComplex();
        derivar.setAllowUndeclared(true);
        derivar.setAllowAssignment(true);
        derivar.setImplicitMul(true);
        derivar.addStandardDiffRules();
        
        try {
            Node no = derivar.parse(funcion);
            Node diff = derivar.differentiate(no, "x");
            Node sim = derivar.simplify(diff);
            derivada = derivar.toString(sim);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return derivada;
    }
    
    //BISECCION
    public double procesarbis(double a){
        double rpta = Math.exp(-a) + a -2;
        return rpta;
    }
    public double mediabis(double a, double b){
        return (a+b)/2;
    }
    public double procesar2bis(double a){
        return Math.exp(-a) - Math.log(a);
    }
    public double calErrorbis(double a, double b){
        double numerador = a-b;
        double deno = a;
        return Math.abs(numerador/deno)*100;
    }
    
    //SECANTE
    public double procesarf_sec(double a){
        return Math.exp(-a)+a-2;
    }
    public double procesarx_sec(double f1, double f2, double x1, double x2) throws OutOfMemoryError{
        double num = f1*x2 - f2*x1;
        double den = f1 - f2;
        if(den != 0){
            return num/den;
        }else{
            throw new OutOfMemoryError(new OutOfMemoryError().getMessage());
        }
    }
    public double calErrorsec(double a, double b){
        double num = a-b;
        return Math.abs(num/a);
    }
    
    //FALSO POSICION
    public double mediaf_p(double fa, double fb, double a, double b) throws OutOfMemoryError{
        double num = fb*a - fa*b;
        double den = fb - fa;
        if(den != 0){
            return num/den;
        }else{
            throw new OutOfMemoryError(new OutOfMemoryError().getMessage());
        }        
    }
    public double procesarf_p(double a){
        return Math.exp(-a) + a -2;
    }
    public double calErrorf_p(double a, double b){
        double num = a-b; 
        return Math.abs(num/a)*100;
    }
    
    //NEWTON
    public double procesarx(double f1, double f2, double x1) throws OutOfMemoryError{
        if(f2 != 0){
            double den = f1/f2;
            return x1 - den;
        }else{
            throw new OutOfMemoryError(new OutOfMemoryError().getMessage());
        }
    }
    
    public double calError(double a, double b){
        double num = a-b;
        return Math.abs(num/a);
    }
    
    //PUNTO FIJO
    public double medio(double a, double b){
        double num = a+b;
        return num/2;
    }
    
}

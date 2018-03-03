
package boletin13;

public class ConversorTemperaturas {
    static int grados=80;

    public double centigradosAFharenheit(float temperatura)throws TemperaturaErrada{
       if(temperatura>=grados){       
        double Fharenheit;
        Fharenheit=temperatura*1.8+32;
        return Fharenheit;
       }
       else{
           throw new TemperaturaErrada("A máquina debe de estar a máis de 80º");
      
        }
    }
        
        
    public double centígradosAReamur (float temperatura) throws TemperaturaErrada{
        if(temperatura>=grados){
            double Reamur;
           Reamur=temperatura*5/4;
           return Reamur;
        }
        else{
            throw new TemperaturaErrada("A máquina debe de estar a máis de 80º");
        }    
        }
    
     
    public static void main(String[] args) throws TemperaturaErrada {
      ConversorTemperaturas a= new ConversorTemperaturas();
      System.out.println(a.centigradosAFharenheit(93));
      System.out.println(a.centígradosAReamur(93));
    }
    
}


//Nunha empresa utilizan uns aparellos que traballan a temperaturas expresadas en graos Fharenheit e graos Reamur .Para axudalos, decidimos  facer unha aplicación “ conversor de temperaturas”.De xeito que unha persoa teclea a temperatura, en graos centigrados, e o conversor devolvenos a temperatura en graos Fharenheit e Reamur. Pero o aparello non pode traballar con temperaturas < 80 ºC .
//    Crea unha aplicación cas seguintes clases :
//A clase TemperaturaErradaExcepcion  que represente a nosa excepción ( recorda que a temperatura non pode ser < 80 ºC )
//A clase ConversorTemperaturas . Nesta clase :
//1- Declara unha constante  co valor 80 ºC
//2- Un método centigradosAFharenheit  que reciba unha temperatura, tipo float, en graos centígrados e calcula e retorne o valor correspondente en graos fharenheit 
//     º Fharenheir = 9,0 / 5, 0 * centígrados + 32, 4
//   Este método non tratará a excepción ( TemperaturaErradaExcepcion ), e, se a temperatura é < 80 º centígrados  lanzará a excepción que será capturada e tratada na clase principal . 
//3-Un método centígradosAReamur  que reciba unha temperatura, tipo float, en graos centígrados e calcula e nos retorne o valor correspondente en graos Reamur .
//º Reamur = 4,0 / 5,0 * centígrados 
//Captura a excepción.
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.utility.Delay;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 02.05.2019
  * @author 
  */

public class mindroidInitialized {
  
  public static EV3LargeRegulatedMotor motorL= new EV3LargeRegulatedMotor(MotorPort.A);
  public static EV3LargeRegulatedMotor motorR= new EV3LargeRegulatedMotor(MotorPort.D);
  
  public static void main(String[] args) {
    //Ab hier könnt ihr programmieren
    motorL.forward();
    Delay.msDelay(1000);
    
  } // end of main
  
 
 
 
 
 
 
 
 
 
 
 
 
 
  



} // end of class vereinfachendeMethoden

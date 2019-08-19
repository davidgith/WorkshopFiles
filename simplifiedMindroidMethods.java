import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.utility.Delay;    

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 02.05.2019
  * @author 
  */

public class simplifiedMindroidMethods {
  
  public static EV3LargeRegulatedMotor motorL= new EV3LargeRegulatedMotor(MotorPort.A);
  public static EV3LargeRegulatedMotor motorR= new EV3LargeRegulatedMotor(MotorPort.D);

  public static EV3UltrasonicSensor ultra = new EV3UltrasonicSensor(SensorPort.S2);
  public static EV3GyroSensor gyro = new EV3GyroSensor(SensorPort.S3);
  public static EV3ColorSensor colorL = new EV3ColorSensor(SensorPort.S1);
  public static EV3ColorSensor colorR = new EV3ColorSensor(SensorPort.S4);
  
  static{
    ultra.setCurrentMode("Distance");
    gyro.setCurrentMode("Angle");
    colorL.setCurrentMode("Ambient");
  }

    
  
  
  public static void main(String[] args) {
    //Ab hier könnt ihr programmieren
    
    
  } // end of main
  
 
 
 
 
 
 
 
 
 
 
 
 
 
  
  public static void forwardNeXT(int time){
    motorL.forward();
    motorR.forward();
    Delay.msDelay(time);
    motorL.stop();
    motorR.stop();
  }
  
  public static float getDistance(){
    float signalwert[] = new float[ultra.sampleSize()];
    ultra.fetchSample(signalwert,0);
    return signalwert[0];
  }
  
  public static float getAngle(){
    float signalwert[] = new float[gyro.sampleSize()];
    gyro.fetchSample(signalwert,0);
    return signalwert[0];
  }
  
  public static float getAmbientLightLevel(){
    float signalwert[] = new float[colorL.sampleSize()];
    colorL.fetchSample(signalwert,0);
    return signalwert[0];
  }


} // end of class vereinfachendeMethoden

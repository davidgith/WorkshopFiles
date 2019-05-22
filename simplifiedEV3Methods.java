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

public class simplifiedEV3Methods {
  
  public static EV3LargeRegulatedMotor motorL= new EV3LargeRegulatedMotor(MotorPort.B);
  public static EV3LargeRegulatedMotor motorR= new EV3LargeRegulatedMotor(MotorPort.C);
  public static EV3MediumRegulatedMotor motorM= new EV3MediumRegulatedMotor(MotorPort.A);

  public static EV3UltrasonicSensor ultra = new EV3UltrasonicSensor(SensorPort.S4);
  public static EV3GyroSensor gyro = new EV3GyroSensor(SensorPort.S2);
  public static EV3ColorSensor color = new EV3ColorSensor(SensorPort.S3);
  public static EV3TouchSensor touch = new EV3TouchSensor(SensorPort.S1);
  
  
  public static void main(String[] args) {
    ultra.setCurrentMode("Distance");
    gyro.setCurrentMode("Angle");
    color.setCurrentMode("Ambient");
    touch.setCurrentMode("Touch");
    
    //Ab hier könnt ihr programmieren
       
    
  } // end of main
  
  
  public static void forwardNeXT(int time){
    motorL.forward();
    motorR.forward();
    Delay.msDelay(time);
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
    float signalwert[] = new float[color.sampleSize()];
    color.fetchSample(signalwert,0);
    return signalwert[0];
  }
  
  public static float isPressed(){
    float signalwert[] = new float[touch.sampleSize()];
    touch.fetchSample(signalwert,0);
    return signalwert[0];
  }


} // end of class vereinfachendeMethoden

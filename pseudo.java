package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name = "Pseudocode for general game")
public class psuedo extends LinearOpMode {
  //Declare motors and other variables
  @Override
  public void runOpMode() throws InterruptedException{
    waitForStart();
    PlacePixel();
    Park();
  }

  void Movement(){
    //Do basic movement, just a way of sorting simple code
  }

  void PlacePixel(){
    //Move to board using Movement()
    //Sweep horizontally a specific distance (half the width of the backdrop) until the correct april tag is detected
    //move corresponding motors to place pixel
  }

  void Park(){
    //Move to parking spot using Movement()
  }



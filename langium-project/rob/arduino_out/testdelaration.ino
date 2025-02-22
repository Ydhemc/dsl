#include <PinChangeInt.h>
#include <PinChangeIntConfig.h>
#include <EEPROM.h>
#define _NAMIKI_MOTOR	 //for Namiki 22CL-103501PG80:1
#include <fuzzy_table.h>
#include <PID_Beta6.h>
#include <MotorWheel.h>
#include <Omni4WD.h>

unsigned long __duration;
unsigned long __begin;

bool x;
bool v;
bool a;
int x; 
void iLoveThisCode (bool a, bool v){
        //instruction    

            __duration = 1000*( Omni.getSpeedMMPS() * (((2+2)+2)+2));
            __begin = millis();
            while((millis() - __begin) < __duration){Omni.setCarAdvance(Omni.getCarSpeedMMPS());}

    while(true){

            __duration = 1000*( Omni.getSpeedMMPS() * 4);
            __begin = millis();
            while((millis() - __begin) < __duration){Omni.setCarAdvance(Omni.getCarSpeedMMPS());}

    }

    if( false ){
        /* instruction if*/ 
    
            __duration = 1000*( Omni.getSpeedMMPS() * 1);
            __begin = millis();
            while((millis() - __begin) < __duration){Omni.setCarAdvance(Omni.getCarSpeedMMPS());}

    }  
}
irqISR(irq1, isr1);
MotorWheel wheel1(3, 2, 4, 5, &irq1);

irqISR(irq2, isr2);
MotorWheel wheel2(11, 12, 14, 15, &irq2);

irqISR(irq3, isr3);
MotorWheel wheel3(9, 8, 16, 17, &irq3);

irqISR(irq4, isr4);
MotorWheel wheel4(10, 7, 18, 19, &irq4);


Omni4WD Omni(&wheel1, &wheel2, &wheel3, &wheel4);
bool __isDone = false;

void setup() {
    TCCR1B = TCCR1B & 0xf8 | 0x01; // Pin9,Pin10 PWM 31250Hz
    TCCR2B = TCCR2B & 0xf8 | 0x01; // Pin3,Pin11 PWM 31250Hz
    Omni.PIDEnable(0.31, 0.01, 0, 10);
}

void loop() {
    if(!__isDone){
    
    if( true ){
        /* instruction if*/ 
    
            __duration = 1000*( Omni.getSpeedMMPS() * 2);
            __begin = millis();
            while((millis() - __begin) < __duration){Omni.setCarAdvance(Omni.getCarSpeedMMPS());}

    }else { 
    /*Instruction Else*/
            __duration = 1000*( Omni.getSpeedMMPS() * 4);
            __begin = millis();
            while((millis() - __begin) < __duration){Omni.setCarAdvance(Omni.getCarSpeedMMPS());}

    } 
    while(false){

            __duration = 1000*( Omni.getSpeedMMPS() * 10);
            __begin = millis();
            while((millis() - __begin) < __duration){Omni.setCarAdvance(Omni.getCarSpeedMMPS());}

    }
    __isDone = true;
    } else {
        Omni.setCarSlow2Stop(1000)
    }
}
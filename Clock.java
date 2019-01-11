/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

/**
 *
 * @author Student
 */
public class Clock {

    
    public int h,m,s;
    public char c;
    public  Clock()
    {
        this.h=0;
        this.m=0;
        this.s=0;
        this.c='p';
    }
    
    public  Clock(int h, char c)
    {
        this.h=h;
        this.m=0;
        this.s=0;
        this.c=c;
        
    }
    public  Clock(int h,int m,int s,char c)
    {
        this.h=h;
        this.m=m;
        this.s=s;
        this.c=c;
    }
    public int getHours(){
       return this.h;
    }
    
    public int getMinutes(){
        return this.m;
    }
    
    public int getSecond(){
        return this.s;
    }
    
    public char getisAM(){
        return this.c;
    }
    public void setTime(int h,int m,int s,char c)
    {
        this.h=h;
        this.m=m;
        this.s=s;
        this.c=c;
    }
    public void tick() throws InterruptedException
    {
        if(this.s<59)this.s=this.s+1;
        else{
            if(this.m<59){this.m=this.m+1;this.s=0;}
            else{
                if(this.h<11){
                    this.h=this.h+1;
                    this.m=0;
                    this.s=0;
                    }
                else{
                    if(this.h==11){
                        this.h=12;
                        this.m=0;
                        this.s=0;
                        if(this.c=='a'){
                        this.c='p';
                        } 
                    else this.c='a';}
                    else{
                    this.h=1;this.m=0;
                        this.s=0;}
                }
                    
            }
        }
        System.out.print("time:"+ this.h +" :"+ this.m +" :"+ this.s +" :"+ this.c+"\n");
        Thread.sleep(1000);
    }
    public static void main(String[] args) 
            throws InterruptedException {
        Clock adidas =new Clock(12,59,54,'a');
        while(true)
        {
            adidas.tick();
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drawing;

import Classes.SchedProcess;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author ccsit
 */
public class ProcessBlock {
    private final SchedProcess process;
    private final int width=20,height=30;
   // private final int height,width;
    
    public ProcessBlock(SchedProcess process) {
        this.process=process;
//        this.height=height;
//        this.width=width;
    }
    
    public void show(Graphics g, int x ,int y){
        
        //double segmentSize=width/process.getBurstTime();
        for (int i=0;i<process.getBurstTime();i++){
            g.setColor(Color.red);
            g.drawRect(x, y, width, height);
            g.drawString("Hi", (width+x)/2, (height+y)/2);
            x+=width;
            
        }
       
    }
    
    
    
    
}

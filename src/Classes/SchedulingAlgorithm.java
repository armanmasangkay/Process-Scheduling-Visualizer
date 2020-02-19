/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author armanmasangkay
 */
public abstract class SchedulingAlgorithm {
    
    private List<Process> processes;

    public SchedulingAlgorithm() {
        this.processes = new ArrayList<>();
    }
   
    
    
    public void add(Process process){
        processes.add(process);
    }
    
    
    public abstract void run();
    
}

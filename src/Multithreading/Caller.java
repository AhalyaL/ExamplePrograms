/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading;

import java.util.concurrent.Callable;

/**
 *
 * @author ahalya.l
 */
public class Caller implements Callable{

    @Override
    public Object call() throws Exception {
return "ah";
    }

    
}

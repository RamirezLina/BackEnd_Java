/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author LINA RAMIREZ
 */
public class ArmaduraEx extends Exception {

    /**
     * Creates a new instance of <code>ArmaduraEx</code> without detail message.
     */
    public ArmaduraEx() {
    }

    /**
     * Constructs an instance of <code>ArmaduraEx</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ArmaduraEx(String msg) {
        super(msg);
    }
}

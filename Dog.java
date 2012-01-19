/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gittest;

/**
 *
 * @author M.P.T.R.Kumara 100277E
 */
public class Dog implements Pet{

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("barking !!!");
        }
    
}

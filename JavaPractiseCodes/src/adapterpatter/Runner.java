/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpatter;

/**
 *
 * @author Sharmal
 */
public class Runner {
    
    AndroidHeadset ah = (AndroidHeadset) new HeadsetAdapter();
    
    ListenMusic lm = new ListenMusic(ah);
    
}

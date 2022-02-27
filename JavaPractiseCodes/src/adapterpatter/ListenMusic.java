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
public class ListenMusic {
    private AndroidHeadset headset;

    public ListenMusic(AndroidHeadset headset) {
        this.headset = headset;
    }
    
    public void listenMusic(String srt){
    headset.giveSound(srt);
    }
    
    
}

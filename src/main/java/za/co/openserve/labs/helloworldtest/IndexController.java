/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.openserve.labs.helloworldtest;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Path;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Label;


/**
 *
 * @author DLCruzN
 */
public class IndexController extends GenericForwardComposer
{
    private Label dude;
    
    @Override
    public void doAfterCompose(Component comp) throws Exception
    {
        dude= (Label)Path.getComponent("/window1/label1");
        dude.setValue("HELLO WORLD I updated git dude. this is the 12th iteration");
    }
}

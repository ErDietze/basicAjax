/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicView;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Eric
 */
@ManagedBean
public class BasicView {
     
    private String text;
 
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}

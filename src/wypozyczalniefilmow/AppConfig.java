/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalniefilmow;

import JFrames.Okno;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Rozkurwozaur
 */
//dsfsdf
@Configuration
@ComponentScan("JFrames")
public class AppConfig 
{
    public Okno getOkno()
    {
        return new Okno();
    }
}

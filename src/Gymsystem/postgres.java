/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gymsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author sid
 */
public class postgres {
    Connection con =null;
        public static Connection conectDB()
        {
            try
            {
                Class.forName("org.postgresql.Driver");
                Connection con =DriverManager.getConnection("jdbc:postgresql://localhost:5432/project", "postgres","sid3791");
                if(con!=null)
                {
                    System.out.println("Gym database is connected");
                    
                }
                        
            }catch(Exception ee)
            {
                
                ee.printStackTrace();
            }
        return null;
       }
}

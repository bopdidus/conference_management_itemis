/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.conferencemanagement;

import com.mycompany.conferencemanagement.Model.Talk;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author armel
 */
public class ConferenceManagement {

    public static void main(String[] args) {
       System.out.println("***************WELCOME TO CONFERENCE MANAGEMENT SYSTEM**********************************");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("Please enter the talks and press q(quit) to stop (-: ");
        System.out.println("\n");
        CreateTalk();
    }
    
    public static void CreateTalk(){
        List<Talk> talks = new ArrayList<>();
        String title="";
        int time=0;
        Scanner sc = new Scanner(System.in);
        while(!title.equalsIgnoreCase("q"))
        {
            System.out.println("Enter the title:");
            System.out.print(">");
            title = sc.nextLine();
            
            if(title.equalsIgnoreCase("q") == true)
                break;
            
            System.out.println("Enter the time:");

            try {
                 time = sc.nextInt();
                 talks.add(new Talk(title, time));
                 sc.nextLine();
            } catch (Exception e) {
                System.err.println(e.getMessage());
                System.out.println("Erreur vous devriez recommencer");
            }
        }        
       
    }
}

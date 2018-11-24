/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class PacMan {
    int x, y, width, height;
    
    public void moveUp()
    {
        y = y - 1;
        if(y>0 && y<=height)
        {
            printPosition();
        }
        else
        {
            System.out.println("Error");
        }
    }
    
    public void moveDown()
    {
        y = y + 1;
        if(y>0 && y<=height)
        {
            printPosition();
        }
        else
        {
            System.out.println("Error");
        }
    }
    
    public void moveRight()
    {
        x = x + 1;
        if(x>0 && x<=width)
        {
            printPosition();
        }
        else
        {
            System.out.println("Error");
        }
    }
    
    public void moveLeft()
    {
        x = x - 1;
        if(x>0 && x<=width)
        {
            printPosition();
        }
        else
        {
            System.out.println("Error");
        }
    }
    
    public void printPosition()
    {
        System.out.println("");
        System.out.println("==========PacMan==========");
        for(int y1 = 1; y1 <= height; y1++)
        {
            for(int x1 = 1; x1 <= width; x1++)
            {
                if(x1==x && y1==y)
                {
                    System.out.print("C");
                }
                else
                {
                    System.out.print(".");
                }
            }
            System.out.println("");
        }
    }
}
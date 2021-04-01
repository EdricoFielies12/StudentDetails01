/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.studentdetails01;

/**
 *
 * @author Breyton Ernstzen - 217203027 (Group Lead)
 */
public class StudentDetails {
    
  public boolean CellNumberVerifier (String cellNumber)
    {

        boolean isCellNumberValid = true;
        if(cellNumber == null)
        {
           isCellNumberValid = false;
        }
        else 
        {
            if (isCellLengthValid(cellNumber)) 
            {
                for (int i = 0; i < cellNumber.length(); i++) 
                {
                    char character = cellNumber.charAt(i);
                    if(!(Character.isDigit(character))) isCellNumberValid = false;
                }
            }else { isCellNumberValid = false; }
        } 
        return isCellNumberValid;
    }
    
    private static boolean isCellLengthValid(String cell)
    {
        if(cell.length() == 10) return true;
        else return false;
    }
      
}

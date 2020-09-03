package com.Eshanvi.Assignments;
import java.util.*; 
class OccurenceOfCharInString { 
    static void characterCount(String inputString) //here we are taking a method of characterCount of type String
    { 
        
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();// Creating a HashMap containing char as a key and occurrences as  a value        
        char[] strArray = inputString.toCharArray(); //here we are are converting the given String to char array
        for (char c : strArray)//here we are each char of strArray 
        { 
            if (charCountMap.containsKey(c))//here it checks if the char is present in map or not if it true it moves to next line  
            { 
            	charCountMap.put(c, charCountMap.get(c) + 1); //here if char is present in charCountMap then incrementing its count by 1
            } 
            else 
            {
                charCountMap.put(c, 1); //if char is not present in charcountMap,putting this char to charCountMap with 1 as its value
            } 
        } 
        for (Map.Entry entry : charCountMap.entrySet())//here to get a set of  the entries i.e the contents  of the map are dispalyed by  using a set view  ,obtained by calling entryset() method entryset () methods it returns a set that contains elements of a map i.e we are printing charCountMap 
        { 
            System.out.println(entry.getKey() + " " + entry.getValue());// here it prints the key and value
        }
        System.out.println();
    }  
    public static void main(String[] args) 
    { 
        String str = "ABCABCABCA"; //here we are initializing an instance of variable of string type
        characterCount(str); //here CharacterCount takes the str string as paamater movess to the 4th line and place the str value in inputString
    } 
} 

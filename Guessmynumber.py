#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Jan 19 07:59:45 2017

@author: dani
"""


low = 0
high = 100
guess = (int(high) + int(low))/2
ans = "i"
print("Please think of a number between 0 and 100!")
while (ans!="c"):
    print("Is your secret numbers ", int(guess), "?")
    ans=str(input("Enter 'h' to indicate the guess is too high. Enter 'l' to indicate the guess is too low. Enter 'c' to indicate I guessed correctly."))
    if ans == "h":
        high=guess
       
    elif ans =="l":
         low=guess
    elif ans == "c":
        break;     
    else:
        print("Sorry, I did not understand your input.")
        
    guess=(int(high)+int(low))/2
 
print("Game over. Your secret number was: ", guess)

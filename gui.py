#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Mar 29 08:13:21 2017

@author: dani
"""
from tkinter import *
from tkinter import messagebox
top = Tk()
scrollbar = Scrollbar(top)
scrollbar.pack(side = RIGHT,fill = Y)
text = Text(top)
text.insert(INSERT, "HELLLLOOO:::")
text.insert(END, "::::_______")
text.pack()
top.geometry("400x200")
def vowels():
    x=StringVar()
    E = Entry(top, bd = 5, textvariable=x)
    E.pack(side = RIGHT)
    count=0
    for a in x:
        if a == "a" or a == "e" or a=="o" or a =="i" or a=="u":          
            count = count +1
    print (count)
   
    
    
    
def helloCallBack():
    msg = messagebox.showinfo("Holla", "Prueba")
    text.insert(INSERT, "Texto de prueba")#Este texto sale en la ventana principal despues de darle a ok
B = Button (top, text="Hola", command=helloCallBack, activebackground= "blue", cursor ="pirate" )
C = Button (top, text="Prueba", command=vowels, activebackground="red", cursor="cross")
B.place(x=50,y=50)
C.place(x=50, y=100)
top.mainloop()

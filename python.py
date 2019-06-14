#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Jan 18 07:31:48 2017

@author: dani
"""
from tqdm import tqdm
from time import sleep
from random import randint
import threading
from itertools import count
import sys
import time
exitFlag=0
class myThread (threading.Thread):
    def __init__(self, threadID, name, counter):
        threading.Thread.__init__(self)
        self.threadID = threadID
        self.name = name
        self.counter = counter
    def run(self):
        print ("Starting" + self.name)
        print_time(self.name, self.counter, 5)
        print ("Exiting" + self.name)
def print_time(threadName, delay, counter):
    while counter:
        if exitFlag:
            threadName.exit()
        time.sleep(delay)
        print("%s: %s" %(threadName, time.ctime(time.time())))
        counter-=1
def exit():
    sys.exit(0)
def dor():
    for i in tqdm(range(20)):
        sleep(randint(1, 5))
def substring():
    print("\033[3;35m Hello")
    x=input("\033[3;35mGive me  a string:\033[1;m\n");    
    cad=x[0:0]
    for start in range(len(x)):
        for end in count(start + len(cad) + 1):
            subcad = x[start:end]
            if len(subcad) != (end - start):
                break
            if sorted(subcad) == list(subcad):
                cad = subcad
    print (cad)
def var(x,y):
    if ((type (x)) == str or(type (y)) == str):    
       return ("\033[5;93mstring involved")
    elif x == y:
        print ("equal")
    elif (x > y):
        return("bigger")
    elif (x < y):
        return ("smaller")
def vowels(x):
    count=0
    for a in x:
        if a == "a" or a == "e" or a=="o" or a =="i" or a=="u":          
            count = count +1
    print (count)
def multi():
    thread1 = myThread(1, "Thread-1", 1)
    thread2 = myThread(2, "Thread-2", 2)
    thread1.start()
    thread2.start()
    dor()
    thread1.join()
    thread2.join()
    print("Exiting Main Thread")
def read():
    filename=input('\033[5;94mEnter the filename:\033[1;m\n')
    with open(filename) as f:
        text=f.read()
    print ("\033[1;37"+text) 

def fib (num):
  if (num<2):
     return num

  else:
     return fib (num-1) + fib(num-2)
a=1
while a!=0:    
    print ("""\033[6;31m \033[6;104m     Menu                                                                                           
    Type 1:For comparato type \"var(num1,num2)\";
    Type 2:For serche ther largest string inside other string odered by alfhabethical \n type \"substring()\"
    Type 3:For count number of vowels on a string type \"vowels(string)\"
    Type 4:For read a file type \"read()\". \n You can enter the route of the file and it will read it
    Type 5: For progress bar.
    Type 6: Multithreading.
    Type 7: Recursive
    Type 99: Exit.\033[1;m\n                                                          
    """)
    print (time.strftime("%I:%M:%S"))
    a=int(input())
    if a==1:
        x=int(input("\033[5;93mGive me the first number\033[1;m\n"))
        y=int(input("\033[5;93mGive me the second number\033[1;m\n"))
        print(var(x,y))
    elif a==2:
        substring()
    elif a==3:
        
        x=str(input("\033[6;32mWrite a string of text\033[1;m\n"))
        vowels(x)
    elif a==4:
        read()
        
        
    elif a == 5:
        dor()
    elif a==6:
        multi()
    elif a == 7:
        num=int(input("Enter the a number\n"))
        print (fib(num))
    elif a==99:
        exit()
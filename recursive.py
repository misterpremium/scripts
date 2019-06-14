#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Mar  9 08:53:06 2017

@author: dani
"""
def fib (num):
    if (num<2):
       return num
    else:
        return fib (num-1) + fib(num-2)
print (fib(4))
        

#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Fri Jan 13 07:52:19 2017

@author: dani
"""

filename=input('Enter the filename:')
with open(filename) as f:
    text=f.read()
print (text)    
    

#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Jan 19 09:05:24 2017

@author: dani
"""


def polysum(n,s):
    """ 
    Input: n = number of sides
           s = length of sides
    This calculate first the area of the polygon and the the perimeter, then sum teh area plus square of the perimiter
    To use this function it need the math import.
    
    """
    import math
    area=(0.25*n*math.pow(s,2))/(math.tan(math.pi/n))
    peri=n*s
    result = math.pow(peri,2) + area
   
    return  round (result,4)

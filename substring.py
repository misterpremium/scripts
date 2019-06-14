#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon Jan 16 07:13:08 2017

@author: dani
"""
import sys
print('Introduce a string\t' + sys.argv[1])
from itertools import count
cad = sys.argv[1][0:0]
for start in range(len(sys.argv[1])):
    for end in count(start + len(cad) + 1):
        subcad = sys.argv[1][start:end]
        if len(subcad) != (end - start):
            break
        if sorted(subcad) == list(subcad):
            cad = subcad
print (cad)
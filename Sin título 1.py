#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon Jan 16 09:07:14 2017

@author: dani
"""
for i in range(10):
  try: 
    if 10 / i == 2.0:
      break
  except ZeroDivisionError:
    print(1)
  else:
    print(2)

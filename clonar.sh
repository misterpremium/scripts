#!/bin/bash




dd if=/dev/sdb1 of=/dev/sda2 bs=1M


grub-install /dev/sda2




# BusinessWorks Custom Mask Function

## Overview

Provides TIBCO BusinessWorks with the ability to Mask Strings directly within the BusinessWorks mapper. Particularly useful if you want to hide details in your String such as Credit Card Numbers etc.

## Prerequisites/Minimum Platform version

Works for TIBCO BusinessWorks 6.x. Built using BW 6.4.1 but should work with all previous and upcoming BW 6.x versions.

## Installation Steps

Full source is incuded. Use eGit within BusinessWorks to clone this repository into your Workspace.

Once cloned, right click on the project (maskCustomFunction), choose Export, choose Deployable Plugins and Fragments

Make sure you select Install into Host Repository. You will have to accept the unsigned installation and restart BusinessWorks

### Description 

The function will appear in the Functions tab of the Mapper. There is one function:

mask

The function takes a String as input, an optional Masking character ("*" is default), and an option number of Characters to hide (-1 will mask everything if included) with an optional debug parameter which can be set to true or false.

Using the Mask Functions in the TIBCO BusinessWorks Mapper:
![logo]

[logo]: https://github.com/davewins/bw_customMaskFunction/blob/master/MaskingFunction.png "BW Mapper"
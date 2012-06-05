# kmw-rats

## About

This is a modified version of [Rats!](http://cs.nyu.edu/rgrimm/xtc/rats-intro.html) - 
a Java Packrat Parser generator - published by [Robert Grim](http://cs.nyu.edu/rgrimm/) as part of his 
[xtc](http://cs.nyu.edu/rgrimm/xtc/) (eXTensible Compiler) project.

Our code is based on version 2.3.1 (2012-04-04) of Rats!, which we have obtained from 
[here](http://cs.nyu.edu/rgrimm/xtc/#distribution). All changes made to this original code base will be listed in 
[ChangeLog.txt](https://github.com/km-works/kmw-rats/blob/master/ChangeLog.txt). 
Both the original software and our modifications are licensed under a GPL2 License. For details see 
[LICENSE.txt](https://github.com/km-works/kmw-rats/blob/master/LICENSE.txt).

## Purpose

The purpose of this project is to enhance the runtime architecture of the Rats-generated Java packrat parser. 
The problem with the original version is, that all generated parser code is thrown into a single Java class file. 
For large grammars this can lead to an unmanagable size of the generated parser source.  
[Oracle Labs](https://labs.oracle.com/projects/) [Project Fortress](http://projectfortress.java.net/) for instance, 
one of the more prominent users of Rats!, generates a single 2MB parser source file out of some 30 grammar modules. 

On the other hand Rats! already supports modular grammar definitions, in fact one of its distinguishing features. 
So why, we have asked ourselfs, not leverage this capability for a better runtime architecure, 
and divide the generated code into managable parser modules? It's not that complicated after all.

The deeper intention behind these obvious niceties is, however, our desire for parsing island grammars with a set of 
compatible, runtime composable parsers. Thus not only managable parser modules, will be the issue, but even more, a 
parser state that can be passed around in a parser stack ...
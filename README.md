# kmw-rats

## About

This is a modified version of [Rats!](http://cs.nyu.edu/rgrimm/xtc/rats-intro.html) - a Java Packrat Parser generator 
- published by [Robert Grim](http://cs.nyu.edu/rgrimm/) as part of his [xtc](http://cs.nyu.edu/rgrimm/xtc/) 
(eXTensible Compiler) project.

Our code is based on version 2.3.1 (2012-04-04) of Rats!, which can be found 
[here](http://cs.nyu.edu/rgrimm/xtc/#distribution). All changes made to the original code base will be listed in 
[ChangeLog.txt](https://github.com/km-works/kmw-rats/blob/master/ChangeLog.txt)

Both the original software and our modifications are licensed under a GPL2 License. For details see 
[LICENSE.txt](https://github.com/km-works/kmw-rats/blob/master/LICENSE.txt).

## Purpose

The purpose of this project is to enhance the runtime architecture of the generated packrat parser. 
The problem with the original version is, that the generated parser code is thrown into a single Java class, and 
for large grammars this can lead to an unmanagable size of the generated parser source.

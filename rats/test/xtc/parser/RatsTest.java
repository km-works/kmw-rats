/*
 *   Copyright (C) 2012 Christian P. Lerch, Vienna, Austria.
 *
 *   This file is part of kmw-rats - a modified version of the Rats parser generator
 *
 *   kmw-rats is free software: you can use, modify and redistribute it under
 *   the terms of the GNU General Public License version 3 as published by
 *   the Free Software Foundation, Inc. <http://fsf.org/>
 *
 *   kmw-rats is distributed in the hope that it will be useful, but WITHOUT
 *   ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 *   FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *   version 3 for details.
 *
 *   You should have received a copy of the GNU General Public License along
 *   with this distribution. If not, see <http://km-works.eu/res/GPL.txt> or
 *   <http://www.gnu.org/licenses/gpl-3.0.html>.
 */
package xtc.parser;

import java.io.File;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author cpl
 */
public class RatsTest {
  
  public RatsTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  // The following test case just documents how to call to Rats tool
  // You must fill-in real file paths, before using it
  @Test @Ignore
  public void testMain() {
    String rootPath = "/abs/path/to/rats-root-dir";
    String srcPath = rootPath + "/rats/main-mod";
    File modDir = new File(rootPath);   // top-level dir for all rats modules
    File srcDir = new File(srcPath);    // dir for main rats module - somehwere below rootPath
    String[] args = new String[] { 
      "-no-exit",     // extremly necessary !
      "-verbose",     // optional
      "-in",          // main module dir
      srcDir.getAbsolutePath(),
      "-in",          // top-level dir
      modDir.getAbsolutePath(),
      "-out",         // where to write the generated parser; must be consistent with package name
      srcDir.getAbsolutePath(),
      srcPath + "main.rats"   // file name of main Rats module
    };
    Rats.main(args);
  }
}

/*
 * Copyright (C) 2010-2018 Gordon Fraser, Andrea Arcuri and EvoSuite
 * contributors
 *
 * This file is part of EvoSuite.
 *
 * EvoSuite is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3.0 of the License, or
 * (at your option) any later version.
 *
 * EvoSuite is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with EvoSuite. If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 14 19:36:29 GMT 2015
 */

package org.evosuite.runtime.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static shaded.org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.util.ComputeClassWriter;
import org.junit.runner.RunWith;
import shaded.org.evosuite.runtime.EvoRunner;
import shaded.org.evosuite.runtime.EvoRunnerParameters;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ComputeClassWriter_ESTest extends ComputeClassWriter_ESTest_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      ComputeClassWriter computeClassWriter0 = new ComputeClassWriter((-2878));
      String string0 = computeClassWriter0.getCommonSuperClass("java/lang/Class", "java/lang/Throwable");
      assertEquals("java/lang/Object", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      ComputeClassWriter computeClassWriter0 = new ComputeClassWriter(2147483632);
      String string0 = computeClassWriter0.getCommonSuperClass("java/lang/String", "java/lang/Object");
      assertEquals("java/lang/Object", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      ComputeClassWriter computeClassWriter0 = new ComputeClassWriter((-2878));
      // Undeclared exception!
      try { 
        computeClassWriter0.getCommonSuperClass("java/lang/Throwable", "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Class not found: : shaded.org.evosuite.runtime.mock.java.lang.MockThrowable: Class not found 
         //
         assertThrownBy("org.evosuite.runtime.util.ComputeClassWriter", e);
      }
  }

  @Test
  public void test3()  throws Throwable  {
      ComputeClassWriter computeClassWriter0 = new ComputeClassWriter((-2878));
      String string0 = computeClassWriter0.getCommonSuperClass("java/lang/Throwable", "java/lang/Throwable");
      assertEquals("java/lang/Throwable", string0);
  }

  @Test
  public void test4()  throws Throwable  {
      ComputeClassWriter computeClassWriter0 = new ComputeClassWriter((-32768));
      // Undeclared exception!
      try { 
        computeClassWriter0.getCommonSuperClass("", "37SFrh2");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Class not found: : shaded.org.evosuite.runtime.mock.java.lang.MockThrowable: Class not found 
         //
         assertThrownBy("org.evosuite.runtime.util.ComputeClassWriter", e);
      }
  }
}

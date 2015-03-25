package edu.washington.ext.libraryproject.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The Class LibraryTestSuite.
 * 
 * @author Chris Kindelberger
 * @version final 20150325
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
   BookTest.class,
   MusicTest.class,
   PatronTest.class,
   VideoTest.class,
   LibraryTest.class
})


public class LibraryTestSuite {
}

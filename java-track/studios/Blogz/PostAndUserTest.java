package Blogz;

import org.junit.Test;

// CONSTRUCTOR Method

public class PostAndUserTest
{

	// instance properties go here

    private static boolean initialized = false;

    public PostAndUserTest() {

        // constructor code; runs once per @Test method

        if (!initialized) {
            // code that should only run once goes here
            initialized = true;
        }

    }

    @Test
    public void testSomeCode() {
        //...test code goes here
    }
}

// ...OR...
// @BEFORE Method
//
////imports go here
//
//public class PostAndUserTest {
//
// // instance properties go here
//
// private static boolean initialized = false;
//
// @Before
// public void init() {
//
//     // initializer code; runs once per @Test method
//
//     if (!initialized) {
//         // code that should only run once goes here
//         initialized = true;
//     }
// }
//
// @Test
// public void testSomeCode() {
//     //...test code goes here
// }
//}



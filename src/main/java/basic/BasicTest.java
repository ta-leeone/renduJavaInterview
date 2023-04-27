package basic;

import io.vavr.control.Option;

/**
 * For this basic test, you should not use any library. e.g. you should not use Math.pow for power method
 */
public class BasicTest {

  /**
   * return i ^ n for positive Integer, None otherwise
   * alse return None in case of errors
   */
  public static Option<Integer> power(Integer i, Integer n) {
	   if (n > 0) {
		   return Option.of(
		              java.util.stream.IntStream.range(0, n)
		                      .reduce(1, (a, b) -> a * i)
		      );
       }else {
    	   return Option.none();
       }
	 
  }
}

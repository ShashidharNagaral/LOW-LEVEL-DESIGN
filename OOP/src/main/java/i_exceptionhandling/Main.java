package i_exceptionhandling;

public class Main {

    /*
    NOTE:   When you perform the operation a / b where a is a double and b is 0, in floating-point arithmetic,
            the result is considered mathematically undefined and is represented as "infinity"
            (Double.POSITIVE_INFINITY for positive values, and Double.NEGATIVE_INFINITY for negative values).
            This is because floating-point arithmetic follows IEEE 754 standard, which defines special values l
            ike positive and negative infinity to handle such cases.

            On the other hand, in integer arithmetic, dividing by zero is not mathematically possible and is
            considered an error.
    */

    /*
        Object->   Throwable ->  Exception
                                ->  RuntimeException
                                        ->  ArithmeticException
                                        ->  ArrayIndexOutOfBoundsException
                                        ...
                                ->  IOException
                                ->  SQLException
                                ...
                            ->  Error
                                    ->  StackOverflowError
                                    ->  OutOfMemoryError
                                    ...
    */

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        // System.out.println(divide(a, b)); // throws Arithmetic Exception
        // to handle this we have to put the code inside try-catch block

        try {
//            System.out.println(divide(a, b));
            System.out.println(divide2(a, b));
//            if(a == 10) {
//                throw new CustomException("this is custom exception created");
//            }
        } catch (CustomException e) {
            System.out.println("custom made exception");
        }
        catch (ArithmeticException e) {
            System.out.println("arithmetic exception"); // this will specifically handle arithmetic exceptions
        } catch(Exception e) {
            System.out.println(e.getMessage()); // this will handle exceptions in general other than above exceptions
        } finally {
            System.out.println("Finally will be always executed");
        }
    }

    static int divide(int a, int b) {
        return a/b; // if b == 0, it throws arithmetic exception
    }

    static int divide2(int a, int b) throws CustomException{
        if(b == 0) {
            throw new CustomException("divide by zero exception");
        }
        return a/b;
    }

}

package throwable;

import java.io.FileNotFoundException;

/**
 * @anthor joey
 * @date 2019/3/14 18:46
 */
public class ErrorAndException {
    private void throwError(){
        throw new StackOverflowError();
    }
    private void throwRuntimeException(){
        throw new RuntimeException();
    }
    private void throwCheckedException(){
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ErrorAndException eae=new ErrorAndException();
        eae.throwError();
        eae.throwRuntimeException();
        eae.throwCheckedException();

    }

}


    public class Fibonacci {

        public boolean pertence(int numero) {
            int num1 = 0;
            int num2 = 1;
            int ponteiro = 1;

            while (ponteiro < numero) {
                ponteiro = num1 + num2;
                num1 = num2;
                num2 = ponteiro;
            }

            if (ponteiro == numero)
                return true;
            else
                return false;
        }
    }

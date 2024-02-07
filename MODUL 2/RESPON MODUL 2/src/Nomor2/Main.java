package Nomor2;

//class Main merupakan class utama yang di dalamnya ada program yang akan dieksekusi
class Main {

        static int priority(char operator) {
            if (operator == '+' || operator == '-') {
                return 1;
            }
            if (operator == '*' || operator == '/') {
                return 2;
            }
            if (operator == '^') {
                return 3;
            }
            return -1;
        }
        //Method toPrefix digunakan untuk mengkonfersi notasi selain prefix menjadi prefix
        static void toPrefix(String operasi) {
            String tmp;
            Stack temp = new Stack();
            for (char now : operasi.toCharArray()) {
                if (now == '+' || now == '-' || now == '/' || now == '*') {
                    String element1 = temp.pop();
                    String element2 = temp.pop();
                    tmp = "";
                    tmp += now;
                    tmp += element2;
                    tmp += element1;
                    temp.Push(tmp);
                }
                else {
                    tmp = "";
                    tmp += now;
                    temp.Push(tmp);
                }
            }
            System.out.println("Notasi Prefix : " + temp.top.data);
            System.out.println("====================================");
        }
        //script di bawah adalah program yang akan dieksekusi
        public static void main(String[] args) {
            Stack operator = new Stack();

            String operasi = "(A+B)*C-(D-E)*(F+G)";
            StringBuilder hasil = new StringBuilder();
            String tmp;

            for (int i = 0; i < operasi.length(); i++) {
                char ok = operasi.charAt(i);
                if (ok == ('+') || ok == ('-') || ok == ('*') || ok == ('/')) {
                    while (operator.top != null && priority(operator.getTop().charAt(0)) >= priority(ok)) {
                        hasil.append(operator.pop());
                    }
                    tmp = "";
                    tmp += ok;
                    operator.Push(tmp);
                }
                else if (ok == '(') {
                    tmp = "";
                    tmp += ok;
                    operator.Push(tmp);
                }
                else if (ok == ')') {
                    while (operator.getTop().charAt(0) != '(') {
                        hasil.append(operator.pop());
                    }
                    operator.pop();
                }
                else {
                    hasil.append(ok);
                }
            }
            while (operator.top != null) {
                hasil.append(operator.pop());
            }
            System.out.println ("Notasi infix : (A+B)*C-(D-E)*(F+G)");
            System.out.println("Notasi Postfix : " + hasil);
            toPrefix(hasil.toString());
        }

}
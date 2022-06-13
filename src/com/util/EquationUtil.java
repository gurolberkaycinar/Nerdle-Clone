package com.util;



public class EquationUtil {

    // Generating an equation
    public String generateEquation() {
        char[] set = {'0', '1', '2' , '3', '4', '5' ,'6' ,'7', '8', '9', '+', '-', '*', '/'};
        int equalPos;
        int i;
        int counter = 0;
        char[] arr;
        String str;
        String rightSide;
        do {
            arr = new char[9];
            equalPos = 2 + (int) (Math.random() * 5);
            arr[0] = set[(int)(Math.random() * 10)];
            for(i = 1; i < equalPos; i++) {
                if(arr[i-1] < '0' || arr[i-1] > '9') {
                    arr[i] = set[(int)(Math.random() * 10)];
                } else {
                    arr[i] = set[(int)(Math.random() * 14)];
                }
                if(arr[i] == '0' && arr[i - 1] == '/') {
                    arr[i] = '1';
                }
            }
            arr[i] = set[1 + (int)(Math.random() * 9)];
            rightSide = Integer.toString(calculateEquation(new String(arr).substring(0, equalPos + 1)));
            str = new String(arr).substring(0, equalPos + 1);
            str += '=' + rightSide;

        } while(!isValid(str));
        System.out.println("==============");
        System.out.println(str);
        System.out.println("==============");
        return str;
    }

    // Validating an equation
    public boolean isValid(String str) {
        boolean hasOperand = false;

        // Size
        if(str.length() < 7 || str.length() > 9) {
            //System.out.println("Length invalid");
            return false;
        }

        int equalIndex = str.indexOf('=');

        // Has 1' ='
        if(equalIndex == -1 ||equalIndex != str.lastIndexOf('=') || equalIndex == str.length() - 1 || equalIndex == 0) {
            //System.out.println("Invalid =");
            return false;
        }

        char[] arr = str.toCharArray();

        if(!(arr[0] >= '1' && arr[0] <= '9') || !(arr[equalIndex - 1] >= '0' && arr[equalIndex - 1] <= '9')) {
            //System.out.println("Illegal start or finish before = 1");
            return false;
        }

        if(!((arr[equalIndex + 1] >= '1' && arr[equalIndex + 1] <= '9') || arr[equalIndex + 1] == '-') || !(arr[str.length() - 1] >= '0' && arr[str.length() - 1] <= '9')) {
            //System.out.println("Illegal start or finish after = 2");
            return false;
        }

        for(int i = 0; i < str.length(); i++) {
            if((arr[i] < '0' || arr[i] > '9') && (arr[i + 1] < '0' || arr[i + 1] > '9') && i < equalIndex) {
                //System.out.println("2 operands in a row");
                return false;
            }
            if(arr[i] == '0' && arr[i - 1] == '/') {
                //System.out.println("Divie by 0");
                return false;
            }

            if((i < str.length() - 1 && arr[i] == '0') && (arr[i + 1] >= '0' && arr[i + 1] <= '9') && (i > 0 && (arr[i - 1] < '0'  || arr[i - 1] > '9'))) {
                //System.out.println("Leading 0");
                return false;
            }

            if((arr[i] < '0' || arr[i] > '9') && arr[i] != '=') {
                hasOperand = true;
            }
        }

        if(calculateEquation(str.substring(0, equalIndex)) != calculateEquation(str.substring(equalIndex + 1, str.length()))) {
            //System.out.println("left and right side of = are unequal");
            return false;
        }

        return hasOperand;
    }

    // Calculating an equation
    public int calculateEquation(String str) {
        char[] arr = str.toCharArray();
        char last = '0';
        char[] tmp;
        int j = 0;
        int i;
        int sum = 0;
        for(i = 0; i < arr.length ; i++) {
            if(i + 1 < arr.length && (arr[i+1] >= '0' && arr[i+1] <= '9')){
                    if(arr[i] < '0' || arr[i] > '9') {
                        tmp = new String(arr).substring(j, i).toCharArray();
                        j = i + 1;
                        if(last != '0') {
                            if(last == '+') {
                                sum += Integer.parseInt(new String(tmp));
                            } else if(last == '-') {
                                sum -= Integer.parseInt(new String(tmp));
                            } else if(last == '*') {
                                sum *= Integer.parseInt(new String(tmp));
                            } else {
                                if(sum % Integer.parseInt(new String(tmp)) != 0) {
                                    sum = 9999999;
                                } else {
                                    sum /= Integer.parseInt(new String(tmp));
                                }
                            }
                        }else if(!(new String(tmp).equals(""))){
                            sum = Integer.parseInt(new String(tmp));
                        }
                        last = arr[i];
                    }
            }
        }
        if(last == '0') {
            return Integer.parseInt(str);
        }
        tmp = new String(arr).substring(j, i).toCharArray();
        if(last == '+') {
            sum += Integer.parseInt(new String(tmp));
        } else if(last == '-') {
            sum -= Integer.parseInt(new String(tmp));
        } else if(last == '*') {
            sum *= Integer.parseInt(new String(tmp));
        } else {
            if(sum % Integer.parseInt(new String(tmp)) != 0) {
                sum = 9999999;
            } else {
                sum /= Integer.parseInt(new String(tmp));
            }
        }
        return sum;
    }
}

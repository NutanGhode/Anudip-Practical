  class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        int rev = 0, n = num;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }

        if (num == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

    
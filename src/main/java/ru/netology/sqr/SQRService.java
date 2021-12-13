package ru.netology.sqr;

public class SQRService {

    public int calculateSquqres(int start, int finish) {
        int count = 0;

        for (int i = 10; i <= 99; i = i + 1) {
            if (i * i >= start && i * i <= finish) {
                count = count + 1;
            }
        }
        return count;
    }
}

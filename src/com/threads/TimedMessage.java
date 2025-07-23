package com.threads;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimedMessage extends Thread {

    private final String message;
    private final LocalTime targetTime;

    public TimedMessage(String name, String message, String timeString) {
        super(name);
        this.message = message;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        this.targetTime = LocalTime.parse(timeString, formatter);
    }

    @Override
    public void run() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("[" + getName() + "] Scheduled for: " + targetTime);

        while (true) {
            LocalTime now = LocalTime.now();

            if (!now.isBefore(targetTime)) {
                System.out.println("[" + now.format(formatter) + "] " + getName() + ": " + message);
                break;
            }

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");

        System.out.print("Enter number of messages: ");
        int count = Integer.parseInt(scanner.nextLine());

        List<TimedMessage> threadList = new ArrayList<>();

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter message " + i + ": ");
            String msg = scanner.nextLine();

            String timeStr;
            while (true) {
                System.out.print("Enter time for message " + i + " (HH:mm): ");
                timeStr = scanner.nextLine();
                try {
                    LocalTime.parse(timeStr, timeFormat);
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid time format. Try again.");
                }
            }

            TimedMessage t = new TimedMessage("MessageThread-" + i, msg, timeStr);
            threadList.add(t);
        }

        scanner.close(); 

        
        for (TimedMessage t : threadList) {
            t.start();
        }
    }
}

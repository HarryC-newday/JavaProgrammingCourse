package org.main.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class FlightControl {
    private HashMap<String, Airplane> airplanes;
    private ArrayList<Flight> flights;
    private Scanner scanner;

    public FlightControl(Scanner scanner) {
        this.airplanes = new HashMap<>();
        this.flights = new ArrayList<>();
        this.scanner = scanner;
    }

    public void start() {
        airportAssetControl();

        flightControl();
    }

    private void airportAssetControl() {
        System.out.println("Airport Asset Control");
        System.out.println();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.print("> ");

            String command = scanner.nextLine();

            if (command.equals("1")) {
                addAirplane();
            } else if (command.equals("2")) {
                addFlight();
            } else if (command.equals("x")) {
                break;
            } else {
                System.out.println("Invalid command. Please try again.");
            }
        }
    }

    private void flightControl() {
        System.out.println();
        System.out.println("Flight Control");
        System.out.println();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.print("> ");

            String command = scanner.nextLine();

            if (command.equals("1")) {
                printAirplanes();
            } else if (command.equals("2")) {
                printFlights();
            } else if (command.equals("3")) {
                printAirplaneDetails();
            } else if (command.equals("x")) {
                break;
            } else {
                System.out.println("Invalid command. Please try again.");
            }
        }
    }

    private void addAirplane() {
        System.out.print("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.print("Give the airplane capacity: ");
        int capacity = Integer.parseInt(scanner.nextLine());

        Airplane airplane = new Airplane(id, capacity);
        airplanes.put(id, airplane);
    }

    private void addFlight() {
        System.out.print("Give the airplane id: ");
        String airplaneId = scanner.nextLine();

        Airplane airplane = airplanes.get(airplaneId);
        if (airplane == null) {
            System.out.println("Airplane not found!");
            return;
        }

        System.out.print("Give the departure airport id: ");
        String departure = scanner.nextLine();
        System.out.print("Give the target airport id: ");
        String destination = scanner.nextLine();

        Flight flight = new Flight(airplane, departure, destination);
        flights.add(flight);
    }

    private void printAirplanes() {
        ArrayList<String> airplaneIds = new ArrayList<>(airplanes.keySet());
        Collections.sort(airplaneIds);

        for (String id : airplaneIds) {
            System.out.println(airplanes.get(id));
        }
    }

    private void printFlights() {
        for (Flight flight : flights) {
            System.out.println(flight);
        }
        System.out.println();
    }

    private void printAirplaneDetails() {
        System.out.print("Give the airplane id: ");
        String id = scanner.nextLine();

        Airplane airplane = airplanes.get(id);
        if (airplane != null) {
            System.out.println(airplane);
        } else {
            System.out.println("Airplane not found!");
        }
        System.out.println();
    }
}

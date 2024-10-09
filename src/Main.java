public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age = 77;
        if (age >= 18) {
            System.out.println("Если возраст человека " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека " + age + ", то он несовершеннолетний, нужно немного подождать.");
        }
        age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека " + age + ", то он несовершеннолетний, нужно немного подождать.");
        }
        //Задача 2
        int outdoorTemperature = 15;
        if (outdoorTemperature > 5) {
            System.out.println("На улице " + outdoorTemperature + " градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице " + outdoorTemperature + " градусов, нужно надеть шапку.");
        }
        outdoorTemperature = 4;
        if (outdoorTemperature > 5) {
            System.out.println("На улице " + outdoorTemperature + " градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице " + outdoorTemperature + " градусов, нужно надеть шапку.");
        }
        //Задача 3
        int carSpeed = 78;
        if (carSpeed > 60) {
            System.out.println("Если скорость " + carSpeed + ", то придётся заплатить штраф.");
        } else {
            System.out.println("Если скорость " + carSpeed + ", то можно ездить спокойно.");
        }
        carSpeed = 55;
        if (carSpeed > 60) {
            System.out.println("Если скорость " + carSpeed + ", то придётся заплатить штраф.");
        } else {
            System.out.println("Если скорость " + carSpeed + ", то можно ездить спокойно.");
        }
        //Задача 4
        age = 5;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else {
            if (age >= 7 && age <= 17) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
            } else {
                if (age >= 18 && age <= 24) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
                } else {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
                }
            }
        }
        age = 17;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else {
            if (age >= 7 && age <= 17) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
            } else {
                if (age >= 18 && age <= 24) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
                } else {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
                }
            }
        }
        age = 23;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else {
            if (age >= 7 && age <= 17) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
            } else {
                if (age >= 18 && age <= 24) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
                } else {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
                }
            }
        }
        age = 45;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else {
            if (age >= 7 && age <= 17) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
            } else {
                if (age >= 18 && age <= 24) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
                } else {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
                }
            }
        }
        //Задача 5
        age = 3;
        if (age < 5) {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else {
            if (age < 14) {
                System.out.println("Если возраст ребёнка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
            } else {
                System.out.println("Если возраст ребёнка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
            }
        }
        age = 10;
        if (age < 5) {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else {
            if (age < 14) {
                System.out.println("Если возраст ребёнка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
            } else {
                System.out.println("Если возраст ребёнка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
            }
        }
        age = 16;
        if (age < 5) {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else {
            if (age < 14) {
                System.out.println("Если возраст ребёнка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
            } else {
                System.out.println("Если возраст ребёнка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
            }
        }
        //Задача 6
        int trainCapacity = 102;
        int seats = 60;
        int standingPlaces = trainCapacity - seats;
        int freeSeats, freeStandingPlaces;
        int passengersNumber = 102;
        if (passengersNumber >= trainCapacity) {
            System.out.println("Поезд полностью забит!");
        } else {
            if (passengersNumber >= seats) {
                freeStandingPlaces = trainCapacity - passengersNumber;
                System.out.println("В вагоне не осталось сидячих, но есть " + freeStandingPlaces + " стоячих места.");
            } else {
                freeSeats = trainCapacity - passengersNumber;
                freeStandingPlaces = standingPlaces;
                System.out.println("В вагоне осталось " + freeSeats + " сидячих и " + freeStandingPlaces + " стоячих места.");
            }
        }
        passengersNumber = 11;
        if (passengersNumber >= trainCapacity) {
            System.out.println("Поезд полностью забит!");
        } else {
            if (passengersNumber >= seats) {
                freeStandingPlaces = trainCapacity - passengersNumber;
                System.out.println("В вагоне не осталось сидячих, но есть " + freeStandingPlaces + " стоячих места.");
            } else {
                freeSeats = trainCapacity - passengersNumber;
                freeStandingPlaces = standingPlaces;
                System.out.println("В вагоне осталось " + freeSeats + " сидячих и " + freeStandingPlaces + " стоячих места.");
            }
        }
        passengersNumber = 70;
        if (passengersNumber >= trainCapacity) {
            System.out.println("Поезд полностью забит!");
        } else {
            if (passengersNumber >= seats) {
                freeStandingPlaces = trainCapacity - passengersNumber;
                System.out.println("В вагоне не осталось сидячих, но есть " + freeStandingPlaces + " стоячих места.");
            } else {
                freeSeats = trainCapacity - passengersNumber;
                freeStandingPlaces = standingPlaces;
                System.out.println("В вагоне осталось " + freeSeats + " сидячих и " + freeStandingPlaces + " стоячих места.");
            }
        }
        //Задача 7
        int one, two, three;
        one = 30;
        two = 30;
        three = 305;
        if (one > two && one > three) {
            System.out.println("one бо́льшее и имеет значение " + one);
        } else {
            if (two > one && two > three) {
                System.out.println("two бо́льшее и имеет значение " + two);
            } else {
                if (three > one && three > two) {
                    System.out.println("three бо́льшее и имеет значение " + three);
                } else {
                    if (one == two && one > three) {
                        System.out.println("one и two бо́льшие и имеют значение " + one);
                    } else {
                        if (two == three && two > one) {
                            System.out.println("two и three бо́льшие и имеют знчение " + three);
                        } else {
                            if (one == three && one > two) {
                                System.out.println("one и three бо́льшие и имеют значение " + one);
                            } else {
                                System.out.println("Числа одинаковы");
                            }
                        }
                    }
                }
            }
        }
    }
}
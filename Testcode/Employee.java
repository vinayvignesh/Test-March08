package Testcode;

class Employee {
    String fullName;
    int pointLevel;
    String assignedCategory;

    public Employee(String fullName, int pointLevel, String assignedCategory) {
        this.fullName = fullName;
        this.pointLevel = pointLevel;
        this.assignedCategory = assignedCategory;
    }
}

class Ticket {
    int id;
    String name;
    String category;
    int point;
    String assignedEmployee = "";
    boolean isCompleted = false;

    public Ticket(int id, String name, String category, int point) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.point = point;
    }
}

class HelpDesk {
    Employee emp1, emp2;
    Ticket[] tickets = new Ticket[5];

    public void addEmployee(Employee e, int pos) {
        if (pos == 1) emp1 = e;
        else if (pos == 2) emp2 = e;
    }

    public void addTicket(Ticket t, int pos) {
        if (pos >= 1 && pos <= 5) tickets[pos - 1] = t;
    }

    public void completeTicket(String employeeName, int ticketId) {
        Employee employee = (emp1.fullName.equals(employeeName)) ? emp1 : emp2;
        for (Ticket t : tickets) {
            if (t != null && t.id == ticketId && !t.isCompleted) {
                if (employee.pointLevel >= t.point) {
                    t.assignedEmployee = employeeName;
                    t.isCompleted = true;
                    System.out.println("Ticket Id: " + ticketId + " marked as completed by " + employeeName + ".");
                } else {
                    System.out.println("Ticket Id " + ticketId + " cannot be completed by " + employeeName + " (Insufficient points).");
                }
                return;
            }
        }
    }

    public int getWaitingTicketCount() {
        int count = 0;
        for (Ticket t : tickets) {
            if (t != null && !t.isCompleted) count++;
        }
        return count;
    }

    public int getCompletedTicketsTotalPoint() {
        int sum = 0;
        for (Ticket t : tickets) {
            if (t != null && t.isCompleted) sum += t.point;
        }
        return sum;
    }

    public static void main(String[] args) {
        HelpDesk helpDesk = new HelpDesk();
        Employee alice = new Employee("Alice Brown", 5, "SOFTWARE");
        Employee bob = new Employee("Bob Smith", 8, "HARDWARE");

        helpDesk.addEmployee(alice, 1);
        helpDesk.addEmployee(bob, 2);

        Ticket t1 = new Ticket(101, "Software Bug", "SOFTWARE", 4);
        Ticket t2 = new Ticket(102, "Network Issue", "HARDWARE", 7);
        Ticket t3 = new Ticket(103, "System Crash", "HARDWARE", 10);
        Ticket t4 = new Ticket(104, "Printer Not Working", "HARDWARE", 3);
        Ticket t5 = new Ticket(105, "UI Bug", "SOFTWARE", 2);

        helpDesk.addTicket(t1, 1);
        helpDesk.addTicket(t2, 2);
        helpDesk.addTicket(t3, 3);
        helpDesk.addTicket(t4, 4);
        helpDesk.addTicket(t5, 5);

        helpDesk.completeTicket("Alice Brown", 101);
        helpDesk.completeTicket("Bob Smith", 102);
        helpDesk.completeTicket("Alice Brown", 103);
        helpDesk.completeTicket("Bob Smith", 104);
        helpDesk.completeTicket("Alice Brown", 105);

        System.out.println(helpDesk.getWaitingTicketCount());
        System.out.println(helpDesk.getCompletedTicketsTotalPoint());
    }
}
package Testcode;

class Employee {
    String fullName;
    int pointLevel;
    String assignedCategory;

    public Employee(String fullName, int pointLevel, String assignedCategory) {
        this.fullName = fullName;
        this.pointLevel = pointLevel;
        this.assignedCategory = assignedCategory;
    }
}

class Ticket {
    int id;
    String name;
    String category;
    int point;
    String assignedEmployee = "";
    boolean isCompleted = false;

    public Ticket(int id, String name, String category, int point) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.point = point;
    }
}

class HelpDesk {
    Employee emp1, emp2;
    Ticket[] tickets = new Ticket[5];

    public void addEmployee(Employee e, int pos) {
        if (pos == 1) emp1 = e;
        else if (pos == 2) emp2 = e;
    }

    public void addTicket(Ticket t, int pos) {
        if (pos >= 1 && pos <= 5) tickets[pos - 1] = t;
    }

    public void completeTicket(String employeeName, int ticketId) {
        Employee employee = (emp1.fullName.equals(employeeName)) ? emp1 : emp2;
        for (Ticket t : tickets) {
            if (t != null && t.id == ticketId && !t.isCompleted) {
                if (employee.pointLevel >= t.point) {
                    t.assignedEmployee = employeeName;
                    t.isCompleted = true;
                    System.out.println("Ticket Id: " + ticketId + " marked as completed by " + employeeName + ".");
                } else {
                    System.out.println("Ticket Id " + ticketId + " cannot be completed by " + employeeName + " (Insufficient points).");
                }
                return;
            }
        }
    }

    public int getWaitingTicketCount() {
        int count = 0;
        for (Ticket t : tickets) {
            if (t != null && !t.isCompleted) count++;
        }
        return count;
    }

    public int getCompletedTicketsTotalPoint() {
        int sum = 0;
        for (Ticket t : tickets) {
            if (t != null && t.isCompleted) sum += t.point;
        }
        return sum;
    }

    public static void main(String[] args) {
        HelpDesk helpDesk = new HelpDesk();
        Employee alice = new Employee("Alice Brown", 5, "SOFTWARE");
        Employee bob = new Employee("Bob Smith", 8, "HARDWARE");

        helpDesk.addEmployee(alice, 1);
        helpDesk.addEmployee(bob, 2);

        Ticket t1 = new Ticket(101, "Software Bug", "SOFTWARE", 4);
        Ticket t2 = new Ticket(102, "Network Issue", "HARDWARE", 7);
        Ticket t3 = new Ticket(103, "System Crash", "HARDWARE", 10);
        Ticket t4 = new Ticket(104, "Printer Not Working", "HARDWARE", 3);
        Ticket t5 = new Ticket(105, "UI Bug", "SOFTWARE", 2);

        helpDesk.addTicket(t1, 1);
        helpDesk.addTicket(t2, 2);
        helpDesk.addTicket(t3, 3);
        helpDesk.addTicket(t4, 4);
        helpDesk.addTicket(t5, 5);

        helpDesk.completeTicket("Alice Brown", 101);
        helpDesk.completeTicket("Bob Smith", 102);
        helpDesk.completeTicket("Alice Brown", 103);
        helpDesk.completeTicket("Bob Smith", 104);
        helpDesk.completeTicket("Alice Brown", 105);

        System.out.println(helpDesk.getWaitingTicketCount());
        System.out.println(helpDesk.getCompletedTicketsTotalPoint());
    }
}

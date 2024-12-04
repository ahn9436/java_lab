class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    //Method to subtract amount from balance
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    //Method to transfer amount to another account
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Method to return string representation of accout
    @Override
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        //Create account
        Account account1 = new Account("A1", "Alice");

        Account account2 = new Account("A2", "Bob", 1000);

        System.out.println(account1);
        System.out.println(account2);

        account1.credit(500);
        System.out.println("After crediting 500 to account1: " + account1);

        account2.debit(200);
        System.out.println("After debiting 200 from account2:" + account2);

        account2.transferTo(account1, 300);
        System.out.println("After transferring 300 from account2 to account1");
        System.out.println(account1);
        System.out.println(account2);
    }
}



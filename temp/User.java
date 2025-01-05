public class User {
    private int userId;
    private String username;
    private String password;
    private double accountBalance;

    // Constructors
    public User(int userId, String username, String password, double accountBalance) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.accountBalance = accountBalance;
    }

    // Getters and Setters
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public double getAccountBalance() { return accountBalance; }
    public void setAccountBalance(double accountBalance) { this.accountBalance = accountBalance; }
}

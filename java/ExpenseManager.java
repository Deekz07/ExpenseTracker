import java.util.ArrayList;

public class ExpenseManager {

    private ArrayList<Expense> expenses =
            new ArrayList<>();

    public void addExpense(Expense expense) {

        expenses.add(expense);
    }

    public void showExpenses() {

        System.out.println("\nRecent Transactions:\n");

        for(Expense expense : expenses) {

            System.out.println(expense);
        }
    }

    public double calculateTotalExpense() {

        double total = 0;

        for(Expense expense : expenses) {

            total += expense.getAmount();
        }

        return total;
    }
}
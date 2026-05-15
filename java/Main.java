public class Main {

    public static void main(String[] args) {

        ExpenseManager manager =
                new ExpenseManager();

        manager.addExpense(
                new Expense(
                        "Food",
                        500,
                        "Dining"
                )
        );

        manager.addExpense(
                new Expense(
                        "Uber",
                        250,
                        "Travel"
                )
        );

        manager.addExpense(
                new Expense(
                        "Shopping",
                        1500,
                        "Lifestyle"
                )
        );

        manager.showExpenses();

        System.out.println(
                "\nTotal Expense: ₹" +
                manager.calculateTotalExpense()
        );
    }
}
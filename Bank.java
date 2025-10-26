/*
LeetCode 2043 — Simple Bank System

You have been tasked with writing a program for a popular bank that will automate all its incoming transactions 
(transfer, deposit, and withdraw). The bank has n accounts numbered from 1 to n. 
The initial balance of each account is stored in a 0-indexed integer array balance, 
where the (i + 1)th account has an initial balance of balance[i].

Execute all the valid transactions. A transaction is valid if:
1. The given account number(s) are between 1 and n, and
2. The amount of money withdrawn or transferred from is less than or equal to the balance of the account.

Implement the Bank class:
    Bank(long[] balance)
        Initializes the object with the 0-indexed integer array balance.

    boolean transfer(int account1, int account2, long money)
        Transfers money dollars from the account numbered account1 to the account numbered account2.
        Return true if the transaction was successful, false otherwise.

    boolean deposit(int account, long money)
        Deposits money dollars into the account numbered account.
        Return true if the transaction was successful, false otherwise.

    boolean withdraw(int account, long money)
        Withdraws money dollars from the account numbered account.
        Return true if the transaction was successful, false otherwise.


Example:
Input:
["Bank", "withdraw", "transfer", "deposit", "transfer", "withdraw"]
[[[10, 100, 20, 50, 30]], [3, 10], [5, 1, 20], [5, 20], [3, 4, 15], [10, 50]]

Output:
[null, true, true, true, false, false]

Explanation:
Bank([10,100,20,50,30]) initializes 5 accounts with the given balances.
withdraw(3,10) returns true. Account 3 had 20, so withdrawing 10 is valid → new balance is 10.
transfer(5,1,20) returns true. Account 5 had 30, so transferring 20 to account 1 is valid → account5 now 10, account1 now 30.
deposit(5,20) returns true. Account 5 now 30.
transfer(3,4,15) returns false. Account 3 only has 10 now, so cannot transfer 15 → balances unchanged.
withdraw(10,50) returns false. Account 10 does not exist (we have only 5 accounts) → invalid.


Constraints:
• n == balance.length
• 1 <= n, account, account1, account2 <= 10^5
• 0 <= balance[i], money <= 10^12
• At most 10^4 calls will be made to each function (transfer, deposit, withdraw).
*/











package JavaPraticeQuestions;

class Bank {
    private final long[] bal;
    private final int n;

    public Bank(long[] bal) {
        this.bal = bal;
        this.n = bal.length;
    }

    public boolean transfer(int from, int to, long amt) {
        if (!valid(from) || !valid(to) || bal[from - 1] < amt) return false;
        bal[from - 1] -= amt;
        bal[to - 1] += amt;
        return true;
    }

    public boolean deposit(int acc, long amt) {
        if (!valid(acc)) return false;
        bal[acc - 1] += amt;
        return true;
    }

    public boolean withdraw(int acc, long amt) {
        if (!valid(acc) || bal[acc - 1] < amt) return false;
        bal[acc - 1] -= amt;
        return true;
    }

    private boolean valid(int acc) {
        return acc > 0 && acc <= n;
    }
}


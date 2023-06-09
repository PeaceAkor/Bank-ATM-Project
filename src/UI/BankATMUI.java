package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankATMUI {
    char uniChar = '\u20A6';
    JFrame Frame = new JFrame("Window");
    JButton Login = new JButton("Login");
    JLabel Password = new JLabel("Enter Password");
    JTextField PasswordField = new JTextField();

    public void mainUI() {
        Frame.setSize(450,500);
        Frame.setLayout(new GridLayout(3,1));
        Frame.setVisible(true);
        Frame.setLocationRelativeTo(null);
        Frame.setTitle("Welcome to Winner's bank");
        Frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        Frame.add(Password);
        Frame.add(PasswordField);
        Frame.add(Login);

        Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float userID = (Float.parseFloat(PasswordField.getText()));
                if (userID == 5555) {
                    accountTypeUI();
                } else {
                    JOptionPane.showMessageDialog(null,"Incorrect pin, Try again");
                }
            }
        });

    }

    JFrame Frame2 = new JFrame("Window");
    JButton accountTypeSavings = new JButton("Savings Account");
    JButton accountTypeCurrent = new JButton("Current Account");
    
    public void accountTypeUI()

    {
        Frame2.setSize(450, 500);
        Frame2.setLayout(new GridLayout(2, 1));
        Frame2.setVisible(true);
        Frame2.setLocationRelativeTo(null);
        Frame2.setTitle("Choose your account type");

        Frame2.add(accountTypeSavings);
        Frame2.add(accountTypeCurrent);
        Frame2.add(accountTypeField);

        accountTypeSavings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                savingsUI();
            }
        });
        accountTypeCurrent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentUI();
            }
        });
    }
    JFrame FrameSavings = new JFrame("window");
    JLabel Balance = new JLabel("Balance: "+uniChar+"100000");
    JButton DepositSavings = new JButton("Deposit");
    JButton WithdrawSavings = new JButton("Withdraw");
    
    public void savingsUI() {
        FrameSavings.setSize(450, 500);
        FrameSavings.setLayout(new GridLayout(3, 1));
        FrameSavings.setVisible(true);
        FrameSavings.setLocationRelativeTo(null);
        FrameSavings.setTitle("Account: Savings");

        FrameSavings.add(Balance);
        FrameSavings.add(DepositSavings);
        FrameSavings.add(WithdrawSavings);

        DepositSavings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depositSavingsUI();
            }
        });
        WithdrawSavings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { withdrawCurrentUI();
            }
        });
    }

    JFrame FrameDepositSave = new JFrame("Window");
    JButton DepositSave = new JButton("Deposit");
    JLabel AmountDepositSave = new JLabel("Enter Deposit Amount");
    JTextField AmountFieldDepositSave = new JTextField();

    public void depositSavingsUI(){
        FrameDepositSave.setSize(450, 500);
        FrameDepositSave.setLayout(new GridLayout(3, 1));
        FrameDepositSave.setVisible(true);
        FrameDepositSave.setLocationRelativeTo(null);
        FrameDepositSave.setTitle("Deposit");
        FrameDepositSave.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        FrameDepositSave.add(AmountDepositSave);
        FrameDepositSave.add(AmountFieldDepositSave);
        FrameDepositSave.add(DepositSave);

        DepositSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BankATM assObj = new BankATM();
                float answer = assObj.balance1(Float.parseFloat(AmountFieldDepositSave.getText()));
                JOptionPane.showMessageDialog(null, "You new balance " +uniChar+answer);
            }
        });
    }
     JFrame FrameWithdrawSave = new JFrame("window");
    JButton WithdrawSave = new JButton("Withdraw");
    //    JLabel Welcome = new JLabel("");
    JLabel AmountWithSave = new JLabel(" Enter Withdrawal Amount:");
    JTextField AmountFieldWithSave = new JTextField();

    public void withdrawSavingsUI() {
        FrameWithdrawSave.setSize(450, 500);
        FrameWithdrawSave.setLayout(new GridLayout(3, 1));
        FrameWithdrawSave.setVisible(true);
        FrameWithdrawSave.setLocationRelativeTo(null);
        FrameWithdrawSave.setTitle("Withdrawal");
        FrameWithdrawSave.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        FrameWithdrawSave.add(AmountWithSave);
        FrameWithdrawSave.add(AmountFieldWithSave);
        FrameWithdrawSave.add(WithdrawSave);

        WithdrawSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BankATM assObj = new BankATM();
                float WithdrawSave = (Float.parseFloat(AmountFieldWithSave.getText()));
                float solution = assObj.withdrawalBalance(Float.parseFloat(AmountFieldWithSave.getText()));
                if (WithdrawSave > 20000) {
                    JOptionPane.showMessageDialog(null, "Withdrawal limit is " + uniChar + "20000");
                } else {
                    JOptionPane.showMessageDialog(null, "Your new balance is " + uniChar + solution);
                }
            }
        });
    }
    JFrame FrameCurrent = new JFrame("window");
    JLabel BalanceCurrent = new JLabel("Balance: "+uniChar+"100000");.
    JButton depositCurrent = new JButton("Deposit");
    JButton withdrawCurrent = new JButton("Withdraw");

    public void currentUI() {
        FrameCurrent.setSize(450, 500);
        FrameCurrent.setLayout(new GridLayout(3, 1));
        FrameCurrent.setVisible(true);
        FrameCurrent.setLocationRelativeTo(null);
        FrameCurrent.setTitle("Account: Current");
        FrameCurrent.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        FrameCurrent.add(BalanceCurrent);
        FrameCurrent.add(depositCurrent);
        FrameCurrent.add(withdrawCurrent);

        depositCurrent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depositCurrentUI();
            }
        });
        withdrawCurrent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                withdrawCurrentUI();
            }
        });
    }
    JFrame FrameDepositCurrent = new JFrame("window");
    JButton DepositCurrent = new JButton("Deposit");
    //    JLabel Welcome = new JLabel("");
    JLabel AmountDepCurrent = new JLabel(" Enter Deposit Amount:");
    JTextField AmountFieldDepCurrent = new JTextField();
//    JLabel test = new JLabel(AmountFieldDepSave);

    public void depositCurrentUI(){
        FrameDepositCurrent.setSize(450, 500);
        FrameDepositCurrent.setLayout(new GridLayout(3, 1));
        FrameDepositCurrent.setVisible(true);
        FrameDepositCurrent.setLocationRelativeTo(null);
        FrameDepositCurrent.setTitle("Deposit");
        FrameDepositCurrent.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        FrameDepositCurrent.add(AmountDepCurrent);
        FrameDepositCurrent.add(AmountFieldDepCurrent);
        FrameDepositCurrent.add(DepositCurrent);

        DepositCurrent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BankATM assObj = new BankATM();
                float answer1 = assObj.balance1 (Float.parseFloat(AmountFieldDepCurrent.getText()));
                JOptionPane.showMessageDialog(null, "You new balance " +uniChar+answer1);
            }
        });
    }
    JFrame FrameWithdrawCurrent = new JFrame("window");
    JButton WithdrawCurrent = new JButton("Withdraw");
    //    JLabel Welcome = new JLabel("");
    JLabel AmountWithCurrent = new JLabel(" Enter Withdrawal Amount:");
    JTextField AmountFieldWithCurrent = new JTextField();

    public void withdrawCurrentUI() {
        FrameWithdrawCurrent.setSize(450, 500);
        FrameWithdrawCurrent.setLayout(new GridLayout(3, 1));
        FrameWithdrawCurrent.setVisible(true);
        FrameWithdrawCurrent.setLocationRelativeTo(null);
        FrameWithdrawCurrent.setTitle("Withdrawal");
        FrameWithdrawCurrent.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        FrameWithdrawCurrent.add(AmountWithCurrent);
        FrameWithdrawCurrent.add(AmountFieldWithCurrent);
        FrameWithdrawCurrent.add(WithdrawCurrent);

        WithdrawCurrent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BankATM assObj = new BankATM();
//                float WithCurrent = (Float.parseFloat(AmountFieldWithCurrent.getText()));
                float solution1 = assObj.withdrawalBalance(Float.parseFloat(AmountFieldWithCurrent.getText()));
                JOptionPane.showMessageDialog(null, "You withdrew " +uniChar+solution1);
            }
        });
    }
}



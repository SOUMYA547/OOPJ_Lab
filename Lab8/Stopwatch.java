import javax.swing.*;
import java.awt.event.*;

class Stopwatch extends JFrame implements ActionListener {
    private long startTime = 0;
    private boolean running = false;
    private JLabel timeLabel;
    private JButton startBtn, stopBtn, resetBtn;
    private Thread timerThread;

    public Stopwatch() {
        setTitle("Stopwatch");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        timeLabel = new JLabel("Time: 0 sec", SwingConstants.CENTER);
        timeLabel.setBounds(50, 20, 200, 30);
        add(timeLabel);

        startBtn = new JButton("Start");
        startBtn.setBounds(30, 80, 80, 30);
        startBtn.addActionListener(this);
        add(startBtn);

        stopBtn = new JButton("Stop");
        stopBtn.setBounds(110, 80, 80, 30);
        stopBtn.addActionListener(this);
        add(stopBtn);

        resetBtn = new JButton("Reset");
        resetBtn.setBounds(190, 80, 80, 30);
        resetBtn.addActionListener(this);
        add(resetBtn);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startBtn) {
            if (!running) {
                running = true;
                startTime = System.currentTimeMillis();
                timerThread = new Thread(() -> {
                    while (running) {
                        long elapsed = (System.currentTimeMillis() - startTime) / 1000;
                        timeLabel.setText("Time: " + elapsed + " sec");
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                    }
                });
                timerThread.start();
            }
        } else if (e.getSource() == stopBtn) {
            running = false;
        } else if (e.getSource() == resetBtn) {
            running = false;
            timeLabel.setText("Time: 0 sec");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Stopwatch().setVisible(true));
    }
}

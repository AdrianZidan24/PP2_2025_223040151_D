package modul6;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class ContohActionListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh ActionListener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,150);
        frame.setLayout(new FlowLayout());

        //1. buat komponen (Event source dan komponen lain)
        JLabel label = new JLabel("Halo klik tombol di bawah!");
        JButton button = new JButton("Klik Saya!");
        
        //2. buat event listener
        //kita menggunakan "anonymous inner class" di sini
        ActionListener listener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //3. logika yang dieksekusi saat event terjadi
                label.setText("Tombol telah diklik!");
            }
        };

        //4.daftarkan listener ke source
        button.addActionListener(listener);

        //Tambahkan komponen ke frame
        frame.add(label);
        frame.add(button);
        frame.setVisible(true);
    }
}

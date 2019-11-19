package laboratornuerobotu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Laba4 extends JFrame{
	
	JButton b1, b2;
	JLabel l1, l2;
	JTextField t1;
	int i;
	String a;
	
	TaxiPark taxi = new TaxiPark();

	public Laba4(String s) {
		super(s);
		setLayout(new FlowLayout());
		b1 = new JButton("Очистить");
		b2 = new JButton("Вывести инфо о такси");
		l1 = new JLabel("Введите номер такси");
		l2 = new JLabel("");
		t1 = new JTextField(10);
		add(b1);
		add(b2);
		add(l1);
		add(t1);
		add(l2);
		b1.addActionListener(taxi);
		b2.addActionListener(taxi);
	}
	
	public class TaxiPark implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b2) {
			i = Integer.parseInt(t1.getText());
			if(i == 1) {
				a = " || Цвет такси - Синий || Марка автомобиля - BMW || Доход в месяц с автомобиля - 60000 гривен || ";
				l2.setText(a);
				}
			if(i == 2) {
				a = " || Цвет такси - Жёлтый || Марка автомобиля - Jaguar || Доход в месяц с автомобиля - 57000 гривен || ";
				l2.setText(a);
				}
			if(i == 3) {
				a = " || Цвет такси - Зелёный || Марка автомобиля - Renault || Доход в месяц с автомобиля - 37000 гривен || ";
				l2.setText(a);
				}
			if(i == 4) {
				a = " || Цвет такси - Фиолетовый || Марка автомобиля - Lada || Доход в месяц с автомобиля - 30000 гривен || ";
				l2.setText(a);
				}
			if(i == 5) {
				a = " || Цвет такси - Серый || Марка автомобиля - Subaru || Доход в месяц с автомобиля - 43000 гривен || ";
				l2.setText(a);
				}
			}
			
			if(e.getSource()==b1) {
				t1.setText(null);
				l2.setText(null);
			}
		}
	}
	
	
	public static void main(String[] args) {
		Laba4 r = new Laba4("Общая информация о таксо-парке");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(650, 100);
		r.setResizable(false);
		r.setLocationRelativeTo(null);
		
	}

}

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Converter extends Frame implements ActionListener, ItemListener{
	Frame f;
	Label lh,lt,lu,la,lq1,lq2;
	Checkbox c1,c2,c3,c4,c5;
	TextField t1,t2;
	CheckboxGroup cbg;
	Button bc,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	Converter(){
		f = new Frame();
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
		lh = new Label("UNIT CONVERTER",Label.CENTER);
		lh.setFont(new Font("TimesRoman", Font.BOLD, 20));
        lh.setForeground(Color.RED);
        f.add(lh);
        lh.setBounds(0, 50, 500, 50);
        cbg = new CheckboxGroup();
        lq1 = new Label("Select the unit you want to convert");
        lq1.setBounds(20,80,500,50);
        f.add(lq1);
        c1= new Checkbox("Distance",cbg,false);
        c2= new Checkbox("Temperature",cbg,false);
        c3= new Checkbox("Digital storage",cbg,false);
        c4= new Checkbox("Volume",cbg,false);
        c5= new Checkbox("Weight",cbg,false);
        c1.setBounds(20,120,100,50);
        c2.setBounds(120,120,100,50);
        c3.setBounds(220,120,100,50);
        c4.setBounds(320,120,100,50);
        c5.setBounds(420,120,100,50);
        f.add(c1);f.add(c2);f.add(c3);f.add(c4);f.add(c5);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
                System.exit(0); 
            }});
        lt = new Label("Enter the value you wish to convert.");
        lt.setBounds(100,200,500,50);
        f.add(lt);
        lu = new Label("Unit =");
        lu.setBounds(50,260,50,20);
        f.add(lu);
        la = new Label("Answer=");
        la.setBounds(50,300,50,20);
        f.add(la);
        t1 = new TextField();
        t1.setBounds(100,260,200,20);
        f.add(t1);
        t2 = new TextField();
        t2.setBounds(100,300,200,20);
        f.add(t2);
        bc = new Button("Clear");
        bc.setBounds(300,260,50,20);
        f.add(bc);
        lq2 = new Label("Click the below buttons to convert");
        lq2.setBounds(20,330,500,50);
        f.add(lq2);
        b1 = new Button();
        b2 = new Button();
        b3 = new Button();
        b4 = new Button();
        b5 = new Button();
        b6 = new Button();
        b7 = new Button();
        b8 = new Button();
        b9 = new Button();
        b1.setBounds(50,380,70,20);
        b2.setBounds(170,380,70,20);
        b3.setBounds(290,380,70,20);
        b4.setBounds(50,410,70,20);
        b5.setBounds(170,410,70,20);
        b6.setBounds(290,410,70,20);
        b7.setBounds(50,440,70,20);
        b8.setBounds(170,440,70,20);
        b9.setBounds(290,440,70,20); 
        bc.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
        c5.addItemListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		double a,b=0;
		a=Double.parseDouble(t1.getText());
		if(ae.getSource()==bc){
			t1.setText(" ");
			t2.setText(" ");
		}else if(cbg.getSelectedCheckbox()==c1){
			if(ae.getSource()==b1){
				b=a/100;
			}else if(ae.getSource()==b2){
				b=a/1000;
			}else if(ae.getSource()==b3){
				b=a*100;
			}else if(ae.getSource()==b4){
				b=a*100000;
			}else if(ae.getSource()==b5){
				b=a*1000;
			}else if(ae.getSource()==b6){
				b=a/2.54;
			}else if(ae.getSource()==b7){
				b=a*2.54;
			}else if(ae.getSource()==b8){
				b=a/12;
			}else if(ae.getSource()==b9){
				b=a*12;
			}
		}else if(cbg.getSelectedCheckbox()==c2){
			if(ae.getSource()==b1){
				b=(a*9/5)+32;
			}else if(ae.getSource()==b2){
				b=a+273.15;
			}else if(ae.getSource()==b3){
				b=(a-32)*5/9;
			}else if(ae.getSource()==b4){
				b=(a-32)*5/9 + 273.15;
			}else if(ae.getSource()==b5){
				b=a-273.15;
			}else if(ae.getSource()==b6){
				b=(a-273.15)*9/5+32;
			}
		}else if(cbg.getSelectedCheckbox()==c3){
			if(ae.getSource()==b1){
				b=a/1000;
			}else if(ae.getSource()==b2){
				b=a/1000;
			}else if(ae.getSource()==b3){
				b=a*1000;
			}else if(ae.getSource()==b4){
				b=a/1000000;
			}else if(ae.getSource()==b5){
				b=a/1000;
			}else if(ae.getSource()==b6){
				b=a*1000000000;
			}
		}else if(cbg.getSelectedCheckbox()==c4){
			if(ae.getSource()==b1){
				b=a*1000;
			}else if(ae.getSource()==b2){
				b=a/1000;
			}else if(ae.getSource()==b3){
				b=a/3.785;
			}else if(ae.getSource()==b4){
				b=a*3.785;
			}
		}else if(cbg.getSelectedCheckbox()==c5){
			if(ae.getSource()==b1){
				b=a/1000;
			}else if(ae.getSource()==b2){
				b=a/1000;
			}else if(ae.getSource()==b3){
				b=a/1000000;
			}else if(ae.getSource()==b4){
				b=a*1000;
			}else if(ae.getSource()==b5){
				b=a*1000000;
			}else if(ae.getSource()==b6){
				b=a*2.205;
			}
		}
		t2.setText(String.valueOf(b));
	}
	public void itemStateChanged(ItemEvent ie){
		if(ie.getSource()==c1){
			b1.setLabel("cm -> m");
			b2.setLabel("m -> km");
			b3.setLabel("m -> cm");
			b4.setLabel("km -> cm");
			b5.setLabel("km -> m");
			b6.setLabel("cm -> inch");
			b7.setLabel("inch -> cm");
			b8.setLabel("inch -> ft");
			b9.setLabel("ft -> inch");
			f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);
		}else if(ie.getSource()==c2){
			b1.setLabel("C -> F");
			b2.setLabel("C -> K");
			b3.setLabel("F -> C");
			b4.setLabel("F -> K");
			b5.setLabel("K -> C");
			b6.setLabel("K -> F");
			f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.remove(b7);f.remove(b8);f.remove(b9);
		}else if(ie.getSource()==c3){
			b1.setLabel("Kb -> Mb");
			b2.setLabel("Mb -> Gb");
			b3.setLabel("Mb -> Kb");
			b4.setLabel("Kb -> Gb");
			b5.setLabel("Gb -> Tb");
			b6.setLabel("Tb -> kb");
			f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.remove(b7);f.remove(b8);f.remove(b9);
		}else if(ie.getSource()==c4){
			b1.setLabel("Lt -> ml");
			b2.setLabel("ml -> Lt");
			b3.setLabel("Lt->gallon");
			b4.setLabel("gallon->Lt");
			f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.remove(b5);f.remove(b6);f.remove(b7);f.remove(b8);f.remove(b9);
		}else if(ie.getSource()==c5){
			b1.setLabel("mg -> g");
			b2.setLabel("g -> Kg");
			b3.setLabel("mg -> Kg");
			b4.setLabel("Kg -> g");
			b5.setLabel("kg -> mg");
			b6.setLabel("kg->pound");
			f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.remove(b7);f.remove(b8);f.remove(b9);
		}
	}
	public static void main(String args[]) {
		new Converter();
	}
}

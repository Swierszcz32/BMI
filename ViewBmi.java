package pl.java.BMI;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewBmi extends JFrame{
	
	public ViewBmi() {
		super("BMI Calculator");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			int width = screenSize.width;
			int height = screenSize.height;
		this.setSize(width/3, height/2);
		this.setVisible(true);
		this.setDefaultCloseOperation(3);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("bmi.png"));
			int widthFrame = this.getSize().width;
			int heightFrame = this.getSize().height;
		this.setLocation((width-widthFrame)/2, (height-heightFrame)/2);
		initButtons();
		setVisible(true);
	}
	
	JButton convert;
	JLabel resultBMI;
	JLabel title;
	JLabel setHeight;
	JLabel setWeight;
	JLabel yourBMI;
	JLabel scoreBMI;
	JLabel yourDiagnosis;
	JLabel diagnosis;
	JTextField textHeight;
	JTextField textWeight;
	GroupLayout layout = new GroupLayout(getContentPane());
	ConvertVariable cv = new ConvertVariable();
	
	private void initButtons() {
//		jScrollPane1 = new JScrollPane();
		title = new JLabel();
		setHeight = new JLabel();
        setWeight = new JLabel();
        textHeight = new JTextField();
        textWeight = new JTextField();
        convert = new JButton();
        yourBMI = new JLabel();
        scoreBMI = new JLabel();
        yourDiagnosis = new JLabel();
        diagnosis = new JLabel();

        setDefaultCloseOperation(3);

        title.setText("Calculator of BMI");

        setHeight.setText("Give height");

        setWeight.setText("Give weight");
        
        convert.setText("Convert");

        yourBMI.setText("Score");

//        scoreBMI.setText("scoreBMI");

        yourDiagnosis.setText("Diagnosis");

//        diagnosis.setText("diagnosis");
        
        convert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(!textHeight.getText().equals("") && !textWeight.getText().equals("")) {
					try {
					TransmittedVariable tv = new TransmittedVariable(Double.parseDouble(textHeight.getText()), Double.parseDouble(textWeight.getText()));
			
					scoreBMI.setText(String.valueOf(cv.converting(tv.getHeight(), tv.getWeight())));
					} catch (NumberFormatException ex) {
						scoreBMI.setText(ex.getMessage());
						diagnosis.setText(ex.getMessage());
					}
					}
				int i = 0;
				if(Double.parseDouble(scoreBMI.getText()) < 18.5) i = 0;
				if(Double.parseDouble(scoreBMI.getText()) >= 18.5 && Double.parseDouble(scoreBMI.getText()) < 25.0 ) i = 1;
				if(Double.parseDouble(scoreBMI.getText()) >= 25.0) i = 2;
				
				switch( i ) {
				case 0: diagnosis.setText("Underweight");
				break;
				case 1: diagnosis.setText("Correct value");
				break;
				case 2: diagnosis.setText("Overweight");
				break;
				}
			}
		}
        );

        getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(convert, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(title, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
                                    .addComponent(setWeight, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                    .addComponent(setHeight, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                    .addComponent(textHeight, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textWeight, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yourBMI, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scoreBMI, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yourDiagnosis, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diagnosis, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(textHeight, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(setHeight, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(setWeight, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(textWeight, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(convert, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(yourBMI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(scoreBMI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(yourDiagnosis, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(diagnosis, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
		
	}
	
	public static void main(String[] args) {
		new ViewBmi();
	}

}

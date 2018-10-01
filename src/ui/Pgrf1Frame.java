package ui;


import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Timer;
import java.util.TimerTask;

public class Pgrf1Frame extends JFrame {
    static int FPS= 1000/60;
    private BufferedImage img;
    static int width =800;
    static int height = 600;
    private JPanel panel;



    public static void main(String... args){

        Pgrf1Frame pgrf1Frame = new Pgrf1Frame();
        pgrf1Frame.img= new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
        pgrf1Frame.init(width,height);
        //System.out.println("Fibonacciho Posloupnost");

        //for (int i = 0; i<15;i++){
            //pres sysout vypsat fibonacciho posloupnost
        //}

       // int n1=0,n2=1,n3,i,count=15;
        //System.out.print(n1+" "+n2);//p 0 a 1

        //for(i=2;i<count;++i)//z od 2
        //{
           // n3=n1+n2;
           // System.out.print(" "+n3);
            //n1=n2;
           // n2=n3;
       // }
    }
    private void init (int width,int height){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(width,height);
        setTitle("Pocitacova Grafika");

        panel=new JPanel();
        add(panel);
        setLocationRelativeTo(null);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                 draw();
            }
        } ,100,FPS);
        draw();

    }
private void draw(){
        img.getGraphics().fillRect(0, 0, img.getWidth(),img.getHeight());
        for (int i=0; i<100;i++){
        img.setRGB(200,200, Color.RED.getRGB());
        }


        panel.getGraphics().drawImage(img,0, 0, img.getWidth(),img.getHeight(), null);
        panel.paintComponents(getGraphics());
}
}



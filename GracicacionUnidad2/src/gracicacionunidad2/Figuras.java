package graficacionunidad2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Figuras extends JPanel{
    // ventana
    private JFrame ventana;
    // contenedor
    private Container contenedor;
    // inicializar la ventana
    public Figuras(){
      ventana = new JFrame("Dibujando icono");
        // definir tamaño a ventana
        ventana.setSize(800, 600);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        
        contenedor = ventana.getContentPane();
        contenedor.setSize(800, 600);
        // agregar la ventana en el contenedor
        contenedor.add(this, BorderLayout.CENTER);  
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.drawLine(100, 50, 200, 50);
        g.drawLine(200, 50, 200, 100);
        g.drawLine(100, 50, 100, 100);
        g.drawLine(100, 100, 200, 100);
        
        g.setColor(Color.GRAY);
        g.drawLine(100, 50, 150, 20);
        g.drawLine(200, 50, 150, 20);
        
        //Trazo de Rectangulos
        g.setColor(Color.BLUE);
        g.drawRect(280, 50, 100, 50);
        g.fillRect(280, 110, 100, 50);
        
        g.setColor(Color.BLACK);
        g.drawRoundRect(450, 50, 100, 50, 50, 50);
        g.fillRoundRect(450, 110, 100, 50, 20, 20);
        
        g.setColor(Color.YELLOW);
        g.drawOval(100, 200, 80, 80);
        g.fillOval(100, 290, 50, 50);
        
        //Trazo Ovalos(Circunferencias)
        g.setColor(Color.GREEN);
        g.drawOval(280,200,80,40);
        g.fillOval(200, 290, 40, 80);
        
        //Dibujar Triangulos
        g.setColor(Color.PINK);
        g.drawLine(450, 300, 550, 300);
        g.drawLine(450, 300, 500, 250);
        g.drawLine(550, 300, 500, 250);
        
        //Dibujo de Cadena de Texto
        g.drawString("Ejemplo de trazo de figuras clasicas", 200, 400);
        
        //Dibujar Arco
        g.setColor(Color.ORANGE);
        g.drawArc(100, 350, 200, 100, 150, 95);
        g.fillArc(100, 450, 300, 150, 300, 200);
    }
}

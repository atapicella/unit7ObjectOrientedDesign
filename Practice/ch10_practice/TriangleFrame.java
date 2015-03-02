import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class TriangleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 1000;
    private static final int FRAME_HEIGHT = 1000;
    
    private TriangleComponent scene;
    
    public TriangleFrame()
    {
        this.scene = new TriangleComponent();
        this.add(scene);   
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setTitle("Triangle");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    
    
    
    
    
    
    
   
}

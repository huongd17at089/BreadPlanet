
package view.BieuDo;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.JFrame;
import org.jfree.chart.*;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.title.TextTitle;

/**
 *
 * @author DinhGi
 */
public class ChartForm extends ChartFrame {
    
    public ChartForm(String title, JFreeChart chart) {
        super(title, chart);
        chart.setBackgroundPaint(Color.WHITE);
        chart.getTitle().setPaint(new Color(90,89,70));
        chart.setTitle(new TextTitle("Biểu đồ doanh số bánh", new Font("Arial",BOLD, 20)));
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(new Color(150,17,92));
        this.setSize(800, 500);
        this.setLocationRelativeTo(null); 
    }
}

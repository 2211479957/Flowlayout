import javax.swing.*;
import java.awt.*;
public class FlowLayoutDemo extends JFrame{
    JPanel p;
    JButton btn1,btn2,btn3;
    public FlowLayoutDemo(){
        //super为调用父类JFrame的方法，命名标题
        super("FlowLayout流布局");
        //创建面板
        p = new JPanel();
        //创建一个流布局对象，对齐方式是左对齐，水平间距30像素，垂直间距30像素)
        FlowLayout layout=new FlowLayout(FlowLayout.LEFT,30,30);
        p.setLayout(layout);
        ///上面这三行代码可以简化成下面一条语句
        //p=new JPanel(new FlowLayout(FlowLayout.LEFT,30,30));
        //创建按钮
        btn1=new JButton("按钮1");
        btn2=new JButton("按钮2");
        btn3=new JButton("按钮3");
        //将按钮添加到面板中
        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        //将面板添加到窗体中
        this.add(p);
        //设定窗口大小
        this.setSize(1080,800);
        //设定窗口默认关闭方式为退出应用程序
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口可视
        this.setVisible(true);
    }
    public static void main(String []args){
        new FlowLayoutDemo();
    }
}

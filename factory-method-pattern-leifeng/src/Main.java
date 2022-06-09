/**
 * 工厂方法客户端
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/08
 */
public class Main {
    public static void main(String[] args) {
        LeiFengFactory factory = new UndergraduateFactory();
        LeiFeng leiFeng = factory.createLeiFeng();
        leiFeng.buyRice();
        leiFeng.sweep();
        leiFeng.wash();
    }
}

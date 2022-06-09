/**
 * 学习雷锋的大学生工厂
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/08
 */
public class UndergraduateFactory implements LeiFengFactory{
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}

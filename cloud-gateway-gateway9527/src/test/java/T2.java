import java.time.ZonedDateTime;

/**
 * @Author: 95
 * @Date: 2020/4/15
 */
public class T2
{
    public static void main(String[] args)
    {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);

        //2020-02-21T15:51:37.485+08:00[Asia/Shanghai]
    }
}

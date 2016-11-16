package info.xiaomo.multipleSource.sql;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 *
 * @author: xiaomo
 * @github: https://github.com/qq83387856
 * @email: hupengbest@163.com
 * @QQ_NO: 83387856
 * @Date: 2016/11/16 11:29
 * @Description: 用户实体类
 * @Copyright(©) 2015 by xiaomo.
 **/

public class Sql {

    public static String addUser1= "insert into user(name,age) values(?, ?)";
    public static String addUser2= "insert into user(name,age) values(?, ?)";

    public static String selectUser1 = "select count(1) from user";
    public static String selectUser2 = "select count(1) from user";

}
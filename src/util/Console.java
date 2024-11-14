package util;

public class Console {

    public static void console(){
        System.out.println("--------------------欢迎来到仿美团外卖系统--------------------");
        System.out.println("1.我是顾客");
        System.out.println("2.我是商家");
        System.out.println("3.我是骑手");
        System.out.println("4.我是管理员");
        System.out.println("5.退出");
        System.out.println("请选择你的身份:");
    }

    public static void console_customer(){
        System.out.println("--------------------欢迎来到仿美团外卖系统--------------------");
        System.out.println("1.顾客登录");
        System.out.println("2.顾客注册");
        System.out.println("3.退出");
        System.out.println("请选择你的操作:");
    }

    public static void console_merchant(){
        System.out.println("--------------------欢迎来到仿美团外卖系统--------------------");
        System.out.println("1.商家登录");
        System.out.println("2.商家注册");
        System.out.println("3.退出");
        System.out.println("请选择你的操作:");
    }

    public static void console_merchant_functions(){
        System.out.println("--------------------欢迎来到仿美团外卖系统--------------------");
        System.out.println("1.申请上架菜品");
        System.out.println("2.下架菜品");
        System.out.println("3.查看所有的菜品");
        System.out.println("4.查看所有的订单信息");
        System.out.println("5.查看新的订单");
        System.out.println("6.退出");
        System.out.println("请选择你的操作:");
    }

    public static void console_manager(){
        System.out.println("--------------------欢迎来到仿美团外卖系统--------------------");
        System.out.println("1.管理员登录");
        System.out.println("2.退出");
        System.out.println("请选择你的操作:");
    }

    public static void console_manager_functions(){
        System.out.println("--------------------欢迎来到仿美团外卖系统--------------------");
        System.out.println("1.查看所有的商家信息");
        System.out.println("2.查看所有的骑手信息");
        System.out.println("3.查看所有商家注册申请");
        System.out.println("4.查看所有骑手注册申请");
        System.out.println("5.查看所有菜品上架申请");
        System.out.println("6.查看所有的订单信息");
        System.out.println("7.查看所有的申诉");
        System.out.println("8.退出");
        System.out.println("请选择你的操作:");
    }
    public static void console_customer_functions(){
        System.out.println("--------------------欢迎来到仿美团外卖系统--------------------");
        System.out.println("1.查看地址信息");
        System.out.println("2.搜索店铺");
        System.out.println("3.搜索菜品");
        System.out.println("4.查看所有的订单信息");
        System.out.println("5.退出");
        System.out.println("请选择你的操作:");
    }

    public static void console_delivery(){
        System.out.println("--------------------欢迎来到仿美团外卖系统--------------------");
        System.out.println("1.骑手登录");
        System.out.println("2.骑手注册");
        System.out.println("3.退出");
        System.out.println("请选择你的操作:");
    }

    public static void console_delivery_functions(){
        System.out.println("--------------------欢迎来到仿美团外卖系统--------------------");
        System.out.println("1.查看所有的订单");
        System.out.println("2.查看正在进行的订单");
        System.out.println("3.查看正在召唤骑手的订单");
        System.out.println("4.退出");
        System.out.println("请选择你的操作:");
    }
}

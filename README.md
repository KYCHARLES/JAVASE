# JAVASE
# 2024/11/12:实现了顾客的登录和注册的功能
# 2024/11/12:商家的注册功能
    商家在注册的时候,status字段默认是1,代表等待管理员审核的阶段,这个阶段商家还没办法登录
# 2024/11/12:商家的登录功能
    商家登录功能基本实现,在登录成功的时候,要改变status这个字段,还没有写
# 2024/11/12:实现了管理员的登录功能
    管理员的username:000 password:000
# 2024/11/12:实现了管理员的查看所有商家的信息
# 2024/11/12:实现了管理员查看和审核注册商家的功能
# 2024/11/12:实现了顾客通过模糊查找店铺的功能
# 2024/11/13:实现了商家上架菜品
# 2024/11/13:实现了管理员审核商家菜品的功能
# 2024/11/13:补充了商家上线和退出的时候status字段的变化,2代表正在营业,顾客可以进入点单;3代表休息,顾客无法进入点单
# 2024/11/13:实现了顾客通过模糊搜索查找菜品的功能
# 2024/11/13:实现了顾客在查询店铺以后进入店铺,将商品添加到购物车,将商品移出购物车,查看购物车的功能,提交订单的功能还没有实现
# 2024/11/13:实现了顾客查看,增加,删除,修改地址的功能
# 2024/11/14:实现了顾客提交订单的功能,订单提交以后status是1,等待商家接单的状态
# 2024/11/14:实现了商家下架商品的功能,下架商品后dish_status = 0;
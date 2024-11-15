-- 创建Customer表
CREATE TABLE Customer (
    customer_id NUMBER  PRIMARY KEY,
    customer_name VARCHAR2(255),
    customer_username NUMBER UNIQUE,
    customer_password VARCHAR2(255),
    customer_status NUMBER,
    create_date DATE DEFAULT SYSDATE,
    update_date DATE DEFAULT SYSDATE
);
 

-- 创建Address表
CREATE TABLE Address (
    address_id NUMBER  PRIMARY KEY,
    customer_id NUMBER,
    address_location VARCHAR2(300),
    address_recipient VARCHAR2(100),
    address_phoneNumber VARCHAR2(18),
    address_status NUMBER,
    create_date DATE DEFAULT SYSDATE,
    update_date DATE DEFAULT SYSDATE,
    CONSTRAINT fk_customer_id FOREIGN KEY (customer_id) REFERENCES Customer(customer_id)
);
 
-- 创建Merchant表
CREATE TABLE Merchant (
    merchant_id NUMBER  PRIMARY KEY,
    merchant_name VARCHAR2(255),
    merchant_username NUMBER UNIQUE,
    merchant_password VARCHAR2(30),
    merchant_status NUMBER,
    merchant_unfinishedOrder NUMBER,
    merchant_completedOrder NUMBER,
    merchant_cancelledOrder NUMBER,
    merchant_score NUMBER,
    create_date DATE DEFAULT SYSDATE,
    update_date DATE DEFAULT SYSDATE
);
 
-- 创建Dish表
CREATE TABLE Dish (
    dish_id NUMBER  PRIMARY KEY,
    merchant_id NUMBER,
    dish_name VARCHAR2(255),
    dish_description VARCHAR2(300),
    dish_price NUMBER,
    dish_type NUMBER,
    dish_status number,
    create_date DATE DEFAULT SYSDATE,
    update_date DATE DEFAULT SYSDATE,
    CONSTRAINT fk_merchant_id FOREIGN KEY (merchant_id) REFERENCES Merchant(merchant_id)
);
 
-- 创建Orders表
CREATE TABLE Orders (
    orders_id NUMBER  PRIMARY KEY,
    customer_id NUMBER,
    delivery_id NUMBER,
    merchant_id number,
    dish_description varchar2(600),
    address_information varchar2(300),
    orders_status NUMBER,
    orders_costomerPaid NUMBER,
    orders_deliveryFee NUMBER,
    create_date DATE DEFAULT SYSDATE,
    update_date DATE DEFAULT SYSDATE
  
);

insert into orders(orders_id, customer_id,delivery_id,merchant_id,dish_description,address_information,orders_status,orders_costomerpaid,orders_deliveryfee,create_date,update_date)
values(orders_seq.nextval,?,0,?,?,?,1,?,?,sysdate,sysdate)
 
-- 创建Delivery表
CREATE TABLE Delivery (
    delivery_id NUMBER  PRIMARY KEY,
    delivery_name VARCHAR2(255),
    delivery_username NUMBER UNIQUE,
    delivery_password VARCHAR2(30),
    delivery_status NUMBER,
    delivery_unfinishedOrder NUMBER,
    delivery_completedOrder NUMBER,
    delivery_cancelledOrder NUMBER,
    delivery_score NUMBER,
    create_date DATE DEFAULT SYSDATE,
    update_date DATE DEFAULT SYSDATE
);
 
-- 创建Manager表
CREATE TABLE Manager (
    manager_id NUMBER  PRIMARY KEY,
    manager_name VARCHAR2(255),
    manager_username VARCHAR2(255) UNIQUE,
    manager_password VARCHAR2(30),
    manager_status NUMBER,
    create_date DATE DEFAULT SYSDATE,
    update_date DATE DEFAULT SYSDATE
);
 
-- 创建Comment表
CREATE TABLE Comments (
    comments_id NUMBER  PRIMARY KEY,
    order_id NUMBER,
    comments_comment VARCHAR2(300),
    create_date DATE DEFAULT SYSDATE,
    update_date DATE DEFAULT SYSDATE
    
);
 
-- 创建Appeal表
CREATE TABLE Appeal (
    appeal_id NUMBER  PRIMARY KEY,
    order_id NUMBER,
    appeal_content VARCHAR2(300),
    appeal_status NUMBER,
    create_date DATE DEFAULT SYSDATE,
    update_date DATE DEFAULT SYSDATE
   
);

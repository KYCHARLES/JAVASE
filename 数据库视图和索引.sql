
create sequence merchant_seq;
create sequence manager_seq start with 1
create sequence customer_seq start with 1;
create sequence dish_seq start with 1
create sequence address_seq start with 
create sequence orders_seq start with 1
create sequence delivery_seq start with 1;

create or replace view dish_view as 
select dish_id,dish.merchant_id,dish_name,dish_description,dish_price,merchant_name,merchant.merchant_status 
from dish
inner join merchant on merchant.merchant_id = dish.merchant_id
where dish_status = 2 and merchant.merchant_status >= 2


create or replace view orders_view as
select orders_id,orders.customer_id, orders.delivery_id,delivery.delivery_name,delivery.delivery_username,orders.merchant_id,merchant.merchant_name,merchant.merchant_username,dish_description,address_information,orders_costomerpaid,orders_deliveryfee,orders_status,orders.update_date
from orders
inner join delivery on delivery.delivery_id = orders.delivery_id
inner join merchant on merchant.merchant_id = orders.merchant_id 

create view merchant_view as 
select merchant_id,merchant_name,merchant_status from merchant



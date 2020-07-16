USE nya_store;
show tables ;
select * from goods_list_store;
select * from goods_list_orders;
select * from member;
select * from goods;
select * from store;
select * from member_level;

insert into store(id, name, member_id, description) values (0,'失落商品收集处',0,'没有指定商品所属店铺的商品默认指向');

insert into member_level(id, detail) VALUES (1,'普通用户'),(2,'商店店员'),(99,'超级管理员'),(10,'商店店长');

update goods set store_id = (select id from store where name = '三得利官方店') where id = 10;

update store set id = 0 where name = '失落商品收集处';

update store set member_id = 9 where id = 0;

insert into member(id, name, password, nickname, level_id, phone, create_time, gender, status, birthday, personalized_signature, email) VALUES
    (11,'lostStore','socialism666','失落商品收集处',10,default,sysdate(),default,default,sysdate(),'lost&found',default);
update member set id=9 where name = 'lostStore';
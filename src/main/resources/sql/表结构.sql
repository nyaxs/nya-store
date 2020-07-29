# 创建数据库
CREATE DATABASE nya_store;

USE nya_store;

# 创建会员表member
CREATE TABLE member
(
    id                     INT          NOT NULL AUTO_INCREMENT,
    name                   VARCHAR(255) NOT NULL COMMENT '用户名',
    password               VARCHAR(255) NOT NULL DEFAULT '123456',
    nickname               VARCHAR(255) NOT NULL DEFAULT 'nya_default' COMMENT '昵称',
    level_id               INT          NOT NULL DEFAULT 1 COMMENT '用户等级',
    phone                  INT                   DEFAULT 01234567890 COMMENT '手机号',
    crete_time             DATETIME              DEFAULT NULL COMMENT '注册时间',
    gender                 INT(1)                DEFAULT 0 COMMENT '性别：0-未知，1-男，2-女',
    status                 INT(1)                DEFAULT 1 COMMENT '账户状态：0-禁用，1-启用',
    birthday               DATE                  DEFAULT NULL COMMENT '生日',
    personalized_signature VARCHAR(255)          DEFAULT NULL COMMENT '个性签名',
    PRIMARY KEY (id),
    UNIQUE KEY index_name (name),
    UNIQUE KEY index_phone (phone)
) ENGINE = InnoDB
  AUTO_INCREMENT = 10
  DEFAULT CHARSET = utf8 COMMENT '会员表';

# 向member表中添加邮箱列
alter TABLE member
    ADD COLUMN email VARCHAR(255) DEFAULT NULL COMMENT '用户邮箱';

# 删除手机号唯一索引
ALTER TABLE member
    DROP INDEX index_phone;

# 修改create_time拼写错误
ALTER TABLE member
    CHANGE crete_time create_time DATE DEFAULT NULL;

# 创建商品表
CREATE TABLE goods
(
    id          INT          NOT NULL AUTO_INCREMENT,
    name        VARCHAR(255) NOT NULL COMMENT '商品名',
    description VARCHAR(255) NOT NULL DEFAULT '商品还未添加描述' COMMENT '商品描述',
    storeId     INT          NOT NULL DEFAULT 0 COMMENT '所属商店，默认为官方商店id0',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 10
  DEFAULT CHARSET = utf8 COMMENT '商品表';


# 修改goods表storeId字段为store_id
ALTER TABLE goods
    CHANGE storeId store_id INT NOT NULL DEFAULT 0 COMMENT '所属商店，默认为官方商店id0';

# 创建商店表store
CREATE TABLE store
(
    id          INT          NOT NULL AUTO_INCREMENT,
    name        VARCHAR(255) NOT NULL COMMENT '商店名',
    member_id   INT          NOT NULL COMMENT '店主id',
    description VARCHAR(255) NOT NULL DEFAULT '商店还没有描述' COMMENT '商店描述',
    PRIMARY KEY (id),
    UNIQUE KEY index_store_name (name)
) ENGINE = InnoDB
  AUTO_INCREMENT = 10
  DEFAULT CHARSET = utf8 COMMENT '商店表';

# 创建用户等级表
Create Table member_level
(
    id     int          not null auto_increment comment '用户等级id',
    detail varchar(255) not null comment '用户等级描述',
    primary key (id)
) engine = InnoDB
  auto_increment = 10
  default charset = utf8 comment '用户等级表';

drop table if exists orders;

# 创建订单表
CREATE TABLE orders
(
    id            int not null auto_increment,
    goods_list_id int not null comment '商品列表id',
    primary key (id)
) engine = InnoDB
  auto_increment = 10
  default charset = utf8 comment '订单表';

# 创建订单对应的商品列表表
CREATE TABLE goods_list
(
    id        int not null auto_increment,
    goods_id  int not null comment '商品id',
    orders_id int not null comment '订单id',
    size      int not null comment '商品数量',
    primary key (id)
) engine = InnoDB
  auto_increment = 10
  default charset = utf8 comment '商品列表表';

alter table goods_list rename to goods_list_orders;


# 创建商店对应的商品列表表
CREATE TABLE goods_list_store
(
    id       int not null auto_increment,
    goods_id int not null comment '商品id',
    store_id int not null comment '订单id',
    size     int not null comment '商品数量',
    primary key (id)
) engine = InnoDB
  auto_increment = 10
  default charset = utf8 comment '商店对应的商品列表表';

#商店表store添加字段商品列表id goods_list_id
alter table store
    add column goods_list_id int not null default 0 comment '商店拥有的商品列表id';

alter table goods rename to commodities;

alter table member rename to members;

alter table store rename to stores;

alter table goods_list_orders rename to commodities_list_orders;

alter table commodities
    add column buy_number int(4) default 1 comment '购买数量';

alter table commodities
    add column price double default 0.00 comment '商品价格';

alter table commodities
    add column create_time DATE comment '上传日期';

create table categories
(
    id           int          not null auto_increment comment '类型id',
    category     varchar(255) not null comment '类型说明',
    commodity_id int          not null comment '商品id',
    primary key (id)
) engine = InnoDB
  auto_increment = 10
  default charset = utf8 comment '分类表';

alter table orders
    add column create_time datetime not null comment '订单创建时间';

alter table orders
    add column status int not null default 1 comment '订单状态：1-待付款，2-代发货，3-待收货，4-待评价';

alter table orders
    add column address varchar(255) not null comment '收货地址';

alter table orders
    drop goods_list_id;

create table orders_commodities_list
(
    id           int    not null auto_increment,
    order_id     int    not null comment '订单id',
    commodity_id int    not null comment '商品id',
    buy_number   int(4) not null default 1 comment '购买数量',
    store_id     int    not null comment '商店id',
    primary key (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 10
  default charset = utf8 comment '订单商品列表';

create table images_commodities
(
    id           int          not null auto_increment,
    commodity_id int          not null comment '商品id',
    img_address  varchar(255) not null default '/images/defaultImages.jpg' comment '商品图片地址',
    primary key (id)
) engine = InnoDB
  auto_increment = 10
  default charset = utf8 comment '商品图片地址表';

alter table stores
    change member_id manager_id int;

alter table stores
    drop goods_list_id;

alter table stores
    add column create_time DATE comment '创建时间';

alter table stores
    add column address varchar(255) comment '商店地址';

alter table stores
    add column email varchar(255) comment '商店联系方式：email';

create table inventories
(
    id           int not null auto_increment,
    store_id     int not null comment '商店id',
    commodity_id int not null comment '商店id',
    amount       int not null default 1 comment '库存数目',
    details      varchar(255) comment '商品详情规格等描述',
    primary key (id)
) engine = InnoDB
  auto_increment = 10
  default charset = utf8 comment '商店商品库存表';

create table images_stores_managers
(
    id          int          not null auto_increment,
    store_id    int comment '商店id',
    img_address varchar(255) not null default '/images/defaultImages.jpg' comment '商店图片地址',
    primary key (id)
) engine = InnoDB
  auto_increment = 10
  default charset = utf8 comment '商店图片地址表';

alter table member_level rename to levels;

alter table levels
    add column rank int(4) not null comment '会员或店员或管理员等级';

alter table levels
    add column role varchar(20) not null comment '等级对应的角色';

alter table levels
    drop detail;

create table managers
(
    id       int          not null auto_increment,
    name     varchar(255) not null comment '管理员名字',
    store_id int          not null comment '所属商店',
    password varchar(255) not null default '123456' comment '登录密码',
    rank     int(4)       not null default 51 comment '管理员权限等级，默认51，普通店员',
    email    varchar(255) comment '联系邮箱',
    phone    int(11) comment '联系电话',
    primary key (id)
) engine = InnoDB
  auto_increment = 10
  default charset = utf8 comment '商店管理员表';

alter table members
    change level_id rank int(4) default 1 comment '会员等级，默认为1普通会员';

create table shopping_cart
(
    id        int not null auto_increment,
    member_id int not null comment '购物车所属会员id',
    primary key (id)
) engine = InnoDB
  auto_increment = 10
  default charset = utf8 comment '购物车表';

alter table shopping_cart rename to shopping_carts;

create table shopping_carts_commodities
(
    id               int    not null auto_increment,
    shopping_cart_id int    not null comment '购物车id',
    commodity_id     int    not null comment '商品id',
    buy_number       int(4) not null default 1 comment '购买数量，默认1',
    store_id         int comment '商品对应的商店id',
    primary key (id)
) engine = InnoDB
  auto_increment = 10
  default charset = utf8 comment '购物车商品列表';

create table orders_members_list
(
    id        int not null auto_increment,
    order_id  int not null comment '订单Id',
    member_id int not null comment '会员id',
    primary key (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 10
  default charset = utf8 comment '会员的全部订单表';

alter table managers
change `rank` rank_info int(4) not null default 51 comment '管理员权限等级，默认51，普通店员';

alter table members
    change `rank` rank_info int(4) default 1 comment '会员等级，默认为1普通会员';
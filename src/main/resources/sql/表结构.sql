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
CREATE TABLE goods(
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL COMMENT '商品名',
    description VARCHAR(255) NOT NULL DEFAULT '商品还未添加描述' COMMENT '商品描述',
    storeId INT NOT NULL DEFAULT 0 COMMENT '所属商店，默认为官方商店id0',
                  PRIMARY KEY (id)
)ENGINE = InnoDB
  AUTO_INCREMENT = 10
  DEFAULT CHARSET = utf8 COMMENT '商品表';


# 修改goods表storeId字段为store_id
ALTER TABLE goods
CHANGE storeId store_id INT NOT NULL DEFAULT 0 COMMENT '所属商店，默认为官方商店id0';

# 创建商店表store
CREATE TABLE store(
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL COMMENT '商店名',
    member_id INT NOT NULL COMMENT '店主id',
    description VARCHAR(255) NOT NULL DEFAULT '商店还没有描述' COMMENT '商店描述',
    PRIMARY KEY (id),
    UNIQUE KEY index_store_name (name)
)ENGINE = InnoDB
  AUTO_INCREMENT = 10
  DEFAULT CHARSET = utf8 COMMENT '商店表';


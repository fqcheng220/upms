-- MySQL Script generated by MySQL Workbench
-- Mon Jun 10 16:37:08 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

-- MySQL Script generated by MySQL Workbench
-- Tue Jan 22 16:48:28 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema db_stone_mall
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `db_stone_mall` ;

-- -----------------------------------------------------
-- Schema db_stone_mall
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_stone_mall` DEFAULT CHARACTER SET utf8 ;
USE `db_stone_mall` ;

-- -----------------------------------------------------
-- Table `db_stone_mall`.`tb_upms_user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_stone_mall`.`tb_upms_user` ;

CREATE TABLE IF NOT EXISTS `db_stone_mall`.`tb_upms_user` (
  `userId` INT NOT NULL AUTO_INCREMENT,
  `userName` VARCHAR(45) NOT NULL UNIQUE,
  `pwd` VARCHAR(45) NOT NULL,
  `realName` VARCHAR(45) NULL,
  `phone` VARCHAR(45) NOT NULL,
  `createTime` DATE NOT NULL,
  PRIMARY KEY (`userId`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_stone_mall`.`tb_upms_role`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_stone_mall`.`tb_upms_role` ;

CREATE TABLE IF NOT EXISTS `db_stone_mall`.`tb_upms_role` (
  `roleId` INT NOT NULL AUTO_INCREMENT,
  `roleName` VARCHAR(45) NOT NULL UNIQUE,
  `createTime` DATE NOT NULL,
  `description` VARCHAR(45) NULL,
  PRIMARY KEY (`roleId`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_stone_mall`.`tb_upms_user_role`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_stone_mall`.`tb_upms_user_role` ;

CREATE TABLE IF NOT EXISTS `db_stone_mall`.`tb_upms_user_role` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `userId` INT NOT NULL,
  `roleId` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY(`userId`,`roleId`),
  INDEX `fk_tb_upms_user_role_tb_upms_user_idx` (`userId` ASC),
  INDEX `fk_tb_upms_user_role_tb_upms_role1_idx` (`roleId` ASC),
  CONSTRAINT `fk_tb_upms_user_role_tb_upms_user`
    FOREIGN KEY (`userId`)
    REFERENCES `db_stone_mall`.`tb_upms_user` (`userId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_upms_user_role_tb_upms_role1`
    FOREIGN KEY (`roleId`)
    REFERENCES `db_stone_mall`.`tb_upms_role` (`roleId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_stone_mall`.`tb_upms_system`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_stone_mall`.`tb_upms_system` ;

CREATE TABLE IF NOT EXISTS `db_stone_mall`.`tb_upms_system` (
  `systemId` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL UNIQUE,
  `description` VARCHAR(200) NULL,
  `status` TINYINT(4) NULL COMMENT '0禁止 1正常',
  `createTime` DATE NOT NULL,
  PRIMARY KEY (`systemId`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_stone_mall`.`tb_upms_permission`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_stone_mall`.`tb_upms_permission` ;

CREATE TABLE IF NOT EXISTS `db_stone_mall`.`tb_upms_permission` (
  `permissionId` INT NOT NULL AUTO_INCREMENT,
  `permissionValue` VARCHAR(45) UNIQUE NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `createTime` DATE NOT NULL,
  `type` TINYINT(4) NULL,
  `status` TINYINT(4) NOT NULL COMMENT '0禁止 1正常',
  `upms_system_systemId` INT NOT NULL,
  PRIMARY KEY (`permissionId`),
  INDEX `fk_tb_upms_permission_upms_system1_idx` (`upms_system_systemId` ASC),
  CONSTRAINT `fk_tb_upms_permission_upms_system1`
    FOREIGN KEY (`upms_system_systemId`)
    REFERENCES `db_stone_mall`.`tb_upms_system` (`systemId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
alter table `db_stone_mall`.`tb_upms_permission` modify `name` VARCHAR(45) character set gbk;


-- -----------------------------------------------------
-- Table `db_stone_mall`.`tb_upms_role_permission`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_stone_mall`.`tb_upms_role_permission` ;

CREATE TABLE IF NOT EXISTS `db_stone_mall`.`tb_upms_role_permission` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `roleId` INT NOT NULL,
  `permissionId` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY(`permissionId`,`roleId`),
  INDEX `fk_tb_upms_permission_has_tb_upms_role_tb_upms_role1_idx` (`roleId` ASC),
  INDEX `fk_tb_upms_permission_has_tb_upms_role_tb_upms_permission1_idx` (`permissionId` ASC),
  CONSTRAINT `fk_tb_upms_permission_has_tb_upms_role_tb_upms_permission1`
    FOREIGN KEY (`permissionId`)
    REFERENCES `db_stone_mall`.`tb_upms_permission` (`permissionId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_upms_permission_has_tb_upms_role_tb_upms_role1`
    FOREIGN KEY (`roleId`)
    REFERENCES `db_stone_mall`.`tb_upms_role` (`roleId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_stone_mall`.`tb_upms_user_permission`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_stone_mall`.`tb_upms_user_permission` ;

CREATE TABLE IF NOT EXISTS `db_stone_mall`.`tb_upms_user_permission` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `userId` INT NOT NULL,
  `permissionId` INT NOT NULL,
  UNIQUE KEY(`userId`,`permissionId`),
  INDEX `fk_tb_upms_user_has_tb_upms_permission_tb_upms_permission1_idx` (`permissionId` ASC),
  INDEX `fk_tb_upms_user_has_tb_upms_permission_tb_upms_user1_idx` (`userId` ASC),
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_tb_upms_user_has_tb_upms_permission_tb_upms_user1`
    FOREIGN KEY (`userId`)
    REFERENCES `db_stone_mall`.`tb_upms_user` (`userId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_upms_user_has_tb_upms_permission_tb_upms_permission1`
    FOREIGN KEY (`permissionId`)
    REFERENCES `db_stone_mall`.`tb_upms_permission` (`permissionId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


insert into tb_upms_user values(1,'test','test','fake nick name','13112345678',20180101);
insert into tb_upms_user values(2,'admin','admin','fake nick name','13112345678',20180101);

insert into tb_upms_role values(1,'general',20180101,'general');
insert into tb_upms_role values(2,'super',20180101,'super');

insert into tb_upms_user_role values(1,1,1);
insert into tb_upms_user_role values(2,2,2);

insert into tb_upms_system values(1,'upms','',1,20180101);

insert into tb_upms_permission values(1,'upms:user:add','增加用户',20180101,0,1,1);
-- insert into tb_upms_permission values(2,'upms:user:add','删除用户',20180101,0,1,1);
-- insert into tb_upms_permission values(3,'upms:user:add','修改用户',20180101,0,1,1);
-- insert into tb_upms_permission values(4,'upms:user:add','查询所有用户',20180101,0,1,1);
-- insert into tb_upms_permission values(5,'upms:user:add','用户登录',20180101,0,1,1);
insert into tb_upms_permission values(2,'upms:user:del','删除用户',20180101,0,1,1);
insert into tb_upms_permission values(3,'upms:user:update','修改用户',20180101,0,1,1);
insert into tb_upms_permission values(4,'upms:user:listall','查询所有用户',20180101,0,1,1);
insert into tb_upms_permission values(5,'upms:user:login','用户登录',20180101,0,1,1);

insert into tb_upms_role_permission values(1,2,1);
insert into tb_upms_role_permission values(2,2,2);
insert into tb_upms_role_permission values(3,2,3);
insert into tb_upms_role_permission values(4,2,4);
insert into tb_upms_role_permission values(5,2,5);
insert into tb_upms_role_permission values(6,1,5);






-- -----------------------------------------------------
-- Table `db_stone_mall`.`tb_product_category`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_stone_mall`.`tb_product_category` ;

CREATE TABLE IF NOT EXISTS `db_stone_mall`.`tb_product_category` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '分类ID',
  `parent_id` BIGINT(20) NOT NULL COMMENT '父分类ID',
  `name` VARCHAR(64) NOT NULL COMMENT '分类名称',
  `sort` INT NULL COMMENT '排序',
  `status` TINYINT(2) NOT NULL DEFAULT 1 COMMENT '状态 1-显示 0-隐藏',
  `type` TINYINT(2) NOT NULL COMMENT '目录类型 2=二级目录/1=一级目录/0=总目录',
  `show_in_nav` TINYINT(2) NULL DEFAULT 0 COMMENT '是否导航栏 1=显示/0=隐藏',
  `show_in_top` TINYINT(2) NULL DEFAULT 0 COMMENT '是否置顶 1=置顶/0=默认',
  `show_in_hot` TINYINT(2) NULL DEFAULT 0 COMMENT '是否热门 1=热门/0=默认',
  `create_time` DATETIME(6) NULL COMMENT '创建时间',
  `create_by` VARCHAR(64) NULL COMMENT '创建者',
  `update_time` DATETIME(6) NULL COMMENT '更新时间',
  `update_by` VARCHAR(64) NULL COMMENT '更新者',
  `page_title` VARCHAR(64) NULL COMMENT '页面标题',
  `page_description` VARCHAR(64) NULL COMMENT '页面描述',
  `Page_keywords` VARCHAR(64) NULL COMMENT '页面关键词',
  `remark` VARCHAR(255) NULL COMMENT '备注信息',
  `icon_url` VARCHAR(255) NULL COMMENT '分类图标',
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_stone_mall`.`tb_product_attr`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_stone_mall`.`tb_product_attr` ;

CREATE TABLE IF NOT EXISTS `db_stone_mall`.`tb_product_attr` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '属性id',
  `name` VARCHAR(45) NOT NULL COMMENT '属性名称',
  `tb_product_category_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY(`tb_product_category_id`,`name`),
  INDEX `fk_tb_product_attr_tb_product_category1_idx` (`tb_product_category_id` ASC),
  CONSTRAINT `fk_tb_product_attr_tb_product_category1`
    FOREIGN KEY (`tb_product_category_id`)
    REFERENCES `db_stone_mall`.`tb_product_category` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_stone_mall`.`tb_product_attr_value`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_stone_mall`.`tb_product_attr_value` ;

CREATE TABLE IF NOT EXISTS `db_stone_mall`.`tb_product_attr_value` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '属性值id',
  `value` VARCHAR(64) NOT NULL COMMENT '属性值',
  `tb_product_attr_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY(`tb_product_attr_id`,`value`),
  INDEX `fk_tb_product_attr_value_tb_product_attr1_idx` (`tb_product_attr_id` ASC),
  CONSTRAINT `fk_tb_product_attr_value_tb_product_attr1`
    FOREIGN KEY (`tb_product_attr_id`)
    REFERENCES `db_stone_mall`.`tb_product_attr` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_stone_mall`.`tb_product_spec`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_stone_mall`.`tb_product_spec` ;

CREATE TABLE IF NOT EXISTS `db_stone_mall`.`tb_product_spec` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '规格id',
  `name` VARCHAR(45) NOT NULL COMMENT '规格名称',
  `tb_product_category_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY(`tb_product_category_id`,`name`),
  INDEX `fk_tb_product_spec_tb_product_category1_idx` (`tb_product_category_id` ASC),
  CONSTRAINT `fk_tb_product_spec_tb_product_category1`
    FOREIGN KEY (`tb_product_category_id`)
    REFERENCES `db_stone_mall`.`tb_product_category` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_stone_mall`.`tb_product_spec_value`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_stone_mall`.`tb_product_spec_value` ;

CREATE TABLE IF NOT EXISTS `db_stone_mall`.`tb_product_spec_value` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '规格值id',
  `value` VARCHAR(45) NOT NULL COMMENT '规格值',
  `tb_product_spec_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY(`tb_product_spec_id`,`value`),
  INDEX `fk_tb_product_spec_value_tb_product_spec1_idx` (`tb_product_spec_id` ASC),
  CONSTRAINT `fk_tb_product_spec_value_tb_product_spec1`
    FOREIGN KEY (`tb_product_spec_id`)
    REFERENCES `db_stone_mall`.`tb_product_spec` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_stone_mall`.`tb_product_brand`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_stone_mall`.`tb_product_brand` ;

CREATE TABLE IF NOT EXISTS `db_stone_mall`.`tb_product_brand` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '品牌id',
  `name` VARCHAR(45) NULL COMMENT '品牌名称',
  `descrption` VARCHAR(255) NULL COMMENT '品牌描述',
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_stone_mall`.`tb_product_spu`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_stone_mall`.`tb_product_spu` ;

CREATE TABLE IF NOT EXISTS `db_stone_mall`.`tb_product_spu` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `number` VARCHAR(64) NULL COMMENT 'spu编号',
  `spuName` VARCHAR(64) NULL COMMENT '货品名称',
  `introduce` VARCHAR(64) NULL COMMENT '货品简介',
  `show_in_shelve` TINYINT(2) NULL DEFAULT 0 COMMENT '是否上架：1=上架/0=下架',
  `shelve_time` DATETIME(6) NULL COMMENT '上架时间',
  `shelve_by` VARCHAR(45) NULL COMMENT '上架人',
  `update_time` DATETIME(6) NULL COMMENT '更新时间',
  `update_by` VARCHAR(45) NULL COMMENT '更新者',
  `show_in_top` TINYINT(2) NULL DEFAULT 0 COMMENT '是否置顶 1=置顶/0=默认',
  `show_in_nav` TINYINT(2) NULL DEFAULT 0 COMMENT '是否导航栏 1=显示/0=隐藏',
  `show_in_hot` TINYINT(2) NULL DEFAULT 0 COMMENT '是否热门 1=热门/0=默认',
  `create_time` DATETIME(6) NULL COMMENT '创建时间',
  `create_by` VARCHAR(45) NULL COMMENT '创建者',
  `video_introduce` VARCHAR(255) NULL COMMENT '视频介绍',
  `search_key` VARCHAR(255) NULL COMMENT '搜索关键词',
  `tb_product_category_id` BIGINT(20) NOT NULL,
  `tb_product_brand_id` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_tb_product_spu_tb_product_category1_idx` (`tb_product_category_id` ASC),
  INDEX `fk_tb_product_spu_tb_product_brand1_idx` (`tb_product_brand_id` ASC),
  CONSTRAINT `fk_tb_product_spu_tb_product_category1`
    FOREIGN KEY (`tb_product_category_id`)
    REFERENCES `db_stone_mall`.`tb_product_category` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_product_spu_tb_product_brand1`
    FOREIGN KEY (`tb_product_brand_id`)
    REFERENCES `db_stone_mall`.`tb_product_brand` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_stone_mall`.`tb_product_sku`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_stone_mall`.`tb_product_sku` ;

CREATE TABLE IF NOT EXISTS `db_stone_mall`.`tb_product_sku` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `number` VARCHAR(64) NULL COMMENT 'sku编号',
  `name` VARCHAR(64) NULL COMMENT '商品名称',
  `introduce` VARCHAR(64) NULL COMMENT '商品简介',
  `show_in_shelve` TINYINT(2) NULL DEFAULT 0 COMMENT '是否上架：1=上架/0=下架',
  `shelve_time` DATETIME(6) NULL COMMENT '上架时间',
  `shelve_by` VARCHAR(45) NULL COMMENT '上架人',
  `update_time` DATETIME(6) NULL COMMENT '更新时间',
  `update_by` VARCHAR(45) NULL COMMENT '更新者',
  `show_in_top` TINYINT(2) NULL DEFAULT 0 COMMENT '是否置顶 1=置顶/0=默认',
  `show_in_nav` TINYINT(2) NULL DEFAULT 0 COMMENT '是否导航栏 1=显示/0=隐藏',
  `show_in_hot` TINYINT(2) NULL DEFAULT 0 COMMENT '是否热门 1=热门/0=默认',
  `create_time` DATETIME(6) NULL COMMENT '创建时间',
  `create_by` VARCHAR(45) NULL COMMENT '创建者',
  `pic_image` VARCHAR(255) NULL COMMENT '展示图片',
  `search_key` VARCHAR(255) NULL COMMENT '搜索关键词',
  `price` DECIMAL(10,2) NULL COMMENT '价格',
  `stock` INT NULL COMMENT '库存',
  `tb_product_spu_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_tb_product_sku_tb_product_spu1_idx` (`tb_product_spu_id` ASC),
  CONSTRAINT `fk_tb_product_sku_tb_product_spu1`
    FOREIGN KEY (`tb_product_spu_id`)
    REFERENCES `db_stone_mall`.`tb_product_spu` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_stone_mall`.`tb_product_sku_attr_value`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_stone_mall`.`tb_product_sku_attr_value` ;

CREATE TABLE IF NOT EXISTS `db_stone_mall`.`tb_product_sku_attr_value` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `tb_product_attr_id` INT NOT NULL,
  `tb_product_attr_value_id` INT NOT NULL,
  `tb_product_sku_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_tb_product_sku_attr_value_tb_product_attr_idx` (`tb_product_attr_id` ASC),
  INDEX `fk_tb_product_sku_attr_value_tb_product_attr_value1_idx` (`tb_product_attr_value_id` ASC),
  INDEX `fk_tb_product_sku_attr_value_tb_product_sku1_idx` (`tb_product_sku_id` ASC),
  CONSTRAINT UNIQUE (tb_product_attr_id,tb_product_sku_id),
  CONSTRAINT `fk_tb_product_sku_attr_value_tb_product_attr`
    FOREIGN KEY (`tb_product_attr_id`)
    REFERENCES `db_stone_mall`.`tb_product_attr` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_product_sku_attr_value_tb_product_attr_value`
    FOREIGN KEY (`tb_product_attr_value_id`)
    REFERENCES `db_stone_mall`.`tb_product_attr_value` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_product_sku_attr_value_tb_product_sku1`
    FOREIGN KEY (`tb_product_sku_id`)
    REFERENCES `db_stone_mall`.`tb_product_sku` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_stone_mall`.`tb_product_sku_spec_value`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_stone_mall`.`tb_product_sku_spec_value` ;

CREATE TABLE IF NOT EXISTS `db_stone_mall`.`tb_product_sku_spec_value` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `tb_product_spec_id` INT NOT NULL,
  `tb_product_spec_value_id` INT NOT NULL,
  `tb_product_sku_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_tb_product_sku_spec_value_tb_product_spec_idx` (`tb_product_spec_id` ASC),
  INDEX `fk_tb_product_sku_spec_value_tb_product_spec_value1_idx` (`tb_product_spec_value_id` ASC),
  INDEX `fk_tb_product_sku_spec_value_tb_product_sku1_idx` (`tb_product_sku_id` ASC),
  CONSTRAINT UNIQUE (tb_product_spec_id,tb_product_sku_id),
  CONSTRAINT `fk_tb_product_sku_spec_value_tb_product_spec_id`
    FOREIGN KEY (`tb_product_spec_id`)
    REFERENCES `db_stone_mall`.`tb_product_spec` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_product_sku_spec_value_tb_product_spec_value1`
    FOREIGN KEY (`tb_product_spec_value_id`)
    REFERENCES `db_stone_mall`.`tb_product_spec_value` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_product_sku_spec_value_tb_product_sku1`
    FOREIGN KEY (`tb_product_sku_id`)
    REFERENCES `db_stone_mall`.`tb_product_sku` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_stone_mall`.`tb_product_spu_img`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_stone_mall`.`tb_product_spu_img` ;

CREATE TABLE IF NOT EXISTS `db_stone_mall`.`tb_product_spu_img` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'spu图片id',
  `path` VARCHAR(255) NULL COMMENT 'spu图片路径',
  `sort` INT NULL COMMENT 'spu图片排序',
  `statue` TINYINT(2) NULL COMMENT 'spu图片状态',
  `tb_product_spu_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_tb_product_spu_img_tb_product_spu1_idx` (`tb_product_spu_id` ASC),
  CONSTRAINT `fk_tb_product_spu_img_tb_product_spu1`
    FOREIGN KEY (`tb_product_spu_id`)
    REFERENCES `db_stone_mall`.`tb_product_spu` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- 自增id默认从1开始 如果设置为0 则表示自增
-- INSERT INTO `tb_product_category` VALUES ('0', '0', '全部商品', null, '0', '1', '0', '0', '0', '2017-02-25 21:44:43', 'test', '2017-02-25 21:44:48', 'test', '全部商品', null, null, null, null);
INSERT INTO `tb_product_category` VALUES ('0', '0', '手机数码', null, '1', '1', '0', '0', '0', '2017-02-25 21:44:43', 'test', '2017-02-25 21:44:48', 'test', '全部商品', null, null, null, null);
INSERT INTO `tb_product_category` VALUES ('0', '0', '食品生鲜', null, '1', '1', '0', '0', '0', '2017-02-25 21:44:43', 'test', '2017-02-25 21:44:48', 'test', '全部商品', null, null, null, null);
INSERT INTO `tb_product_category` VALUES ('0', '0', '母婴童装', null, '1', '1', '0', '0', '0', '2017-02-25 21:44:43', 'test', '2017-02-25 21:44:48', 'test', '全部商品', null, null, null, null);
INSERT INTO `tb_product_category` VALUES ('0', '0', '家居厨具', null, '1', '1', '0', '0', '0', '2017-02-25 21:44:43', 'test', '2017-02-25 21:44:48', 'test', '全部商品', null, null, null, null);
INSERT INTO `tb_product_category` VALUES ('0', '0', '女装', null, '1', '1', '0', '0', '0', '2017-02-25 21:44:43', 'test', '2017-02-25 21:44:48', 'test', '全部商品', null, null, null, null);

INSERT INTO `tb_product_category` VALUES ('0', '1', '手机', null, '1', '2', '0', '0', '0', '2017-02-25 21:44:43', 'test', '2017-02-25 21:44:48', 'test', '全部商品', null, null, null, null);
INSERT INTO `tb_product_category` VALUES ('0', '1', '运营商', null, '1', '2', '0', '0', '0', '2017-02-25 21:44:43', 'test', '2017-02-25 21:44:48', 'test', '全部商品', null, null, null, null);
INSERT INTO `tb_product_category` VALUES ('0', '1', '摄影摄像', null, '1', '2', '0', '0', '0', '2017-02-25 21:44:43', 'test', '2017-02-25 21:44:48', 'test', '全部商品', null, null, null, null);
INSERT INTO `tb_product_category` VALUES ('0', '1', '影音娱乐', null, '1', '2', '0', '0', '0', '2017-02-25 21:44:43', 'test', '2017-02-25 21:44:48', 'test', '全部商品', null, null, null, null);

INSERT INTO `tb_product_category` VALUES ('0', '3', '童装', null, '1', '2', '0', '0', '0', '2017-02-25 21:44:43', 'test', '2017-02-25 21:44:48', 'test', '全部商品', null, null, null, null);
INSERT INTO `tb_product_category` VALUES ('0', '3', '童鞋', null, '1', '2', '0', '0', '0', '2017-02-25 21:44:43', 'test', '2017-02-25 21:44:48', 'test', '全部商品', null, null, null, null);
INSERT INTO `tb_product_category` VALUES ('0', '3', '妈妈专区', null, '1', '2', '0', '0', '0', '2017-02-25 21:44:43', 'test', '2017-02-25 21:44:48', 'test', '全部商品', null, null, null, null);

INSERT INTO `tb_product_category` VALUES ('0', '5', '裙装', null, '1', '2', '0', '0', '0', '2017-02-25 21:44:43', 'test', '2017-02-25 21:44:48', 'test', '全部商品', null, null, null, null);
INSERT INTO `tb_product_category` VALUES ('0', '5', '女士小装', null, '1', '2', '0', '0', '0', '2017-02-25 21:44:43', 'test', '2017-02-25 21:44:48', 'test', '全部商品', null, null, null, null);
INSERT INTO `tb_product_category` VALUES ('0', '5', '外套', null, '1', '2', '0', '0', '0', '2017-02-25 21:44:43', 'test', '2017-02-25 21:44:48', 'test', '全部商品', null, null, null, null);

INSERT INTO `tb_product_category` VALUES ('0', '15', '防晒衫', null, '1', '3', '0', '0', '0', '2017-02-25 21:44:43', 'test', '2017-02-25 21:44:48', 'test', '全部商品', null, null, null, null);
INSERT INTO `tb_product_category` VALUES ('0', '15', '薄外套', null, '1', '3', '0', '0', '0', '2017-02-25 21:44:43', 'test', '2017-02-25 21:44:48', 'test', '全部商品', null, null, null, null);
INSERT INTO `tb_product_category` VALUES ('0', '15', '披肩外套', null, '1', '3', '0', '0', '0', '2017-02-25 21:44:43', 'test', '2017-02-25 21:44:48', 'test', '全部商品', null, null, null, null);

INSERT INTO `tb_product_attr` VALUES ('0', '衣长', '17');
INSERT INTO `tb_product_attr` VALUES ('0', '版型', '17');
INSERT INTO `tb_product_attr` VALUES ('0', '风格', '17');
INSERT INTO `tb_product_attr` VALUES ('0', '材质', '17');
INSERT INTO `tb_product_attr` VALUES ('0', '流行元素', '17');
INSERT INTO `tb_product_attr` VALUES ('0', '上市时间', '17');

INSERT INTO `tb_product_attr_value` VALUES ('0', '超长款', '1');
INSERT INTO `tb_product_attr_value` VALUES ('0', '中长款', '1');
INSERT INTO `tb_product_attr_value` VALUES ('0', '长款', '1');
INSERT INTO `tb_product_attr_value` VALUES ('0', '短款', '1');
INSERT INTO `tb_product_attr_value` VALUES ('0', '超短款', '1');
INSERT INTO `tb_product_attr_value` VALUES ('0', '常规款', '1');

INSERT INTO `tb_product_attr_value` VALUES ('0', '露肩型', '2');
INSERT INTO `tb_product_attr_value` VALUES ('0', '直筒型', '2');
INSERT INTO `tb_product_attr_value` VALUES ('0', '修身型', '2');

INSERT INTO `tb_product_spec` VALUES ('0', '尺码', '17');
INSERT INTO `tb_product_spec` VALUES ('0', '颜色', '17');
INSERT INTO `tb_product_spec` VALUES ('0', '主要材质', '17');
INSERT INTO `tb_product_spec` VALUES ('0', '领袖', '17');

INSERT INTO `tb_product_spec_value` VALUES ('0', 'S', '1');
INSERT INTO `tb_product_spec_value` VALUES ('0', 'M', '1');
INSERT INTO `tb_product_spec_value` VALUES ('0', 'L', '1');
INSERT INTO `tb_product_spec_value` VALUES ('0', 'XL', '1');

INSERT INTO `tb_product_spec_value` VALUES ('0', '灰色', '2');
INSERT INTO `tb_product_spec_value` VALUES ('0', '白色', '2');
INSERT INTO `tb_product_spec_value` VALUES ('0', '黑色', '2');

INSERT INTO `tb_product_brand` VALUES ('0', 'Lily', '');
INSERT INTO `tb_product_brand` VALUES ('0', 'Gucci', '');

INSERT INTO `tb_product_spu` VALUES ('0', '1234567', '普通薄外套女',null,null,null,null,null,null,null,null,null,null,null,'https://vod.300hu.com/4c1f7a6atransbjngwcloud1oss/27f3dfef133596732532994049/v.f30.mp4?dockingId=3790b700-2f59-47d0-add4-2c9bc2846fca&storageSource=3',null,'17','1');
INSERT INTO `tb_product_spu` VALUES ('0', '1234567', '披肩外套SPU',null,null,null,null,null,null,null,null,null,null,null,'https://vod.300hu.com/4c1f7a6atransbjngwcloud1oss/27f3dfef133596732532994049/v.f30.mp4?dockingId=3790b700-2f59-47d0-add4-2c9bc2846fca&storageSource=3',null,'18','1');

INSERT INTO `tb_product_sku` VALUES ('0', '1234567', '普通薄外套女sku0',null,null,null,null,null,null,null,null,null,null,null,null,null,'160.00','20','1');
INSERT INTO `tb_product_sku` VALUES ('0', '1234567', '普通薄外套女sku1',null,null,null,null,null,null,null,null,null,null,null,null,null,'160.00','20','1');
INSERT INTO `tb_product_sku` VALUES ('0', '1234567', '普通薄外套女sku2',null,null,null,null,null,null,null,null,null,null,null,null,null,'160.00','20','1');

INSERT INTO `tb_product_sku_attr_value` VALUES ('0', '2', '8','1');
INSERT INTO `tb_product_sku_attr_value` VALUES ('0', '1', '1','1');

INSERT INTO `tb_product_sku_spec_value` VALUES ('0', '1', '1','1');
INSERT INTO `tb_product_sku_spec_value` VALUES ('0', '2', '6','1');

INSERT INTO `tb_product_spu_img` VALUES ('0', 'https://m.360buyimg.com/mobilecms/s1080x1080_jfs/t1/162/4/3727/83121/5b997bffEa033f072/d0ef923444593847.jpg!q70.jpg.webp',1,null,'1');
INSERT INTO `tb_product_spu_img` VALUES ('0', 'https://m.360buyimg.com/mobilecms/s1080x1080_jfs/t1/160/24/3733/77954/5b997bffE0045db72/b5fe450b7a45a3c8.jpg!q70.jpg.webp',2,null,'1');
INSERT INTO `tb_product_spu_img` VALUES ('0', 'https://m.360buyimg.com/mobilecms/s1080x1080_jfs/t1/26335/31/3391/75469/5c26e046Eb124a92f/ee4b443eb43c5097.jpg!q70.jpg.webp',3,null,'1');
INSERT INTO `tb_product_spu_img` VALUES ('0', 'https://test5',5,null,'1');
INSERT INTO `tb_product_spu_img` VALUES ('0', 'https://test4',4,null,'1');
INSERT INTO `tb_product_spu_img` VALUES ('0', 'https://test6',null,null,'2');

/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : db_leopard

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 24/07/2019 21:50:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for raw_abc_record
-- ----------------------------
DROP TABLE IF EXISTS `raw_abc_record`;
CREATE TABLE `raw_abc_record` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `amount` varchar(255) DEFAULT NULL,
  `balance` double DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `other_party_account` varchar(255) DEFAULT NULL,
  `other_party_name` varchar(255) DEFAULT NULL,
  `trans_bank` varchar(255) DEFAULT NULL,
  `trans_channel` varchar(255) DEFAULT NULL,
  `trans_date` varchar(255) DEFAULT NULL,
  `trans_summary` varchar(255) DEFAULT NULL,
  `trans_time` varchar(255) DEFAULT NULL,
  `trans_use` varchar(255) DEFAULT NULL,
  `trans_way` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=63 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for raw_alipay_record
-- ----------------------------
DROP TABLE IF EXISTS `raw_alipay_record`;
CREATE TABLE `raw_alipay_record` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `amount` bigint(20) DEFAULT NULL,
  `business_order_num` varchar(255) DEFAULT NULL,
  `fund_status` varchar(255) DEFAULT NULL,
  `memo` varchar(255) DEFAULT NULL,
  `order_create_time` datetime DEFAULT NULL,
  `pay_time` datetime DEFAULT NULL,
  `product_name` varchar(255) DEFAULT NULL,
  `recently_update_time` datetime DEFAULT NULL,
  `refund` bigint(20) DEFAULT NULL,
  `service_fee` bigint(20) DEFAULT NULL,
  `trading_partner` varchar(255) DEFAULT NULL,
  `transaction_num` varchar(255) DEFAULT NULL,
  `transaction_source` varchar(255) DEFAULT NULL,
  `transaction_status` varchar(255) DEFAULT NULL,
  `transaction_type` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4101 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for raw_boc_csv_export
-- ----------------------------
DROP TABLE IF EXISTS `raw_boc_csv_export`;
CREATE TABLE `raw_boc_csv_export` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `balance` bigint(20) DEFAULT NULL,
  `banknote` varchar(255) DEFAULT NULL,
  `branches` varchar(255) DEFAULT NULL,
  `business_summary` varchar(255) DEFAULT NULL,
  `currency` varchar(255) DEFAULT NULL,
  `income` bigint(20) DEFAULT NULL,
  `other_party_account` varchar(255) DEFAULT NULL,
  `other_party_name` varchar(255) DEFAULT NULL,
  `pay_way` varchar(255) DEFAULT NULL,
  `payout` bigint(20) DEFAULT NULL,
  `postscript` varchar(255) DEFAULT NULL,
  `trans_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=110 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for raw_boc_csv_new
-- ----------------------------
DROP TABLE IF EXISTS `raw_boc_csv_new`;
CREATE TABLE `raw_boc_csv_new` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `balance` bigint(20) DEFAULT NULL,
  `banknote` varchar(255) DEFAULT NULL,
  `business_summary` varchar(255) DEFAULT NULL,
  `currency` varchar(255) DEFAULT NULL,
  `income` bigint(20) DEFAULT NULL,
  `other_party_account` varchar(255) DEFAULT NULL,
  `other_party_name` varchar(255) DEFAULT NULL,
  `pay_way` varchar(255) DEFAULT NULL,
  `payout` bigint(20) DEFAULT NULL,
  `postscript` varchar(255) DEFAULT NULL,
  `trans_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=188 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for raw_boc_csv_old
-- ----------------------------
DROP TABLE IF EXISTS `raw_boc_csv_old`;
CREATE TABLE `raw_boc_csv_old` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `amount` bigint(20) DEFAULT NULL,
  `balance` bigint(20) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `other_party_account` varchar(255) DEFAULT NULL,
  `trans_date` date DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=325 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for raw_cmb_credit_record
-- ----------------------------
DROP TABLE IF EXISTS `raw_cmb_credit_record`;
CREATE TABLE `raw_cmb_credit_record` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `amount` bigint(20) DEFAULT NULL,
  `area` varchar(255) DEFAULT NULL,
  `bookkeeping_day` date DEFAULT NULL,
  `card_num` varchar(255) DEFAULT NULL,
  `original_trans_amount` bigint(20) DEFAULT NULL,
  `summary` varchar(255) DEFAULT NULL,
  `trading_day` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=495 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for raw_cmb_debit_record
-- ----------------------------
DROP TABLE IF EXISTS `raw_cmb_debit_record`;
CREATE TABLE `raw_cmb_debit_record` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `balance` bigint(20) DEFAULT NULL,
  `income` bigint(20) DEFAULT NULL,
  `memo` varchar(255) DEFAULT NULL,
  `payout` bigint(20) DEFAULT NULL,
  `trans_date` date DEFAULT NULL,
  `trans_time` time DEFAULT NULL,
  `trans_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=118 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for raw_cmb_debit_record_old
-- ----------------------------
DROP TABLE IF EXISTS `raw_cmb_debit_record_old`;
CREATE TABLE `raw_cmb_debit_record_old` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `balance` bigint(20) DEFAULT NULL,
  `currency` varchar(255) DEFAULT NULL,
  `other_party_info` varchar(255) DEFAULT NULL,
  `trans_amount` bigint(20) DEFAULT NULL,
  `trans_date` date DEFAULT NULL,
  `trans_summary` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=118 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for raw_icbc_record
-- ----------------------------
DROP TABLE IF EXISTS `raw_icbc_record`;
CREATE TABLE `raw_icbc_record` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `balance` bigint(20) DEFAULT NULL,
  `banknote` varchar(255) DEFAULT NULL,
  `bill_currency` varchar(255) DEFAULT NULL,
  `bill_income` bigint(20) DEFAULT NULL,
  `bill_payout` bigint(20) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `currency` varchar(255) DEFAULT NULL,
  `income` bigint(20) DEFAULT NULL,
  `other_party_name` varchar(255) DEFAULT NULL,
  `payout` bigint(20) DEFAULT NULL,
  `places` varchar(255) DEFAULT NULL,
  `summary` varchar(255) DEFAULT NULL,
  `trans_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=270 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for raw_wechat_record
-- ----------------------------
DROP TABLE IF EXISTS `raw_wechat_record`;
CREATE TABLE `raw_wechat_record` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `amount` bigint(20) DEFAULT NULL,
  `memo` varchar(255) DEFAULT NULL,
  `now_status` varchar(255) DEFAULT NULL,
  `order_num` varchar(255) DEFAULT NULL,
  `pay_type` varchar(255) DEFAULT NULL,
  `payment_type` varchar(255) DEFAULT NULL,
  `product` varchar(255) DEFAULT NULL,
  `tarns_num` varchar(255) DEFAULT NULL,
  `trans_partner` varchar(255) DEFAULT NULL,
  `trans_time` datetime DEFAULT NULL,
  `trans_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1153673526108049410 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for std_account
-- ----------------------------
DROP TABLE IF EXISTS `std_account`;
CREATE TABLE `std_account` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `is_deleted` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1154023542706147331 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for std_consume_record
-- ----------------------------
DROP TABLE IF EXISTS `std_consume_record`;
CREATE TABLE `std_consume_record` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `amount` bigint(20) DEFAULT NULL,
  `pay_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

SET FOREIGN_KEY_CHECKS = 1;

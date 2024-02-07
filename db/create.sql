create table tbl_member
(
    memb_code  int auto_increment comment '회원 코드'
        primary key,
    memb_name  varchar(100) null comment '이름',
    memb_phone char(11)     null comment '연락처',
    memb_id    varchar(255) null comment '회원 아이디',
    memb_pass  varchar(255) null comment '비밀번호'
)
    comment '회원 정보';

create table tbl_facility
(
    facility_code  int auto_increment comment '시설 코드'
        primary key,
    facility_kind  varchar(255) not null comment '시설 종류',
    facility_info  varchar(255) null comment '상세정보',
    facility_guide varchar(255) null comment '이용안내',
    facility_price int          not null comment '가격'
)
    comment '목욕 시설';



create table tbl_payment
(
    pay_code  int auto_increment comment '결제 코드'
        primary key,
    pay_kind  varchar(255) null comment '결제수단',
    pay_date  datetime     null comment '결제일시',
    memb_code int          not null comment '회원 코드'
)
    comment '결제';

create table tbl_use
(
    use_code      int auto_increment comment '사용 코드'
        primary key,
    use_date      varchar(100) not null comment '사용 날짜',
    pay_code      int          not null comment '결제 코드',
    facility_code int          not null comment '시설 코드'
)
    comment '목욕 시설 사용 관리';


ALTER TABLE `tbl_payment`
    ADD CONSTRAINT `tbl_payment_FK` FOREIGN KEY ( `memb_code` )
        REFERENCES `tbl_member` (`memb_code` );


ALTER TABLE `tbl_use`
    ADD CONSTRAINT `tbl_use_FK` FOREIGN KEY ( `pay_code` )
        REFERENCES `tbl_payment` (`pay_code` );

ALTER TABLE `tbl_use`
    ADD CONSTRAINT `tbl_use_FK1` FOREIGN KEY ( `facility_code` )
        REFERENCES `tbl_facility` (`facility_code` );



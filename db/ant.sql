/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/12/12 8:49:57                           */
/*==============================================================*/


drop table if exists activity_information;

drop table if exists activity_score;

drop table if exists activity_sum;

drop table if exists basic_score;

drop table if exists class_information;

drop table if exists college_information;

drop table if exists monitor_user;

drop table if exists organization_user;

drop table if exists profession_information;

drop table if exists student_comprehensive;

drop table if exists student_join;

drop table if exists student_scan;

drop table if exists student_user;

/*==============================================================*/
/* Table: activity_information                                  */
/*==============================================================*/
create table activity_information
(
   id                   int not null auto_increment,
   name                 varchar(30),
   description          varchar(1000),
   organization_id      int,
   level                varchar(10),
   apply_begin          datetime,
   apply_end            datetime,
   hold_begin           datetime,
   hold_end             datetime,
   hold_place           varchar(50),
   style                varchar(6),
   participant          varchar(30),
   image                varchar(20),
   search_type          varchar(10),
   comprehensive_type   varchar(10),
   is_interview         char(2),
   student_number       int,
   primary key (id)
);

alter table activity_information comment '活动详情表';

/*==============================================================*/
/* Table: activity_score                                        */
/*==============================================================*/
create table activity_score
(
   id                   int not null auto_increment,
   activity_id          int,
   stage                varchar(10),
   score                float,
   primary key (id)
);

alter table activity_score comment '活动阶段分值表';

/*==============================================================*/
/* Table: activity_sum                                          */
/*==============================================================*/
create table activity_sum
(
   id                   int not null auto_increment,
   student_id           int,
   activity_name        varchar(30),
   year                 varchar(10),
   score                float,
   type                 varchar(10),
   primary key (id)
);

alter table activity_sum comment '活动汇总表';

/*==============================================================*/
/* Table: basic_score                                           */
/*==============================================================*/
create table basic_score
(
   student_id           char(10) not null,
   student_name         varchar(20),
   study_score          float,
   moral_score          float,
   primary key (student_id)
);

alter table basic_score comment '学业品德表现表';

/*==============================================================*/
/* Table: class_information                                     */
/*==============================================================*/
create table class_information
(
   class_id             int not null auto_increment,
   profession_id        int,
   grade                varchar(6),
   my_class             varchar(6),
   primary key (class_id)
);

alter table class_information comment '班级信息表';

/*==============================================================*/
/* Table: college_information                                   */
/*==============================================================*/
create table college_information
(
   college_id           int not null auto_increment,
   name                 varchar(30),
   primary key (college_id)
);

alter table college_information comment '学院信息表';

/*==============================================================*/
/* Table: monitor_user                                          */
/*==============================================================*/
create table monitor_user
(
   email                varchar(30) not null,
   password             varchar(30),
   class_id             int,
   primary key (email)
);

alter table monitor_user comment '班委信息表';

/*==============================================================*/
/* Table: organization_user                                     */
/*==============================================================*/
create table organization_user
(
   organization_id      int not null auto_increment,
   email                varchar(30),
   password             varchar(30),
   name                 varchar(60),
   primary key (organization_id)
);

alter table organization_user comment '组织信息表';

/*==============================================================*/
/* Table: profession_information                                */
/*==============================================================*/
create table profession_information
(
   profession_id        int not null auto_increment,
   name                 varchar(30),
   college_id           int,
   primary key (profession_id)
);

alter table profession_information comment '专业信息表';

/*==============================================================*/
/* Table: student_comprehensive                                 */
/*==============================================================*/
create table student_comprehensive
(
   student_id           int not null,
   score                float,
   primary key (student_id)
);

alter table student_comprehensive comment '综测表';

/*==============================================================*/
/* Table: student_join                                          */
/*==============================================================*/
create table student_join
(
   id                   int not null auto_increment,
   student_id           char(10),
   score_id             int,
   team_name            varchar(20),
   primary key (id)
);

alter table student_join comment '参赛表';

/*==============================================================*/
/* Table: student_scan                                          */
/*==============================================================*/
create table student_scan
(
   id                   int not null auto_increment,
   student_id           char(10),
   activity_id          int,
   primary key (id)
);

alter table student_scan comment '浏览过的活动表';

/*==============================================================*/
/* Table: student_user                                          */
/*==============================================================*/
create table student_user
(
   id                   char(10) not null,
   password             varchar(30),
   name                 varchar(20),
   gender               char(2),
   email                varchar(30),
   class_id             int,
   primary key (id)
);

alter table student_user comment '学生个人表';


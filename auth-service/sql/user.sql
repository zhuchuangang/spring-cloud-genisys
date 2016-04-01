#用户表
#drop table users;
create table users (
  id int auto_increment primary key,
  username varchar(100),#用户名
  name varchar(100),#姓名
  password varchar(100),#密码
  phone varchar(20),#电话
  enabled int default 1,#是否锁定账号
  deleted int default 0,#是否删除
  date_created datetime,#创建时间
  last_updated datetime #更新时间
);
create unique index idx_users_username on users(username);

#角色表
#drop table roles;
create table roles (
  id int auto_increment primary key,
  role varchar(100),#角色名称
  description varchar(100),#描述
  enabled int default 1,#是否可用
  deleted int default 0,#是否删除
  date_created datetime,#创建时间
  last_updated datetime #更新时间
);
create unique index idx_roles_role on roles(role);

#权限表
#drop table authorities;
create table authorities (
  id int auto_increment primary key,
  authority varchar(100),#权限名称
  description varchar(100),#描述
  enabled int default 1,#是否可用
  deleted int default 0,#是否删除
  date_created datetime,#创建时间
  last_updated datetime #更新时间
);
create unique index idx_authorities_authority on authorities(authority);

#资源表
#drop table resources;
create table resources(
  id int auto_increment primary key,
  resource varchar(100),#资源名称
  path varchar(200),#资源路径
  type varchar(10), #资源类型  api/page
  navigation_item int,#如果资源是page,它是否是导航菜单,api默认为false
  navigation_root int,#如果资源是page,它是否是导航根菜单,api默认为false
  navigation_no int,#导航显示顺序
  navigation_icon varchar(100),#导航图标
  parent_id int,#如果资源是page,它的上级page的资源ID
  description varchar(100),#描述
  enabled int default 0,#是否可用
  deleted int default 0,#是否删除
  date_created datetime,#创建时间
  last_updated datetime #更新时间
);

#用户角色关联表
#drop table users_has_roles;
create table users_has_roles (
  user_id int,
  role_id int,
  constraint pk_users_has_roles primary key(user_id, role_id)
);

#角色权限关联表
#drop table roles_has_authorities;
create table roles_has_authorities (
  role_id int,
  authority_id int,
  constraint pk_roles_has_authorities primary key(role_id, authority_id)
);

#权限和资源关联表
#drop table authorities_has_resources;
create table authorities_has_resources (
  authority_id int,
  resource_id int,
  constraint pk_authorities_has_resources primary key(authority_id, resource_id)
);

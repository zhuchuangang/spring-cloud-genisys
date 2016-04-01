insert into users(username, name, password, enabled, deleted, date_created)
values('admin','管理员','d9e5ee0a526fd7c84b5372c18592cf06d5350481f9ddd03d826c368910014637d4b6abefc1daadb1',1,0,now());

insert into roles(role, description, enabled, deleted, date_created)
values('ADMIN','管理员角色',1,0,now());

insert into authorities(authority, description, enabled, deleted, date_created)
values('settings.users.page','用户设置页面',1,0,now());


insert into resources(resource, path, type, navigation_item,navigation_root,navigation_no, navigation_icon, parent_id, description, enabled, deleted, date_created)
values('系统设置',null,'page',1,1,1,'icon-folder-close-alt',null,'系统设置',1,0,now());
insert into resources(resource, path, type, navigation_item,navigation_root,navigation_no, navigation_icon, parent_id, description, enabled, deleted, date_created)
values('用户设置','/settings/user','page',1,1,1,'icon-user',1,'用户设置主页面',1,0,now());

insert into users_has_roles(user_id, role_id) values(1,1);
insert into roles_has_authorities(role_id, authority_id) values(1,1);
insert into authorities_has_resources(authority_id, resource_id) values(1,1);
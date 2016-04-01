insert into oauth_client_details(client_id, resource_ids, client_secret, scope, authorized_grant_types,
web_server_redirect_uri, authorities, access_token_validity, refresh_token_validity, additional_information, autoapprove)
values ('client', 'auth-service,platform-service,settings-ui', 'secret', 'read,write',
'authorization_code,refresh_token',NULL, 'ADMIN', NULL, NULL, NULL, NULL);

insert into oauth_client_details(client_id, resource_ids, client_secret, scope, authorized_grant_types,
web_server_redirect_uri, authorities, access_token_validity, refresh_token_validity, additional_information, autoapprove)
values('service-integration','auth-service,settings-ui','client_secret','read,write',
'client_credentials',null,'X',null,null,null,null);

# Note!
## remember
when a token used for the first time resource server(this app) make a request to oauth server and validate it.
for other call its seems that resource server hold it somewhere and do not make any request to authorization server.
its either hole token or just validation parameter.
if resource server restart its obviously going to make one request again to auth server and hold it again.
so after first request if auth server going down until the token is valid, resource server has no problem.

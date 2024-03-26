# Note!
## remember
when a token used for the first time resource server(this app) make a request to oauth server and get necessary data.  
calling these end points:
1. /.well-known/openid-configuration
2. /oauth2/jwks

so after first request if auth server going down resource server has no problem(in jwt scenario and default mode i think).

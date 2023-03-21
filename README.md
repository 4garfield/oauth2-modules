Sample spring boot project for [OAuth2 Client Credentials Flow](https://auth0.com/docs/get-started/authentication-and-authorization-flow/client-credentials-flow)

Build and run the spring boot applications.

First, to get jwt token from authorization server:

```bash
curl 'http://localhost:9000/oauth2/token' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--header 'Accept: application/json' \
--data-urlencode 'grant_type=client_credentials' \
--data-urlencode 'client_id=client1' \
--data-urlencode 'client_secret=clientSecretVal' \
--data-urlencode 'scope=greeting:read'
```

Then, access resource server with jwt token:

```bash
curl 'http://localhost:9010/greeting' \
--header 'Accept: application/json' \
--header 'Authorization: Bearer <jwt-token>'
```

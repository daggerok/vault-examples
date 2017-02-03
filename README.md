# vault [![build](https://travis-ci.org/daggerok/vault.svg?branch=master)](https://travis-ci.org/daggerok/vault)

secure storing and getting things vault

```bash
gradle dockerUp
export VAULT_ADDR='http://0.0.0.0:8200'
vault status
vault auth myroot
vault write /secret/app/config/host hostname=localhost
vault write /secret/app/config/user username=user password=pass
vault read /secret/app/config/user
vault read /secret/app/config/host
```

spring-boot

```bash
gradle assemble
gradle bootRun --parallel
```

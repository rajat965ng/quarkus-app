# How To's

## Enable Blue Green Deployment
```
blueGreen:
  enabled: true
```

### Verify
helm template serbeppms . --set blueGreen.blue.tag=12637278,blueGreen.green.tag=12637278,blueGreen.blue.host=blue.serb.com,blueGreen.green.host=green.serb.com


## Normal Deployment
```
blueGreen:
  enabled: false
```
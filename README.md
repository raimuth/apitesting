# Simple project to experiment with different approaches to API design

Bases on the Typesafe Reactor project [Scala Seed](https://www.typesafe.com/activator/template/play-scala-reactive-platform-15v01)
([Sources](https://github.com/playframework/playframework/tree/master/templates/play-scala))

## Structure

- each scenario gets it's own api path (e.g. /_scenario name_)
- each scenario should be implemented in it's own class and complex
  scenarios should be created in a separated package
- scenarios are to be explained (html) under the path /_scenario name_/description
- complex scenarios may contain a service document under the root path (containing all resources)

## Current Scenarios

### 1. ETag Header

Simulate ETag Header generation and proper responses for ETags
 Based upon explanation from Wikipedia: [ETag](https://en.wikipedia.org/wiki/HTTP_ETag)


 **TODO**: verify usage with component test, improve example with dynamic ETag generation
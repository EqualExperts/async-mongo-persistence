# async-mongo-persistence

[ ![Download](https://api.bintray.com/packages/equalexperts/open-source-release-candidates/async-mongo-persistence/images/download.svg) ](https://bintray.com/equalexperts/open-source-release-candidates/async-mongo-persistence/_latestVersion)
[![CircleCI](https://circleci.com/gh/EqualExperts/async-persistence.svg?style=svg)](https://circleci.com/gh/EqualExperts/async-persistence)

Library to provide persistence to MongoDB to support asynchronous functions from [play-async](https://github.com/EqualExperts/play-async)


### Installing

Include the following dependency in your SBT build

* Release candidate versions

[ ![Download](https://api.bintray.com/packages/equalexperts/open-source-release-candidates/async-mongo-persistence/images/download.svg) ](https://bintray.com/equalexperts/open-source-release-candidates/async-mongo-persistence/_latestVersion)

```scala
resolvers += Resolver.bintrayRepo("equalexperts", "open-source-release-candidates")

libraryDependencies += "com.equalexperts" %% "async-mongo-persistence" % "[INSERT-VERSION]"
```

* Released versions

TBC

```scala
resolvers += Resolver.bintrayRepo("equalexperts", "open-source")

libraryDependencies += "com.equalexperts" %% "async-mongo-persistence" % "[INSERT-VERSION]"
```

### Building with Docker

`docker build -t async-mongo-persistence:latest .`

### Publishing with Docker

`docker run -v ~/.ivy2:/root/.ivy2 -t async-mongo-persistence:latest`


## Contributors 

This based off a forked from [/hmrc/microservice-async](https://github.com/hmrc/microservice-async)


### License

This code is open source software licensed under the [Apache 2.0 License]("http://www.apache.org/licenses/LICENSE-2.0.html").

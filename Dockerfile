FROM hseeberger/scala-sbt:8u141-jdk_2.12.3_0.13.16

WORKDIR /async-mongo-persistence

COPY ./.git /async-mongo-persistence/.git/

COPY ./build.sbt /async-mongo-persistence

COPY ./bintray.sbt /async-mongo-persistence

COPY ./LICENSE /async-mongo-persistence

COPY ./project/*.sbt /async-mongo-persistence/project/

COPY ./project/*.scala /async-mongo-persistence/project/

COPY ./src /async-mongo-persistence/src/

RUN sbt test

CMD ["sbt", "publishLocal"]

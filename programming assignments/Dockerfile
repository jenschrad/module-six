FROM openjdk:17-oracle

WORKDIR /docker/app

COPY TipCalculator.java .

COPY TipCalculator.class .

RUN javac TipCalculator.java

CMD [ "java", "TipCalculator" ]


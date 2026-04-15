FROM openjdk:17
WORKDIR /app
COPY src/AuctionService.java .

RUN javac AuctionService.java

CMD ["java", "AuctionService"]

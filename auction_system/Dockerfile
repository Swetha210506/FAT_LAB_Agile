FROM openjdk:17
WORKDIR /app
COPY src/main/java/AuctionService.java .

RUN javac AuctionService.java

CMD ["java", "AuctionService"]

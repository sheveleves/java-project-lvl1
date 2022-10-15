run-dist:
	./app/build/install/app/bin/app

clean:
	./app/gradlew clean installDist


install:
	./app/gradlew clean install


build:
	./app/gradlew clean build


check:
	./app/gradlew checkstyleMain


run:
	./app/gradlew run

.PHONY: build

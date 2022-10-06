run-dist:
	./build/install/app/bin/app

clean:
	./gradlew clean installDist


install:
	./gradlew clean install


build:
	./gradlew clean build


check:
	./gradlew checkstyleMain


run:
	./gradlew clean
	./gradlew run

.PHONY: build
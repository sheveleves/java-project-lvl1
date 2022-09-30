run-dist:
	./build/install/app/bin/app

clean:
	./gradlew clean

install: clean
	./gradlew installDist

.PHONY: build

all: build compile

build:
	mkdir -p build
	cp -r src/resources build/

compile:
	javac -d build $(shell find src ../BlobGame/src ../Battlefield/src -name "*.java")

run: compile
	java -cp build src.LauncherMain

clean:
	rm -rf build

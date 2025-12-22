all: build compile

build:
	mkdir -p build
run:
	java -cp build LauncherMain.java
compile:
	javac -d build $(shell find src ../BlobGame/src ../Battlefield/src -name "*.java")
clean:
	rm -rf build

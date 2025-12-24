# JPlay
JPlay is a launcher interface that hosts and gives access to two interactive video games: Battlefield and Blobgame. The former features a strategic tower-defense game, where players must defend a tower from the approaching monsters by placing different warriors along a path. The second game is a territory-expansion puzzle, where the goal is to manipulate blocks to take over the board ans score points. 

## File Structure
<pre>
+--- JPlay
    +--- Battlefield (submodule)
        +--- src
            +--- components
                +--- Axebringer.java
                ...
        +--- out
            +--- Axebringer.class
            ...
        +--- Main.java
    +--- BlobGame (submodule)
        +--- src
            +--- blobgame
                +--- BlobGoal.java
                ...
        +--- BlobGoal.class
        ...
    +--- launcher
        +--- build
        +--- src
            +--- resources
                +--- blob.png
                +--- battlefield.png  
            +--- LauncherMain.java
            +--- UI.java
        +--- Makefile 
    +--- README.md
</pre>

## Getting Started
To get JPlay and launch the games, first clone the repository on your local machine : 
<pre>
    git clone "https or ssh link"
    cd JPlay
    git submodule update --init --recursive
</pre>
Then, simply move into the launcher directory and build the project : 
<pre>
    cd launcher
    make build
    make
</pre>
You can now launch JPlay and have fun by running the following command :
<pre>
    make run
</pre>


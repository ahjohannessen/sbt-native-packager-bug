name          := "snpb"

organization  := "com.github.ahjohannessen"

version       := "0.0.1"

scalaVersion  := "2.11.7"

updateOptions := updateOptions.value.withCachedResolution(true)

enablePlugins(JavaAppPackaging)

libraryDependencies ++= Seq(
	"com.geteventstore"  %% "akka-persistence-eventstore"  % "2.0.2",
	"com.geteventstore"  %% "eventstore-client"            % "2.0.3"
)
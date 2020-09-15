/*
 * Copyright (C) 2020 Electronic Arts Inc.  All rights reserved.
 */

libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value
addSbtPlugin("org.scalameta"            % "sbt-scalafmt"    % "2.4.2")
addSbtPlugin("org.scalameta"            % "sbt-mdoc"        % "1.3.6")
addSbtPlugin("org.scoverage"            % "sbt-scoverage"   % "1.6.1")

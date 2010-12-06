A Maven Build Timer
===================

## DESCRIPTION

The goal for `maven-time-tracker` is to help build-masters and developers to optimize their Maven builds by precisely measuring the time taken by each step.

## USAGE

As of Maven 3.0.1 there is no simple way to hook into `org.apache.maven.execution.ExecutionListener`. The current implementation therefore duplicates the Maven 3.0 MavenCli class with all required classes from `maven-embedder`. You can install the tracker via the following steps:

1. Build the tracker with `mvn package`.
2. Take the `maven-time-tracker-*.jar` from the `target` folder and place it inside the Maven installation's `lib` folder.
3. Change the first line in the first line of `m2.conf` in the Maven installation's `bin` directory to:

    main is org.topdesk.maven.tracker.MavenCli from plexus.core

Once you did this Maven is going to print measurements when the build finishes.

## PLANS

The tool should measure the following:

* Time taken for each execution during the build
* Time taken should include:
  * wall-clock time
  * CPU time
  * system time

Reports should show:

* Individual execution times
* Summaries
  * per-plugin goal
  * per-plugin
  * per-module
  * for the entire build

Reports should be exportable as:

* plain text (console output)
* XML
* HTML

Installation

* Instead of having to tamper with the Maven installation, the goal is to enable time measurements either as a command-line option, or via adding an `<extension>` to the project.
* The long-term goal is to have the time measurements be part of Maven itself.

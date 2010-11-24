A Maven Build Timer
===================

## DESCRIPTION

The goal for `maven-time-tracker` is to help build-masters and developers to optimize their Maven builds by precisely measuring the time taken by each step.

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
  * per-module
  * per-plugin
  * for the entire build

Reports should be exportable as:

* plain text
* XML
* CSV
* HTML

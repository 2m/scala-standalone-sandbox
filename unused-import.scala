#!/bin/sh
exec scala -Ywarn-unused-import "$0" "$@"
!#

import scala.concurrent._
import duration._

println("woohoo")

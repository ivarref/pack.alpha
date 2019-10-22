#!/usr/bin/env bash

set -ex

rm -rf target/
clojure -A:build
clojure -A:pack
time docker run -it demo:pack
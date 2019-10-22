#!/usr/bin/env bash

set -ex

rm -rf target/
clojure -A:build
docker build --tag=demo:docker .
time docker run -it demo:docker
#!/bin/bash

cd src/main/cpp/bridj

./Make.sh $@ || exit 1

BUILD_CONFIG=debug ./Make.sh $@ || exit 1

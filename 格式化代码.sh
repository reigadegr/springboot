#!/bin/sh
for i in $(find $(pwd) -name "*.java"); do
    /data/data/com.termux/files/usr/bin/clang-format -i $i
done

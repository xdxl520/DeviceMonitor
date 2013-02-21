#!/bin/bash

shell_path=$(cd "$(dirname $0)";pwd)

jar_name="devicemonitor.jar"

export LD_LIBRARY_PATH=$shell_path

cd $shell_path

java -jar $jar_name

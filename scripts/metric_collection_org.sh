#!/bin/bash

# usage: $0 <project-name> <version>

export D4J_HOME="/home/ubuntu/joel/ulysis/defects4j"
export PATH="$PATH:$D4J_HOME/framework/bin"
export OSA="/home/ubuntu/joel/ulysis/OpenStaticAnalyzer-4.0.0-x64-Linux/Java/OpenStaticAnalyzerJava"
METRIC="McCC"

# metric filtering
csv_file="/tmp/OSAMetrics/$1/$2/Metrics.csv"
mkdir -p /tmp/OSAMetrics_ground/$1/$2
python3 metric_filtering.py $csv_file $METRIC "/tmp/OSAMetrics_ground/$1/$2"

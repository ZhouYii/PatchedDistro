#!/bin/bash
for i in $(seq 1 10)
do
    for j in 4 8 12 16 20 24
    do 	
	echo HINT$j>>baselines
	hadoop jar hints_path_reduce.jar /dict $j >> baselines 2>&1
	echo HINTONLY$j>>baselines
	hadoop jar hints_only_path_reduce.jar /dict $j >> baselines 2>&1
    done
done

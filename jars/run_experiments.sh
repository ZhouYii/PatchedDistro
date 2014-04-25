#!/bin/bash
for i in $(seq 1 5)
do
    for j in 8 10 12
    do 	
	echo BASE$j>>baselines
	hadoop jar base_path_reduce.jar /dict $j >>baselines 2>&1
	echo PART$j>>baselines
	hadoop jar part_hints_path_reduce.jar /dict $j >> baselines 2>&1
    done
done

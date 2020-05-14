# Grading

Final grades were calculated by downloading the grades data from
Blackboard in comma-separated values (CSV) format, and running the
`calculate-grade.py` python script on it --- not unlike the course
project of CS 131 (but in python).  The "Grading Notes" along with
your Final Grade on Blackboard is the line of this CSV file pertaining
to you: see `example_io.txt` for an example of what this should look
like.  Since this is indeed in text format, you can copy the two lines
below `#input` of `example_io.txt` into another text file and name it
`example_input.csv` here.  Then, running

    python3 calculate-grade.py -g groups_131.txt -l fairfield_scheme.txt example_input.csv 

results in what appears below `#output` of `example_io.txt`, where
`groups_131.txt` is the grading scheme of your particular course, and
`fairfield_scheme.txt` is the correspondence between numerical and
letter grades for your particular university (Fairfield U. in this
case).

## calculate your own grade

Simply by replacing `example_input.csv` with your grades --- the
`#input` part of your individual "Grading Notes" --- you can obtain
the `#output` part of your individual "Grading Notes" by running the
above command (`python3` will need to have been installed).

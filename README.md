# Devo Challenge 1

* Description

Write an efficient algorithm to check if a string is a palindrome. A string is a palindrome if the string
matches the reverse of string.

* Build instructions

At the root of the project directory, execute the command "mvn clean package". The executable jar will be
created at the "target" directory.

* Running the demo

To run the demo, execute the command "java -jar <jar_file_name> at the directory where the generated jar
file is.

* Complexity analysis

The runtime complexity of the used algorithm is O(n). For the cases of case insensistiveness and/or
whitespaces being ignored, the string is transformed (either to lower case or to have whitespaces removed),
which implies in the string being copied and more memory needed. In the case of memory constraints, the
code can be changed to have these evaluations in place, with the cost of code complexity. 
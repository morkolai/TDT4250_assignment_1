# TDT4250_assignment_1

## The repo structure

In the /model folder the file NTNU.xmi represents a instance of the model. The file program_wb_page.ecore is the model file. program_web_page.genmodel is the generator file to generate the code based on the model. The folder /src includes all the actual java code, the java classes etc. The package tdt4250.program_web_page.util includes the validator file for validation of the model.

## The model

The `NTNU` class is the resource container class for the model.

There is a oppsite reference between `Specialisation` and `Semester` because a semester can be and can not be in a specialisation, and if it is the semester has the specialisation.

The `Course` class is owned by `NTNU` (RCC) since a course can belong to multiple `Semester` and `CourseGroup`.

## The model instace

The intance of the model is the first year of MSIT - Software.

## Constraints

The `CourseGroup` class has a java constraint that ensures the rules for the course group are fulfilled.

The `Course` class has a OCL constraint that checks with regex if the course code is in a correct format. The regex checks the 2 or 3 first signs is a uppercase letter A to Z and the next 4 signs are digits.

## Derived feature

The `Course` class has a derived feature called `fullCourseTitle` which is computed with two other fields `name` and `courseCode`.

## Methods

## Tests

## Improvements


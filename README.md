# refactoring_step_by_step

1. private
1.1. find usage.
1.2. run test case.
1.3. create getter for getting age on private field for other class.
1.4. change driver.age to driver.getAge.
1.5. run test case.
1.6. change public to private on age.
1.7. run test case.



2. duplicated code
2.1. find usage.
2.2. run test case.
2.3. change the if statement to return ( driver.getAge()>=18 )
2.4. run test case.

3. checkDriver method name
3.1. find usage.
3.2. run test case.
3.3. change the checkDriver to checkDriverAge.
3.4. run test case.




4. driver.age >= 18
4.1. find usage.
4.2. run test case.
4.3. create a field called adultAge to 18.
4.4. refractoring 19 to adultAge from usage.
4.5. run test case.
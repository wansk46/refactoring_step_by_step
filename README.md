# refactoring_step_by_step

1. private
1.1. find usage.
1.2. run test case.
1.3. create getter for getting age on private field for other class.
1.4. change driver.age to driver.getAge.
1.5. change public to private on age.



2. duplicated code
1.1. find usage.
1.2. run test case.
1.3. change the if statement to return ( driver.getAge()>=18 )

3. checkDriver method name
4. driver.age >= 18
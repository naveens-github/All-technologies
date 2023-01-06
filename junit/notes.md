# Basics of unit testing    
#### What does a unit test check?
A unit test checks the functionality of the smallest testable elements of an application―classes and functions―which allows developers to spot the failure and isolate it. Unit tests prove that given some input, the function returns the expected output. A collection of unit tests makes up a test suite.

# Benefits of Unit Tests
### Benifit 1: More confidence in changing code
Application requirements change over time. Code needs to follow those changes. When a new requirement comes in, it may not fit the existing code structure. At this point, a developer has two ways to solve this problem:

* Rework a larger part of the code to match the new requirements, which increases the risk of regression bugs; or
* Keep the no-longer-relevant code structure as-is, with a lower risk of regression bugs, but at the cost of much lower maintainability in the future.    

Unit tests make the first choice much easier―they verify the reworked code structure. Then these tests have to pass for the new structure the same way they passed for the old one. In this sense, a unit test suite is a contract of the existing functionality―as soon as it is followed, the underlying code may be changed.

### Benefit 2: A better understanding of component functionality
Unit tests help your team understand component functionality. Every piece of code expresses some business logic. That logic might be implemented in a complex way initially, or it might become more complex over time due to new requirements, bug-fixing, etc. If it is necessary to change the code after some time, the only way to understand what the code is expressing is to read that code line-by-line.

However, the human brain often cannot process all branches of the logic and all edge cases in the code. Developers make changes to code at their own discretion, which increases the risks of regression issues that are easy to miss in manual testing. Unit tests document all those edge cases and branches in code in a verifiable way and help you get the intention and context better.

### Benifit 3: Better design
Unit tests improve the code’s design by compelling developers to create testable components. As a result, code becomes less coupled and easier to change. Experienced developers write code that is easy to test by design. They aim to cover each method and function with unit tests.

# Testing Pyramid
### 1. Unit tests:
Unit tests are at the base of the Testing Pyramid because they take the least time and cost. They check the logic of a small function or class. If a unit test fails, it means there are problems with the code. Unit tests should run fast, generate stable results, and be modified quickly. To be fast and stable, they should be easy to understand.

### 2. Integration tests:
Integration tests validate the interaction of a piece of code with external components. For this reason, they run slower than unit tests.

### 3. User Interface tests:
User Interface (UI) tests are at the top of the Testing Pyramid because they involve the largest scope and are the most complex. UI tests take the longest to run as they replicate the way an actual user would interact with the app. UI tests check all the system layers from UI to databases and external services.

# Unit Tests vs. Integration Tests
## Unit Tests
* Focus on one specific piece of the system in isolation.  
* Are easier to write, faster to execute, and cheaper to maintain.    
* Verify internal consistency of code that you have complete control over.   
* Have no external dependency―any external dependency is mocked or stubbed out.    
* Let you know the exact piece of code where the error is.     
* Are comparable to checking whether a mobile phone battery is alive or whether the SIM card is activated.     

## Integration Tests
* Focus on the interaction between the units, modules, or components.   
* Are more complex, slower to run, and more expensive to maintain.   
* Verify how your code integrates with some other code.   
* Often require interaction with external dependencies, such as databases, network services, hardware, etc.   
* Indicate which modules/components contain the error.   
* Are comparable to checking whether a mobile phone battery and SIM card are assembled to start the phone.    

# Principles of Good Unit Testing
Robert Martin, a software development expert, formulated five principles of good unit tests that form the F.I.R.S.T. acronym, sometimes referred to as the FIRST principles.    
### F Fast
Tests should be fast-running. A whole suite of unit tests should take seconds to run. The faster the tests, the more of them you can have in the suite, and the more often you can run them. When tests run slowly, your team will not run them frequently. As a result, you may not find problems early enough to fix them easily, which limits your ability to clean up the code, resulting in a gradual deterioration of code quality.
### I Independent     
Tests should not be dependent on each other. One test should not set the conditions for the next. Your team members should be able to run each test independently and in any order. When tests depend on each other, the first one to fail causes a cascade of downstream failures, making a diagnosis difficult and hiding downstream defects.
### R Repeatable
Tests should be repeatable in any environment. If unit tests pass when running one-by-one but fail when running the whole test suite, or if they pass on your development machine but fail on the continuous integration server, there’s a design flaw. Your team should be able to successfully run the tests on the production environment, QA environment, and laptops so there’s never an excuse not to do it.
### S Self-Validating    
Tests should have a Boolean output and either pass or fail. The same test that fails now and passes later is flaky and compromises the whole testing suite. Flaky tests lead to negative consequences. Developers stop trusting tests and start ignoring them, and it becomes challenging to identify non-flaky tests that fail in a sea of flaky tests. You should not have to read through a log file or manually compare two text files to determine if a test passes. If they are not self-validating, then failure becomes subjective, and running tests requires a long manual evaluation.
### T Timely
Unit tests should be written in a timely manner―before or at the same time as the production code. Testing post facto requires developers on your team to refactor the working code and make additional efforts to have tests fulfilling FIRST principles.



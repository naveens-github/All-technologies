# SonarQube:   
    SonarQube is recommended for automated code analysis.

    SonarQube provides very deep code analysis, allowing it to calculate and manage the value of technical debt. 
    In addition to SonarQube, there are other useful tools for automated code analysis.

    Most modern IDEs—for example, IntelliJ IDEA and Visual Studio—can run static code analysis checks immediately after a line of 
    code is written, which helps developers fix violations quickly. Fortify is a static code analyzer that performs automated security 
    testing, enabling teams to resolve issues faster.  
    
## Code Quality Metrics    
    1. Cyclomatic complexity 
    2. Class coupling
    3. Class hierarchy, or a depth of inheritance tree (DIT)
    4. Code duplication
    5. Method cohesion

**1. Cyclomatic complexity**
   
      Cyclomatic complexity is a quality metric that measures the structural complexity of code. It refers to the number of decisions 
      in the source code. The higher the cyclomatic complexity, the more complex the code.
      
**2. Class coupling**
  
      Class coupling measures how many classes a single class uses. The lower the value, the better. Good software design requires low
      coupling; designs with high coupling are difficult to reuse and maintain.    
      
**3. Class hierarchy, or a depth of inheritance tree (DIT)**
    
      Class hierarchy, or a depth of inheritance tree (DIT), measures the complexity of the class hierarchy in object-oriented 
      programming. It shows how object classes are derived from other classes. The higher the DIT, the more complex the software.
      
**4. Code duplication**

    Code duplication refers to a sequence of source code that appears more than once, either within a program or across different 
    programs. Duplicate code is considered undesirable as it is more difficult to maintain. If such code requires updating, there 
    is a risk that one copy of the code will be modified without checking for other instances of the same code sequence.
      
**5. Method cohesion**
      
    Method cohesion has to do with methods written within a class. A method should explicitly state why it is written. Otherwise, 
    it lacks cohesion. High cohesion means that methods of the class are codependent and form a logical whole, whereas low cohesion 
    results in huge classes that are difficult to understand and maintain.
    
    

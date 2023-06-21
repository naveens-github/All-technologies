## Assertions:
  1. assertEquals(expected, actual);
  2. assertNotEquals(ex, ac);
  3. assertSame(ex, ac);
  4. assertTrue(ac);
  5. assertFalse(ac);
  6. assertNull(ac);
  7. assertNotNull(ac);
  8. assertArrayEquals();
  9. assertThat();

----------------------------
# Unit Testing using Mockito:

### Mock the objects without JUnit 5 extension:
  1. Method1: PersonRepository repo=Mockito.mock(PersonRepository.class);   
              PersonService personService = new PersonService(repo);

### Three imp segments to implement in test cases.
  1. Arrage = In arrage segment we set up the context of our prticular test case scenario
  2. Act = In act segment we actually make method call and perform whatever is the main behavior that we are trying to test.
  3. Assert = In this section, we verify the results. 


#### When Stubing we can pass arguments like below if the method has return value.
1. When we don't care about the string: "naveen@gmail.com" = anyString()
2. when we want to equals to some string: eq("naveen@gmail.com")

Ex: when(repo.findByEmailAndPassword("naveen@gmail.com", "abcd1234").thenReturn(person));
    when(repo.findByEmailAndPassword("naveen@gmail.com", "abcd1234").anyString();
    when(repo.findByEmailAndPassword(eq("naveen@gmail.com"), "abcd1234").thenReturn(person);
    
#### Stub if the method is not returning any value.   
Ex: 1. doNothing().when(repo).update(any(Person.class));     
    2. doThrow(new RuntimeException("Invalid Email")).when(repo).update(any(Person.class));   
    
Ex: We will verify for void methods.
    verify(repo).update(any(Person.class));   
    verify(repo, times(1)).update(any(Person.class));//if we want to verify once once     
    verify(repo, atMostOnce()).update(any(Person.class));       
    verify(repo, atLeastOnce()).update(any(Person.class));      
    
    
#### JUnit 5 extension:
  1.  We have to use the annotation @ExtendsWith(MockitoExtension.class)  

      @ExtendsWith(MockitoExtension.class)        
      class PersonServiceTest{      
      
        @Mock   
        PersonRepository repo;    
        @InjectMocks        
        PersonService personService;      
        
      }     

### When to use Spy instead of Mock.
    

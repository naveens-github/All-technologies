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

### Mock the objects
  1. Method1: PersonRepository repo=Mockito.mock(PersonRepository.class);
              PersonService personService = new PersonService(repo);

### Three imp segments to implement in test cases.
  1. Arrage = In arrage segment we set up the context of our prticular test case scenario
  2. Act = In act segment we actually make method call and perform whatever is the main behavior that we are trying to test.
  3. Assert = In this section, we verify the results. 

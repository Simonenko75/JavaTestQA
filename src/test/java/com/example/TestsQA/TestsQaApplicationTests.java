package com.example.TestsQA;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Tests working, It's working!!!")
class TestsQaApplicationTests {

//________________________________Home_Work_1_and_2_____________________________________________________
	@Test
	@Order(1)
	@DisplayName("Work now!")
	public void firstTest() {
		System.out.println("First test");
	}

	@Test
	@Order(2)
	public void secondTest() {
		System.out.println("Second test");
	}

	private class Address {

		public Address(String city, String stream, String house) {
			this.city = city;
			this.street = stream;
			this.house = house;
		}

		private String city;
		private String street;
		private String house;

		public String getCity() {
			return city;
		}

		public String getStreet() {
			return street;
		}

		public String getHouse() {
			return house;
		}
	}

	@Test
	@Order(3)
	public void whenTestAddressObjectReturnCorrectValues() {
		Address address = new Address("Дніпро", "Набережна", "11");
		assertAll("Сценарій перевірки адреси...",
			() -> assertEquals("Дніпро", address.getCity()),
			() -> assertEquals("Набережна", address.getStreet()),
			() -> assertEquals("11", address.getHouse())
		);
		assertEquals("Дніпро", address.getCity());
		assertEquals("Набережна", address.getStreet());
		assertEquals("11", address.getHouse());
	}

	Calculator calculator;

	@BeforeAll
	public static void initAll() {
//		System.out.println("Щось виконується до ...");
	}

	@AfterAll
	public static void destroyAll() {
//		System.out.println("Щось виконалось після ...");
	}

	@BeforeEach
	public void init() {
		calculator = new Calculator();
//		System.out.println("Певний тест виконується...");
	}
	@AfterEach
	public void destroy() {
//		System.out.println("Певний тест виконано!");
	}

//	enum SomeEnum {
//		HELLO, WORLD, GYE
//	}

	@Order(4)
	@ParameterizedTest
	@MethodSource("argsProviderFactory")
	public void whenTakesParameterPrintOnTheScreen(String string) {
		System.out.println(string);
		assert(string != null);
	}

	static Stream<String> argsProviderFactory() {
		return Stream.of("first", "two", "hello");
	}

	@Order(5)
	@ParameterizedTest
	@CsvSource({
			"1, 7, 8",
			"5, 4, 9",
			"6, 4, 10",
	})
	public void whenUseAddGetCorrectSum(int a, int b, Integer expected) {
		System.out.println("argsProviderFactory " + a + " " + b);
		int result = calculator.add(a, b);
		assertEquals(expected, result);

		int result1 = calculator.add(2, 4);

		assertEquals(6, result1);
		assertNotNull(expected);
		assertNull(null);
		assertTrue(expected == result);
		assertFalse(expected != result);
		assertSame(expected, expected);
	}

	@Order(6)
	@ParameterizedTest
	@CsvSource({
			"2, 5, 7",
			"5, 4, 9",
			"6, 4, 10",
	})
	public void whenUseAddGetCorrectSum1(int a, int b, Integer expected) {
		System.out.println("argsProviderFactory " + a + " " + b);
		int result = calculator.add(a, b);
		assertEquals(expected, result);

		if(expected == 6) {
			assertTimeout(Duration.ofSeconds(2), () -> Thread.sleep(3000));
		}
	}

	@Order(7)
	@ParameterizedTest
	@ValueSource(strings = {"Hello"})
	public void whenAssertingArraysThenEquality(String str) {
		char[] expected = {'H', 'e', 'l', 'l', 'o'};
		char[] actual = str.toCharArray();
		assertArrayEquals(expected, actual);
	}

	@Test
	@Order(8)
	public void whenUseSubGetCorrectSub() {

		int result = calculator.sub(3, 5);
		assertEquals(-2, result);

		int result1 = calculator.sub(6, 4);
		assertEquals(2, result1);
	}

	@Test
	@Order(9)
	public void whenUseMultGetCorrectRes() {

		int result = calculator.mult(3, 5);
		assertEquals(15, result);

		int result1 = calculator.mult(2, 4);
		assertEquals(8, result1);
	}

	@Order(10)
	@ParameterizedTest
	@CsvSource({
			"2, 2, 1",
			"15, 3, 5",
			"6, 0, 6",
	})
	public void whenUseDivGetCorrectResult(int a, int b, double result) throws ProgramException {

		if(b != 0){
			assertEquals(result, calculator.div(a, b));
		} else if(b == 0){
			Throwable throable = assertThrows(ProgramException.class, () -> calculator.div(a, b));
			assertEquals("Ви зломаєте математику!", throable.getMessage());
		}


		double result1 = calculator.div(22, 2);
		assertEquals(11, result1);
	}

	@Test
	@Order(11)
	@Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
	public void thenExecutionTimeMoreThan100MsThenExecution() throws InterruptedException {
		Thread.sleep(200);
	}
//______________________________________________________________________________________________________

}

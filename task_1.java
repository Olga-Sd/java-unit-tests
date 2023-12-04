@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("При значении 19 должно возвращаться true",true, isAdult);
	// Напиши код здесь
}

package com.library.importer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest({"mode=importAuthors", "filepath=D:\\\\Litres\\\\Catalog\\\\books.xml"})
class ImporterApplicationTests {

	@Test
	void contextLoads() {
	}

}

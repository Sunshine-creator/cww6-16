import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TagTest {

	@Test
	@Tag("tag1")
	void tag1() {
		System.out.println("Tag1 Test");
	}
	
	@Test
	@Tag("tag2")
	void tag2() {
		System.out.println("Tag2 test");
	}

}

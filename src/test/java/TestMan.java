import com.persone.information.Man;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMan {
    private Man man;

    @Test(description = "Check if a man is not retired")
    public void testIsNotRetired() {
        Man man = new Man("Bob", "Last", 31, "Name", false);
        Assert.assertFalse(man.isRetired());
    }

    @Test(description = "Check if a man is retired")
    public void testIsRetired() {
        Man man = new Man("John", "Fasa", 67, "Katy", false);
        Assert.assertTrue(man.isRetired());
    }

    @Test(description = "Check if a man is married")
    public void testRegisterPartnershipYes() {
        Man man = new Man("John", "Fasa", 60, "Fasa", false);
        Assert.assertEquals(man.getPartner(), man.getLastName());

    }

    @Test(description = "Check if a man is not married")
    public void testRegisterPartnershipNo() {
        Man man = new Man("Bob", "Last", 31, "Nana", false);
        Assert.assertNotEquals(man.getLastName(), man.getPartner());
    }

    @Test(description = "Check if a man doesn't have a partner (register partnership)")
    public void testRegisterPartnershipNotMarried() {
        Man man = new Man("John", "Yong", 60, null, false);
        Assert.assertNull(man.getPartner());
    }

    @Test(description = "Check if a man is divorced")
    public void testDeregisterPartnershipYes() {
        Man man = new Man("John", "LastName", 60, "Lola Steach", false);
        Assert.assertFalse(man.isDivorced());
    }

    @Test(description = "Check if a man is not divorced")
    public void testDeregisterPartnershipNo() {
        Man man = new Man("Bob", "Chao", 60, null, true);
        Assert.assertTrue(man.isDivorced());
    }

    @Test(description = "Check if a man doesn't have a partner (deregister partnership)")
    public void testDeregisterPartnershipNotMarried() {
        Man man = new Man("Bob", "Chao", 60, null, false);
        Assert.assertNull(man.getPartner());
    }
}
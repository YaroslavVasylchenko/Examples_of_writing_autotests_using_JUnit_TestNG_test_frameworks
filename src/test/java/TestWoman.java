import com.persone.information.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWoman {
    private Woman woman;

    @Test(description = "Check if a woman is not retired")
    public void testIsNotRetired(){
       Woman woman = new Woman("Ira", "Fifa", 32, "Name", false,"Last");
        Assert.assertFalse(woman.isRetired());
    }

    @Test(description = "Check if a woman is retired")
    public void testIsRetired(){
        Woman woman = new Woman("Vlada", "Karpenko", 66, "Gosha", false,"Narigi");
        Assert.assertTrue(woman.isRetired());
    }

    @Test(description = "Check if a woman is married")
    public void testRegisterPartnershipYes(){
        Woman  woman = new Woman("Vlada", "Javelin", 60, "Javelin", false,"Javelin");
        Assert.assertEquals(woman.getLastName(), woman.getPartner());
    }

    @Test(description = "Check if a woman is not married")
    public void testRegisterPartnershipNo(){
        Woman woman = new Woman("Lola", "Gukenko", 35, "Hika", false,"Gukenko");
        Assert.assertNotEquals(woman.getLastName(), woman.getPartner());
    }

    @Test(description = "Check if a woman doesn't have a partner (register partnership)")
    public void testRegisterPartnershipNotMarried(){
        Woman woman = new Woman("Tania", "Kalatenko", 60, null, false, "Yong");
        Assert.assertNull(woman.getPartner());
    }

    @Test(description = "Check if a woman is divorced")
    public void testDeregisterPartnershipYes(){
        Woman woman = new Woman("Galka", "Goga", 60, "Misha", false,"LastNameOriginal");
        Assert.assertNotEquals(woman.getLastName(), woman.getLastNameOriginal());
    }

    @Test(description = "Check if a woman is not divorced")
    public void testDeregisterPartnershipNo(){
        Woman woman = new Woman("Anya", "Hiki", 60, null, false, "Hiki");
        Assert.assertEquals(woman.getLastName(), woman.getLastNameOriginal());
    }

    @Test(description = "Check if a woman doesn't have a partner (deregister partnership)")
    public void testDeregisterPartnershipNotMarried(){
        Woman woman = new Woman("Anya", "Karpenko", 60, null, false, "Hiki");
        Assert.assertNull(woman.getPartner());
    }

    @Test(description = "Check if a woman has getLastNameOriginal()")
    public void testGetLastNameOriginal(){
      Woman  woman = new Woman("Anya", "Karpenko", 60, null, false, "Hiki");
        Assert.assertEquals(woman.getLastNameOriginal(), woman.getLastNameOriginal());
    }

    @Test(description = "Check if a woman has getLastNameOriginal() not NULL")
    public void testGetLastNameOriginalNotNull(){
      Woman  woman = new Woman("Anya", "Karpenko", 60, null, false, "Hiki");
        Assert.assertNotNull(woman.getLastNameOriginal());
    }

    @Test(description = "Check if a woman has setLastNameOriginal()")
    public void testSetLastNameOriginal(){
       Woman woman = new Woman("Anya", "Karpenko", 60, null, false, "Hiki");
        String lastName = "";
        woman.setLastNameOriginal(lastName);
        Assert.assertEquals(woman.getLastNameOriginal(), lastName);
    }

    @Test(description = "Check if a woman has setLastNameOriginal() not NULL")
    public void testSetLastNameOriginalNotNull(){
      Woman woman = new Woman("Anya", "Karpenko", 60, null, false, "Hiki");
        String lastName = "";
        woman.setLastNameOriginal(lastName);
        Assert.assertNotNull(woman.getLastNameOriginal());
    }

}

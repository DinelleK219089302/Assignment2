/*
BankAccountTest.java
This is a test class to test the add, remove and find functions when used with collections, lists, sets and maps.
Dinelle Kotze
219089302
16 May 2021
 */

package za.ac.cput.assignment2collections219089302;

import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest
{
    List<BankAccount> bankAccountList = new ArrayList<>();
    Set<BankAccount> bankAccountSet = new HashSet<>();
    Map<Integer, BankAccount> bankAccountMap = new HashMap<>();
    Collection<BankAccount> bankAccountCollection = new LinkedHashSet<>();

    BankAccount b1 = new BankAccount("C Colenbrander", "Standard Bank", "000727", "current", "063246295");
    BankAccount b2 = new BankAccount("S Ferrandi", "Standard Bank", "6309", "current", "242913334");
    BankAccount b3 = new BankAccount("M Fourie", "Standard Bank", "2209", "current", "061065951");
    BankAccount b4 = new BankAccount("D Kotze", "ABSA", "632005", "savings", "9277838382");
    BankAccount b5 = new BankAccount("L Montile", "FNB", "250655", "savings", "62520981847");
    BankAccount b6 = new BankAccount("A Williams", "Standard Bank", "909", "current", "10114235315");

    @BeforeEach
    void setUp()
    {
        bankAccountCollection.add(b1);
        bankAccountCollection.add(b2);
        bankAccountCollection.add(b3);
        bankAccountCollection.add(b4);
        bankAccountCollection.add(b5);

        bankAccountList.add(b1);
        bankAccountList.add(b2);
        bankAccountList.add(b3);
        bankAccountList.add(b4);
        bankAccountList.add(b5);

        bankAccountSet.add(b1);
        bankAccountSet.add(b2);
        bankAccountSet.add(b3);
        bankAccountSet.add(b4);
        bankAccountSet.add(b5);

        bankAccountMap.put(0, b1);
        bankAccountMap.put(1, b2);
        bankAccountMap.put(2, b3);
        bankAccountMap.put(3, b4);
        bankAccountMap.put(4, b5);
    }

    //testing of collection functions

    @Test
    void collectionAddTest()
    {
        bankAccountCollection.add(b6);
        assertEquals(6, bankAccountCollection.size());
    }

    @Test
    void collectionRemoveTest()
    {
        bankAccountCollection.remove(b4);
        assertEquals(4, bankAccountCollection.size());
    }

    @Test
    void collectionFindTest()
    {
        assertTrue(bankAccountCollection.contains(b3));
        System.out.println(b3.toString());
    }

    //testing of list functions

    @Test
    void listAddTest()
    {
        bankAccountList.add(3, b6);
        assertEquals(6, bankAccountList.size());
    }

    @Test
    void listRemoveTest()
    {
        bankAccountList.remove(4);
        assertEquals(4, bankAccountList.size());
    }

    @Test
    void listFindTest()
    {
        assertTrue(bankAccountList.contains(b3));
        System.out.println(b3.toString());
    }

    //testing of set functions

    @Test
    void setAddTest()
    {
        bankAccountSet.add(b6);
        assertEquals(6, bankAccountSet.size());
    }

    @Test
    void setRemoveTest()
    {
        bankAccountSet.remove(b4);
        assertEquals(4, bankAccountSet.size());
    }

    @Test
    void setFindTest()
    {
        assertTrue(bankAccountSet.contains(b3));
        System.out.println(b3.toString());
    }

    //testing of map functions

    @Test
    void mapAddTest()
    {
        bankAccountMap.put(bankAccountMap.size(), b6);
        assertEquals(6, bankAccountMap.size());
    }

    @Test
    void mapRemoveTest()
    {
        bankAccountMap.remove(4);
        assertEquals(4, bankAccountMap.size());
    }

    @Test
    void mapFindTest()
    {
        assertTrue(bankAccountMap.containsValue(b3));
        System.out.println(b3.toString());
    }
}
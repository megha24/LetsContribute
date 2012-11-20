package com.example;

import android.app.Activity;
import android.app.Instrumentation;
import android.test.ActivityInstrumentationTestCase2;
import com.example.stub.DatabaseRepositoryStub;
import com.example.utils.TestUtilities;

public class ContactDetailActivityTest extends BaseActivityTest<ContactDetailActivity> {

    private DatabaseRepositoryStub dbRepository;

    public ContactDetailActivityTest() {
        super(ContactDetailActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        dbRepository = new DatabaseRepositoryStub(activity);
        activity.setDbRepository(dbRepository);
    }

    public void testShouldInsertPersonRecordOnSubmit() throws InterruptedException {
        TestUtilities.setEditText(R.id.address,"someAddress",activity,this);
        TestUtilities.setEditText(R.id.personName,"someName",activity,this);
        TestUtilities.setEditText(R.id.contactNumber,"someNumber",activity,this);
        TestUtilities.setEditText(R.id.bloodGroup, "O+", activity, this);
        TestUtilities.clickButton(R.id.addDetailButton, activity, this);
        
        assertEquals(1,dbRepository.getPersonList().size());
        assertEquals("someAddress",dbRepository.getPersonList().get(0).getAddress());
        assertEquals("someName",dbRepository.getPersonList().get(0).getName());
        assertEquals("someNumber",dbRepository.getPersonList().get(0).getContactNumber());
        assertEquals("O+",dbRepository.getPersonList().get(0).getBloodGroup());

    }
    public void testShouldDisplayThankYOuActivity(){
        TestUtilities.setEditText(R.id.address,"someAddress",activity,this);
        TestUtilities.setEditText(R.id.personName,"someName",activity,this);
        TestUtilities.setEditText(R.id.contactNumber,"someNumber",activity,this);
        TestUtilities.setEditText(R.id.bloodGroup, "O+", activity, this);
        assertNavigationToTarget(R.id.addDetailButton,ThankYouActivity.class);
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }
}

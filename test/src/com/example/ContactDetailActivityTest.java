package com.example;

import android.test.ActivityInstrumentationTestCase2;
import com.example.stub.DatabaseRepositoryStub;
import com.example.utils.TestUtilities;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.example.ContactDetailActivityTest \
 * com.example.tests/android.test.InstrumentationTestRunner
 */
public class ContactDetailActivityTest extends ActivityInstrumentationTestCase2<ContactDetailActivity> {

    private ContactDetailActivity activity;
    private DatabaseRepositoryStub dbRepository;

    public ContactDetailActivityTest() {
        super("com.example", ContactDetailActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();    //To change body of overridden methods use File | Settings | File Templates.
        activity = getActivity();
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

    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        //activity.finish();
    }
}

package com.example;

import android.R;
import android.app.Activity;
import android.app.Instrumentation;
import android.test.ActivityInstrumentationTestCase2;
import com.example.utils.TestUtilities;

import static android.app.Instrumentation.ActivityMonitor;


public class MainPageActivityTest extends ActivityInstrumentationTestCase2<MainPageActivity>{
    private MainPageActivity activity;

    public MainPageActivityTest() {
        super(MainPageActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        activity =  getActivity();
    }

    public void testShouldGoToRegisterActivity(){
        ActivityMonitor monitor = getInstrumentation().addMonitor(ContactDetailActivity.class.getName(), null, false);
        TestUtilities.clickButton(R.id.register, activity, this);

        Activity nextActivity = getInstrumentation().waitForMonitorWithTimeout(monitor, 5000);
        assertEquals(nextActivity.getClass(), ContactDetailActivity.class);

    }

}

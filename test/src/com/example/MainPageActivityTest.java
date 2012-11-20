package com.example;

import android.app.Activity;
import android.app.Instrumentation;
import android.test.ActivityInstrumentationTestCase2;
import com.example.utils.TestUtilities;

import java.util.HashMap;
import java.util.Map;

import static android.app.Instrumentation.ActivityMonitor;


public class MainPageActivityTest extends BaseActivityTest<MainPageActivity>{

    public MainPageActivityTest() {
        super(MainPageActivity.class);
    }

    public void testShouldGoToContactDetailsActivityOnRegisterWithRegisterAsParamater(){
        Map<String,String> bundleExtras = new HashMap<String, String>();
        bundleExtras.put(DonateBloodConstants.REQUEST_TYPE,DonateBloodConstants.REGISTER);
        assertNavigationToTargetWithParameters(R.id.register, ContactDetailActivity.class,bundleExtras );
    }

    public void testShouldGoToContactDetailsActivityOnFindDonorWithDonorAsParameter(){
        Map<String,String> bundleExtras = new HashMap<String, String>();
        bundleExtras.put(DonateBloodConstants.REQUEST_TYPE,DonateBloodConstants.FIND_DONOR);
        assertNavigationToTargetWithParameters(R.id.find_donor, ContactDetailActivity.class,bundleExtras );
    }

}

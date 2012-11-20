package com.example;


public class ThankYouActivityTest extends BaseActivityTest<ThankYouActivity>{
    public ThankYouActivityTest() {
        super(ThankYouActivity.class);
    }

    public void testShouldGoToMainPageActivityOnPressingHomeButton(){
        assertNavigationToTarget(R.id.home, MainPageActivity.class);
    }


}

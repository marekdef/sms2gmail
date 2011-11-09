package pl.retsat1.starlab.android.sms2gmail.test;

import android.test.ActivityInstrumentationTestCase2;
import pl.retsat1.starlab.android.sms2gmail.*;

public class HelloAndroidActivityTest extends ActivityInstrumentationTestCase2<HelloAndroidActivity> {

    public HelloAndroidActivityTest() {
        super("pl.retsat1.starlab.android.sms2gmail", HelloAndroidActivity.class);
    }

    public void testActivity() {
        HelloAndroidActivity activity = getActivity();
        assertNotNull(activity);
    }
}


package com.xabber.android.ui.preferences;

import android.os.Bundle;

import com.xabber.android.R;
import com.xabber.android.ui.activity.PreferenceSummaryHelperActivity;

public class ConnectionSettingsFragment extends android.preference.PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preference_connection);

        PreferenceSummaryHelperActivity.updateSummary(getPreferenceScreen());
    }
}

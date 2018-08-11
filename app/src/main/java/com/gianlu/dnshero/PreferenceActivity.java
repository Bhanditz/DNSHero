package com.gianlu.dnshero;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.gianlu.commonutils.Preferences.BasePreferenceActivity;
import com.gianlu.commonutils.Preferences.MaterialAboutPreferenceItem;

import java.util.ArrayList;
import java.util.List;

public class PreferenceActivity extends BasePreferenceActivity {
    @NonNull
    @Override
    protected List<MaterialAboutPreferenceItem> getPreferencesItems() {
        return new ArrayList<>();
    }

    @Override
    protected int getAppIconRes() {
        return R.mipmap.ic_launcher;
    }

    @Override
    protected boolean hasTutorial() {
        return false;
    }

    @Nullable
    @Override
    protected String getOpenSourceUrl() {
        return "https://github.com/devgianlu/DNSHero";
    }
}

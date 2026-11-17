package com.kahf.dns.utils;

import android.content.SharedPreferences;
import coil3.decode.p009lL.mDZxtsynkk;
import com.kahf.dns.utils.PreferencesHelper;
import java.util.Collection;
import java.util.Iterator;
import p000.bha;
import p000.cy7;
import p000.dl2;
import p000.kl6;
import p000.lv7;
import p000.ly6;
import p000.mg9;
import p000.ne9;
import p000.r2c;
import p000.sa2;
import p000.stb;
import p000.sx7;
import p000.tl4;
import p000.tz6;
import p000.u53;
import p000.wnb;
import p000.ynb;

/* compiled from: r8-map-id-b8b93801524a0cb5f1b2b7f102d051fba074747374ffcd125865f57b5b99c0dd */
/* loaded from: classes.dex */
public final class PreferencesHelper {
    public static final int $stable = 8;
    public static final mg9 Companion = new mg9();
    private static final String ROLE_TAG = "DEVICE_ROLE";
    private final kl6 _deviceMongoId$delegate;
    private final kl6 deviceIdPrefs$delegate;
    private final kl6 deviceMongoId$delegate;
    private final SharedPreferences sharedPreferences;

    public PreferencesHelper() {
        final byte b = 0;
        SharedPreferences sharedPreferences = sa2.f38142u.m17960c().getSharedPreferences("AppPreferences", 0);
        sharedPreferences.getClass();
        this.sharedPreferences = sharedPreferences;
        this.deviceIdPrefs$delegate = new r2c(new cy7((byte) 7));
        this._deviceMongoId$delegate = new r2c(new tl4(this) { // from class: lg9

            /* renamed from: v */
            public final /* synthetic */ PreferencesHelper f24329v;

            {
                this.f24329v = this;
            }

            @Override // p000.tl4
            public final Object invoke() {
                lv7 _deviceMongoId_delegate$lambda$0;
                wnb deviceMongoId_delegate$lambda$0;
                byte b2 = b;
                PreferencesHelper preferencesHelper = this.f24329v;
                switch (b2) {
                    case 0:
                        _deviceMongoId_delegate$lambda$0 = PreferencesHelper._deviceMongoId_delegate$lambda$0(preferencesHelper);
                        return _deviceMongoId_delegate$lambda$0;
                    default:
                        deviceMongoId_delegate$lambda$0 = PreferencesHelper.deviceMongoId_delegate$lambda$0(preferencesHelper);
                        return deviceMongoId_delegate$lambda$0;
                }
            }
        });
        final byte b2 = 1;
        this.deviceMongoId$delegate = new r2c(new tl4(this) { // from class: lg9

            /* renamed from: v */
            public final /* synthetic */ PreferencesHelper f24329v;

            {
                this.f24329v = this;
            }

            @Override // p000.tl4
            public final Object invoke() {
                lv7 _deviceMongoId_delegate$lambda$0;
                wnb deviceMongoId_delegate$lambda$0;
                byte b22 = b2;
                PreferencesHelper preferencesHelper = this.f24329v;
                switch (b22) {
                    case 0:
                        _deviceMongoId_delegate$lambda$0 = PreferencesHelper._deviceMongoId_delegate$lambda$0(preferencesHelper);
                        return _deviceMongoId_delegate$lambda$0;
                    default:
                        deviceMongoId_delegate$lambda$0 = PreferencesHelper.deviceMongoId_delegate$lambda$0(preferencesHelper);
                        return deviceMongoId_delegate$lambda$0;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lv7 _deviceMongoId_delegate$lambda$0(PreferencesHelper preferencesHelper) {
        String string = preferencesHelper.sharedPreferences.getString(PrefKeys.KEY_DEVICE_MONGODB_ID, "");
        return bha.m2069a(string != null ? string : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences deviceIdPrefs_delegate$lambda$0() {
        return sa2.f38142u.m17960c().getSharedPreferences("user_prefs", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wnb deviceMongoId_delegate$lambda$0(PreferencesHelper preferencesHelper) {
        return dl2.m6406b(preferencesHelper.get_deviceMongoId());
    }

    public static /* synthetic */ boolean getBooleanFromPreferences$default(PreferencesHelper preferencesHelper, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return preferencesHelper.getBooleanFromPreferences(str, z);
    }

    private final SharedPreferences getDeviceIdPrefs() {
        Object value = this.deviceIdPrefs$delegate.getValue();
        value.getClass();
        return (SharedPreferences) value;
    }

    public static /* synthetic */ float getFloatFromPreferences$default(PreferencesHelper preferencesHelper, String str, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = -1.0f;
        }
        return preferencesHelper.getFloatFromPreferences(str, f);
    }

    public static /* synthetic */ int getIntFromPreferences$default(PreferencesHelper preferencesHelper, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        return preferencesHelper.getIntFromPreferences(str, i);
    }

    public static /* synthetic */ long getLongFromPreferences$default(PreferencesHelper preferencesHelper, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = -1;
        }
        return preferencesHelper.getLongFromPreferences(str, j);
    }

    public static /* synthetic */ String getStringFromPreferences$default(PreferencesHelper preferencesHelper, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return preferencesHelper.getStringFromPreferences(str, str2);
    }

    private final lv7 get_deviceMongoId() {
        return (lv7) this._deviceMongoId$delegate.getValue();
    }

    public static /* synthetic */ void saveDeviceSupervisionStatus$default(PreferencesHelper preferencesHelper, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, int i, Object obj) {
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        preferencesHelper.saveDeviceSupervisionStatus(z, z2, z3, z4, str, str2);
    }

    private static final String saveToPreferences$lambda$1(String str) {
        return tz6.m19210k("Device MongoDB ID updated and emitted: ", stb.m18283w1(8, str), "...");
    }

    public final void clearAuthToken() {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.getClass();
        edit.remove(PrefKeys.AUTH_TOKEN);
        edit.apply();
    }

    public final void clearDeviceSupervisionStatus() {
        saveDeviceSupervisionStatus(false, false, false, false, null, null);
    }

    public final String getAuthToken() {
        return getStringFromPreferences$default(this, PrefKeys.AUTH_TOKEN, null, 2, null);
    }

    public final boolean getBooleanFromPreferences(String str, boolean z) {
        str.getClass();
        return this.sharedPreferences.getBoolean(str, z);
    }

    public final wnb getDeviceMongoId() {
        return (wnb) this.deviceMongoId$delegate.getValue();
    }

    public final float getFloatFromPreferences(String str, float f) {
        str.getClass();
        return this.sharedPreferences.getFloat(str, f);
    }

    public final int getIntFromPreferences(String str, int i) {
        str.getClass();
        return this.sharedPreferences.getInt(str, i);
    }

    public final long getLongFromPreferences(String str, long j) {
        str.getClass();
        return this.sharedPreferences.getLong(str, j);
    }

    public final ne9 getPrayerTime(String str) {
        str.getClass();
        return new ne9(str, this.sharedPreferences.getInt(str.concat("_start_hour"), 0), this.sharedPreferences.getInt(str.concat("_start_minute"), 0), this.sharedPreferences.getInt(str.concat("_end_hour"), 0), this.sharedPreferences.getInt(str.concat("_end_minute"), 0), this.sharedPreferences.getBoolean(str.concat("_enabled"), false));
    }

    public final String getStringFromPreferences(String str, String str2) {
        str.getClass();
        str2.getClass();
        String string = this.sharedPreferences.getString(str, str2);
        return string == null ? str2 : string;
    }

    public final String getUniqueDeviceId() {
        String string = getDeviceIdPrefs().getString("unique_user_id", null);
        if (string == null || string.length() <= 0) {
            return null;
        }
        return string;
    }

    public final boolean isChildDevice() {
        return getBooleanFromPreferences(PrefKeys.IS_CHILD_DEVICE, false);
    }

    public final boolean isParentDevice() {
        return getBooleanFromPreferences(PrefKeys.IS_PARENT_DEVICE, false);
    }

    public final void remove(Collection<String> collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return;
        }
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.getClass();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.apply();
    }

    public final void saveAuthToken(String str) {
        str.getClass();
        saveToPreferences(PrefKeys.AUTH_TOKEN, str);
    }

    public final void saveDeviceSupervisionStatus(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.getClass();
        edit.putBoolean(PrefKeys.IS_SUPERVISED_BY_PARTNER, z3);
        edit.putBoolean(PrefKeys.IS_CHILD_ACCOUNT, z4);
        edit.putBoolean(PrefKeys.IS_CHILD_DEVICE, z);
        edit.putBoolean(PrefKeys.IS_PARENT_DEVICE, z2);
        if (str != null) {
            edit.putString(PrefKeys.SUPERVISOR_NAME, str);
        } else {
            edit.remove(PrefKeys.SUPERVISOR_NAME);
        }
        if (str2 != null) {
            edit.putString(PrefKeys.SUPERVISOR_EMAIL, str2);
        } else {
            edit.remove(PrefKeys.SUPERVISOR_EMAIL);
        }
        edit.apply();
        ynb ynbVar = u53.f41789a;
        Boolean valueOf = Boolean.valueOf(z);
        ynbVar.getClass();
        ynbVar.m22921k(null, valueOf);
        sx7 sx7Var = sx7.f39332a;
        sx7.m18369g(ly6.f25310w, ROLE_TAG, null, saveDeviceSupervisionStatus$lambda$1(z, z2, z3, z4, str, str2));
    }

    public final void savePrayerTime(String str, int i, int i2, int i3, int i4, boolean z) {
        str.getClass();
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.getClass();
        edit.putInt(str.concat("_start_hour"), i);
        edit.putInt(str.concat("_start_minute"), i2);
        edit.putInt(str.concat("_end_hour"), i3);
        edit.putInt(str.concat("_end_minute"), i4);
        edit.putBoolean(str.concat("_enabled"), z);
        edit.apply();
    }

    public final void saveToPreferences(String str, String str2) {
        str.getClass();
        str2.getClass();
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.getClass();
        edit.putString(str, str2);
        edit.apply();
        if (str.equals(PrefKeys.KEY_DEVICE_MONGODB_ID)) {
            ynb ynbVar = (ynb) get_deviceMongoId();
            ynbVar.getClass();
            ynbVar.m22921k(null, str2);
            sx7 sx7Var = sx7.f39332a;
            sx7.m18369g(ly6.f25309v, "PreferencesHelper", null, saveToPreferences$lambda$1(str2));
        }
    }

    private static final String saveDeviceSupervisionStatus$lambda$1(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2) {
        StringBuilder m19220u = tz6.m19220u("PreferencesHelper: Saved isChildDevice=", z, ", isParentDevice=", z2, ", isSupervisedByPartner=");
        tz6.m19225z(m19220u, z3, mDZxtsynkk.btOPbDhMhvA, z4, ", supervisorName=");
        return tz6.m19214o(m19220u, str, ", supervisorEmail=", str2);
    }

    public final void saveToPreferences(String str, int i) {
        str.getClass();
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.getClass();
        edit.putInt(str, i);
        edit.apply();
    }

    public final void saveToPreferences(String str, boolean z) {
        str.getClass();
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.getClass();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public final void saveToPreferences(String str, float f) {
        str.getClass();
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.getClass();
        edit.putFloat(str, f);
        edit.apply();
    }

    public final void saveToPreferences(String str, long j) {
        str.getClass();
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.getClass();
        edit.putLong(str, j);
        edit.apply();
    }
}

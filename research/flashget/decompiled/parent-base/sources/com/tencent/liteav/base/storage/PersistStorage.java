package com.tencent.liteav.base.storage;

import android.content.SharedPreferences;
import android.support.v4.media.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

@JNINamespace("liteav")
/* loaded from: classes7.dex */
public class PersistStorage {
    private String mDomain;
    private final SharedPreferences.Editor mEditor;
    private final SharedPreferences mSharedPreferences;
    private static final String LITEAV_PERSIST_STORAGE_SP_NAME = ProtectedSandApp.s("匣\u0001");
    public static final String GLOBAL_DOMAIN = ProtectedSandApp.s("匦\u0001");

    public PersistStorage(String str) {
        this(str, false);
    }

    private String[] filterSet(Set<String> set, String str) {
        if (str == null || str.isEmpty()) {
            return (String[]) set.toArray(new String[set.size()]);
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : set) {
            if (str2.startsWith(str)) {
                arrayList.add(str2.substring(str.length()));
            }
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    private void initializeDomain(String str, boolean z4) {
        if (z4) {
            this.mDomain = "";
        } else if (str == null || str.isEmpty()) {
            this.mDomain = ProtectedSandApp.s("匥\u0001");
        } else {
            this.mDomain = str.concat(ProtectedSandApp.s("匤\u0001"));
        }
    }

    public static int integerToBase(Integer num) {
        return num.intValue();
    }

    public static long longToBase(Long l4) {
        return l4.longValue();
    }

    public void clear(String str) {
        this.mEditor.remove(this.mDomain + str);
    }

    public void commit() {
        this.mEditor.apply();
    }

    public String[] getAllKeys() {
        Map<String, ?> all = this.mSharedPreferences.getAll();
        return (all == null || all.isEmpty()) ? new String[0] : filterSet(all.keySet(), this.mDomain);
    }

    public Integer getInt(String str) {
        if (!this.mSharedPreferences.contains(this.mDomain + str)) {
            return null;
        }
        try {
            return Integer.valueOf(this.mSharedPreferences.getInt(this.mDomain + str, -1));
        } catch (Throwable unused) {
            return null;
        }
    }

    public Long getLong(String str) {
        if (!this.mSharedPreferences.contains(this.mDomain + str)) {
            return null;
        }
        try {
            return Long.valueOf(this.mSharedPreferences.getLong(this.mDomain + str, -1L));
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getString(String str) {
        if (!this.mSharedPreferences.contains(this.mDomain + str)) {
            return null;
        }
        try {
            return this.mSharedPreferences.getString(this.mDomain + str, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void put(String str, int i4) {
        this.mEditor.putInt(this.mDomain + str, i4);
    }

    public PersistStorage(String str, boolean z4) {
        initializeDomain(str, z4);
        SharedPreferences sharedPreferences = ContextUtils.getApplicationContext().getSharedPreferences(z4 ? str : ProtectedSandApp.s("匣\u0001"), 0);
        this.mSharedPreferences = sharedPreferences;
        this.mEditor = sharedPreferences.edit();
    }

    public void put(String str, long j4) {
        this.mEditor.putLong(c.a(new StringBuilder(), this.mDomain, str), j4);
    }

    public void put(String str, String str2) {
        this.mEditor.putString(this.mDomain + str, str2);
    }
}

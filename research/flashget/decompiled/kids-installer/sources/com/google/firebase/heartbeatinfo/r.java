package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.c1;
import androidx.annotation.m1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: HeartBeatInfoStorage.java */
/* loaded from: classes2.dex */
class r {

    /* renamed from: b, reason: collision with root package name */
    private static r f16665b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final String f16666c = ProtectedSandApp.s("ᘡ");

    /* renamed from: d, reason: collision with root package name */
    private static final String f16667d = ProtectedSandApp.s("ᘢ");

    /* renamed from: e, reason: collision with root package name */
    private static final String f16668e = ProtectedSandApp.s("ᘣ");

    /* renamed from: f, reason: collision with root package name */
    private static final String f16669f = ProtectedSandApp.s("ᘤ");

    /* renamed from: g, reason: collision with root package name */
    private static final String f16670g = ProtectedSandApp.s("ᘥ");

    /* renamed from: h, reason: collision with root package name */
    private static final int f16671h = 30;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f16672a;

    public r(Context context, String str) {
        this.f16672a = context.getSharedPreferences(ProtectedSandApp.s("ᘦ") + str, 0);
    }

    private synchronized void a() {
        long j5 = this.f16672a.getLong(ProtectedSandApp.s("ᘧ"), 0L);
        String str = "";
        String str2 = null;
        for (Map.Entry<String, ?> entry : this.f16672a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str3 : (Set) entry.getValue()) {
                    if (str2 == null || str2.compareTo(str3) > 0) {
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f16672a.getStringSet(str, new HashSet()));
        hashSet.remove(str2);
        this.f16672a.edit().putStringSet(str, hashSet).putLong(ProtectedSandApp.s("ᘨ"), j5 - 1).commit();
    }

    private synchronized String d(long j5) {
        Instant instant;
        ZoneOffset zoneOffset;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String format;
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat(ProtectedSandApp.s("ᘩ"), Locale.UK).format(new Date(j5));
        }
        instant = new Date(j5).toInstant();
        zoneOffset = ZoneOffset.UTC;
        atOffset = instant.atOffset(zoneOffset);
        localDateTime = atOffset.toLocalDateTime();
        dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        format = localDateTime.format(dateTimeFormatter);
        return format;
    }

    private synchronized String g(String str) {
        for (Map.Entry<String, ?> entry : this.f16672a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    private synchronized void j(String str) {
        String g5 = g(str);
        if (g5 == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.f16672a.getStringSet(g5, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            this.f16672a.edit().remove(g5).commit();
        } else {
            this.f16672a.edit().putStringSet(g5, hashSet).commit();
        }
    }

    private synchronized void o(String str, String str2) {
        j(str2);
        HashSet hashSet = new HashSet(this.f16672a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f16672a.edit().putStringSet(str, hashSet).commit();
    }

    synchronized void b() {
        SharedPreferences.Editor edit = this.f16672a.edit();
        int i5 = 0;
        for (Map.Entry<String, ?> entry : this.f16672a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Set set = (Set) entry.getValue();
                String d6 = d(System.currentTimeMillis());
                String key = entry.getKey();
                if (set.contains(d6)) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(d6);
                    i5++;
                    edit.putStringSet(key, hashSet);
                } else {
                    edit.remove(key);
                }
            }
        }
        if (i5 == 0) {
            edit.remove(ProtectedSandApp.s("ᘪ"));
        } else {
            edit.putLong(ProtectedSandApp.s("ᘫ"), i5);
        }
        edit.commit();
    }

    synchronized List<s> c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f16672a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                HashSet hashSet = new HashSet((Set) entry.getValue());
                hashSet.remove(d(System.currentTimeMillis()));
                if (!hashSet.isEmpty()) {
                    arrayList.add(new a(entry.getKey(), new ArrayList(hashSet)));
                }
            }
        }
        n(System.currentTimeMillis());
        return arrayList;
    }

    @c1({c1.a.TESTS})
    @m1
    int e() {
        return (int) this.f16672a.getLong(ProtectedSandApp.s("ᘬ"), 0L);
    }

    synchronized long f() {
        return this.f16672a.getLong(ProtectedSandApp.s("ᘭ"), -1L);
    }

    synchronized boolean h(long j5, long j6) {
        return d(j5).equals(d(j6));
    }

    synchronized void i() {
        String d6 = d(System.currentTimeMillis());
        this.f16672a.edit().putString(ProtectedSandApp.s("ᘮ"), d6).commit();
        j(d6);
    }

    synchronized boolean k(long j5) {
        return l(ProtectedSandApp.s("ᘯ"), j5);
    }

    synchronized boolean l(String str, long j5) {
        if (!this.f16672a.contains(str)) {
            this.f16672a.edit().putLong(str, j5).commit();
            return true;
        }
        if (h(this.f16672a.getLong(str, -1L), j5)) {
            return false;
        }
        this.f16672a.edit().putLong(str, j5).commit();
        return true;
    }

    synchronized void m(long j5, String str) {
        String d6 = d(j5);
        if (this.f16672a.getString(ProtectedSandApp.s("ᘰ"), "").equals(d6)) {
            String g5 = g(d6);
            if (g5 == null) {
                return;
            }
            if (g5.equals(str)) {
                return;
            }
            o(str, d6);
            return;
        }
        long j6 = this.f16672a.getLong(ProtectedSandApp.s("ᘱ"), 0L);
        if (j6 + 1 == 30) {
            a();
            j6 = this.f16672a.getLong(ProtectedSandApp.s("ᘲ"), 0L);
        }
        HashSet hashSet = new HashSet(this.f16672a.getStringSet(str, new HashSet()));
        hashSet.add(d6);
        this.f16672a.edit().putStringSet(str, hashSet).putLong(ProtectedSandApp.s("ᘳ"), j6 + 1).putString(ProtectedSandApp.s("ᘴ"), d6).commit();
    }

    synchronized void n(long j5) {
        this.f16672a.edit().putLong(ProtectedSandApp.s("ᘵ"), j5).commit();
    }

    @c1({c1.a.TESTS})
    @m1
    r(SharedPreferences sharedPreferences) {
        this.f16672a = sharedPreferences;
    }
}

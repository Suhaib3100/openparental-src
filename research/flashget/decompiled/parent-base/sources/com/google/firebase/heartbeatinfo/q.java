package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.c1;
import androidx.annotation.m1;
import com.flashget.parentalcontrol.ProtectedSandApp;
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
/* loaded from: classes6.dex */
class q {

    /* renamed from: b, reason: collision with root package name */
    private static q f59686b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final String f59687c = ProtectedSandApp.s("\u0081\u0001");

    /* renamed from: d, reason: collision with root package name */
    private static final String f59688d = ProtectedSandApp.s("\u0082\u0001");

    /* renamed from: e, reason: collision with root package name */
    private static final String f59689e = ProtectedSandApp.s("\u0083\u0001");

    /* renamed from: f, reason: collision with root package name */
    private static final String f59690f = ProtectedSandApp.s("\u0084\u0001");

    /* renamed from: g, reason: collision with root package name */
    private static final String f59691g = ProtectedSandApp.s("\u0085\u0001");

    /* renamed from: h, reason: collision with root package name */
    private static final int f59692h = 30;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f59693a;

    public q(Context context, String str) {
        this.f59693a = context.getSharedPreferences(ProtectedSandApp.s("\u0083\u0001") + str, 0);
    }

    private synchronized void a() {
        try {
            long j4 = this.f59693a.getLong(ProtectedSandApp.s("\u0084\u0001"), 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.f59693a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f59693a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f59693a.edit().putStringSet(str, hashSet).putLong(ProtectedSandApp.s("\u0084\u0001"), j4 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized String d(long j4) {
        Instant instant;
        ZoneOffset zoneOffset;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String format;
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat(ProtectedSandApp.s("\u0086\u0001"), Locale.UK).format(new Date(j4));
        }
        instant = new Date(j4).toInstant();
        zoneOffset = ZoneOffset.UTC;
        atOffset = instant.atOffset(zoneOffset);
        localDateTime = atOffset.toLocalDateTime();
        dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        format = localDateTime.format(dateTimeFormatter);
        return format;
    }

    private synchronized String g(String str) {
        for (Map.Entry<String, ?> entry : this.f59693a.getAll().entrySet()) {
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
        try {
            String g4 = g(str);
            if (g4 == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f59693a.getStringSet(g4, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f59693a.edit().remove(g4).commit();
            } else {
                this.f59693a.edit().putStringSet(g4, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void o(String str, String str2) {
        j(str2);
        HashSet hashSet = new HashSet(this.f59693a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f59693a.edit().putStringSet(str, hashSet).commit();
    }

    synchronized void b() {
        try {
            SharedPreferences.Editor edit = this.f59693a.edit();
            int i4 = 0;
            for (Map.Entry<String, ?> entry : this.f59693a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String d5 = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(d5)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(d5);
                        i4++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i4 == 0) {
                edit.remove(ProtectedSandApp.s("\u0084\u0001"));
            } else {
                edit.putLong(ProtectedSandApp.s("\u0084\u0001"), i4);
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized List<r> c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f59693a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            n(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    @c1({c1.a.TESTS})
    @m1
    int e() {
        return (int) this.f59693a.getLong(ProtectedSandApp.s("\u0084\u0001"), 0L);
    }

    synchronized long f() {
        return this.f59693a.getLong(ProtectedSandApp.s("\u0081\u0001"), -1L);
    }

    synchronized boolean h(long j4, long j5) {
        return d(j4).equals(d(j5));
    }

    synchronized void i() {
        String d5 = d(System.currentTimeMillis());
        this.f59693a.edit().putString(ProtectedSandApp.s("\u0085\u0001"), d5).commit();
        j(d5);
    }

    synchronized boolean k(long j4) {
        return l(ProtectedSandApp.s("\u0081\u0001"), j4);
    }

    synchronized boolean l(String str, long j4) {
        if (!this.f59693a.contains(str)) {
            this.f59693a.edit().putLong(str, j4).commit();
            return true;
        }
        if (h(this.f59693a.getLong(str, -1L), j4)) {
            return false;
        }
        this.f59693a.edit().putLong(str, j4).commit();
        return true;
    }

    synchronized void m(long j4, String str) {
        String d5 = d(j4);
        if (this.f59693a.getString(ProtectedSandApp.s("\u0085\u0001"), "").equals(d5)) {
            String g4 = g(d5);
            if (g4 == null) {
                return;
            }
            if (g4.equals(str)) {
                return;
            }
            o(str, d5);
            return;
        }
        long j5 = this.f59693a.getLong(ProtectedSandApp.s("\u0084\u0001"), 0L);
        if (j5 + 1 == 30) {
            a();
            j5 = this.f59693a.getLong(ProtectedSandApp.s("\u0084\u0001"), 0L);
        }
        HashSet hashSet = new HashSet(this.f59693a.getStringSet(str, new HashSet()));
        hashSet.add(d5);
        this.f59693a.edit().putStringSet(str, hashSet).putLong(ProtectedSandApp.s("\u0084\u0001"), j5 + 1).putString(ProtectedSandApp.s("\u0085\u0001"), d5).commit();
    }

    synchronized void n(long j4) {
        this.f59693a.edit().putLong(ProtectedSandApp.s("\u0081\u0001"), j4).commit();
    }

    @c1({c1.a.TESTS})
    @m1
    q(SharedPreferences sharedPreferences) {
        this.f59693a = sharedPreferences;
    }
}

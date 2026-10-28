package com.google.firebase.abt;

import android.text.TextUtils;
import androidx.annotation.m1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.analytics.connector.a;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: AbtExperimentInfo.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: g, reason: collision with root package name */
    @m1
    static final String f15028g = ProtectedSandApp.s("ኽ");

    /* renamed from: h, reason: collision with root package name */
    @m1
    static final String f15029h = ProtectedSandApp.s("ኾ");

    /* renamed from: i, reason: collision with root package name */
    @m1
    static final String f15030i = ProtectedSandApp.s("\u12bf");

    /* renamed from: j, reason: collision with root package name */
    @m1
    static final String f15031j = ProtectedSandApp.s("ዀ");

    /* renamed from: k, reason: collision with root package name */
    @m1
    static final String f15032k = ProtectedSandApp.s("\u12c1");

    /* renamed from: l, reason: collision with root package name */
    @m1
    static final String f15033l = ProtectedSandApp.s("ዂ");

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f15034m = {ProtectedSandApp.s("ዅ"), ProtectedSandApp.s("\u12c6"), ProtectedSandApp.s("\u12c7"), ProtectedSandApp.s("ዃ"), ProtectedSandApp.s("ዄ")};

    /* renamed from: n, reason: collision with root package name */
    @m1
    static final DateFormat f15035n = new SimpleDateFormat(ProtectedSandApp.s("ወ"), Locale.US);

    /* renamed from: a, reason: collision with root package name */
    private final String f15036a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15037b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15038c;

    /* renamed from: d, reason: collision with root package name */
    private final Date f15039d;

    /* renamed from: e, reason: collision with root package name */
    private final long f15040e;

    /* renamed from: f, reason: collision with root package name */
    private final long f15041f;

    public a(String str, String str2, String str3, Date date, long j5, long j6) {
        this.f15036a = str;
        this.f15037b = str2;
        this.f15038c = str3;
        this.f15039d = date;
        this.f15040e = j5;
        this.f15041f = j6;
    }

    static a a(a.c cVar) {
        String str = cVar.f15288d;
        if (str == null) {
            str = "";
        }
        return new a(cVar.f15286b, String.valueOf(cVar.f15287c), str, new Date(cVar.f15297m), cVar.f15289e, cVar.f15294j);
    }

    static a b(Map<String, String> map) throws AbtException {
        String s5 = ProtectedSandApp.s("ዉ");
        l(map);
        try {
            return new a(map.get(ProtectedSandApp.s("ው")), map.get(ProtectedSandApp.s("ዎ")), map.containsKey(s5) ? map.get(s5) : "", f15035n.parse(map.get(ProtectedSandApp.s("ዊ"))), Long.parseLong(map.get(ProtectedSandApp.s("ዋ"))), Long.parseLong(map.get(ProtectedSandApp.s("ዌ"))));
        } catch (NumberFormatException e6) {
            throw new AbtException(ProtectedSandApp.s("ዏ"), e6);
        } catch (ParseException e7) {
            throw new AbtException(ProtectedSandApp.s("ዐ"), e7);
        }
    }

    static void k(a aVar) throws AbtException {
        l(aVar.j());
    }

    private static void l(Map<String, String> map) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (String str : f15034m) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format(ProtectedSandApp.s("ዑ"), arrayList));
        }
    }

    String c() {
        return this.f15036a;
    }

    long d() {
        return this.f15039d.getTime();
    }

    long e() {
        return this.f15041f;
    }

    String f() {
        return this.f15038c;
    }

    long g() {
        return this.f15040e;
    }

    String h() {
        return this.f15037b;
    }

    a.c i(String str) {
        a.c cVar = new a.c();
        cVar.f15285a = str;
        cVar.f15297m = d();
        cVar.f15286b = this.f15036a;
        cVar.f15287c = this.f15037b;
        cVar.f15288d = TextUtils.isEmpty(this.f15038c) ? null : this.f15038c;
        cVar.f15289e = this.f15040e;
        cVar.f15294j = this.f15041f;
        return cVar;
    }

    @m1
    Map<String, String> j() {
        HashMap hashMap = new HashMap();
        hashMap.put(ProtectedSandApp.s("ዒ"), this.f15036a);
        hashMap.put(ProtectedSandApp.s("ዓ"), this.f15037b);
        hashMap.put(ProtectedSandApp.s("ዔ"), this.f15038c);
        hashMap.put(ProtectedSandApp.s("ዕ"), f15035n.format(this.f15039d));
        hashMap.put(ProtectedSandApp.s("ዖ"), Long.toString(this.f15040e));
        hashMap.put(ProtectedSandApp.s("\u12d7"), Long.toString(this.f15041f));
        return hashMap;
    }
}

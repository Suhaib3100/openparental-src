package com.google.firebase.abt;

import android.text.TextUtils;
import androidx.annotation.m1;
import com.flashget.parentalcontrol.ProtectedSandApp;
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
/* loaded from: classes6.dex */
public class a {

    /* renamed from: g, reason: collision with root package name */
    @m1
    static final String f58101g = ProtectedSandApp.s("嬨");

    /* renamed from: h, reason: collision with root package name */
    @m1
    static final String f58102h = ProtectedSandApp.s("廒");

    /* renamed from: i, reason: collision with root package name */
    @m1
    static final String f58103i = ProtectedSandApp.s("廙");

    /* renamed from: j, reason: collision with root package name */
    @m1
    static final String f58104j = ProtectedSandApp.s("彩");

    /* renamed from: k, reason: collision with root package name */
    @m1
    static final String f58105k = ProtectedSandApp.s("徭");

    /* renamed from: l, reason: collision with root package name */
    @m1
    static final String f58106l = ProtectedSandApp.s("惘");

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f58107m = {ProtectedSandApp.s("嬨"), ProtectedSandApp.s("彩"), ProtectedSandApp.s("惘"), ProtectedSandApp.s("徭"), ProtectedSandApp.s("廒")};

    /* renamed from: n, reason: collision with root package name */
    @m1
    static final DateFormat f58108n = new SimpleDateFormat(ProtectedSandApp.s("慎"), Locale.US);

    /* renamed from: a, reason: collision with root package name */
    private final String f58109a;

    /* renamed from: b, reason: collision with root package name */
    private final String f58110b;

    /* renamed from: c, reason: collision with root package name */
    private final String f58111c;

    /* renamed from: d, reason: collision with root package name */
    private final Date f58112d;

    /* renamed from: e, reason: collision with root package name */
    private final long f58113e;

    /* renamed from: f, reason: collision with root package name */
    private final long f58114f;

    public a(String str, String str2, String str3, Date date, long j4, long j5) {
        this.f58109a = str;
        this.f58110b = str2;
        this.f58111c = str3;
        this.f58112d = date;
        this.f58113e = j4;
        this.f58114f = j5;
    }

    static a a(a.c cVar) {
        String str = cVar.f58367d;
        if (str == null) {
            str = "";
        }
        return new a(cVar.f58365b, String.valueOf(cVar.f58366c), str, new Date(cVar.f58376m), cVar.f58368e, cVar.f58373j);
    }

    static a b(Map<String, String> map) throws AbtException {
        String s4 = ProtectedSandApp.s("廙");
        l(map);
        try {
            return new a(map.get(ProtectedSandApp.s("嬨")), map.get(ProtectedSandApp.s("廒")), map.containsKey(s4) ? map.get(s4) : "", f58108n.parse(map.get(ProtectedSandApp.s("彩"))), Long.parseLong(map.get(ProtectedSandApp.s("徭"))), Long.parseLong(map.get(ProtectedSandApp.s("惘"))));
        } catch (NumberFormatException e4) {
            throw new AbtException(ProtectedSandApp.s("愈"), (Throwable) e4);
        } catch (ParseException e5) {
            throw new AbtException(ProtectedSandApp.s("憎"), (Throwable) e5);
        }
    }

    static void k(a aVar) throws AbtException {
        l(aVar.j());
    }

    private static void l(Map<String, String> map) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (String str : f58107m) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format(ProtectedSandApp.s("慠"), arrayList));
        }
    }

    String c() {
        return this.f58109a;
    }

    long d() {
        return this.f58112d.getTime();
    }

    long e() {
        return this.f58114f;
    }

    String f() {
        return this.f58111c;
    }

    long g() {
        return this.f58113e;
    }

    String h() {
        return this.f58110b;
    }

    a.c i(String str) {
        a.c cVar = new a.c();
        cVar.f58364a = str;
        cVar.f58376m = d();
        cVar.f58365b = this.f58109a;
        cVar.f58366c = this.f58110b;
        cVar.f58367d = TextUtils.isEmpty(this.f58111c) ? null : this.f58111c;
        cVar.f58368e = this.f58113e;
        cVar.f58373j = this.f58114f;
        return cVar;
    }

    @m1
    Map<String, String> j() {
        HashMap hashMap = new HashMap();
        hashMap.put(ProtectedSandApp.s("嬨"), this.f58109a);
        hashMap.put(ProtectedSandApp.s("廒"), this.f58110b);
        hashMap.put(ProtectedSandApp.s("廙"), this.f58111c);
        hashMap.put(ProtectedSandApp.s("彩"), f58108n.format(this.f58112d));
        hashMap.put(ProtectedSandApp.s("徭"), Long.toString(this.f58113e));
        hashMap.put(ProtectedSandApp.s("惘"), Long.toString(this.f58114f));
        return hashMap;
    }
}

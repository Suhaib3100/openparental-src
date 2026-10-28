package org.mp4parser.aspectj.lang;

import lg.c0;

/* compiled from: JoinPoint.java */
/* loaded from: classes9.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f87694a = "method-execution";

    /* renamed from: b, reason: collision with root package name */
    public static final String f87695b = "method-call";

    /* renamed from: c, reason: collision with root package name */
    public static final String f87696c = "constructor-execution";

    /* renamed from: d, reason: collision with root package name */
    public static final String f87697d = "constructor-call";

    /* renamed from: e, reason: collision with root package name */
    public static final String f87698e = "field-get";

    /* renamed from: f, reason: collision with root package name */
    public static final String f87699f = "field-set";

    /* renamed from: g, reason: collision with root package name */
    public static final String f87700g = "staticinitialization";

    /* renamed from: h, reason: collision with root package name */
    public static final String f87701h = "preinitialization";

    /* renamed from: i, reason: collision with root package name */
    public static final String f87702i = "initialization";

    /* renamed from: j, reason: collision with root package name */
    public static final String f87703j = "exception-handler";

    /* renamed from: k, reason: collision with root package name */
    public static final String f87704k = "lock";

    /* renamed from: l, reason: collision with root package name */
    public static final String f87705l = "unlock";

    /* renamed from: m, reason: collision with root package name */
    public static final String f87706m = "adviceexecution";

    /* compiled from: JoinPoint.java */
    public interface a extends b {
    }

    /* compiled from: JoinPoint.java */
    public interface b {
        int a();

        String b();

        String d();

        String f();

        c0 g();

        e h();

        String toString();
    }

    String b();

    b c();

    String d();

    Object e();

    String f();

    c0 g();

    e h();

    Object j();

    Object[] k();

    String toString();
}

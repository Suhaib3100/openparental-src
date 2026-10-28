package com.google.firebase.crashlytics.internal.common;

/* compiled from: ResponseParser.java */
/* loaded from: classes6.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f58835a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f58836b = 1;

    public static int a(int i4) {
        if (i4 < 200 || i4 > 299) {
            return ((i4 < 300 || i4 > 399) && i4 >= 400 && i4 <= 499) ? 0 : 1;
        }
        return 0;
    }
}

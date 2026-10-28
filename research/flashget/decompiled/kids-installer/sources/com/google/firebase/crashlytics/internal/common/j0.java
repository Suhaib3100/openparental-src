package com.google.firebase.crashlytics.internal.common;

/* compiled from: ResponseParser.java */
/* loaded from: classes2.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f15621a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f15622b = 1;

    public static int a(int i5) {
        if (i5 < 200 || i5 > 299) {
            return ((i5 < 300 || i5 > 399) && i5 >= 400 && i5 <= 499) ? 0 : 1;
        }
        return 0;
    }
}

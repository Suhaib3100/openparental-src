package com.tencent.beacon.base.net.adapter;

import com.tencent.beacon.base.net.BodyType;

/* compiled from: HttpAdapter.java */
/* loaded from: classes6.dex */
/* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f71145a;

    static {
        int[] iArr = new int[BodyType.values().length];
        f71145a = iArr;
        try {
            iArr[BodyType.DATA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f71145a[BodyType.FORM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f71145a[BodyType.JSON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}

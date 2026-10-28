package com.tencent.beacon.base.net.adapter;

import com.tencent.beacon.base.net.BodyType;

/* compiled from: OkHttpAdapter.java */
/* loaded from: classes6.dex */
/* synthetic */ class e {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f71152a;

    static {
        int[] iArr = new int[BodyType.values().length];
        f71152a = iArr;
        try {
            iArr[BodyType.FORM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f71152a[BodyType.JSON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f71152a[BodyType.DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}

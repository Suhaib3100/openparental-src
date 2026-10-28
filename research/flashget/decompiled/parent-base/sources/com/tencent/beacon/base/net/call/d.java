package com.tencent.beacon.base.net.call;

import com.tencent.beacon.base.net.BodyType;

/* compiled from: HttpRequestEntity.java */
/* loaded from: classes6.dex */
/* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f71347a;

    static {
        int[] iArr = new int[BodyType.values().length];
        f71347a = iArr;
        try {
            iArr[BodyType.JSON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f71347a[BodyType.FORM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f71347a[BodyType.DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}

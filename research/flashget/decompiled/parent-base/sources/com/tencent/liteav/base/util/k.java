package com.tencent.liteav.base.util;

/* loaded from: classes7.dex */
public enum k {
    f71939a(0),
    f71940b(90),
    f71941c(180),
    f71942d(270);


    /* renamed from: e, reason: collision with root package name */
    private static final k[] f71943e = values();
    public final int mValue;

    k(int i4) {
        this.mValue = i4;
    }

    public static k a(int i4) {
        for (k kVar : f71943e) {
            if (kVar.mValue == i4) {
                return kVar;
            }
        }
        return f71939a;
    }

    public static boolean b(int i4) {
        return i4 == 0 || i4 == 90 || i4 == 180 || i4 == 270;
    }

    public static int a(k kVar) {
        if (kVar != null) {
            return kVar.mValue;
        }
        return f71939a.mValue;
    }
}

package com.airbnb.lottie.model;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Marker.java */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: d, reason: collision with root package name */
    private static final String f39091d = ProtectedSandApp.s("Ř");

    /* renamed from: a, reason: collision with root package name */
    private final String f39092a;

    /* renamed from: b, reason: collision with root package name */
    public final float f39093b;

    /* renamed from: c, reason: collision with root package name */
    public final float f39094c;

    public h(String str, float f4, float f5) {
        this.f39092a = str;
        this.f39094c = f5;
        this.f39093b = f4;
    }

    public float a() {
        return this.f39094c;
    }

    public String b() {
        return this.f39092a;
    }

    public float c() {
        return this.f39093b;
    }

    public boolean d(String str) {
        if (this.f39092a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f39092a.endsWith(ProtectedSandApp.s("Ř"))) {
            String str2 = this.f39092a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}

package com.google.firebase.remoteconfig.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: FirebaseRemoteConfigValueImpl.java */
/* loaded from: classes3.dex */
public class y implements com.google.firebase.remoteconfig.s {

    /* renamed from: c, reason: collision with root package name */
    private static final String f18068c = ProtectedSandApp.s("⬮");

    /* renamed from: a, reason: collision with root package name */
    private final String f18069a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18070b;

    y(String str, int i5) {
        this.f18069a = str;
        this.f18070b = i5;
    }

    private String f() {
        return d().trim();
    }

    private void g() {
        if (this.f18069a == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("⬧"));
        }
    }

    @Override // com.google.firebase.remoteconfig.s
    public long a() {
        if (this.f18070b == 0) {
            return 0L;
        }
        String f6 = f();
        try {
            return Long.valueOf(f6).longValue();
        } catch (NumberFormatException e6) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("⬩"), f6, ProtectedSandApp.s("⬨")), e6);
        }
    }

    @Override // com.google.firebase.remoteconfig.s
    public byte[] b() {
        return this.f18070b == 0 ? com.google.firebase.remoteconfig.p.f18291q : this.f18069a.getBytes(p.f17981e);
    }

    @Override // com.google.firebase.remoteconfig.s
    public double c() {
        if (this.f18070b == 0) {
            return com.google.firebase.remoteconfig.p.f18289o;
        }
        String f6 = f();
        try {
            return Double.valueOf(f6).doubleValue();
        } catch (NumberFormatException e6) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("⬫"), f6, ProtectedSandApp.s("⬪")), e6);
        }
    }

    @Override // com.google.firebase.remoteconfig.s
    public String d() {
        if (this.f18070b == 0) {
            return "";
        }
        g();
        return this.f18069a;
    }

    @Override // com.google.firebase.remoteconfig.s
    public boolean e() throws IllegalArgumentException {
        if (this.f18070b == 0) {
            return false;
        }
        String f6 = f();
        if (p.f17982f.matcher(f6).matches()) {
            return true;
        }
        if (p.f17983g.matcher(f6).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("⬭"), f6, ProtectedSandApp.s("⬬")));
    }

    @Override // com.google.firebase.remoteconfig.s
    public int k() {
        return this.f18070b;
    }
}

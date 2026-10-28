package com.google.firebase.remoteconfig.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: FirebaseRemoteConfigValueImpl.java */
/* loaded from: classes6.dex */
public class y implements com.google.firebase.remoteconfig.s {

    /* renamed from: c, reason: collision with root package name */
    private static final String f60614c = ProtectedSandApp.s("ς\u0001");

    /* renamed from: a, reason: collision with root package name */
    private final String f60615a;

    /* renamed from: b, reason: collision with root package name */
    private final int f60616b;

    y(String str, int i4) {
        this.f60615a = str;
        this.f60616b = i4;
    }

    private String g() {
        return a().trim();
    }

    private void h() {
        if (this.f60615a == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("π\u0001"));
        }
    }

    @Override // com.google.firebase.remoteconfig.s
    public String a() {
        if (this.f60616b == 0) {
            return "";
        }
        h();
        return this.f60615a;
    }

    @Override // com.google.firebase.remoteconfig.s
    public byte[] b() {
        return this.f60616b == 0 ? com.google.firebase.remoteconfig.p.f60681r : this.f60615a.getBytes(p.f60514e);
    }

    @Override // com.google.firebase.remoteconfig.s
    public long c() {
        if (this.f60616b == 0) {
            return 0L;
        }
        String g4 = g();
        try {
            return Long.valueOf(g4).longValue();
        } catch (NumberFormatException e4) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("ς\u0001"), g4, ProtectedSandApp.s("ρ\u0001")), e4);
        }
    }

    @Override // com.google.firebase.remoteconfig.s
    public double d() {
        if (this.f60616b == 0) {
            return com.google.firebase.remoteconfig.p.f60679p;
        }
        String g4 = g();
        try {
            return Double.valueOf(g4).doubleValue();
        } catch (NumberFormatException e4) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("ς\u0001"), g4, ProtectedSandApp.s("σ\u0001")), e4);
        }
    }

    @Override // com.google.firebase.remoteconfig.s
    public boolean e() throws IllegalArgumentException {
        if (this.f60616b == 0) {
            return false;
        }
        String g4 = g();
        if (p.f60515f.matcher(g4).matches()) {
            return true;
        }
        if (p.f60516g.matcher(g4).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("ς\u0001"), g4, ProtectedSandApp.s("τ\u0001")));
    }

    @Override // com.google.firebase.remoteconfig.s
    public int f() {
        return this.f60616b;
    }
}

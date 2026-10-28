package com.google.zxing.client.result;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: GeoParsedResult.java */
/* loaded from: classes6.dex */
public final class m extends q {

    /* renamed from: b, reason: collision with root package name */
    private final double f62739b;

    /* renamed from: c, reason: collision with root package name */
    private final double f62740c;

    /* renamed from: d, reason: collision with root package name */
    private final double f62741d;

    /* renamed from: e, reason: collision with root package name */
    private final String f62742e;

    m(double d5, double d6, double d7, String str) {
        super(r.GEO);
        this.f62739b = d5;
        this.f62740c = d6;
        this.f62741d = d7;
        this.f62742e = str;
    }

    @Override // com.google.zxing.client.result.q
    public String a() {
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.f62739b);
        String s4 = ProtectedSandApp.s("৹\u0001");
        sb.append(s4);
        sb.append(this.f62740c);
        if (this.f62741d > com.google.firebase.remoteconfig.p.f60679p) {
            sb.append(s4);
            sb.append(this.f62741d);
            sb.append('m');
        }
        if (this.f62742e != null) {
            sb.append(ProtectedSandApp.s("৺\u0001"));
            sb.append(this.f62742e);
            sb.append(')');
        }
        return sb.toString();
    }

    public double e() {
        return this.f62741d;
    }

    public String f() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("৻\u0001"));
        sb.append(this.f62739b);
        sb.append(',');
        sb.append(this.f62740c);
        if (this.f62741d > com.google.firebase.remoteconfig.p.f60679p) {
            sb.append(',');
            sb.append(this.f62741d);
        }
        if (this.f62742e != null) {
            sb.append('?');
            sb.append(this.f62742e);
        }
        return sb.toString();
    }

    public double g() {
        return this.f62739b;
    }

    public double h() {
        return this.f62740c;
    }

    public String i() {
        return this.f62742e;
    }
}

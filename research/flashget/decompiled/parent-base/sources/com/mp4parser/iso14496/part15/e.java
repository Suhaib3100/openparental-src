package com.mp4parser.iso14496.part15;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;

/* compiled from: TemporalLayerSampleGroup.java */
/* loaded from: classes6.dex */
public class e extends com.googlecode.mp4parser.boxes.mp4.samplegrouping.b {

    /* renamed from: l, reason: collision with root package name */
    public static final String f70070l = ProtectedSandApp.s("ᦌ\u0001");

    /* renamed from: a, reason: collision with root package name */
    int f70071a;

    /* renamed from: b, reason: collision with root package name */
    int f70072b;

    /* renamed from: c, reason: collision with root package name */
    boolean f70073c;

    /* renamed from: d, reason: collision with root package name */
    int f70074d;

    /* renamed from: e, reason: collision with root package name */
    long f70075e;

    /* renamed from: f, reason: collision with root package name */
    long f70076f;

    /* renamed from: g, reason: collision with root package name */
    int f70077g;

    /* renamed from: h, reason: collision with root package name */
    int f70078h;

    /* renamed from: i, reason: collision with root package name */
    int f70079i;

    /* renamed from: j, reason: collision with root package name */
    int f70080j;

    /* renamed from: k, reason: collision with root package name */
    int f70081k;

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        i.m(allocate, this.f70071a);
        i.m(allocate, (this.f70072b << 6) + (this.f70073c ? 32 : 0) + this.f70074d);
        allocate.putInt((int) this.f70075e);
        i.k(allocate, this.f70076f);
        i.m(allocate, this.f70077g);
        i.f(allocate, this.f70078h);
        i.f(allocate, this.f70079i);
        i.m(allocate, this.f70080j);
        i.f(allocate, this.f70081k);
        return (ByteBuffer) allocate.rewind();
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public String b() {
        return ProtectedSandApp.s("ᦌ\u0001");
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public void c(ByteBuffer byteBuffer) {
        this.f70071a = g.p(byteBuffer);
        int p4 = g.p(byteBuffer);
        this.f70072b = (p4 & 192) >> 6;
        this.f70073c = (p4 & 32) > 0;
        this.f70074d = p4 & 31;
        this.f70075e = g.l(byteBuffer);
        this.f70076f = g.n(byteBuffer);
        this.f70077g = g.p(byteBuffer);
        this.f70078h = g.i(byteBuffer);
        this.f70079i = g.i(byteBuffer);
        this.f70080j = g.p(byteBuffer);
        this.f70081k = g.i(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public int d() {
        return 20;
    }

    public int e() {
        return this.f70071a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f70071a == eVar.f70071a && this.f70079i == eVar.f70079i && this.f70081k == eVar.f70081k && this.f70080j == eVar.f70080j && this.f70078h == eVar.f70078h && this.f70076f == eVar.f70076f && this.f70077g == eVar.f70077g && this.f70075e == eVar.f70075e && this.f70074d == eVar.f70074d && this.f70072b == eVar.f70072b && this.f70073c == eVar.f70073c;
    }

    public int f() {
        return this.f70079i;
    }

    public int g() {
        return this.f70081k;
    }

    public int h() {
        return this.f70080j;
    }

    public int hashCode() {
        int i4 = ((((((this.f70071a * 31) + this.f70072b) * 31) + (this.f70073c ? 1 : 0)) * 31) + this.f70074d) * 31;
        long j4 = this.f70075e;
        int i5 = (i4 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f70076f;
        return ((((((((((i5 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f70077g) * 31) + this.f70078h) * 31) + this.f70079i) * 31) + this.f70080j) * 31) + this.f70081k;
    }

    public int i() {
        return this.f70078h;
    }

    public long j() {
        return this.f70076f;
    }

    public int k() {
        return this.f70077g;
    }

    public long l() {
        return this.f70075e;
    }

    public int m() {
        return this.f70074d;
    }

    public int n() {
        return this.f70072b;
    }

    public boolean o() {
        return this.f70073c;
    }

    public void p(int i4) {
        this.f70071a = i4;
    }

    public void q(int i4) {
        this.f70079i = i4;
    }

    public void r(int i4) {
        this.f70081k = i4;
    }

    public void s(int i4) {
        this.f70080j = i4;
    }

    public void t(int i4) {
        this.f70078h = i4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ᦍ\u0001"));
        sb.append(this.f70071a);
        sb.append(ProtectedSandApp.s("ᦎ\u0001"));
        sb.append(this.f70072b);
        sb.append(ProtectedSandApp.s("ᦏ\u0001"));
        sb.append(this.f70073c);
        sb.append(ProtectedSandApp.s("ᦐ\u0001"));
        sb.append(this.f70074d);
        sb.append(ProtectedSandApp.s("ᦑ\u0001"));
        sb.append(this.f70075e);
        sb.append(ProtectedSandApp.s("ᦒ\u0001"));
        sb.append(this.f70076f);
        sb.append(ProtectedSandApp.s("ᦓ\u0001"));
        sb.append(this.f70077g);
        sb.append(ProtectedSandApp.s("ᦔ\u0001"));
        sb.append(this.f70078h);
        sb.append(ProtectedSandApp.s("ᦕ\u0001"));
        sb.append(this.f70079i);
        sb.append(ProtectedSandApp.s("ᦖ\u0001"));
        sb.append(this.f70080j);
        sb.append(ProtectedSandApp.s("ᦗ\u0001"));
        return androidx.view.e.a(sb, this.f70081k, '}');
    }

    public void u(long j4) {
        this.f70076f = j4;
    }

    public void v(int i4) {
        this.f70077g = i4;
    }

    public void w(long j4) {
        this.f70075e = j4;
    }

    public void x(int i4) {
        this.f70074d = i4;
    }

    public void y(int i4) {
        this.f70072b = i4;
    }

    public void z(boolean z4) {
        this.f70073c = z4;
    }
}

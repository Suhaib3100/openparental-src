package com.coremedia.iso.boxes.fragment;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.view.e;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.c;
import java.nio.ByteBuffer;

/* compiled from: SampleFlags.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private byte f47613a;

    /* renamed from: b, reason: collision with root package name */
    private byte f47614b;

    /* renamed from: c, reason: collision with root package name */
    private byte f47615c;

    /* renamed from: d, reason: collision with root package name */
    private byte f47616d;

    /* renamed from: e, reason: collision with root package name */
    private byte f47617e;

    /* renamed from: f, reason: collision with root package name */
    private byte f47618f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f47619g;

    /* renamed from: h, reason: collision with root package name */
    private int f47620h;

    public a() {
    }

    public void a(ByteBuffer byteBuffer) {
        i.i(byteBuffer, (this.f47613a << c.F) | (this.f47614b << 26) | (this.f47615c << c.B) | (this.f47616d << c.f54880z) | (this.f47617e << c.f54878x) | (this.f47618f << 17) | ((this.f47619g ? 1 : 0) << 16) | this.f47620h);
    }

    public byte b() {
        return this.f47614b;
    }

    public int c() {
        return this.f47613a;
    }

    public int d() {
        return this.f47620h;
    }

    public int e() {
        return this.f47615c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f47614b == aVar.f47614b && this.f47613a == aVar.f47613a && this.f47620h == aVar.f47620h && this.f47615c == aVar.f47615c && this.f47617e == aVar.f47617e && this.f47616d == aVar.f47616d && this.f47619g == aVar.f47619g && this.f47618f == aVar.f47618f;
    }

    public int f() {
        return this.f47617e;
    }

    public int g() {
        return this.f47616d;
    }

    public int h() {
        return this.f47618f;
    }

    public int hashCode() {
        return (((((((((((((this.f47613a * c.I) + this.f47614b) * 31) + this.f47615c) * 31) + this.f47616d) * 31) + this.f47617e) * 31) + this.f47618f) * 31) + (this.f47619g ? 1 : 0)) * 31) + this.f47620h;
    }

    public boolean i() {
        return this.f47619g;
    }

    public void j(byte b5) {
        this.f47614b = b5;
    }

    public void k(int i4) {
        this.f47613a = (byte) i4;
    }

    public void l(int i4) {
        this.f47620h = i4;
    }

    public void m(int i4) {
        this.f47615c = (byte) i4;
    }

    public void n(int i4) {
        this.f47617e = (byte) i4;
    }

    public void o(int i4) {
        this.f47616d = (byte) i4;
    }

    public void p(boolean z4) {
        this.f47619g = z4;
    }

    public void q(int i4) {
        this.f47618f = (byte) i4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ᐇ"));
        sb.append((int) this.f47613a);
        sb.append(ProtectedSandApp.s("ᐈ"));
        sb.append((int) this.f47614b);
        sb.append(ProtectedSandApp.s("ᐉ"));
        sb.append((int) this.f47615c);
        sb.append(ProtectedSandApp.s("ᐊ"));
        sb.append((int) this.f47616d);
        sb.append(ProtectedSandApp.s("ᐋ"));
        sb.append((int) this.f47617e);
        sb.append(ProtectedSandApp.s("ᐌ"));
        sb.append((int) this.f47618f);
        sb.append(ProtectedSandApp.s("ᐍ"));
        sb.append(this.f47619g);
        sb.append(ProtectedSandApp.s("ᐎ"));
        return e.a(sb, this.f47620h, '}');
    }

    public a(ByteBuffer byteBuffer) {
        long l4 = g.l(byteBuffer);
        this.f47613a = (byte) (((-268435456) & l4) >> 28);
        this.f47614b = (byte) ((201326592 & l4) >> 26);
        this.f47615c = (byte) ((50331648 & l4) >> 24);
        this.f47616d = (byte) ((12582912 & l4) >> 22);
        this.f47617e = (byte) ((3145728 & l4) >> 20);
        this.f47618f = (byte) ((917504 & l4) >> 17);
        this.f47619g = ((PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH & l4) >> 16) > 0;
        this.f47620h = (int) (l4 & okhttp3.internal.ws.g.f84969s);
    }
}

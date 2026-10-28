package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: BaseDescriptor.java */
@g(tags = {0})
/* loaded from: classes6.dex */
public abstract class b {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f63957d = false;

    /* renamed from: a, reason: collision with root package name */
    int f63958a;

    /* renamed from: b, reason: collision with root package name */
    int f63959b;

    /* renamed from: c, reason: collision with root package name */
    int f63960c;

    abstract int a();

    public int b() {
        return c() + a() + 1;
    }

    public int c() {
        int a5 = a();
        int i4 = 0;
        while (true) {
            if (a5 <= 0 && i4 >= this.f63960c) {
                return i4;
            }
            a5 >>>= 7;
            i4++;
        }
    }

    public int d() {
        return this.f63958a;
    }

    public final void e(int i4, ByteBuffer byteBuffer) throws IOException {
        this.f63958a = i4;
        int p4 = com.coremedia.iso.g.p(byteBuffer);
        this.f63959b = p4 & 127;
        int i5 = 1;
        while ((p4 >>> 7) == 1) {
            p4 = com.coremedia.iso.g.p(byteBuffer);
            i5++;
            this.f63959b = (this.f63959b << 7) | (p4 & 127);
        }
        this.f63960c = i5;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.f63959b);
        f(slice);
        byteBuffer.position(byteBuffer.position() + this.f63959b);
    }

    public abstract void f(ByteBuffer byteBuffer) throws IOException;

    public abstract ByteBuffer g();

    public void h(ByteBuffer byteBuffer, int i4) {
        int position = byteBuffer.position();
        int i5 = 0;
        while (true) {
            if (i4 <= 0 && i5 >= this.f63960c) {
                byteBuffer.position(c() + position);
                return;
            }
            i5++;
            if (i4 > 0) {
                byteBuffer.put((c() + position) - i5, (byte) (i4 & 127));
            } else {
                byteBuffer.put((c() + position) - i5, Byte.MIN_VALUE);
            }
            i4 >>>= 7;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ኼ\u0001"));
        sb.append(this.f63958a);
        sb.append(ProtectedSandApp.s("ኽ\u0001"));
        return androidx.view.e.a(sb, this.f63959b, '}');
    }
}

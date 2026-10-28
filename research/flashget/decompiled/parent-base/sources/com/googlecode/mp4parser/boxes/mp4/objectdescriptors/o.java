package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: SLConfigDescriptor.java */
@g(tags = {6})
/* loaded from: classes6.dex */
public class o extends b {

    /* renamed from: e, reason: collision with root package name */
    int f64013e;

    public o() {
        this.f63958a = 6;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    int a() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f64013e == ((o) obj).f64013e;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public void f(ByteBuffer byteBuffer) throws IOException {
        this.f64013e = com.coremedia.iso.g.p(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public ByteBuffer g() {
        ByteBuffer allocate = ByteBuffer.allocate(b());
        com.coremedia.iso.i.m(allocate, 6);
        h(allocate, a());
        com.coremedia.iso.i.m(allocate, this.f64013e);
        return allocate;
    }

    public int hashCode() {
        return this.f64013e;
    }

    public int i() {
        return this.f64013e;
    }

    public void j(int i4) {
        this.f64013e = i4;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public String toString() {
        return androidx.view.e.a(new StringBuilder(ProtectedSandApp.s("፠\u0001")), this.f64013e, '}');
    }
}

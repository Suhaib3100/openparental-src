package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ProfileLevelIndicationDescriptor.java */
@g(tags = {20})
/* loaded from: classes6.dex */
public class n extends b {

    /* renamed from: e, reason: collision with root package name */
    int f64012e;

    public n() {
        this.f63958a = 20;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public int a() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f64012e == ((n) obj).f64012e;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public void f(ByteBuffer byteBuffer) throws IOException {
        this.f64012e = com.coremedia.iso.g.p(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public ByteBuffer g() {
        ByteBuffer allocate = ByteBuffer.allocate(b());
        com.coremedia.iso.i.m(allocate, 20);
        h(allocate, a());
        com.coremedia.iso.i.m(allocate, this.f64012e);
        return allocate;
    }

    public int hashCode() {
        return this.f64012e;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public String toString() {
        return ProtectedSandApp.s("፟\u0001") + Integer.toHexString(this.f64012e) + '}';
    }
}

package com.mp4parser.iso14496.part15;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;

/* compiled from: SyncSampleEntry.java */
/* loaded from: classes6.dex */
public class d extends com.googlecode.mp4parser.boxes.mp4.samplegrouping.b {

    /* renamed from: c, reason: collision with root package name */
    public static final String f70067c = ProtectedSandApp.s("ᦉ\u0001");

    /* renamed from: a, reason: collision with root package name */
    int f70068a;

    /* renamed from: b, reason: collision with root package name */
    int f70069b;

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        i.m(allocate, this.f70069b + (this.f70068a << 6));
        return (ByteBuffer) allocate.rewind();
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public String b() {
        return ProtectedSandApp.s("ᦉ\u0001");
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public void c(ByteBuffer byteBuffer) {
        int p4 = g.p(byteBuffer);
        this.f70068a = (p4 & 192) >> 6;
        this.f70069b = p4 & 63;
    }

    public int e() {
        return this.f70069b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f70069b == dVar.f70069b && this.f70068a == dVar.f70068a;
    }

    public int f() {
        return this.f70068a;
    }

    public void g(int i4) {
        this.f70069b = i4;
    }

    public void h(int i4) {
        this.f70068a = i4;
    }

    public int hashCode() {
        return (this.f70068a * 31) + this.f70069b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ᦊ\u0001"));
        sb.append(this.f70068a);
        sb.append(ProtectedSandApp.s("ᦋ\u0001"));
        return androidx.view.e.a(sb, this.f70069b, '}');
    }
}

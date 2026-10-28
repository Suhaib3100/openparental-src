package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;

/* compiled from: VisualRandomAccessEntry.java */
/* loaded from: classes6.dex */
public class g extends b {

    /* renamed from: c, reason: collision with root package name */
    public static final String f64038c = ProtectedSandApp.s("Ꭺ\u0001");

    /* renamed from: a, reason: collision with root package name */
    private boolean f64039a;

    /* renamed from: b, reason: collision with root package name */
    private short f64040b;

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.put((byte) ((this.f64039a ? 128 : 0) | (this.f64040b & 127)));
        allocate.rewind();
        return allocate;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public String b() {
        return ProtectedSandApp.s("Ꭺ\u0001");
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public void c(ByteBuffer byteBuffer) {
        byte b5 = byteBuffer.get();
        this.f64039a = (b5 & 128) == 128;
        this.f64040b = (short) (b5 & Byte.MAX_VALUE);
    }

    public short e() {
        return this.f64040b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f64040b == gVar.f64040b && this.f64039a == gVar.f64039a;
    }

    public boolean f() {
        return this.f64039a;
    }

    public void g(short s4) {
        this.f64040b = s4;
    }

    public void h(boolean z4) {
        this.f64039a = z4;
    }

    public int hashCode() {
        return ((this.f64039a ? 1 : 0) * 31) + this.f64040b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("Ꭻ\u0001"));
        sb.append(this.f64039a);
        sb.append(ProtectedSandApp.s("Ꭼ\u0001"));
        return androidx.view.e.a(sb, this.f64040b, '}');
    }
}

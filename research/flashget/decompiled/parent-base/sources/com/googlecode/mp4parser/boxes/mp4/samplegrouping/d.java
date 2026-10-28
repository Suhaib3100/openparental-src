package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;

/* compiled from: RollRecoveryEntry.java */
/* loaded from: classes6.dex */
public class d extends b {

    /* renamed from: b, reason: collision with root package name */
    public static final String f64031b = ProtectedSandApp.s("Ꭶ\u0001");

    /* renamed from: a, reason: collision with root package name */
    private short f64032a;

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort(this.f64032a);
        allocate.rewind();
        return allocate;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public String b() {
        return ProtectedSandApp.s("Ꭶ\u0001");
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public void c(ByteBuffer byteBuffer) {
        this.f64032a = byteBuffer.getShort();
    }

    public short e() {
        return this.f64032a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f64032a == ((d) obj).f64032a;
    }

    public void f(short s4) {
        this.f64032a = s4;
    }

    public int hashCode() {
        return this.f64032a;
    }
}

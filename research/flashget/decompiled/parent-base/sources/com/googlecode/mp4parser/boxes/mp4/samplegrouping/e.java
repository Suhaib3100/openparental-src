package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import androidx.compose.animation.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;

/* compiled from: TemporalLevelEntry.java */
/* loaded from: classes6.dex */
public class e extends b {

    /* renamed from: c, reason: collision with root package name */
    public static final String f64033c = ProtectedSandApp.s("Ꭷ\u0001");

    /* renamed from: a, reason: collision with root package name */
    private boolean f64034a;

    /* renamed from: b, reason: collision with root package name */
    private short f64035b;

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.put((byte) (this.f64034a ? 128 : 0));
        allocate.rewind();
        return allocate;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public String b() {
        return ProtectedSandApp.s("Ꭷ\u0001");
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public void c(ByteBuffer byteBuffer) {
        this.f64034a = (byteBuffer.get() & 128) == 128;
    }

    public boolean e() {
        return this.f64034a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f64034a == eVar.f64034a && this.f64035b == eVar.f64035b;
    }

    public void f(boolean z4) {
        this.f64034a = z4;
    }

    public int hashCode() {
        return ((this.f64034a ? 1 : 0) * 31) + this.f64035b;
    }

    public String toString() {
        return l.a(new StringBuilder(ProtectedSandApp.s("Ꭸ\u0001")), this.f64034a, '}');
    }
}

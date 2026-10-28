package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* compiled from: IntVector.java */
/* loaded from: classes3.dex */
public final class l extends b {
    public l f(int i4, ByteBuffer byteBuffer) {
        b(i4, 4, byteBuffer);
        return this;
    }

    public int g(int i4) {
        return this.f29329d.getInt(a(i4));
    }

    public long h(int i4) {
        return g(i4) & 4294967295L;
    }
}

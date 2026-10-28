package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* compiled from: ByteVector.java */
/* loaded from: classes3.dex */
public final class f extends b {
    public f f(int i4, ByteBuffer byteBuffer) {
        b(i4, 1, byteBuffer);
        return this;
    }

    public byte g(int i4) {
        return this.f29329d.get(a(i4));
    }

    public int h(int i4) {
        return g(i4) & 255;
    }
}

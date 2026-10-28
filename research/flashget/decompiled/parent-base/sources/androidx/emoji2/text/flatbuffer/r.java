package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import kotlin.g2;

/* compiled from: ShortVector.java */
/* loaded from: classes3.dex */
public final class r extends b {
    public r f(int i4, ByteBuffer byteBuffer) {
        b(i4, 2, byteBuffer);
        return this;
    }

    public short g(int i4) {
        return this.f29329d.getShort(a(i4));
    }

    public int h(int i4) {
        return g(i4) & g2.f75095e;
    }
}

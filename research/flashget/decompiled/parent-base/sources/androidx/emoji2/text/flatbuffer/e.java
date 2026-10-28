package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* compiled from: ByteBufferUtil.java */
/* loaded from: classes3.dex */
public class e {
    public static int a(ByteBuffer byteBuffer) {
        return byteBuffer.getInt(byteBuffer.position());
    }

    public static ByteBuffer b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(duplicate.position() + 4);
        return duplicate;
    }
}

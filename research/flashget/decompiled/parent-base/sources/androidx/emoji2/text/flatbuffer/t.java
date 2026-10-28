package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* compiled from: Struct.java */
/* loaded from: classes3.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    protected int f29382a;

    /* renamed from: b, reason: collision with root package name */
    protected ByteBuffer f29383b;

    public void a() {
        b(0, null);
    }

    protected void b(int i4, ByteBuffer byteBuffer) {
        this.f29383b = byteBuffer;
        if (byteBuffer != null) {
            this.f29382a = i4;
        } else {
            this.f29382a = 0;
        }
    }
}

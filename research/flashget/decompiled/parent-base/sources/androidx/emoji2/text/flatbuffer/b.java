package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* compiled from: BaseVector.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private int f29326a;

    /* renamed from: b, reason: collision with root package name */
    private int f29327b;

    /* renamed from: c, reason: collision with root package name */
    private int f29328c;

    /* renamed from: d, reason: collision with root package name */
    protected ByteBuffer f29329d;

    protected int a(int i4) {
        return (i4 * this.f29328c) + this.f29326a;
    }

    protected void b(int i4, int i5, ByteBuffer byteBuffer) {
        this.f29329d = byteBuffer;
        if (byteBuffer != null) {
            this.f29326a = i4;
            this.f29327b = byteBuffer.getInt(i4 - 4);
            this.f29328c = i5;
        } else {
            this.f29326a = 0;
            this.f29327b = 0;
            this.f29328c = 0;
        }
    }

    protected int c() {
        return this.f29326a;
    }

    public int d() {
        return this.f29327b;
    }

    public void e() {
        b(0, 0, null);
    }
}

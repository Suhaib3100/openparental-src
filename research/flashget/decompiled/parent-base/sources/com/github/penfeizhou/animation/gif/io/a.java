package com.github.penfeizhou.animation.gif.io;

import com.github.penfeizhou.animation.io.f;
import java.nio.IntBuffer;

/* compiled from: GifWriter.java */
/* loaded from: classes5.dex */
public class a implements f {

    /* renamed from: a, reason: collision with root package name */
    protected IntBuffer f50827a;

    public a() {
        e(androidx.work.f.f35970d);
    }

    @Override // com.github.penfeizhou.animation.io.f
    public void a(byte[] bArr) {
    }

    @Override // com.github.penfeizhou.animation.io.f
    public void b(int i4) {
        this.f50827a.position(position() + i4);
    }

    public IntBuffer c() {
        return this.f50827a;
    }

    @Override // com.github.penfeizhou.animation.io.f
    public void close() {
    }

    @Override // com.github.penfeizhou.animation.io.f
    public void d(byte b5) {
    }

    @Override // com.github.penfeizhou.animation.io.f
    public void e(int i4) {
        IntBuffer intBuffer = this.f50827a;
        if (intBuffer == null || i4 > intBuffer.capacity()) {
            this.f50827a = IntBuffer.allocate(i4);
        }
        this.f50827a.clear();
        this.f50827a.limit(i4);
        this.f50827a.position(0);
    }

    public int[] f() {
        return this.f50827a.array();
    }

    @Override // com.github.penfeizhou.animation.io.f
    public byte[] m() {
        return null;
    }

    @Override // com.github.penfeizhou.animation.io.f
    public int position() {
        return this.f50827a.position();
    }
}

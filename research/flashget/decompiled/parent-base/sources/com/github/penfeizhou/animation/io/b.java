package com.github.penfeizhou.animation.io;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: ByteBufferWriter.java */
/* loaded from: classes5.dex */
public class b implements f {

    /* renamed from: a, reason: collision with root package name */
    protected ByteBuffer f50849a;

    public b() {
        e(androidx.work.f.f35970d);
    }

    @Override // com.github.penfeizhou.animation.io.f
    public void a(byte[] bArr) {
        this.f50849a.put(bArr);
    }

    @Override // com.github.penfeizhou.animation.io.f
    public void b(int i4) {
        this.f50849a.position(position() + i4);
    }

    @Override // com.github.penfeizhou.animation.io.f
    public void close() {
    }

    @Override // com.github.penfeizhou.animation.io.f
    public void d(byte b5) {
        this.f50849a.put(b5);
    }

    @Override // com.github.penfeizhou.animation.io.f
    public void e(int i4) {
        ByteBuffer byteBuffer = this.f50849a;
        if (byteBuffer == null || i4 > byteBuffer.capacity()) {
            ByteBuffer allocate = ByteBuffer.allocate(i4);
            this.f50849a = allocate;
            allocate.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.f50849a.clear();
    }

    @Override // com.github.penfeizhou.animation.io.f
    public byte[] m() {
        return this.f50849a.array();
    }

    @Override // com.github.penfeizhou.animation.io.f
    public int position() {
        return this.f50849a.position();
    }
}

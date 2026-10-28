package com.googlecode.mp4parser;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: MemoryDataSourceImpl.java */
/* loaded from: classes6.dex */
public class e implements a {

    /* renamed from: b, reason: collision with root package name */
    ByteBuffer f64068b;

    public e(byte[] bArr) {
        this.f64068b = ByteBuffer.wrap(bArr);
    }

    @Override // com.googlecode.mp4parser.a
    public void O1(long j4) throws IOException {
        this.f64068b.position(com.googlecode.mp4parser.util.c.a(j4));
    }

    @Override // com.googlecode.mp4parser.a
    public long T(long j4, long j5, WritableByteChannel writableByteChannel) throws IOException {
        return writableByteChannel.write((ByteBuffer) ((ByteBuffer) this.f64068b.position(com.googlecode.mp4parser.util.c.a(j4))).slice().limit(com.googlecode.mp4parser.util.c.a(j5)));
    }

    @Override // com.googlecode.mp4parser.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // com.googlecode.mp4parser.a
    public ByteBuffer e3(long j4, long j5) throws IOException {
        int position = this.f64068b.position();
        this.f64068b.position(com.googlecode.mp4parser.util.c.a(j4));
        ByteBuffer slice = this.f64068b.slice();
        slice.limit(com.googlecode.mp4parser.util.c.a(j5));
        this.f64068b.position(position);
        return slice;
    }

    @Override // com.googlecode.mp4parser.a
    public long position() throws IOException {
        return this.f64068b.position();
    }

    @Override // com.googlecode.mp4parser.a
    public int read(ByteBuffer byteBuffer) throws IOException {
        if (this.f64068b.remaining() == 0 && byteBuffer.remaining() != 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.f64068b.remaining());
        if (byteBuffer.hasArray()) {
            byteBuffer.put(this.f64068b.array(), this.f64068b.position(), min);
            ByteBuffer byteBuffer2 = this.f64068b;
            byteBuffer2.position(byteBuffer2.position() + min);
        } else {
            byte[] bArr = new byte[min];
            this.f64068b.get(bArr);
            byteBuffer.put(bArr);
        }
        return min;
    }

    @Override // com.googlecode.mp4parser.a
    public long size() throws IOException {
        return this.f64068b.capacity();
    }

    public e(ByteBuffer byteBuffer) {
        this.f64068b = byteBuffer;
    }
}

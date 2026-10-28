package com.googlecode.mp4parser.util;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

/* compiled from: ByteBufferByteChannel.java */
/* loaded from: classes6.dex */
public class b implements ByteChannel {

    /* renamed from: b, reason: collision with root package name */
    ByteBuffer f64083b;

    public b(ByteBuffer byteBuffer) {
        this.f64083b = byteBuffer;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        if (this.f64083b.remaining() <= 0) {
            return -1;
        }
        byteBuffer.put((ByteBuffer) this.f64083b.duplicate().limit(byteBuffer.remaining() + this.f64083b.position()));
        ByteBuffer byteBuffer2 = this.f64083b;
        byteBuffer2.position(byteBuffer2.position() + remaining);
        return remaining;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        this.f64083b.put(byteBuffer);
        return remaining;
    }
}

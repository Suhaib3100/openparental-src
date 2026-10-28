package com.github.penfeizhou.animation.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferReader.java */
/* loaded from: classes5.dex */
public class a implements Reader {

    /* renamed from: b, reason: collision with root package name */
    protected final ByteBuffer f50848b;

    public a(ByteBuffer byteBuffer) {
        this.f50848b = byteBuffer;
        byteBuffer.position(0);
    }

    public ByteBuffer a() {
        return this.f50848b;
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public int available() throws IOException {
        return this.f50848b.limit() - this.f50848b.position();
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public void close() throws IOException {
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public byte peek() throws IOException {
        return this.f50848b.get();
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public int position() {
        return this.f50848b.position();
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        this.f50848b.get(bArr, i4, i5);
        return i5;
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public void reset() throws IOException {
        this.f50848b.position(0);
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public long skip(long j4) throws IOException {
        this.f50848b.position((int) (r0.position() + j4));
        return j4;
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public InputStream toInputStream() throws IOException {
        return new ByteArrayInputStream(this.f50848b.array());
    }
}

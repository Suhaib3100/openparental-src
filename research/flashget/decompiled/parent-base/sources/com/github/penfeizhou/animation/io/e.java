package com.github.penfeizhou.animation.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamReader.java */
/* loaded from: classes5.dex */
public class e extends FilterInputStream implements Reader {

    /* renamed from: b, reason: collision with root package name */
    private int f50851b;

    public e(InputStream inputStream) {
        super(inputStream);
        try {
            inputStream.reset();
        } catch (IOException unused) {
        }
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public byte peek() throws IOException {
        byte read = (byte) read();
        this.f50851b++;
        return read;
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public int position() {
        return this.f50851b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, com.github.penfeizhou.animation.io.Reader
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        int read = super.read(bArr, i4, i5);
        this.f50851b = Math.max(0, read) + this.f50851b;
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, com.github.penfeizhou.animation.io.Reader
    public synchronized void reset() throws IOException {
        super.reset();
        this.f50851b = 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, com.github.penfeizhou.animation.io.Reader
    public long skip(long j4) throws IOException {
        long j5 = j4;
        while (j5 > 0) {
            long skip = super.skip(j5);
            if (skip > 0) {
                j5 -= skip;
            } else {
                if (super.read() == -1) {
                    break;
                }
                j5--;
            }
        }
        long j6 = j4 - j5;
        this.f50851b = (int) (this.f50851b + j6);
        return j6;
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public InputStream toInputStream() throws IOException {
        return this;
    }
}

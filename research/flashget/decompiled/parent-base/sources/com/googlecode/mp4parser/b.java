package com.googlecode.mp4parser;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: DirectFileReadDataSource.java */
/* loaded from: classes6.dex */
public class b implements a {

    /* renamed from: d, reason: collision with root package name */
    private static final int f63863d = 8192;

    /* renamed from: b, reason: collision with root package name */
    private RandomAccessFile f63864b;

    /* renamed from: c, reason: collision with root package name */
    private String f63865c;

    public b(File file) throws IOException {
        this.f63864b = new RandomAccessFile(file, ProtectedSandApp.s("༣\u0001"));
        this.f63865c = file.getName();
    }

    @Override // com.googlecode.mp4parser.a
    public void O1(long j4) throws IOException {
        this.f63864b.seek(j4);
    }

    @Override // com.googlecode.mp4parser.a
    public long T(long j4, long j5, WritableByteChannel writableByteChannel) throws IOException {
        return writableByteChannel.write(e3(j4, j5));
    }

    public int a(ByteBuffer byteBuffer) throws IOException {
        byte[] bArr = new byte[byteBuffer.remaining()];
        int read = this.f63864b.read(bArr);
        byteBuffer.put(bArr, 0, read);
        return read;
    }

    @Override // com.googlecode.mp4parser.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f63864b.close();
    }

    @Override // com.googlecode.mp4parser.a
    public ByteBuffer e3(long j4, long j5) throws IOException {
        this.f63864b.seek(j4);
        byte[] bArr = new byte[com.googlecode.mp4parser.util.c.a(j5)];
        this.f63864b.readFully(bArr);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.googlecode.mp4parser.a
    public long position() throws IOException {
        return this.f63864b.getFilePointer();
    }

    @Override // com.googlecode.mp4parser.a
    public int read(ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[8192];
        int i4 = 0;
        int i5 = 0;
        while (i4 < remaining) {
            i5 = this.f63864b.read(bArr, 0, Math.min(remaining - i4, 8192));
            if (i5 < 0) {
                break;
            }
            i4 += i5;
            byteBuffer.put(bArr, 0, i5);
        }
        if (i5 >= 0 || i4 != 0) {
            return i4;
        }
        return -1;
    }

    @Override // com.googlecode.mp4parser.a
    public long size() throws IOException {
        return this.f63864b.length();
    }

    public String toString() {
        return this.f63865c;
    }
}

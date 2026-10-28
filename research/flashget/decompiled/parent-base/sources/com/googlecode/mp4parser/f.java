package com.googlecode.mp4parser;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/* compiled from: MultiFileDataSourceImpl.java */
/* loaded from: classes6.dex */
public class f implements a {

    /* renamed from: b, reason: collision with root package name */
    FileChannel[] f64069b;

    /* renamed from: c, reason: collision with root package name */
    int f64070c = 0;

    public f(File... fileArr) throws FileNotFoundException {
        this.f64069b = new FileChannel[fileArr.length];
        for (int i4 = 0; i4 < fileArr.length; i4++) {
            this.f64069b[i4] = new FileInputStream(fileArr[i4]).getChannel();
        }
    }

    @Override // com.googlecode.mp4parser.a
    public void O1(long j4) throws IOException {
        int i4 = 0;
        while (true) {
            FileChannel[] fileChannelArr = this.f64069b;
            if (i4 >= fileChannelArr.length) {
                return;
            }
            if (j4 - fileChannelArr[i4].size() < 0) {
                this.f64069b[i4].position(j4);
                this.f64070c = i4;
                return;
            } else {
                j4 -= this.f64069b[i4].size();
                i4++;
            }
        }
    }

    @Override // com.googlecode.mp4parser.a
    public long T(long j4, long j5, WritableByteChannel writableByteChannel) throws IOException {
        if (j5 == 0) {
            return 0L;
        }
        long j6 = 0;
        for (FileChannel fileChannel : this.f64069b) {
            long size = fileChannel.size();
            if (j4 >= j6 && j4 < j6 + size && j4 + j5 > j6) {
                long j7 = j4 - j6;
                long min = Math.min(j5, size - j7);
                fileChannel.transferTo(j7, min, writableByteChannel);
                return min + T(j4 + min, j5 - min, writableByteChannel);
            }
            j6 += size;
        }
        return 0L;
    }

    @Override // com.googlecode.mp4parser.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        for (FileChannel fileChannel : this.f64069b) {
            fileChannel.close();
        }
    }

    @Override // com.googlecode.mp4parser.a
    public ByteBuffer e3(long j4, long j5) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(com.googlecode.mp4parser.util.c.a(j5));
        T(j4, j5, Channels.newChannel(byteArrayOutputStream));
        return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
    }

    @Override // com.googlecode.mp4parser.a
    public long position() throws IOException {
        long j4 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f64070c;
            if (i4 >= i5) {
                return this.f64069b[i5].position() + j4;
            }
            j4 += this.f64069b[i4].size();
            i4++;
        }
    }

    @Override // com.googlecode.mp4parser.a
    public int read(ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        int read = this.f64069b[this.f64070c].read(byteBuffer);
        if (read == remaining) {
            return read;
        }
        this.f64070c++;
        return read(byteBuffer) + read;
    }

    @Override // com.googlecode.mp4parser.a
    public long size() throws IOException {
        long j4 = 0;
        for (FileChannel fileChannel : this.f64069b) {
            j4 += fileChannel.size();
        }
        return j4;
    }
}

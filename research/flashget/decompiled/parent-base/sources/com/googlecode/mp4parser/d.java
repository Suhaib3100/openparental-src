package com.googlecode.mp4parser;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.util.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/* compiled from: FileDataSourceViaHeapImpl.java */
/* loaded from: classes6.dex */
public class d implements a {

    /* renamed from: d, reason: collision with root package name */
    private static i f64065d = i.a(d.class);

    /* renamed from: b, reason: collision with root package name */
    FileChannel f64066b;

    /* renamed from: c, reason: collision with root package name */
    String f64067c;

    public d(File file) throws FileNotFoundException {
        this.f64066b = new FileInputStream(file).getChannel();
        this.f64067c = file.getName();
    }

    @Override // com.googlecode.mp4parser.a
    public synchronized void O1(long j4) throws IOException {
        this.f64066b.position(j4);
    }

    @Override // com.googlecode.mp4parser.a
    public synchronized long T(long j4, long j5, WritableByteChannel writableByteChannel) throws IOException {
        return this.f64066b.transferTo(j4, j5, writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f64066b.close();
    }

    @Override // com.googlecode.mp4parser.a
    public synchronized ByteBuffer e3(long j4, long j5) throws IOException {
        ByteBuffer allocate;
        allocate = ByteBuffer.allocate(com.googlecode.mp4parser.util.c.a(j5));
        this.f64066b.read(allocate, j4);
        return (ByteBuffer) allocate.rewind();
    }

    @Override // com.googlecode.mp4parser.a
    public synchronized long position() throws IOException {
        return this.f64066b.position();
    }

    @Override // com.googlecode.mp4parser.a
    public synchronized int read(ByteBuffer byteBuffer) throws IOException {
        return this.f64066b.read(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    public synchronized long size() throws IOException {
        return this.f64066b.size();
    }

    public String toString() {
        return this.f64067c;
    }

    public d(String str) throws FileNotFoundException {
        File file = new File(str);
        this.f64066b = new FileInputStream(file).getChannel();
        this.f64067c = file.getName();
    }

    public d(FileChannel fileChannel) {
        this.f64066b = fileChannel;
        this.f64067c = ProtectedSandApp.s("ᐴ\u0001");
    }

    public d(FileChannel fileChannel, String str) {
        this.f64066b = fileChannel;
        this.f64067c = str;
    }
}

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

/* compiled from: FileDataSourceImpl.java */
/* loaded from: classes6.dex */
public class c implements a {

    /* renamed from: d, reason: collision with root package name */
    private static i f64053d = i.a(c.class);

    /* renamed from: b, reason: collision with root package name */
    FileChannel f64054b;

    /* renamed from: c, reason: collision with root package name */
    String f64055c;

    public c(File file) throws FileNotFoundException {
        this.f64054b = new FileInputStream(file).getChannel();
        this.f64055c = file.getName();
    }

    @Override // com.googlecode.mp4parser.a
    public synchronized void O1(long j4) throws IOException {
        this.f64054b.position(j4);
    }

    @Override // com.googlecode.mp4parser.a
    public synchronized long T(long j4, long j5, WritableByteChannel writableByteChannel) throws IOException {
        return this.f64054b.transferTo(j4, j5, writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f64054b.close();
    }

    @Override // com.googlecode.mp4parser.a
    public synchronized ByteBuffer e3(long j4, long j5) throws IOException {
        return this.f64054b.map(FileChannel.MapMode.READ_ONLY, j4, j5);
    }

    @Override // com.googlecode.mp4parser.a
    public synchronized long position() throws IOException {
        return this.f64054b.position();
    }

    @Override // com.googlecode.mp4parser.a
    public synchronized int read(ByteBuffer byteBuffer) throws IOException {
        return this.f64054b.read(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    public synchronized long size() throws IOException {
        return this.f64054b.size();
    }

    public String toString() {
        return this.f64055c;
    }

    public c(String str) throws FileNotFoundException {
        File file = new File(str);
        this.f64054b = new FileInputStream(file).getChannel();
        this.f64055c = file.getName();
    }

    public c(FileChannel fileChannel) {
        this.f64054b = fileChannel;
        this.f64055c = ProtectedSandApp.s("ᐧ\u0001");
    }

    public c(FileChannel fileChannel, String str) {
        this.f64054b = fileChannel;
        this.f64055c = str;
    }
}

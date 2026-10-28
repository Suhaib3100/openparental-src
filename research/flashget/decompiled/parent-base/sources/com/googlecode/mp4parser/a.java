package com.googlecode.mp4parser;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: DataSource.java */
/* loaded from: classes6.dex */
public interface a extends Closeable {
    void O1(long j4) throws IOException;

    long T(long j4, long j5, WritableByteChannel writableByteChannel) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    ByteBuffer e3(long j4, long j5) throws IOException;

    long position() throws IOException;

    int read(ByteBuffer byteBuffer) throws IOException;

    long size() throws IOException;
}

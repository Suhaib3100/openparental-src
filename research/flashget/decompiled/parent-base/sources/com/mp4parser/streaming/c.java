package com.mp4parser.streaming;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: StreamingMp4Writer.java */
/* loaded from: classes6.dex */
public interface c extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void w() throws IOException;
}

package com.coremedia.iso.boxes;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: Box.java */
/* loaded from: classes3.dex */
public interface b {
    void getBox(WritableByteChannel writableByteChannel) throws IOException;

    long getOffset();

    c getParent();

    long getSize();

    String getType();

    void parse(com.googlecode.mp4parser.a aVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException;

    void setParent(c cVar);
}

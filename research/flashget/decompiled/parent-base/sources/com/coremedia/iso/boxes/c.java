package com.coremedia.iso.boxes;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;

/* compiled from: Container.java */
/* loaded from: classes3.dex */
public interface c {
    List<b> getBoxes();

    <T extends b> List<T> getBoxes(Class<T> cls);

    <T extends b> List<T> getBoxes(Class<T> cls, boolean z4);

    ByteBuffer getByteBuffer(long j4, long j5) throws IOException;

    void setBoxes(List<b> list);

    void writeContainer(WritableByteChannel writableByteChannel) throws IOException;
}

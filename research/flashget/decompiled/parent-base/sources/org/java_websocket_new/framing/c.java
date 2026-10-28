package org.java_websocket_new.framing;

import java.nio.ByteBuffer;
import org.java_websocket_new.exceptions.InvalidDataException;
import org.java_websocket_new.framing.d;

/* compiled from: FrameBuilder.java */
/* loaded from: classes6.dex */
public interface c extends d {
    void c(d.a aVar);

    void d(boolean z4);

    void e(boolean z4);

    void i(ByteBuffer byteBuffer) throws InvalidDataException;
}

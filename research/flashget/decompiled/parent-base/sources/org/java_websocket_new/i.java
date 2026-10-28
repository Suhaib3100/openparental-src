package org.java_websocket_new;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import javax.net.ssl.SSLException;

/* compiled from: WrappedByteChannel.java */
/* loaded from: classes6.dex */
public interface i extends ByteChannel {
    boolean g0();

    void p1() throws IOException;

    int s1(ByteBuffer byteBuffer) throws SSLException;

    boolean u1();

    boolean x1();
}

package org.java_websocket_new;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SocketChannel;
import javax.net.ssl.SSLException;

/* compiled from: AbstractWrappedByteChannel.java */
/* loaded from: classes6.dex */
public class a implements i {

    /* renamed from: b, reason: collision with root package name */
    private final ByteChannel f86920b;

    public a(ByteChannel byteChannel) {
        this.f86920b = byteChannel;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f86920b.close();
    }

    @Override // org.java_websocket_new.i
    public boolean g0() {
        ByteChannel byteChannel = this.f86920b;
        if (byteChannel instanceof SocketChannel) {
            return ((SocketChannel) byteChannel).isBlocking();
        }
        if (byteChannel instanceof i) {
            return ((i) byteChannel).g0();
        }
        return false;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f86920b.isOpen();
    }

    @Override // org.java_websocket_new.i
    public void p1() throws IOException {
        ByteChannel byteChannel = this.f86920b;
        if (byteChannel instanceof i) {
            ((i) byteChannel).p1();
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        return this.f86920b.read(byteBuffer);
    }

    @Override // org.java_websocket_new.i
    public int s1(ByteBuffer byteBuffer) throws SSLException {
        ByteChannel byteChannel = this.f86920b;
        if (byteChannel instanceof i) {
            return ((i) byteChannel).s1(byteBuffer);
        }
        return 0;
    }

    @Override // org.java_websocket_new.i
    public boolean u1() {
        ByteChannel byteChannel = this.f86920b;
        if (byteChannel instanceof i) {
            return ((i) byteChannel).u1();
        }
        return false;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        return this.f86920b.write(byteBuffer);
    }

    @Override // org.java_websocket_new.i
    public boolean x1() {
        ByteChannel byteChannel = this.f86920b;
        if (byteChannel instanceof i) {
            return ((i) byteChannel).x1();
        }
        return false;
    }

    public a(i iVar) {
        this.f86920b = iVar;
    }
}

package org.java_websocket_new.client;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

/* compiled from: AbstractClientProxyChannel.java */
/* loaded from: classes6.dex */
public abstract class a extends org.java_websocket_new.a {

    /* renamed from: c, reason: collision with root package name */
    protected final ByteBuffer f86934c;

    public a(ByteChannel byteChannel) {
        super(byteChannel);
        try {
            this.f86934c = ByteBuffer.wrap(a().getBytes("ASCII"));
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException(e4);
        }
    }

    public abstract String a();

    @Override // org.java_websocket_new.a, java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        return !this.f86934c.hasRemaining() ? super.write(byteBuffer) : super.write(this.f86934c);
    }
}

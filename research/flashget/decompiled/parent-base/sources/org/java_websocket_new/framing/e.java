package org.java_websocket_new.framing;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.java_websocket_new.exceptions.InvalidDataException;
import org.java_websocket_new.exceptions.InvalidFrameException;
import org.java_websocket_new.framing.d;

/* compiled from: FramedataImpl1.java */
/* loaded from: classes6.dex */
public class e implements c {

    /* renamed from: t, reason: collision with root package name */
    protected static byte[] f86998t = new byte[0];

    /* renamed from: p, reason: collision with root package name */
    protected boolean f86999p;

    /* renamed from: q, reason: collision with root package name */
    protected d.a f87000q;

    /* renamed from: r, reason: collision with root package name */
    private ByteBuffer f87001r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f87002s;

    public e() {
    }

    @Override // org.java_websocket_new.framing.d
    public boolean a() {
        return this.f87002s;
    }

    @Override // org.java_websocket_new.framing.d
    public d.a b() {
        return this.f87000q;
    }

    @Override // org.java_websocket_new.framing.c
    public void c(d.a aVar) {
        this.f87000q = aVar;
    }

    @Override // org.java_websocket_new.framing.c
    public void d(boolean z4) {
        this.f86999p = z4;
    }

    @Override // org.java_websocket_new.framing.c
    public void e(boolean z4) {
        this.f87002s = z4;
    }

    @Override // org.java_websocket_new.framing.d
    public boolean f() {
        return this.f86999p;
    }

    @Override // org.java_websocket_new.framing.d
    public ByteBuffer h() {
        return this.f87001r;
    }

    @Override // org.java_websocket_new.framing.c
    public void i(ByteBuffer byteBuffer) throws InvalidDataException {
        this.f87001r = byteBuffer;
    }

    @Override // org.java_websocket_new.framing.d
    public void j(d dVar) throws InvalidFrameException {
        ByteBuffer h4 = dVar.h();
        if (this.f87001r == null) {
            this.f87001r = ByteBuffer.allocate(h4.remaining());
            h4.mark();
            this.f87001r.put(h4);
            h4.reset();
        } else {
            h4.mark();
            ByteBuffer byteBuffer = this.f87001r;
            byteBuffer.position(byteBuffer.limit());
            ByteBuffer byteBuffer2 = this.f87001r;
            byteBuffer2.limit(byteBuffer2.capacity());
            if (h4.remaining() > this.f87001r.remaining()) {
                ByteBuffer allocate = ByteBuffer.allocate(this.f87001r.capacity() + h4.remaining());
                this.f87001r.flip();
                allocate.put(this.f87001r);
                allocate.put(h4);
                this.f87001r = allocate;
            } else {
                this.f87001r.put(h4);
            }
            this.f87001r.rewind();
            h4.reset();
        }
        this.f86999p = dVar.f();
    }

    public String toString() {
        return "Framedata{ optcode:" + b() + ", fin:" + f() + ", payloadlength:[pos:" + this.f87001r.position() + ", len:" + this.f87001r.remaining() + "], payload:" + Arrays.toString(org.java_websocket_new.util.b.g(new String(this.f87001r.array()))) + "}";
    }

    public e(d.a aVar) {
        this.f87000q = aVar;
        this.f87001r = ByteBuffer.wrap(f86998t);
    }

    public e(d dVar) {
        this.f86999p = dVar.f();
        this.f87000q = dVar.b();
        this.f87001r = dVar.h();
        this.f87002s = dVar.a();
    }
}

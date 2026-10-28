package org.java_websocket_new.framing;

import java.nio.ByteBuffer;
import org.java_websocket_new.exceptions.InvalidDataException;
import org.java_websocket_new.exceptions.InvalidFrameException;
import org.java_websocket_new.framing.d;

/* compiled from: CloseFrameBuilder.java */
/* loaded from: classes6.dex */
public class b extends e implements a {

    /* renamed from: w, reason: collision with root package name */
    static final ByteBuffer f86995w = ByteBuffer.allocate(0);

    /* renamed from: u, reason: collision with root package name */
    private int f86996u;

    /* renamed from: v, reason: collision with root package name */
    private String f86997v;

    public b() {
        super(d.a.CLOSING);
        d(true);
    }

    private void k() throws InvalidFrameException {
        this.f86996u = 1005;
        ByteBuffer h4 = super.h();
        h4.mark();
        if (h4.remaining() >= 2) {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.position(2);
            allocate.putShort(h4.getShort());
            allocate.position(0);
            int i4 = allocate.getInt();
            this.f86996u = i4;
            if (i4 == 1006 || i4 == 1015 || i4 == 1005 || i4 > 4999 || i4 < 1000 || i4 == 1004) {
                throw new InvalidFrameException("closecode must not be sent over the wire: " + this.f86996u);
            }
        }
        h4.reset();
    }

    private void l() throws InvalidDataException {
        if (this.f86996u == 1005) {
            this.f86997v = org.java_websocket_new.util.b.e(super.h());
            return;
        }
        ByteBuffer h4 = super.h();
        int position = h4.position();
        try {
            try {
                h4.position(h4.position() + 2);
                this.f86997v = org.java_websocket_new.util.b.e(h4);
            } catch (IllegalArgumentException e4) {
                throw new InvalidFrameException(e4);
            }
        } finally {
            h4.position(position);
        }
    }

    private void m(int i4, String str) throws InvalidDataException {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (i4 == 1015) {
            i4 = 1005;
        } else {
            str2 = str;
        }
        if (i4 == 1005) {
            if (str2.length() > 0) {
                throw new InvalidDataException(1002, "A close frame must have a closecode if it has a reason");
            }
            return;
        }
        byte[] g4 = org.java_websocket_new.util.b.g(str2);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i4);
        allocate.position(2);
        ByteBuffer allocate2 = ByteBuffer.allocate(g4.length + 2);
        allocate2.put(allocate);
        allocate2.put(g4);
        allocate2.rewind();
        i(allocate2);
    }

    @Override // org.java_websocket_new.framing.a
    public int g() {
        return this.f86996u;
    }

    @Override // org.java_websocket_new.framing.a
    public String getMessage() {
        return this.f86997v;
    }

    @Override // org.java_websocket_new.framing.e, org.java_websocket_new.framing.d
    public ByteBuffer h() {
        return this.f86996u == 1005 ? f86995w : super.h();
    }

    @Override // org.java_websocket_new.framing.e, org.java_websocket_new.framing.c
    public void i(ByteBuffer byteBuffer) throws InvalidDataException {
        super.i(byteBuffer);
        k();
        l();
    }

    @Override // org.java_websocket_new.framing.e
    public String toString() {
        return String.valueOf(super.toString()) + "code: " + this.f86996u;
    }

    public b(int i4) throws InvalidDataException {
        super(d.a.CLOSING);
        d(true);
        m(i4, "");
    }

    public b(int i4, String str) throws InvalidDataException {
        super(d.a.CLOSING);
        d(true);
        m(i4, str);
    }
}

package org.java_websocket_new.drafts;

import eg.f;
import eg.h;
import eg.i;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.java_websocket_new.d;
import org.java_websocket_new.drafts.a;
import org.java_websocket_new.exceptions.InvalidDataException;
import org.java_websocket_new.exceptions.InvalidFrameException;
import org.java_websocket_new.exceptions.InvalidHandshakeException;
import org.java_websocket_new.exceptions.LimitExedeedException;
import org.java_websocket_new.exceptions.NotSendableException;
import org.java_websocket_new.framing.d;

/* compiled from: Draft_10.java */
/* loaded from: classes6.dex */
public class b extends org.java_websocket_new.drafts.a {

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ boolean f86954i = false;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f86955f;

    /* renamed from: g, reason: collision with root package name */
    private org.java_websocket_new.framing.d f86956g = null;

    /* renamed from: h, reason: collision with root package name */
    private final Random f86957h = new Random();

    /* compiled from: Draft_10.java */
    private class a extends Throwable {

        /* renamed from: d, reason: collision with root package name */
        private static final long f86958d = 7330519489840500997L;

        /* renamed from: b, reason: collision with root package name */
        private int f86959b;

        public a(int i4) {
            this.f86959b = i4;
        }

        public int a() {
            return this.f86959b;
        }
    }

    private d.a A(byte b5) throws InvalidFrameException {
        if (b5 == 0) {
            return d.a.CONTINUOUS;
        }
        if (b5 == 1) {
            return d.a.TEXT;
        }
        if (b5 == 2) {
            return d.a.BINARY;
        }
        switch (b5) {
            case 8:
                return d.a.CLOSING;
            case 9:
                return d.a.PING;
            case 10:
                return d.a.PONG;
            default:
                throw new InvalidFrameException("unknow optcode " + ((int) b5));
        }
    }

    private byte w(d.a aVar) {
        if (aVar == d.a.CONTINUOUS) {
            return (byte) 0;
        }
        if (aVar == d.a.TEXT) {
            return (byte) 1;
        }
        if (aVar == d.a.BINARY) {
            return (byte) 2;
        }
        if (aVar == d.a.CLOSING) {
            return (byte) 8;
        }
        if (aVar == d.a.PING) {
            return (byte) 9;
        }
        if (aVar == d.a.PONG) {
            return (byte) 10;
        }
        throw new RuntimeException("Don't know how to handle " + aVar.toString());
    }

    private String x(String str) {
        String concat = String.valueOf(str.trim()).concat("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
        try {
            return org.java_websocket_new.util.a.s(MessageDigest.getInstance("SHA1").digest(concat.getBytes()));
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static int y(f fVar) {
        String k4 = fVar.k("Sec-WebSocket-Version");
        if (k4.length() > 0) {
            try {
                return new Integer(k4.trim()).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    private byte[] z(long j4, int i4) {
        byte[] bArr = new byte[i4];
        int i5 = (i4 * 8) - 8;
        for (int i6 = 0; i6 < i4; i6++) {
            bArr[i6] = (byte) (j4 >>> (i5 - (i6 * 8)));
        }
        return bArr;
    }

    public org.java_websocket_new.framing.d B(ByteBuffer byteBuffer) throws a, InvalidDataException {
        org.java_websocket_new.framing.c eVar;
        int remaining = byteBuffer.remaining();
        int i4 = 2;
        if (remaining < 2) {
            throw new a(2);
        }
        byte b5 = byteBuffer.get();
        boolean z4 = (b5 >> 8) != 0;
        byte b6 = (byte) ((b5 & Byte.MAX_VALUE) >> 4);
        if (b6 != 0) {
            throw new InvalidFrameException(android.support.v4.media.a.a("bad rsv ", b6));
        }
        byte b7 = byteBuffer.get();
        boolean z5 = (b7 & Byte.MIN_VALUE) != 0;
        int i5 = (byte) (b7 & Byte.MAX_VALUE);
        d.a A = A((byte) (b5 & com.google.common.base.c.f54871q));
        if (!z4 && (A == d.a.PING || A == d.a.PONG || A == d.a.CLOSING)) {
            throw new InvalidFrameException("control frames may no be fragmented");
        }
        if (i5 < 0 || i5 > 125) {
            if (A == d.a.PING || A == d.a.PONG || A == d.a.CLOSING) {
                throw new InvalidFrameException("more than 125 octets");
            }
            if (i5 != 126) {
                i4 = 10;
                if (remaining < 10) {
                    throw new a(10);
                }
                byte[] bArr = new byte[8];
                for (int i6 = 0; i6 < 8; i6++) {
                    bArr[i6] = byteBuffer.get();
                }
                long longValue = new BigInteger(bArr).longValue();
                if (longValue > 2147483647L) {
                    throw new LimitExedeedException("Payloadsize is to big...");
                }
                i5 = (int) longValue;
            } else {
                if (remaining < 4) {
                    throw new a(4);
                }
                i5 = new BigInteger(new byte[]{0, byteBuffer.get(), byteBuffer.get()}).intValue();
                i4 = 4;
            }
        }
        int i7 = i4 + (z5 ? 4 : 0) + i5;
        if (remaining < i7) {
            throw new a(i7);
        }
        ByteBuffer allocate = ByteBuffer.allocate(d(i5));
        if (z5) {
            byte[] bArr2 = new byte[4];
            byteBuffer.get(bArr2);
            for (int i10 = 0; i10 < i5; i10++) {
                allocate.put((byte) (byteBuffer.get() ^ bArr2[i10 % 4]));
            }
        } else {
            allocate.put(byteBuffer.array(), byteBuffer.position(), allocate.limit());
            byteBuffer.position(allocate.limit() + byteBuffer.position());
        }
        if (A == d.a.CLOSING) {
            eVar = new org.java_websocket_new.framing.b();
        } else {
            eVar = new org.java_websocket_new.framing.e();
            eVar.d(z4);
            eVar.c(A);
        }
        allocate.flip();
        eVar.i(allocate);
        return eVar;
    }

    @Override // org.java_websocket_new.drafts.a
    public a.b a(eg.a aVar, h hVar) throws InvalidHandshakeException {
        if (aVar.e("Sec-WebSocket-Key") && hVar.e("Sec-WebSocket-Accept")) {
            return x(aVar.k("Sec-WebSocket-Key")).equals(hVar.k("Sec-WebSocket-Accept")) ? a.b.MATCHED : a.b.NOT_MATCHED;
        }
        return a.b.NOT_MATCHED;
    }

    @Override // org.java_websocket_new.drafts.a
    public a.b b(eg.a aVar) throws InvalidHandshakeException {
        int y4 = y(aVar);
        return (y4 == 7 || y4 == 8) ? c(aVar) ? a.b.MATCHED : a.b.NOT_MATCHED : a.b.NOT_MATCHED;
    }

    @Override // org.java_websocket_new.drafts.a
    public org.java_websocket_new.drafts.a f() {
        return new b();
    }

    @Override // org.java_websocket_new.drafts.a
    public ByteBuffer g(org.java_websocket_new.framing.d dVar) {
        ByteBuffer h4 = dVar.h();
        int i4 = 0;
        boolean z4 = this.f86952a == d.b.CLIENT;
        int i5 = h4.remaining() <= 125 ? 1 : h4.remaining() <= 65535 ? 2 : 8;
        ByteBuffer allocate = ByteBuffer.allocate(h4.remaining() + (i5 > 1 ? i5 + 1 : i5) + 1 + (z4 ? 4 : 0));
        allocate.put((byte) (((byte) (dVar.f() ? -128 : 0)) | w(dVar.b())));
        byte[] z5 = z(h4.remaining(), i5);
        if (i5 == 1) {
            allocate.put((byte) (z5[0] | (z4 ? Byte.MIN_VALUE : (byte) 0)));
        } else if (i5 == 2) {
            allocate.put((byte) ((z4 ? Byte.MIN_VALUE : (byte) 0) | 126));
            allocate.put(z5);
        } else {
            if (i5 != 8) {
                throw new RuntimeException("Size representation not supported/specified");
            }
            allocate.put((byte) ((z4 ? Byte.MIN_VALUE : (byte) 0) | Byte.MAX_VALUE));
            allocate.put(z5);
        }
        if (z4) {
            ByteBuffer allocate2 = ByteBuffer.allocate(4);
            allocate2.putInt(this.f86957h.nextInt());
            allocate.put(allocate2.array());
            while (h4.hasRemaining()) {
                allocate.put((byte) (h4.get() ^ allocate2.get(i4 % 4)));
                i4++;
            }
        } else {
            allocate.put(h4);
        }
        allocate.flip();
        return allocate;
    }

    @Override // org.java_websocket_new.drafts.a
    public List<org.java_websocket_new.framing.d> h(String str, boolean z4) {
        org.java_websocket_new.framing.e eVar = new org.java_websocket_new.framing.e();
        try {
            eVar.i(ByteBuffer.wrap(org.java_websocket_new.util.b.g(str)));
            eVar.d(true);
            eVar.c(d.a.TEXT);
            eVar.e(z4);
            return Collections.singletonList(eVar);
        } catch (InvalidDataException e4) {
            throw new NotSendableException(e4);
        }
    }

    @Override // org.java_websocket_new.drafts.a
    public List<org.java_websocket_new.framing.d> i(ByteBuffer byteBuffer, boolean z4) {
        org.java_websocket_new.framing.e eVar = new org.java_websocket_new.framing.e();
        try {
            eVar.i(byteBuffer);
            eVar.d(true);
            eVar.c(d.a.BINARY);
            eVar.e(z4);
            return Collections.singletonList(eVar);
        } catch (InvalidDataException e4) {
            throw new NotSendableException(e4);
        }
    }

    @Override // org.java_websocket_new.drafts.a
    public a.EnumC1347a l() {
        return a.EnumC1347a.TWOWAY;
    }

    @Override // org.java_websocket_new.drafts.a
    public eg.b n(eg.b bVar) {
        bVar.b("Upgrade", "websocket");
        bVar.b("Connection", "Upgrade");
        bVar.b("Sec-WebSocket-Version", "8");
        byte[] bArr = new byte[16];
        this.f86957h.nextBytes(bArr);
        bVar.b("Sec-WebSocket-Key", org.java_websocket_new.util.a.s(bArr));
        return bVar;
    }

    @Override // org.java_websocket_new.drafts.a
    public eg.c o(eg.a aVar, i iVar) throws InvalidHandshakeException {
        iVar.b("Upgrade", "websocket");
        iVar.b("Connection", aVar.k("Connection"));
        iVar.i("Switching Protocols");
        String k4 = aVar.k("Sec-WebSocket-Key");
        if (k4 == null) {
            throw new InvalidHandshakeException("missing Sec-WebSocket-Key");
        }
        iVar.b("Sec-WebSocket-Accept", x(k4));
        return iVar;
    }

    @Override // org.java_websocket_new.drafts.a
    public void r() {
        this.f86955f = null;
    }

    @Override // org.java_websocket_new.drafts.a
    public List<org.java_websocket_new.framing.d> t(ByteBuffer byteBuffer) throws LimitExedeedException, InvalidDataException {
        LinkedList linkedList = new LinkedList();
        if (this.f86955f != null) {
            try {
                byteBuffer.mark();
                int remaining = byteBuffer.remaining();
                int remaining2 = this.f86955f.remaining();
                if (remaining2 > remaining) {
                    this.f86955f.put(byteBuffer.array(), byteBuffer.position(), remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                    return Collections.emptyList();
                }
                this.f86955f.put(byteBuffer.array(), byteBuffer.position(), remaining2);
                byteBuffer.position(byteBuffer.position() + remaining2);
                linkedList.add(B((ByteBuffer) this.f86955f.duplicate().position(0)));
                this.f86955f = null;
            } catch (a e4) {
                this.f86955f.limit();
                ByteBuffer allocate = ByteBuffer.allocate(d(e4.a()));
                this.f86955f.rewind();
                allocate.put(this.f86955f);
                this.f86955f = allocate;
                return t(byteBuffer);
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(B(byteBuffer));
            } catch (a e5) {
                byteBuffer.reset();
                ByteBuffer allocate2 = ByteBuffer.allocate(d(e5.a()));
                this.f86955f = allocate2;
                allocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }
}

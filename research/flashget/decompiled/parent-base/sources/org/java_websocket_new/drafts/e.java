package org.java_websocket_new.drafts;

import eg.f;
import eg.h;
import eg.i;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.java_websocket_new.d;
import org.java_websocket_new.drafts.a;
import org.java_websocket_new.exceptions.IncompleteHandshakeException;
import org.java_websocket_new.exceptions.InvalidDataException;
import org.java_websocket_new.exceptions.InvalidFrameException;
import org.java_websocket_new.exceptions.InvalidHandshakeException;
import org.java_websocket_new.framing.d;

/* compiled from: Draft_76.java */
/* loaded from: classes6.dex */
public class e extends d {

    /* renamed from: p, reason: collision with root package name */
    private static final byte[] f86969p = {-1, 0};

    /* renamed from: n, reason: collision with root package name */
    private boolean f86970n = false;

    /* renamed from: o, reason: collision with root package name */
    private final Random f86971o = new Random();

    private static String A() {
        Random random = new Random();
        long nextInt = random.nextInt(12) + 1;
        String l4 = Long.toString((random.nextInt(Math.abs(new Long(4294967295L / nextInt).intValue())) + 1) * nextInt);
        int nextInt2 = random.nextInt(12) + 1;
        for (int i4 = 0; i4 < nextInt2; i4++) {
            int abs = Math.abs(random.nextInt(l4.length()));
            char nextInt3 = (char) (random.nextInt(95) + 33);
            if (nextInt3 >= '0' && nextInt3 <= '9') {
                nextInt3 = (char) (nextInt3 - 15);
            }
            l4 = new StringBuilder(l4).insert(abs, nextInt3).toString();
        }
        for (int i5 = 0; i5 < nextInt; i5++) {
            l4 = new StringBuilder(l4).insert(Math.abs(random.nextInt(l4.length() - 1) + 1), " ").toString();
        }
        return l4;
    }

    private static byte[] B(String str) throws InvalidHandshakeException {
        try {
            long parseLong = Long.parseLong(str.replaceAll("[^0-9]", ""));
            long length = str.split(" ").length - 1;
            if (length == 0) {
                throw new InvalidHandshakeException("invalid Sec-WebSocket-Key (/key2/)");
            }
            long longValue = new Long(parseLong / length).longValue();
            return new byte[]{(byte) (longValue >> 24), (byte) ((longValue << 8) >> 24), (byte) ((longValue << 16) >> 24), (byte) ((longValue << 24) >> 24)};
        } catch (NumberFormatException unused) {
            throw new InvalidHandshakeException("invalid Sec-WebSocket-Key (/key1/ or /key2/)");
        }
    }

    public static byte[] z(String str, String str2, byte[] bArr) throws InvalidHandshakeException {
        byte[] B = B(str);
        byte[] B2 = B(str2);
        try {
            return MessageDigest.getInstance("MD5").digest(new byte[]{B[0], B[1], B[2], B[3], B2[0], B2[1], B2[2], B2[3], bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]});
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // org.java_websocket_new.drafts.d, org.java_websocket_new.drafts.a
    public a.b a(eg.a aVar, h hVar) {
        if (this.f86970n) {
            return a.b.NOT_MATCHED;
        }
        try {
            if (hVar.k("Sec-WebSocket-Origin").equals(aVar.k("Origin")) && c(hVar)) {
                byte[] content = hVar.getContent();
                if (content == null || content.length == 0) {
                    throw new IncompleteHandshakeException();
                }
                return Arrays.equals(content, z(aVar.k("Sec-WebSocket-Key1"), aVar.k("Sec-WebSocket-Key2"), aVar.getContent())) ? a.b.MATCHED : a.b.NOT_MATCHED;
            }
            return a.b.NOT_MATCHED;
        } catch (InvalidHandshakeException e4) {
            throw new RuntimeException("bad handshakerequest", e4);
        }
    }

    @Override // org.java_websocket_new.drafts.d, org.java_websocket_new.drafts.a
    public a.b b(eg.a aVar) {
        return (aVar.k("Upgrade").equals("WebSocket") && aVar.k("Connection").contains("Upgrade") && aVar.k("Sec-WebSocket-Key1").length() > 0 && !aVar.k("Sec-WebSocket-Key2").isEmpty() && aVar.e("Origin")) ? a.b.MATCHED : a.b.NOT_MATCHED;
    }

    @Override // org.java_websocket_new.drafts.d, org.java_websocket_new.drafts.a
    public a f() {
        return new e();
    }

    @Override // org.java_websocket_new.drafts.d, org.java_websocket_new.drafts.a
    public ByteBuffer g(org.java_websocket_new.framing.d dVar) {
        return dVar.b() == d.a.CLOSING ? ByteBuffer.wrap(f86969p) : super.g(dVar);
    }

    @Override // org.java_websocket_new.drafts.d, org.java_websocket_new.drafts.a
    public a.EnumC1347a l() {
        return a.EnumC1347a.ONEWAY;
    }

    @Override // org.java_websocket_new.drafts.d, org.java_websocket_new.drafts.a
    public eg.b n(eg.b bVar) {
        bVar.b("Upgrade", "WebSocket");
        bVar.b("Connection", "Upgrade");
        bVar.b("Sec-WebSocket-Key1", A());
        bVar.b("Sec-WebSocket-Key2", A());
        if (!bVar.e("Origin")) {
            bVar.b("Origin", "random" + this.f86971o.nextInt());
        }
        byte[] bArr = new byte[8];
        this.f86971o.nextBytes(bArr);
        bVar.j(bArr);
        return bVar;
    }

    @Override // org.java_websocket_new.drafts.d, org.java_websocket_new.drafts.a
    public eg.c o(eg.a aVar, i iVar) throws InvalidHandshakeException {
        iVar.i("WebSocket Protocol Handshake");
        iVar.b("Upgrade", "WebSocket");
        iVar.b("Connection", aVar.k("Connection"));
        iVar.b("Sec-WebSocket-Origin", aVar.k("Origin"));
        iVar.b("Sec-WebSocket-Location", "ws://" + aVar.k("Host") + aVar.d());
        String k4 = aVar.k("Sec-WebSocket-Key1");
        String k5 = aVar.k("Sec-WebSocket-Key2");
        byte[] content = aVar.getContent();
        if (k4 == null || k5 == null || content == null || content.length != 8) {
            throw new InvalidHandshakeException("Bad keys");
        }
        iVar.j(z(k4, k5, content));
        return iVar;
    }

    @Override // org.java_websocket_new.drafts.d, org.java_websocket_new.drafts.a
    public List<org.java_websocket_new.framing.d> t(ByteBuffer byteBuffer) throws InvalidDataException {
        byteBuffer.mark();
        List<org.java_websocket_new.framing.d> y4 = super.y(byteBuffer);
        if (y4 != null) {
            return y4;
        }
        byteBuffer.reset();
        List<org.java_websocket_new.framing.d> list = this.f86966g;
        this.f86965f = true;
        if (this.f86967h != null) {
            throw new InvalidFrameException();
        }
        this.f86967h = ByteBuffer.allocate(2);
        if (byteBuffer.remaining() > this.f86967h.remaining()) {
            throw new InvalidFrameException();
        }
        this.f86967h.put(byteBuffer);
        if (this.f86967h.hasRemaining()) {
            this.f86966g = new LinkedList();
            return list;
        }
        if (!Arrays.equals(this.f86967h.array(), f86969p)) {
            throw new InvalidFrameException();
        }
        list.add(new org.java_websocket_new.framing.b(1000));
        return list;
    }

    @Override // org.java_websocket_new.drafts.a
    public f u(ByteBuffer byteBuffer) throws InvalidHandshakeException {
        eg.c v4 = a.v(byteBuffer, this.f86952a);
        if ((v4.e("Sec-WebSocket-Key1") || this.f86952a == d.b.CLIENT) && !v4.e("Sec-WebSocket-Version")) {
            byte[] bArr = new byte[this.f86952a == d.b.SERVER ? 8 : 16];
            try {
                byteBuffer.get(bArr);
                v4.j(bArr);
            } catch (BufferUnderflowException unused) {
                throw new IncompleteHandshakeException(byteBuffer.capacity() + 16);
            }
        }
        return v4;
    }
}

package org.java_websocket_new.drafts;

import eg.f;
import eg.h;
import eg.i;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.java_websocket_new.d;
import org.java_websocket_new.exceptions.IncompleteHandshakeException;
import org.java_websocket_new.exceptions.InvalidDataException;
import org.java_websocket_new.exceptions.InvalidHandshakeException;
import org.java_websocket_new.exceptions.LimitExedeedException;
import org.java_websocket_new.framing.d;

/* compiled from: Draft.java */
/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: c, reason: collision with root package name */
    public static int f86949c = 1000;

    /* renamed from: d, reason: collision with root package name */
    public static int f86950d = 64;

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f86951e = org.java_websocket_new.util.b.g("<policy-file-request/>\u0000");

    /* renamed from: a, reason: collision with root package name */
    protected d.b f86952a = null;

    /* renamed from: b, reason: collision with root package name */
    protected d.a f86953b = null;

    /* compiled from: Draft.java */
    /* renamed from: org.java_websocket_new.drafts.a$a, reason: collision with other inner class name */
    public enum EnumC1347a {
        NONE,
        ONEWAY,
        TWOWAY;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC1347a[] valuesCustom() {
            EnumC1347a[] valuesCustom = values();
            int length = valuesCustom.length;
            EnumC1347a[] enumC1347aArr = new EnumC1347a[length];
            System.arraycopy(valuesCustom, 0, enumC1347aArr, 0, length);
            return enumC1347aArr;
        }
    }

    /* compiled from: Draft.java */
    public enum b {
        MATCHED,
        NOT_MATCHED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] valuesCustom = values();
            int length = valuesCustom.length;
            b[] bVarArr = new b[length];
            System.arraycopy(valuesCustom, 0, bVarArr, 0, length);
            return bVarArr;
        }
    }

    public static ByteBuffer p(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b5 = 48;
        while (byteBuffer.hasRemaining()) {
            byte b6 = byteBuffer.get();
            allocate.put(b6);
            if (b5 == 13 && b6 == 10) {
                allocate.limit(allocate.position() - 2);
                allocate.position(0);
                return allocate;
            }
            b5 = b6;
        }
        byteBuffer.position(byteBuffer.position() - allocate.position());
        return null;
    }

    public static String q(ByteBuffer byteBuffer) {
        ByteBuffer p4 = p(byteBuffer);
        if (p4 == null) {
            return null;
        }
        return org.java_websocket_new.util.b.d(p4.array(), 0, p4.limit());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v5, types: [eg.g, eg.i] */
    public static eg.c v(ByteBuffer byteBuffer, d.b bVar) throws InvalidHandshakeException, IncompleteHandshakeException {
        eg.d dVar;
        String q4 = q(byteBuffer);
        if (q4 == null) {
            throw new IncompleteHandshakeException(byteBuffer.capacity() + 128);
        }
        String[] split = q4.split(" ", 3);
        if (split.length != 3) {
            throw new InvalidHandshakeException();
        }
        if (bVar == d.b.CLIENT) {
            ?? eVar = new eg.e();
            eVar.g(Short.parseShort(split[1]));
            eVar.i(split[2]);
            dVar = eVar;
        } else {
            eg.d dVar2 = new eg.d();
            dVar2.h(split[1]);
            dVar = dVar2;
        }
        String q5 = q(byteBuffer);
        while (q5 != null && q5.length() > 0) {
            String[] split2 = q5.split(":", 2);
            if (split2.length != 2) {
                throw new InvalidHandshakeException("not an http header");
            }
            dVar.b(split2[0], split2[1].replaceFirst("^ +", ""));
            q5 = q(byteBuffer);
        }
        if (q5 != null) {
            return dVar;
        }
        throw new IncompleteHandshakeException();
    }

    public abstract b a(eg.a aVar, h hVar) throws InvalidHandshakeException;

    public abstract b b(eg.a aVar) throws InvalidHandshakeException;

    protected boolean c(f fVar) {
        return fVar.k("Upgrade").equalsIgnoreCase("websocket") && fVar.k("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade");
    }

    public int d(int i4) throws LimitExedeedException, InvalidDataException {
        if (i4 >= 0) {
            return i4;
        }
        throw new InvalidDataException(1002, "Negative count");
    }

    public List<org.java_websocket_new.framing.d> e(d.a aVar, ByteBuffer byteBuffer, boolean z4) {
        d.a aVar2;
        if (aVar != d.a.BINARY && aVar != (aVar2 = d.a.TEXT) && aVar != aVar2) {
            throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
        }
        if (this.f86953b != null) {
            this.f86953b = d.a.CONTINUOUS;
        } else {
            this.f86953b = aVar;
        }
        org.java_websocket_new.framing.e eVar = new org.java_websocket_new.framing.e(this.f86953b);
        try {
            eVar.i(byteBuffer);
            eVar.d(z4);
            if (z4) {
                this.f86953b = null;
            } else {
                this.f86953b = aVar;
            }
            return Collections.singletonList(eVar);
        } catch (InvalidDataException e4) {
            throw new RuntimeException(e4);
        }
    }

    public abstract a f();

    public abstract ByteBuffer g(org.java_websocket_new.framing.d dVar);

    public abstract List<org.java_websocket_new.framing.d> h(String str, boolean z4);

    public abstract List<org.java_websocket_new.framing.d> i(ByteBuffer byteBuffer, boolean z4);

    public List<ByteBuffer> j(f fVar, d.b bVar) {
        return k(fVar, bVar, true);
    }

    public List<ByteBuffer> k(f fVar, d.b bVar, boolean z4) {
        StringBuilder sb = new StringBuilder(100);
        if (fVar instanceof eg.a) {
            sb.append("GET ");
            sb.append(((eg.a) fVar).d());
            sb.append(" HTTP/1.1");
        } else {
            if (!(fVar instanceof h)) {
                throw new RuntimeException("unknow role");
            }
            sb.append("HTTP/1.1 101 " + ((h) fVar).c());
        }
        sb.append("\r\n");
        Iterator<String> f4 = fVar.f();
        while (f4.hasNext()) {
            String next = f4.next();
            String k4 = fVar.k(next);
            sb.append(next);
            sb.append(": ");
            sb.append(k4);
            sb.append("\r\n");
        }
        sb.append("\r\n");
        byte[] a5 = org.java_websocket_new.util.b.a(sb.toString());
        byte[] content = z4 ? fVar.getContent() : null;
        ByteBuffer allocate = ByteBuffer.allocate((content == null ? 0 : content.length) + a5.length);
        allocate.put(a5);
        if (content != null) {
            allocate.put(content);
        }
        allocate.flip();
        return Collections.singletonList(allocate);
    }

    public abstract EnumC1347a l();

    public d.b m() {
        return this.f86952a;
    }

    public abstract eg.b n(eg.b bVar) throws InvalidHandshakeException;

    public abstract eg.c o(eg.a aVar, i iVar) throws InvalidHandshakeException;

    public abstract void r();

    public void s(d.b bVar) {
        this.f86952a = bVar;
    }

    public abstract List<org.java_websocket_new.framing.d> t(ByteBuffer byteBuffer) throws InvalidDataException;

    public f u(ByteBuffer byteBuffer) throws InvalidHandshakeException {
        return v(byteBuffer, this.f86952a);
    }
}

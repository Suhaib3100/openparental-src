package com.google.firebase.encoders.proto;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.proto.d;
import com.google.firebase.remoteconfig.p;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: ProtobufDataEncoderContext.java */
/* loaded from: classes6.dex */
final class f implements com.google.firebase.encoders.e {

    /* renamed from: f, reason: collision with root package name */
    private static final Charset f59633f = Charset.forName(ProtectedSandApp.s("T\u0001"));

    /* renamed from: g, reason: collision with root package name */
    private static final com.google.firebase.encoders.c f59634g = com.google.android.datatransport.runtime.a.a(1, com.google.firebase.encoders.c.a(ProtectedSandApp.s("U\u0001")));

    /* renamed from: h, reason: collision with root package name */
    private static final com.google.firebase.encoders.c f59635h = com.google.android.datatransport.runtime.a.a(2, com.google.firebase.encoders.c.a(ProtectedSandApp.s("V\u0001")));

    /* renamed from: i, reason: collision with root package name */
    private static final com.google.firebase.encoders.d<Map.Entry<Object, Object>> f59636i = new e();

    /* renamed from: a, reason: collision with root package name */
    private OutputStream f59637a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.d<?>> f59638b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.f<?>> f59639c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.encoders.d<Object> f59640d;

    /* renamed from: e, reason: collision with root package name */
    private final i f59641e = new i(this);

    /* compiled from: ProtobufDataEncoderContext.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f59642a;

        static {
            int[] iArr = new int[d.a.values().length];
            f59642a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59642a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59642a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    f(OutputStream outputStream, Map<Class<?>, com.google.firebase.encoders.d<?>> map, Map<Class<?>, com.google.firebase.encoders.f<?>> map2, com.google.firebase.encoders.d<Object> dVar) {
        this.f59637a = outputStream;
        this.f59638b = map;
        this.f59639c = map2;
        this.f59640d = dVar;
    }

    private <T> f A(com.google.firebase.encoders.d<T> dVar, com.google.firebase.encoders.c cVar, T t4, boolean z4) throws IOException {
        long z5 = z(dVar, t4);
        if (z4 && z5 == 0) {
            return this;
        }
        G((E(cVar) << 3) | 2);
        H(z5);
        dVar.a(t4, this);
        return this;
    }

    private <T> f B(com.google.firebase.encoders.f<T> fVar, com.google.firebase.encoders.c cVar, T t4, boolean z4) throws IOException {
        this.f59641e.c(cVar, z4);
        fVar.a(t4, this.f59641e);
        return this;
    }

    private static d D(com.google.firebase.encoders.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new EncodingException(ProtectedSandApp.s("W\u0001"));
    }

    private static int E(com.google.firebase.encoders.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new EncodingException(ProtectedSandApp.s("W\u0001"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(Map.Entry entry, com.google.firebase.encoders.e eVar) throws IOException {
        eVar.m(f59634g, entry.getKey());
        eVar.m(f59635h, entry.getValue());
    }

    private void G(int i4) throws IOException {
        while ((i4 & (-128)) != 0) {
            this.f59637a.write((i4 & 127) | 128);
            i4 >>>= 7;
        }
        this.f59637a.write(i4 & 127);
    }

    private void H(long j4) throws IOException {
        while (((-128) & j4) != 0) {
            this.f59637a.write((((int) j4) & 127) | 128);
            j4 >>>= 7;
        }
        this.f59637a.write(((int) j4) & 127);
    }

    private static ByteBuffer y(int i4) {
        return ByteBuffer.allocate(i4).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long z(com.google.firebase.encoders.d<T> dVar, T t4) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f59637a;
            this.f59637a = bVar;
            try {
                dVar.a(t4, this);
                this.f59637a = outputStream;
                long a5 = bVar.a();
                bVar.close();
                return a5;
            } catch (Throwable th) {
                this.f59637a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    f C(@q0 Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        com.google.firebase.encoders.d<?> dVar = this.f59638b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new EncodingException(ProtectedSandApp.s("X\u0001") + obj.getClass());
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e b(@o0 com.google.firebase.encoders.c cVar, boolean z4) throws IOException {
        return t(cVar, z4 ? 1 : 0, true);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e c(@o0 com.google.firebase.encoders.c cVar, long j4) throws IOException {
        return v(cVar, j4, true);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e d(@o0 com.google.firebase.encoders.c cVar, int i4) throws IOException {
        return t(cVar, i4, true);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e e(@o0 com.google.firebase.encoders.c cVar, float f4) throws IOException {
        return o(cVar, f4, true);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e f(@o0 com.google.firebase.encoders.c cVar) throws IOException {
        throw new EncodingException(ProtectedSandApp.s("Y\u0001"));
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e g(@o0 com.google.firebase.encoders.c cVar, double d5) throws IOException {
        return l(cVar, d5, true);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e h(@o0 String str, boolean z4) throws IOException {
        return t(com.google.firebase.encoders.c.d(str), z4 ? 1 : 0, true);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e i(@o0 String str, double d5) throws IOException {
        return l(com.google.firebase.encoders.c.d(str), d5, true);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e j(@o0 String str, long j4) throws IOException {
        return v(com.google.firebase.encoders.c.d(str), j4, true);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e k(@o0 String str, int i4) throws IOException {
        return t(com.google.firebase.encoders.c.d(str), i4, true);
    }

    com.google.firebase.encoders.e l(@o0 com.google.firebase.encoders.c cVar, double d5, boolean z4) throws IOException {
        if (z4 && d5 == p.f60679p) {
            return this;
        }
        G((E(cVar) << 3) | 1);
        this.f59637a.write(y(8).putDouble(d5).array());
        return this;
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e m(@o0 com.google.firebase.encoders.c cVar, @q0 Object obj) throws IOException {
        return q(cVar, obj, true);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e n(@q0 Object obj) throws IOException {
        return C(obj);
    }

    com.google.firebase.encoders.e o(@o0 com.google.firebase.encoders.c cVar, float f4, boolean z4) throws IOException {
        if (z4 && f4 == 0.0f) {
            return this;
        }
        G((E(cVar) << 3) | 5);
        this.f59637a.write(y(4).putFloat(f4).array());
        return this;
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e p(@o0 String str, @q0 Object obj) throws IOException {
        return q(com.google.firebase.encoders.c.d(str), obj, true);
    }

    com.google.firebase.encoders.e q(@o0 com.google.firebase.encoders.c cVar, @q0 Object obj, boolean z4) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z4 && charSequence.length() == 0) {
                return this;
            }
            G((E(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f59633f);
            G(bytes.length);
            this.f59637a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                q(cVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                A(f59636i, cVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return l(cVar, ((Double) obj).doubleValue(), z4);
        }
        if (obj instanceof Float) {
            return o(cVar, ((Float) obj).floatValue(), z4);
        }
        if (obj instanceof Number) {
            return v(cVar, ((Number) obj).longValue(), z4);
        }
        if (obj instanceof Boolean) {
            return t(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z4);
        }
        if (!(obj instanceof byte[])) {
            com.google.firebase.encoders.d<?> dVar = this.f59638b.get(obj.getClass());
            if (dVar != null) {
                return A(dVar, cVar, obj, z4);
            }
            com.google.firebase.encoders.f<?> fVar = this.f59639c.get(obj.getClass());
            return fVar != null ? B(fVar, cVar, obj, z4) : obj instanceof c ? t(cVar, ((c) obj).getNumber(), true) : obj instanceof Enum ? t(cVar, ((Enum) obj).ordinal(), true) : A(this.f59640d, cVar, obj, z4);
        }
        byte[] bArr = (byte[]) obj;
        if (z4 && bArr.length == 0) {
            return this;
        }
        G((E(cVar) << 3) | 2);
        G(bArr.length);
        this.f59637a.write(bArr);
        return this;
    }

    @o0
    public f r(@o0 com.google.firebase.encoders.c cVar, int i4) throws IOException {
        return t(cVar, i4, true);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e s(@o0 String str) throws IOException {
        return f(com.google.firebase.encoders.c.d(str));
    }

    f t(@o0 com.google.firebase.encoders.c cVar, int i4, boolean z4) throws IOException {
        if (z4 && i4 == 0) {
            return this;
        }
        d D = D(cVar);
        int i5 = a.f59642a[D.intEncoding().ordinal()];
        if (i5 == 1) {
            G(D.tag() << 3);
            G(i4);
        } else if (i5 == 2) {
            G(D.tag() << 3);
            G((i4 << 1) ^ (i4 >> 31));
        } else if (i5 == 3) {
            G((D.tag() << 3) | 5);
            this.f59637a.write(y(4).putInt(i4).array());
        }
        return this;
    }

    @o0
    public f u(@o0 com.google.firebase.encoders.c cVar, long j4) throws IOException {
        return v(cVar, j4, true);
    }

    f v(@o0 com.google.firebase.encoders.c cVar, long j4, boolean z4) throws IOException {
        if (z4 && j4 == 0) {
            return this;
        }
        d D = D(cVar);
        int i4 = a.f59642a[D.intEncoding().ordinal()];
        if (i4 == 1) {
            G(D.tag() << 3);
            H(j4);
        } else if (i4 == 2) {
            G(D.tag() << 3);
            H((j4 >> 63) ^ (j4 << 1));
        } else if (i4 == 3) {
            G((D.tag() << 3) | 1);
            this.f59637a.write(y(8).putLong(j4).array());
        }
        return this;
    }

    @o0
    public f w(@o0 com.google.firebase.encoders.c cVar, boolean z4) throws IOException {
        return t(cVar, z4 ? 1 : 0, true);
    }

    f x(@o0 com.google.firebase.encoders.c cVar, boolean z4, boolean z5) throws IOException {
        return t(cVar, z4 ? 1 : 0, z5);
    }
}

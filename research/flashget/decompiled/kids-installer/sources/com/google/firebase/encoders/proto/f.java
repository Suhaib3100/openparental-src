package com.google.firebase.encoders.proto;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
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
/* loaded from: classes3.dex */
final class f implements com.google.firebase.encoders.e {

    /* renamed from: f, reason: collision with root package name */
    private static final Charset f16612f = Charset.forName(ProtectedSandApp.s("⩸"));

    /* renamed from: g, reason: collision with root package name */
    private static final com.google.firebase.encoders.c f16613g = com.google.android.datatransport.runtime.a.a(1, com.google.firebase.encoders.c.a(ProtectedSandApp.s("⩹")));

    /* renamed from: h, reason: collision with root package name */
    private static final com.google.firebase.encoders.c f16614h = com.google.android.datatransport.runtime.a.a(2, com.google.firebase.encoders.c.a(ProtectedSandApp.s("⩺")));

    /* renamed from: i, reason: collision with root package name */
    private static final com.google.firebase.encoders.d<Map.Entry<Object, Object>> f16615i = new com.google.firebase.encoders.d() { // from class: com.google.firebase.encoders.proto.e
        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        public final void a(Object obj, com.google.firebase.encoders.e eVar) {
            f.F((Map.Entry) obj, eVar);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private OutputStream f16616a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.d<?>> f16617b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.f<?>> f16618c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.encoders.d<Object> f16619d;

    /* renamed from: e, reason: collision with root package name */
    private final i f16620e = new i(this);

    /* compiled from: ProtobufDataEncoderContext.java */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16621a;

        static {
            int[] iArr = new int[d.a.values().length];
            f16621a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16621a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16621a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    f(OutputStream outputStream, Map<Class<?>, com.google.firebase.encoders.d<?>> map, Map<Class<?>, com.google.firebase.encoders.f<?>> map2, com.google.firebase.encoders.d<Object> dVar) {
        this.f16616a = outputStream;
        this.f16617b = map;
        this.f16618c = map2;
        this.f16619d = dVar;
    }

    private <T> f A(com.google.firebase.encoders.d<T> dVar, com.google.firebase.encoders.c cVar, T t5, boolean z5) throws IOException {
        long z6 = z(dVar, t5);
        if (z5 && z6 == 0) {
            return this;
        }
        G((E(cVar) << 3) | 2);
        H(z6);
        dVar.a(t5, this);
        return this;
    }

    private <T> f B(com.google.firebase.encoders.f<T> fVar, com.google.firebase.encoders.c cVar, T t5, boolean z5) throws IOException {
        this.f16620e.b(cVar, z5);
        fVar.a(t5, this.f16620e);
        return this;
    }

    private static d D(com.google.firebase.encoders.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new EncodingException(ProtectedSandApp.s("⩻"));
    }

    private static int E(com.google.firebase.encoders.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new EncodingException(ProtectedSandApp.s("⩼"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(Map.Entry entry, com.google.firebase.encoders.e eVar) throws IOException {
        eVar.r(f16613g, entry.getKey());
        eVar.r(f16614h, entry.getValue());
    }

    private void G(int i5) throws IOException {
        while ((i5 & (-128)) != 0) {
            this.f16616a.write((i5 & 127) | 128);
            i5 >>>= 7;
        }
        this.f16616a.write(i5 & 127);
    }

    private void H(long j5) throws IOException {
        while (((-128) & j5) != 0) {
            this.f16616a.write((((int) j5) & 127) | 128);
            j5 >>>= 7;
        }
        this.f16616a.write(((int) j5) & 127);
    }

    private static ByteBuffer y(int i5) {
        return ByteBuffer.allocate(i5).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long z(com.google.firebase.encoders.d<T> dVar, T t5) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f16616a;
            this.f16616a = bVar;
            try {
                dVar.a(t5, this);
                this.f16616a = outputStream;
                long a6 = bVar.a();
                bVar.close();
                return a6;
            } catch (Throwable th) {
                this.f16616a = outputStream;
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
        com.google.firebase.encoders.d<?> dVar = this.f16617b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new EncodingException(ProtectedSandApp.s("⩽") + obj.getClass());
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e a(@o0 com.google.firebase.encoders.c cVar, boolean z5) throws IOException {
        return t(cVar, z5 ? 1 : 0, true);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e b(@o0 com.google.firebase.encoders.c cVar, long j5) throws IOException {
        return v(cVar, j5, true);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e c(@o0 com.google.firebase.encoders.c cVar, int i5) throws IOException {
        return t(cVar, i5, true);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e e(@o0 com.google.firebase.encoders.c cVar, float f6) throws IOException {
        return n(cVar, f6, true);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e f(@o0 com.google.firebase.encoders.c cVar) throws IOException {
        throw new EncodingException(ProtectedSandApp.s("⩾"));
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e g(@o0 com.google.firebase.encoders.c cVar, double d6) throws IOException {
        return m(cVar, d6, true);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e h(@q0 Object obj) throws IOException {
        return C(obj);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e i(@o0 String str, boolean z5) throws IOException {
        return t(com.google.firebase.encoders.c.d(str), z5 ? 1 : 0, true);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e j(@o0 String str, double d6) throws IOException {
        return m(com.google.firebase.encoders.c.d(str), d6, true);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e k(@o0 String str, long j5) throws IOException {
        return v(com.google.firebase.encoders.c.d(str), j5, true);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e l(@o0 String str, int i5) throws IOException {
        return t(com.google.firebase.encoders.c.d(str), i5, true);
    }

    com.google.firebase.encoders.e m(@o0 com.google.firebase.encoders.c cVar, double d6, boolean z5) throws IOException {
        if (z5 && d6 == p.f18289o) {
            return this;
        }
        G((E(cVar) << 3) | 1);
        this.f16616a.write(y(8).putDouble(d6).array());
        return this;
    }

    com.google.firebase.encoders.e n(@o0 com.google.firebase.encoders.c cVar, float f6, boolean z5) throws IOException {
        if (z5 && f6 == 0.0f) {
            return this;
        }
        G((E(cVar) << 3) | 5);
        this.f16616a.write(y(4).putFloat(f6).array());
        return this;
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e o(@o0 String str, @q0 Object obj) throws IOException {
        return p(com.google.firebase.encoders.c.d(str), obj, true);
    }

    com.google.firebase.encoders.e p(@o0 com.google.firebase.encoders.c cVar, @q0 Object obj, boolean z5) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z5 && charSequence.length() == 0) {
                return this;
            }
            G((E(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f16612f);
            G(bytes.length);
            this.f16616a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                p(cVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                A(f16615i, cVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return m(cVar, ((Double) obj).doubleValue(), z5);
        }
        if (obj instanceof Float) {
            return n(cVar, ((Float) obj).floatValue(), z5);
        }
        if (obj instanceof Number) {
            return v(cVar, ((Number) obj).longValue(), z5);
        }
        if (obj instanceof Boolean) {
            return t(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z5);
        }
        if (!(obj instanceof byte[])) {
            com.google.firebase.encoders.d<?> dVar = this.f16617b.get(obj.getClass());
            if (dVar != null) {
                return A(dVar, cVar, obj, z5);
            }
            com.google.firebase.encoders.f<?> fVar = this.f16618c.get(obj.getClass());
            return fVar != null ? B(fVar, cVar, obj, z5) : obj instanceof c ? t(cVar, ((c) obj).getNumber(), true) : obj instanceof Enum ? t(cVar, ((Enum) obj).ordinal(), true) : A(this.f16619d, cVar, obj, z5);
        }
        byte[] bArr = (byte[]) obj;
        if (z5 && bArr.length == 0) {
            return this;
        }
        G((E(cVar) << 3) | 2);
        G(bArr.length);
        this.f16616a.write(bArr);
        return this;
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e q(@o0 String str) throws IOException {
        return f(com.google.firebase.encoders.c.d(str));
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e r(@o0 com.google.firebase.encoders.c cVar, @q0 Object obj) throws IOException {
        return p(cVar, obj, true);
    }

    @o0
    public f s(@o0 com.google.firebase.encoders.c cVar, int i5) throws IOException {
        return t(cVar, i5, true);
    }

    f t(@o0 com.google.firebase.encoders.c cVar, int i5, boolean z5) throws IOException {
        if (z5 && i5 == 0) {
            return this;
        }
        d D = D(cVar);
        int i6 = a.f16621a[D.intEncoding().ordinal()];
        if (i6 == 1) {
            G(D.tag() << 3);
            G(i5);
        } else if (i6 == 2) {
            G(D.tag() << 3);
            G((i5 << 1) ^ (i5 >> 31));
        } else if (i6 == 3) {
            G((D.tag() << 3) | 5);
            this.f16616a.write(y(4).putInt(i5).array());
        }
        return this;
    }

    @o0
    public f u(@o0 com.google.firebase.encoders.c cVar, long j5) throws IOException {
        return v(cVar, j5, true);
    }

    f v(@o0 com.google.firebase.encoders.c cVar, long j5, boolean z5) throws IOException {
        if (z5 && j5 == 0) {
            return this;
        }
        d D = D(cVar);
        int i5 = a.f16621a[D.intEncoding().ordinal()];
        if (i5 == 1) {
            G(D.tag() << 3);
            H(j5);
        } else if (i5 == 2) {
            G(D.tag() << 3);
            H((j5 >> 63) ^ (j5 << 1));
        } else if (i5 == 3) {
            G((D.tag() << 3) | 1);
            this.f16616a.write(y(8).putLong(j5).array());
        }
        return this;
    }

    @o0
    public f w(@o0 com.google.firebase.encoders.c cVar, boolean z5) throws IOException {
        return t(cVar, z5 ? 1 : 0, true);
    }

    f x(@o0 com.google.firebase.encoders.c cVar, boolean z5, boolean z6) throws IOException {
        return t(cVar, z5 ? 1 : 0, z6);
    }
}

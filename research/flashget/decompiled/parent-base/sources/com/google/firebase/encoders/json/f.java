package com.google.firebase.encoders.json;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonValueObjectEncoderContext.java */
/* loaded from: classes6.dex */
final class f implements com.google.firebase.encoders.e, com.google.firebase.encoders.g {

    /* renamed from: a, reason: collision with root package name */
    private f f59623a = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f59624b = true;

    /* renamed from: c, reason: collision with root package name */
    private final JsonWriter f59625c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.d<?>> f59626d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.f<?>> f59627e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.encoders.d<Object> f59628f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f59629g;

    f(@o0 Writer writer, @o0 Map<Class<?>, com.google.firebase.encoders.d<?>> map, @o0 Map<Class<?>, com.google.firebase.encoders.f<?>> map2, com.google.firebase.encoders.d<Object> dVar, boolean z4) {
        this.f59625c = new JsonWriter(writer);
        this.f59626d = map;
        this.f59627e = map2;
        this.f59628f = dVar;
        this.f59629g = z4;
    }

    private boolean H(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private f K(@o0 String str, @q0 Object obj) throws IOException, EncodingException {
        M();
        this.f59625c.name(str);
        if (obj != null) {
            return y(obj, false);
        }
        this.f59625c.nullValue();
        return this;
    }

    private f L(@o0 String str, @q0 Object obj) throws IOException, EncodingException {
        if (obj == null) {
            return this;
        }
        M();
        this.f59625c.name(str);
        return y(obj, false);
    }

    private void M() throws IOException {
        if (!this.f59624b) {
            throw new IllegalStateException(ProtectedSandApp.s("L\u0001"));
        }
        f fVar = this.f59623a;
        if (fVar != null) {
            fVar.M();
            this.f59623a.f59624b = false;
            this.f59623a = null;
            this.f59625c.endObject();
        }
    }

    @Override // com.google.firebase.encoders.e
    @o0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public f i(@o0 String str, double d5) throws IOException {
        M();
        this.f59625c.name(str);
        return q(d5);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public f k(@o0 String str, int i4) throws IOException {
        M();
        this.f59625c.name(str);
        return add(i4);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public f j(@o0 String str, long j4) throws IOException {
        M();
        this.f59625c.name(str);
        return a(j4);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public f p(@o0 String str, @q0 Object obj) throws IOException {
        return this.f59629g ? L(str, obj) : K(str, obj);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public f h(@o0 String str, boolean z4) throws IOException {
        M();
        this.f59625c.name(str);
        return o(z4);
    }

    @Override // com.google.firebase.encoders.g
    @o0
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public f o(boolean z4) throws IOException {
        M();
        this.f59625c.value(z4);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @o0
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public f u(@q0 byte[] bArr) throws IOException {
        M();
        if (bArr == null) {
            this.f59625c.nullValue();
        } else {
            this.f59625c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    void I() throws IOException {
        M();
        this.f59625c.flush();
    }

    f J(com.google.firebase.encoders.d<Object> dVar, Object obj, boolean z4) throws IOException {
        if (!z4) {
            this.f59625c.beginObject();
        }
        dVar.a(obj, this);
        if (!z4) {
            this.f59625c.endObject();
        }
        return this;
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e b(@o0 com.google.firebase.encoders.c cVar, boolean z4) throws IOException {
        return h(cVar.b(), z4);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e c(@o0 com.google.firebase.encoders.c cVar, long j4) throws IOException {
        return j(cVar.b(), j4);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e d(@o0 com.google.firebase.encoders.c cVar, int i4) throws IOException {
        return k(cVar.b(), i4);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e e(@o0 com.google.firebase.encoders.c cVar, float f4) throws IOException {
        return i(cVar.b(), f4);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e f(@o0 com.google.firebase.encoders.c cVar) throws IOException {
        return s(cVar.b());
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e g(@o0 com.google.firebase.encoders.c cVar, double d5) throws IOException {
        return i(cVar.b(), d5);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e m(@o0 com.google.firebase.encoders.c cVar, @q0 Object obj) throws IOException {
        return p(cVar.b(), obj);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e n(@q0 Object obj) throws IOException {
        return y(obj, true);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e s(@o0 String str) throws IOException {
        M();
        this.f59623a = new f(this);
        this.f59625c.name(str);
        this.f59625c.beginObject();
        return this.f59623a;
    }

    @Override // com.google.firebase.encoders.g
    @o0
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public f q(double d5) throws IOException {
        M();
        this.f59625c.value(d5);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @o0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public f r(float f4) throws IOException {
        M();
        this.f59625c.value(f4);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @o0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public f add(int i4) throws IOException {
        M();
        this.f59625c.value(i4);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @o0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public f a(long j4) throws IOException {
        M();
        this.f59625c.value(j4);
        return this;
    }

    @o0
    f y(@q0 Object obj, boolean z4) throws IOException {
        if (z4 && H(obj)) {
            throw new EncodingException(String.format(ProtectedSandApp.s("M\u0001"), obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f59625c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f59625c.value((Number) obj);
            return this;
        }
        int i4 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f59625c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    y(it.next(), false);
                }
                this.f59625c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f59625c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        p((String) key, entry.getValue());
                    } catch (ClassCastException e4) {
                        throw new EncodingException(String.format(ProtectedSandApp.s("N\u0001"), key, key.getClass()), (Throwable) e4);
                    }
                }
                this.f59625c.endObject();
                return this;
            }
            com.google.firebase.encoders.d<?> dVar = this.f59626d.get(obj.getClass());
            if (dVar != null) {
                return J(dVar, obj, z4);
            }
            com.google.firebase.encoders.f<?> fVar = this.f59627e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return J(this.f59628f, obj, z4);
            }
            if (obj instanceof g) {
                add(((g) obj).getNumber());
            } else {
                l(((Enum) obj).name());
            }
            return this;
        }
        if (obj instanceof byte[]) {
            return u((byte[]) obj);
        }
        this.f59625c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i4 < length) {
                this.f59625c.value(r6[i4]);
                i4++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i4 < length2) {
                a(jArr[i4]);
                i4++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i4 < length3) {
                this.f59625c.value(dArr[i4]);
                i4++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i4 < length4) {
                this.f59625c.value(zArr[i4]);
                i4++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                y(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                y(obj2, false);
            }
        }
        this.f59625c.endArray();
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @o0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public f l(@q0 String str) throws IOException {
        M();
        this.f59625c.value(str);
        return this;
    }

    private f(f fVar) {
        this.f59625c = fVar.f59625c;
        this.f59626d = fVar.f59626d;
        this.f59627e = fVar.f59627e;
        this.f59628f = fVar.f59628f;
        this.f59629g = fVar.f59629g;
    }
}

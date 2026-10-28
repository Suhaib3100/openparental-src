package com.google.firebase.encoders.json;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonValueObjectEncoderContext.java */
/* loaded from: classes3.dex */
final class f implements com.google.firebase.encoders.e, com.google.firebase.encoders.g {

    /* renamed from: a, reason: collision with root package name */
    private f f16602a = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16603b = true;

    /* renamed from: c, reason: collision with root package name */
    private final JsonWriter f16604c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.d<?>> f16605d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.f<?>> f16606e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.encoders.d<Object> f16607f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f16608g;

    f(@o0 Writer writer, @o0 Map<Class<?>, com.google.firebase.encoders.d<?>> map, @o0 Map<Class<?>, com.google.firebase.encoders.f<?>> map2, com.google.firebase.encoders.d<Object> dVar, boolean z5) {
        this.f16604c = new JsonWriter(writer);
        this.f16605d = map;
        this.f16606e = map2;
        this.f16607f = dVar;
        this.f16608g = z5;
    }

    private boolean F(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private f I(@o0 String str, @q0 Object obj) throws IOException, EncodingException {
        K();
        this.f16604c.name(str);
        if (obj != null) {
            return w(obj, false);
        }
        this.f16604c.nullValue();
        return this;
    }

    private f J(@o0 String str, @q0 Object obj) throws IOException, EncodingException {
        if (obj == null) {
            return this;
        }
        K();
        this.f16604c.name(str);
        return w(obj, false);
    }

    private void K() throws IOException {
        if (!this.f16603b) {
            throw new IllegalStateException(ProtectedSandApp.s("⩳"));
        }
        f fVar = this.f16602a;
        if (fVar != null) {
            fVar.K();
            this.f16602a.f16603b = false;
            this.f16602a = null;
            this.f16604c.endObject();
        }
    }

    @Override // com.google.firebase.encoders.e
    @o0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public f k(@o0 String str, long j5) throws IOException {
        K();
        this.f16604c.name(str);
        return add(j5);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public f o(@o0 String str, @q0 Object obj) throws IOException {
        return this.f16608g ? J(str, obj) : I(str, obj);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public f i(@o0 String str, boolean z5) throws IOException {
        K();
        this.f16604c.name(str);
        return n(z5);
    }

    @Override // com.google.firebase.encoders.g
    @o0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public f n(boolean z5) throws IOException {
        K();
        this.f16604c.value(z5);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @o0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public f d(@q0 byte[] bArr) throws IOException {
        K();
        if (bArr == null) {
            this.f16604c.nullValue();
        } else {
            this.f16604c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    void G() throws IOException {
        K();
        this.f16604c.flush();
    }

    f H(com.google.firebase.encoders.d<Object> dVar, Object obj, boolean z5) throws IOException {
        if (!z5) {
            this.f16604c.beginObject();
        }
        dVar.a(obj, this);
        if (!z5) {
            this.f16604c.endObject();
        }
        return this;
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e a(@o0 com.google.firebase.encoders.c cVar, boolean z5) throws IOException {
        return i(cVar.b(), z5);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e b(@o0 com.google.firebase.encoders.c cVar, long j5) throws IOException {
        return k(cVar.b(), j5);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e c(@o0 com.google.firebase.encoders.c cVar, int i5) throws IOException {
        return l(cVar.b(), i5);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e e(@o0 com.google.firebase.encoders.c cVar, float f6) throws IOException {
        return j(cVar.b(), f6);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e f(@o0 com.google.firebase.encoders.c cVar) throws IOException {
        return q(cVar.b());
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e g(@o0 com.google.firebase.encoders.c cVar, double d6) throws IOException {
        return j(cVar.b(), d6);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e h(@q0 Object obj) throws IOException {
        return w(obj, true);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e q(@o0 String str) throws IOException {
        K();
        this.f16602a = new f(this);
        this.f16604c.name(str);
        this.f16604c.beginObject();
        return this.f16602a;
    }

    @Override // com.google.firebase.encoders.e
    @o0
    public com.google.firebase.encoders.e r(@o0 com.google.firebase.encoders.c cVar, @q0 Object obj) throws IOException {
        return o(cVar.b(), obj);
    }

    @Override // com.google.firebase.encoders.g
    @o0
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public f add(double d6) throws IOException {
        K();
        this.f16604c.value(d6);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @o0
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public f p(float f6) throws IOException {
        K();
        this.f16604c.value(f6);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @o0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public f add(int i5) throws IOException {
        K();
        this.f16604c.value(i5);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @o0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public f add(long j5) throws IOException {
        K();
        this.f16604c.value(j5);
        return this;
    }

    @o0
    f w(@q0 Object obj, boolean z5) throws IOException {
        int i5 = 0;
        if (z5 && F(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new EncodingException(String.format(ProtectedSandApp.s("⩴"), objArr));
        }
        if (obj == null) {
            this.f16604c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f16604c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f16604c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    w(it.next(), false);
                }
                this.f16604c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f16604c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        o((String) key, entry.getValue());
                    } catch (ClassCastException e6) {
                        throw new EncodingException(String.format(ProtectedSandApp.s("⩵"), key, key.getClass()), e6);
                    }
                }
                this.f16604c.endObject();
                return this;
            }
            com.google.firebase.encoders.d<?> dVar = this.f16605d.get(obj.getClass());
            if (dVar != null) {
                return H(dVar, obj, z5);
            }
            com.google.firebase.encoders.f<?> fVar = this.f16606e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return H(this.f16607f, obj, z5);
            }
            if (obj instanceof g) {
                add(((g) obj).getNumber());
            } else {
                m(((Enum) obj).name());
            }
            return this;
        }
        if (obj instanceof byte[]) {
            return d((byte[]) obj);
        }
        this.f16604c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i5 < length) {
                this.f16604c.value(r6[i5]);
                i5++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i5 < length2) {
                add(jArr[i5]);
                i5++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i5 < length3) {
                this.f16604c.value(dArr[i5]);
                i5++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i5 < length4) {
                this.f16604c.value(zArr[i5]);
                i5++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                w(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                w(obj2, false);
            }
        }
        this.f16604c.endArray();
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @o0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public f m(@q0 String str) throws IOException {
        K();
        this.f16604c.value(str);
        return this;
    }

    @Override // com.google.firebase.encoders.e
    @o0
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public f j(@o0 String str, double d6) throws IOException {
        K();
        this.f16604c.name(str);
        return add(d6);
    }

    @Override // com.google.firebase.encoders.e
    @o0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public f l(@o0 String str, int i5) throws IOException {
        K();
        this.f16604c.name(str);
        return add(i5);
    }

    private f(f fVar) {
        this.f16604c = fVar.f16604c;
        this.f16605d = fVar.f16605d;
        this.f16606e = fVar.f16606e;
        this.f16607f = fVar.f16607f;
        this.f16608g = fVar.f16608g;
    }
}

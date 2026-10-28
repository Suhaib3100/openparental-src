package kotlin.jvm.internal;

import java.io.Serializable;

/* compiled from: AdaptedFunctionReference.java */
@kotlin.c1(version = "1.4")
/* loaded from: classes7.dex */
public class a implements e0, Serializable {

    /* renamed from: b, reason: collision with root package name */
    protected final Object f75276b;

    /* renamed from: c, reason: collision with root package name */
    private final Class f75277c;

    /* renamed from: d, reason: collision with root package name */
    private final String f75278d;

    /* renamed from: e, reason: collision with root package name */
    private final String f75279e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f75280f;

    /* renamed from: g, reason: collision with root package name */
    private final int f75281g;

    /* renamed from: h, reason: collision with root package name */
    private final int f75282h;

    public a(int i4, Class cls, String str, String str2, int i5) {
        this(i4, q.NO_RECEIVER, cls, str, str2, i5);
    }

    public kotlin.reflect.h a() {
        Class cls = this.f75277c;
        if (cls == null) {
            return null;
        }
        return this.f75280f ? l1.g(cls) : l1.d(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f75280f == aVar.f75280f && this.f75281g == aVar.f75281g && this.f75282h == aVar.f75282h && l0.g(this.f75276b, aVar.f75276b) && l0.g(this.f75277c, aVar.f75277c) && this.f75278d.equals(aVar.f75278d) && this.f75279e.equals(aVar.f75279e);
    }

    @Override // kotlin.jvm.internal.e0
    public int getArity() {
        return this.f75281g;
    }

    public int hashCode() {
        Object obj = this.f75276b;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f75277c;
        return ((((androidx.compose.foundation.text.modifiers.n.a(this.f75279e, androidx.compose.foundation.text.modifiers.n.a(this.f75278d, (hashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31), 31) + (this.f75280f ? 1231 : 1237)) * 31) + this.f75281g) * 31) + this.f75282h;
    }

    public String toString() {
        return l1.w(this);
    }

    public a(int i4, Object obj, Class cls, String str, String str2, int i5) {
        this.f75276b = obj;
        this.f75277c = cls;
        this.f75278d = str;
        this.f75279e = str2;
        this.f75280f = (i5 & 1) == 1;
        this.f75281g = i4;
        this.f75282h = i5 >> 1;
    }
}

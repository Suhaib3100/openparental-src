package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.reflect.KDeclarationContainer;

/* compiled from: AdaptedFunctionReference.java */
@SinceKotlin(version = "1.4")
/* loaded from: classes6.dex */
public class a implements FunctionBase, Serializable {

    /* renamed from: o, reason: collision with root package name */
    protected final Object f23518o;

    /* renamed from: p, reason: collision with root package name */
    private final Class f23519p;

    /* renamed from: q, reason: collision with root package name */
    private final String f23520q;

    /* renamed from: r, reason: collision with root package name */
    private final String f23521r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f23522s;

    /* renamed from: t, reason: collision with root package name */
    private final int f23523t;

    /* renamed from: u, reason: collision with root package name */
    private final int f23524u;

    public a(int i5, Class cls, String str, String str2, int i6) {
        this(i5, q.f23594u, cls, str, str2, i6);
    }

    public KDeclarationContainer a() {
        Class cls = this.f23519p;
        if (cls == null) {
            return null;
        }
        return this.f23522s ? l1.g(cls) : l1.d(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f23522s == aVar.f23522s && this.f23523t == aVar.f23523t && this.f23524u == aVar.f23524u && l0.g(this.f23518o, aVar.f23518o) && l0.g(this.f23519p, aVar.f23519p) && this.f23520q.equals(aVar.f23520q) && this.f23521r.equals(aVar.f23521r);
    }

    @Override // kotlin.jvm.internal.FunctionBase
    /* renamed from: f */
    public int getF23321p() {
        return this.f23523t;
    }

    public int hashCode() {
        Object obj = this.f23518o;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f23519p;
        return ((((((this.f23521r.hashCode() + ((this.f23520q.hashCode() + ((hashCode + (cls != null ? cls.hashCode() : 0)) * 31)) * 31)) * 31) + (this.f23522s ? 1231 : 1237)) * 31) + this.f23523t) * 31) + this.f23524u;
    }

    public String toString() {
        return l1.w(this);
    }

    public a(int i5, Object obj, Class cls, String str, String str2, int i6) {
        this.f23518o = obj;
        this.f23519p = cls;
        this.f23520q = str;
        this.f23521r = str2;
        this.f23522s = (i6 & 1) == 1;
        this.f23523t = i5;
        this.f23524u = i6 >> 1;
    }
}

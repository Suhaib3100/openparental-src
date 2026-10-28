package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;

/* compiled from: CallableReference.java */
/* loaded from: classes6.dex */
public abstract class q implements KCallable, Serializable {

    /* renamed from: u, reason: collision with root package name */
    @SinceKotlin(version = "1.1")
    public static final Object f23594u = a.f23601o;

    /* renamed from: o, reason: collision with root package name */
    private transient KCallable f23595o;

    /* renamed from: p, reason: collision with root package name */
    @SinceKotlin(version = "1.1")
    protected final Object f23596p;

    /* renamed from: q, reason: collision with root package name */
    @SinceKotlin(version = "1.4")
    private final Class f23597q;

    /* renamed from: r, reason: collision with root package name */
    @SinceKotlin(version = "1.4")
    private final String f23598r;

    /* renamed from: s, reason: collision with root package name */
    @SinceKotlin(version = "1.4")
    private final String f23599s;

    /* renamed from: t, reason: collision with root package name */
    @SinceKotlin(version = "1.4")
    private final boolean f23600t;

    /* compiled from: CallableReference.java */
    @SinceKotlin(version = "1.2")
    /* loaded from: classes5.dex */
    private static class a implements Serializable {

        /* renamed from: o, reason: collision with root package name */
        private static final a f23601o = new a();

        private a() {
        }

        private Object b() throws ObjectStreamException {
            return f23601o;
        }
    }

    public q() {
        this(f23594u);
    }

    @Override // kotlin.reflect.KCallable
    public Object C(Object... objArr) {
        return x0().C(objArr);
    }

    @Override // kotlin.reflect.KCallable
    public Object X(Map map) {
        return x0().X(map);
    }

    @Override // kotlin.reflect.KCallable
    @SinceKotlin(version = "1.1")
    public boolean a() {
        return x0().a();
    }

    @Override // kotlin.reflect.KCallable
    @SinceKotlin(version = "1.1")
    public KVisibility c() {
        return x0().c();
    }

    @Override // kotlin.reflect.KCallable
    @SinceKotlin(version = "1.1")
    public boolean d() {
        return x0().d();
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List<Annotation> getAnnotations() {
        return x0().getAnnotations();
    }

    @Override // kotlin.reflect.KCallable
    public String getName() {
        return this.f23598r;
    }

    @Override // kotlin.reflect.KCallable
    @SinceKotlin(version = "1.1")
    public List<KTypeParameter> getTypeParameters() {
        return x0().getTypeParameters();
    }

    @Override // kotlin.reflect.KCallable
    public KType i() {
        return x0().i();
    }

    @Override // kotlin.reflect.KCallable
    @SinceKotlin(version = "1.1")
    public boolean isOpen() {
        return x0().isOpen();
    }

    @Override // kotlin.reflect.KCallable, kotlin.reflect.KFunction
    @SinceKotlin(version = "1.3")
    public boolean o() {
        return x0().o();
    }

    @Override // kotlin.reflect.KCallable
    public List<KParameter> r() {
        return x0().r();
    }

    @SinceKotlin(version = "1.1")
    public KCallable s0() {
        KCallable kCallable = this.f23595o;
        if (kCallable != null) {
            return kCallable;
        }
        KCallable t02 = t0();
        this.f23595o = t02;
        return t02;
    }

    protected abstract KCallable t0();

    @SinceKotlin(version = "1.1")
    public Object v0() {
        return this.f23596p;
    }

    public KDeclarationContainer w0() {
        Class cls = this.f23597q;
        if (cls == null) {
            return null;
        }
        return this.f23600t ? l1.g(cls) : l1.d(cls);
    }

    @SinceKotlin(version = "1.1")
    protected KCallable x0() {
        KCallable s02 = s0();
        if (s02 != this) {
            return s02;
        }
        throw new p3.r();
    }

    public String y0() {
        return this.f23599s;
    }

    @SinceKotlin(version = "1.1")
    protected q(Object obj) {
        this(obj, null, null, null, false);
    }

    @SinceKotlin(version = "1.4")
    protected q(Object obj, Class cls, String str, String str2, boolean z5) {
        this.f23596p = obj;
        this.f23597q = cls;
        this.f23598r = str;
        this.f23599s = str2;
        this.f23600t = z5;
    }
}

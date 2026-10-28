package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* compiled from: CallableReference.java */
/* loaded from: classes7.dex */
public abstract class q implements kotlin.reflect.c, Serializable {

    @kotlin.c1(version = "1.1")
    public static final Object NO_RECEIVER = a.f75350b;

    @kotlin.c1(version = "1.4")
    private final boolean isTopLevel;

    @kotlin.c1(version = "1.4")
    private final String name;

    @kotlin.c1(version = "1.4")
    private final Class owner;

    @kotlin.c1(version = "1.1")
    protected final Object receiver;
    private transient kotlin.reflect.c reflected;

    @kotlin.c1(version = "1.4")
    private final String signature;

    /* compiled from: CallableReference.java */
    @kotlin.c1(version = "1.2")
    private static class a implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        private static final a f75350b = new a();

        private a() {
        }

        private Object b() throws ObjectStreamException {
            return f75350b;
        }
    }

    public q() {
        this(NO_RECEIVER);
    }

    @Override // kotlin.reflect.c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // kotlin.reflect.c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    @kotlin.c1(version = "1.1")
    public kotlin.reflect.c compute() {
        kotlin.reflect.c cVar = this.reflected;
        if (cVar != null) {
            return cVar;
        }
        kotlin.reflect.c computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    protected abstract kotlin.reflect.c computeReflected();

    @Override // kotlin.reflect.b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @kotlin.c1(version = "1.1")
    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // kotlin.reflect.c
    public String getName() {
        return this.name;
    }

    public kotlin.reflect.h getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? l1.g(cls) : l1.d(cls);
    }

    @Override // kotlin.reflect.c
    public List<kotlin.reflect.n> getParameters() {
        return getReflected().getParameters();
    }

    @kotlin.c1(version = "1.1")
    protected kotlin.reflect.c getReflected() {
        kotlin.reflect.c compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new kd.r();
    }

    @Override // kotlin.reflect.c
    public kotlin.reflect.s getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // kotlin.reflect.c
    @kotlin.c1(version = "1.1")
    public List<kotlin.reflect.t> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // kotlin.reflect.c
    @kotlin.c1(version = "1.1")
    public kotlin.reflect.w getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // kotlin.reflect.c
    @kotlin.c1(version = "1.1")
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // kotlin.reflect.c
    @kotlin.c1(version = "1.1")
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // kotlin.reflect.c
    @kotlin.c1(version = "1.1")
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // kotlin.reflect.c, kotlin.reflect.i
    @kotlin.c1(version = "1.3")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    @kotlin.c1(version = "1.1")
    protected q(Object obj) {
        this(obj, null, null, null, false);
    }

    @kotlin.c1(version = "1.4")
    protected q(Object obj, Class cls, String str, String str2, boolean z4) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z4;
    }
}

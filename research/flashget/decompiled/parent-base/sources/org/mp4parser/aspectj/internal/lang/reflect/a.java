package org.mp4parser.aspectj.internal.lang.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import lg.a0;

/* compiled from: AdviceImpl.java */
/* loaded from: classes9.dex */
public class a implements lg.a {

    /* renamed from: h, reason: collision with root package name */
    private static final String f87601h = "org.mp4parser.aspectj.runtime.internal";

    /* renamed from: a, reason: collision with root package name */
    private final lg.b f87602a;

    /* renamed from: b, reason: collision with root package name */
    private final Method f87603b;

    /* renamed from: c, reason: collision with root package name */
    private a0 f87604c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f87605d;

    /* renamed from: e, reason: collision with root package name */
    private Type[] f87606e;

    /* renamed from: f, reason: collision with root package name */
    private lg.d[] f87607f;

    /* renamed from: g, reason: collision with root package name */
    private lg.d[] f87608g;

    /* compiled from: AdviceImpl.java */
    /* renamed from: org.mp4parser.aspectj.internal.lang.reflect.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1363a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f87609a;

        static {
            int[] iArr = new int[lg.b.values().length];
            f87609a = iArr;
            try {
                iArr[lg.b.AFTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f87609a[lg.b.AFTER_RETURNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f87609a[lg.b.AFTER_THROWING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f87609a[lg.b.AROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f87609a[lg.b.BEFORE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    protected a(Method method, String str, lg.b bVar) {
        this.f87605d = false;
        this.f87602a = bVar;
        this.f87603b = method;
        this.f87604c = new n(str);
    }

    @Override // lg.a
    public lg.d a() {
        return lg.e.a(this.f87603b.getDeclaringClass());
    }

    @Override // lg.a
    public lg.b b() {
        return this.f87602a;
    }

    @Override // lg.a
    public lg.d<?>[] c() {
        if (this.f87607f == null) {
            Class<?>[] parameterTypes = this.f87603b.getParameterTypes();
            int i4 = 0;
            int i5 = 0;
            for (Class<?> cls : parameterTypes) {
                if (cls.getPackage().getName().equals("org.mp4parser.aspectj.runtime.internal")) {
                    i5++;
                }
            }
            this.f87607f = new lg.d[parameterTypes.length - i5];
            while (true) {
                lg.d[] dVarArr = this.f87607f;
                if (i4 >= dVarArr.length) {
                    break;
                }
                dVarArr[i4] = lg.e.a(parameterTypes[i4]);
                i4++;
            }
        }
        return this.f87607f;
    }

    @Override // lg.a
    public a0 d() {
        return this.f87604c;
    }

    @Override // lg.a
    public lg.d<?>[] e() {
        if (this.f87608g == null) {
            Class<?>[] exceptionTypes = this.f87603b.getExceptionTypes();
            this.f87608g = new lg.d[exceptionTypes.length];
            for (int i4 = 0; i4 < exceptionTypes.length; i4++) {
                this.f87608g[i4] = lg.e.a(exceptionTypes[i4]);
            }
        }
        return this.f87608g;
    }

    @Override // lg.a
    public Type[] f() {
        if (this.f87606e == null) {
            Type[] genericParameterTypes = this.f87603b.getGenericParameterTypes();
            int i4 = 0;
            int i5 = 0;
            for (Type type : genericParameterTypes) {
                if ((type instanceof Class) && ((Class) type).getPackage().getName().equals("org.mp4parser.aspectj.runtime.internal")) {
                    i5++;
                }
            }
            this.f87606e = new Type[genericParameterTypes.length - i5];
            while (true) {
                Type[] typeArr = this.f87606e;
                if (i4 >= typeArr.length) {
                    break;
                }
                Type type2 = genericParameterTypes[i4];
                if (type2 instanceof Class) {
                    typeArr[i4] = lg.e.a((Class) type2);
                } else {
                    typeArr[i4] = type2;
                }
                i4++;
            }
        }
        return this.f87606e;
    }

    @Override // lg.a
    public String getName() {
        String name = this.f87603b.getName();
        if (!name.startsWith("ajc$")) {
            return name;
        }
        jg.a aVar = (jg.a) this.f87603b.getAnnotation(jg.a.class);
        return aVar != null ? aVar.value() : "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
    
        if (r10 != 3) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mp4parser.aspectj.internal.lang.reflect.a.toString():java.lang.String");
    }

    protected a(Method method, String str, lg.b bVar, String str2) {
        this(method, str, bVar);
        this.f87605d = true;
    }
}

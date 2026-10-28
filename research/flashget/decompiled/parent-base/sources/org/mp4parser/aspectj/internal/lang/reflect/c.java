package org.mp4parser.aspectj.internal.lang.reflect;

import java.lang.annotation.Annotation;
import lg.b0;
import lg.d0;
import lg.i;

/* compiled from: DeclareAnnotationImpl.java */
/* loaded from: classes9.dex */
public class c implements lg.i {

    /* renamed from: a, reason: collision with root package name */
    private Annotation f87622a;

    /* renamed from: b, reason: collision with root package name */
    private String f87623b;

    /* renamed from: c, reason: collision with root package name */
    private lg.d<?> f87624c;

    /* renamed from: d, reason: collision with root package name */
    private i.a f87625d;

    /* renamed from: e, reason: collision with root package name */
    private d0 f87626e;

    /* renamed from: f, reason: collision with root package name */
    private b0 f87627f;

    /* compiled from: DeclareAnnotationImpl.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f87628a;

        static {
            int[] iArr = new int[i.a.values().length];
            f87628a = iArr;
            try {
                iArr[i.a.Type.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f87628a[i.a.Method.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f87628a[i.a.Field.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f87628a[i.a.Constructor.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public c(lg.d<?> dVar, String str, String str2, Annotation annotation, String str3) {
        this.f87624c = dVar;
        if (str.equals("at_type")) {
            this.f87625d = i.a.Type;
        } else if (str.equals("at_field")) {
            this.f87625d = i.a.Field;
        } else if (str.equals("at_method")) {
            this.f87625d = i.a.Method;
        } else {
            if (!str.equals("at_constructor")) {
                throw new IllegalStateException("Unknown declare annotation kind: ".concat(str));
            }
            this.f87625d = i.a.Constructor;
        }
        if (this.f87625d == i.a.Type) {
            this.f87626e = new s(str2);
        } else {
            this.f87627f = new p(str2);
        }
        this.f87622a = annotation;
        this.f87623b = str3;
    }

    @Override // lg.i
    public lg.d<?> a() {
        return this.f87624c;
    }

    @Override // lg.i
    public i.a b() {
        return this.f87625d;
    }

    @Override // lg.i
    public d0 c() {
        return this.f87626e;
    }

    @Override // lg.i
    public Annotation d() {
        return this.f87622a;
    }

    @Override // lg.i
    public String e() {
        return this.f87623b;
    }

    @Override // lg.i
    public b0 f() {
        return this.f87627f;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("declare @");
        int i4 = a.f87628a[b().ordinal()];
        if (i4 == 1) {
            stringBuffer.append("type : ");
            stringBuffer.append(c().a());
        } else if (i4 == 2) {
            stringBuffer.append("method : ");
            stringBuffer.append(f().a());
        } else if (i4 == 3) {
            stringBuffer.append("field : ");
            stringBuffer.append(f().a());
        } else if (i4 == 4) {
            stringBuffer.append("constructor : ");
            stringBuffer.append(f().a());
        }
        stringBuffer.append(" : ");
        stringBuffer.append(e());
        return stringBuffer.toString();
    }
}

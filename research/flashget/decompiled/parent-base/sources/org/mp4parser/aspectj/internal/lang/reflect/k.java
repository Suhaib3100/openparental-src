package org.mp4parser.aspectj.internal.lang.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: InterTypeMethodDeclarationImpl.java */
/* loaded from: classes9.dex */
public class k extends i implements lg.s {

    /* renamed from: e, reason: collision with root package name */
    private String f87655e;

    /* renamed from: f, reason: collision with root package name */
    private Method f87656f;

    /* renamed from: g, reason: collision with root package name */
    private int f87657g;

    /* renamed from: h, reason: collision with root package name */
    private lg.d<?>[] f87658h;

    /* renamed from: i, reason: collision with root package name */
    private Type[] f87659i;

    /* renamed from: j, reason: collision with root package name */
    private lg.d<?> f87660j;

    /* renamed from: k, reason: collision with root package name */
    private Type f87661k;

    /* renamed from: l, reason: collision with root package name */
    private lg.d<?>[] f87662l;

    public k(lg.d<?> dVar, String str, int i4, String str2, Method method) {
        super(dVar, str, i4);
        this.f87657g = 1;
        this.f87655e = str2;
        this.f87656f = method;
    }

    @Override // lg.s
    public lg.d<?>[] c() {
        Class<?>[] parameterTypes = this.f87656f.getParameterTypes();
        int length = parameterTypes.length;
        int i4 = this.f87657g;
        lg.d<?>[] dVarArr = new lg.d[length - i4];
        while (i4 < parameterTypes.length) {
            dVarArr[i4 - this.f87657g] = lg.e.a(parameterTypes[i4]);
            i4++;
        }
        return dVarArr;
    }

    @Override // lg.s
    public Type d() {
        Type genericReturnType = this.f87656f.getGenericReturnType();
        return genericReturnType instanceof Class ? lg.e.a((Class) genericReturnType) : genericReturnType;
    }

    @Override // lg.s
    public lg.d<?>[] e() {
        Class<?>[] exceptionTypes = this.f87656f.getExceptionTypes();
        lg.d<?>[] dVarArr = new lg.d[exceptionTypes.length];
        for (int i4 = 0; i4 < exceptionTypes.length; i4++) {
            dVarArr[i4] = lg.e.a(exceptionTypes[i4]);
        }
        return dVarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lg.s
    public Type[] f() {
        Type[] genericParameterTypes = this.f87656f.getGenericParameterTypes();
        int length = genericParameterTypes.length;
        int i4 = this.f87657g;
        lg.d[] dVarArr = new lg.d[length - i4];
        while (i4 < genericParameterTypes.length) {
            Type type = genericParameterTypes[i4];
            if (type instanceof Class) {
                dVarArr[i4 - this.f87657g] = lg.e.a((Class) type);
            } else {
                dVarArr[i4 - this.f87657g] = type;
            }
            i4++;
        }
        return dVarArr;
    }

    @Override // lg.s
    public String getName() {
        return this.f87655e;
    }

    @Override // lg.s
    public lg.d<?> getReturnType() {
        return lg.e.a(this.f87656f.getReturnType());
    }

    @Override // lg.s
    public TypeVariable<Method>[] getTypeParameters() {
        return this.f87656f.getTypeParameters();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Modifier.toString(getModifiers()));
        stringBuffer.append(" ");
        stringBuffer.append(getReturnType().toString());
        stringBuffer.append(" ");
        stringBuffer.append(this.f87649b);
        stringBuffer.append(".");
        stringBuffer.append(getName());
        stringBuffer.append("(");
        lg.d<?>[] c5 = c();
        for (int i4 = 0; i4 < c5.length - 1; i4++) {
            stringBuffer.append(c5[i4].toString());
            stringBuffer.append(", ");
        }
        if (c5.length > 0) {
            stringBuffer.append(c5[c5.length - 1].toString());
        }
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    public k(lg.d<?> dVar, lg.d<?> dVar2, Method method, int i4) {
        super(dVar, dVar2, i4);
        this.f87657g = 0;
        this.f87655e = method.getName();
        this.f87656f = method;
    }
}

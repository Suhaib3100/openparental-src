package org.mp4parser.aspectj.internal.lang.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

/* compiled from: InterTypeConstructorDeclarationImpl.java */
/* loaded from: classes9.dex */
public class h extends i implements lg.p {

    /* renamed from: e, reason: collision with root package name */
    private Method f87647e;

    public h(lg.d<?> dVar, String str, int i4, Method method) {
        super(dVar, str, i4);
        this.f87647e = method;
    }

    @Override // lg.p
    public lg.d<?>[] c() {
        Class<?>[] parameterTypes = this.f87647e.getParameterTypes();
        lg.d<?>[] dVarArr = new lg.d[parameterTypes.length - 1];
        for (int i4 = 1; i4 < parameterTypes.length; i4++) {
            dVarArr[i4 - 1] = lg.e.a(parameterTypes[i4]);
        }
        return dVarArr;
    }

    @Override // lg.p
    public lg.d<?>[] e() {
        Class<?>[] exceptionTypes = this.f87647e.getExceptionTypes();
        lg.d<?>[] dVarArr = new lg.d[exceptionTypes.length];
        for (int i4 = 0; i4 < exceptionTypes.length; i4++) {
            dVarArr[i4] = lg.e.a(exceptionTypes[i4]);
        }
        return dVarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lg.p
    public Type[] f() {
        Type[] genericParameterTypes = this.f87647e.getGenericParameterTypes();
        lg.d[] dVarArr = new lg.d[genericParameterTypes.length - 1];
        for (int i4 = 1; i4 < genericParameterTypes.length; i4++) {
            Type type = genericParameterTypes[i4];
            if (type instanceof Class) {
                dVarArr[i4 - 1] = lg.e.a((Class) type);
            } else {
                dVarArr[i4 - 1] = type;
            }
        }
        return dVarArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Modifier.toString(getModifiers()));
        stringBuffer.append(" ");
        stringBuffer.append(this.f87649b);
        stringBuffer.append(".new(");
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
}

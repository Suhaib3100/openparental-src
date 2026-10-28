package com.google.common.reflect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashSet;
import java.util.Set;

/* compiled from: TypeVisitor.java */
@d
/* loaded from: classes6.dex */
abstract class r {

    /* renamed from: a, reason: collision with root package name */
    private final Set<Type> f57622a = new HashSet();

    r() {
    }

    public final void a(Type... typeArr) {
        for (Type type : typeArr) {
            if (type != null && this.f57622a.add(type)) {
                try {
                    if (type instanceof TypeVariable) {
                        e((TypeVariable) type);
                    } else if (type instanceof WildcardType) {
                        f((WildcardType) type);
                    } else if (type instanceof ParameterizedType) {
                        d((ParameterizedType) type);
                    } else if (type instanceof Class) {
                        b((Class) type);
                    } else {
                        if (!(type instanceof GenericArrayType)) {
                            String valueOf = String.valueOf(type);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 14);
                            sb.append(ProtectedSandApp.s("烙"));
                            sb.append(valueOf);
                            throw new AssertionError(sb.toString());
                        }
                        c((GenericArrayType) type);
                    }
                } catch (Throwable th) {
                    this.f57622a.remove(type);
                    throw th;
                }
            }
        }
    }

    void b(Class<?> cls) {
    }

    void c(GenericArrayType genericArrayType) {
    }

    void d(ParameterizedType parameterizedType) {
    }

    void e(TypeVariable<?> typeVariable) {
    }

    void f(WildcardType wildcardType) {
    }
}

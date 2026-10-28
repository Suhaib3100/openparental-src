package org.mp4parser.aspectj.internal.lang.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.StringTokenizer;

/* compiled from: StringToType.java */
/* loaded from: classes9.dex */
public class q {

    /* compiled from: StringToType.java */
    static class a implements ParameterizedType {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Type[] f87673b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Class f87674c;

        a(Type[] typeArr, Class cls) {
            this.f87673b = typeArr;
            this.f87674c = cls;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return this.f87673b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f87674c.getEnclosingClass();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f87674c;
        }
    }

    public static Type[] a(String str, Class cls) throws ClassNotFoundException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        Type[] typeArr = new Type[stringTokenizer.countTokens()];
        int i4 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            typeArr[i4] = c(stringTokenizer.nextToken().trim(), cls);
            i4++;
        }
        return typeArr;
    }

    private static Type b(String str, Class cls) throws ClassNotFoundException {
        int indexOf = str.indexOf(60);
        return new a(a(str.substring(indexOf + 1, str.lastIndexOf(62)), cls), Class.forName(str.substring(0, indexOf), false, cls.getClassLoader()));
    }

    public static Type c(String str, Class cls) throws ClassNotFoundException {
        try {
            return str.indexOf("<") == -1 ? lg.e.a(Class.forName(str, false, cls.getClassLoader())) : b(str, cls);
        } catch (ClassNotFoundException unused) {
            TypeVariable[] typeParameters = cls.getTypeParameters();
            for (int i4 = 0; i4 < typeParameters.length; i4++) {
                if (typeParameters[i4].getName().equals(str)) {
                    return typeParameters[i4];
                }
            }
            throw new ClassNotFoundException(str);
        }
    }
}

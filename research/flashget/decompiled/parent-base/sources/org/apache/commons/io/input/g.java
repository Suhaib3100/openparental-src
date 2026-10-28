package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.StreamCorruptedException;
import java.lang.reflect.Proxy;

/* compiled from: ClassLoaderObjectInputStream.java */
/* loaded from: classes4.dex */
public class g extends ObjectInputStream {

    /* renamed from: b, reason: collision with root package name */
    private final ClassLoader f85461b;

    public g(ClassLoader classLoader, InputStream inputStream) throws IOException, StreamCorruptedException {
        super(inputStream);
        this.f85461b = classLoader;
    }

    @Override // java.io.ObjectInputStream
    protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
        Class<?> cls = Class.forName(objectStreamClass.getName(), false, this.f85461b);
        return cls != null ? cls : super.resolveClass(objectStreamClass);
    }

    @Override // java.io.ObjectInputStream
    protected Class<?> resolveProxyClass(String[] strArr) throws IOException, ClassNotFoundException {
        Class[] clsArr = new Class[strArr.length];
        for (int i4 = 0; i4 < strArr.length; i4++) {
            clsArr[i4] = Class.forName(strArr[i4], false, this.f85461b);
        }
        try {
            return Proxy.getProxyClass(this.f85461b, clsArr);
        } catch (IllegalArgumentException unused) {
            return super.resolveProxyClass(strArr);
        }
    }
}

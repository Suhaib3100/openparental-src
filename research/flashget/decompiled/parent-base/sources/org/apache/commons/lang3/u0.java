package org.apache.commons.lang3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SerializationUtils.java */
/* loaded from: classes6.dex */
public class u0 {

    /* compiled from: SerializationUtils.java */
    static class a extends ObjectInputStream {

        /* renamed from: c, reason: collision with root package name */
        private static final Map<String, Class<?>> f86409c;

        /* renamed from: b, reason: collision with root package name */
        private final ClassLoader f86410b;

        static {
            HashMap hashMap = new HashMap();
            f86409c = hashMap;
            hashMap.put("byte", Byte.TYPE);
            hashMap.put("short", Short.TYPE);
            hashMap.put("int", Integer.TYPE);
            hashMap.put("long", Long.TYPE);
            hashMap.put("float", Float.TYPE);
            hashMap.put("double", Double.TYPE);
            hashMap.put("boolean", Boolean.TYPE);
            hashMap.put("char", Character.TYPE);
            hashMap.put("void", Void.TYPE);
        }

        a(InputStream inputStream, ClassLoader classLoader) throws IOException {
            super(inputStream);
            this.f86410b = classLoader;
        }

        @Override // java.io.ObjectInputStream
        protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            String name = objectStreamClass.getName();
            try {
                try {
                    return Class.forName(name, false, this.f86410b);
                } catch (ClassNotFoundException e4) {
                    Class<?> cls = f86409c.get(name);
                    if (cls != null) {
                        return cls;
                    }
                    throw e4;
                }
            } catch (ClassNotFoundException unused) {
                return Class.forName(name, false, Thread.currentThread().getContextClassLoader());
            }
        }
    }

    public static <T extends Serializable> T a(T t4) {
        if (t4 == null) {
            return null;
        }
        try {
            a aVar = new a(new ByteArrayInputStream(f(t4)), t4.getClass().getClassLoader());
            try {
                T t5 = (T) aVar.readObject();
                aVar.close();
                return t5;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        aVar.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException e4) {
            throw new SerializationException("IOException while reading or closing cloned object data", e4);
        } catch (ClassNotFoundException e5) {
            throw new SerializationException("ClassNotFoundException while reading cloned object data", e5);
        }
    }

    public static <T> T b(InputStream inputStream) {
        k1.b0(inputStream, "The InputStream must not be null", new Object[0]);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            try {
                T t4 = (T) objectInputStream.readObject();
                objectInputStream.close();
                return t4;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        objectInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException | ClassNotFoundException e4) {
            throw new SerializationException(e4);
        }
    }

    public static <T> T c(byte[] bArr) {
        k1.b0(bArr, "The byte[] must not be null", new Object[0]);
        return (T) b(new ByteArrayInputStream(bArr));
    }

    public static <T extends Serializable> T d(T t4) {
        return (T) c(f(t4));
    }

    public static void e(Serializable serializable, OutputStream outputStream) {
        k1.b0(outputStream, "The OutputStream must not be null", new Object[0]);
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            try {
                objectOutputStream.writeObject(serializable);
                objectOutputStream.close();
            } finally {
            }
        } catch (IOException e4) {
            throw new SerializationException(e4);
        }
    }

    public static byte[] f(Serializable serializable) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        e(serializable, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}

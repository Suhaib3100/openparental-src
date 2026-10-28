package com.google.common.collect;

import com.google.common.collect.u4;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Serialization.java */
@w0
@d9.c
/* loaded from: classes6.dex */
final class b6 {

    /* compiled from: Serialization.java */
    static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Field f55386a;

        void a(T t4, int i4) {
            try {
                this.f55386a.set(t4, Integer.valueOf(i4));
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            }
        }

        void b(T t4, Object obj) {
            try {
                this.f55386a.set(t4, obj);
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            }
        }

        private b(Field field) {
            this.f55386a = field;
            field.setAccessible(true);
        }
    }

    private b6() {
    }

    static <T> b<T> a(Class<T> cls, String str) {
        try {
            return new b<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e4) {
            throw new AssertionError(e4);
        }
    }

    static <K, V> void b(Map<K, V> map, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        c(map, objectInputStream, objectInputStream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> void c(Map<K, V> map, ObjectInputStream objectInputStream, int i4) throws IOException, ClassNotFoundException {
        for (int i5 = 0; i5 < i4; i5++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    static <K, V> void d(r4<K, V> r4Var, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        e(r4Var, objectInputStream, objectInputStream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> void e(r4<K, V> r4Var, ObjectInputStream objectInputStream, int i4) throws IOException, ClassNotFoundException {
        for (int i5 = 0; i5 < i4; i5++) {
            Collection collection = r4Var.get(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i6 = 0; i6 < readInt; i6++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    static <E> void f(u4<E> u4Var, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        g(u4Var, objectInputStream, objectInputStream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <E> void g(u4<E> u4Var, ObjectInputStream objectInputStream, int i4) throws IOException, ClassNotFoundException {
        for (int i5 = 0; i5 < i4; i5++) {
            u4Var.d2(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    static int h(ObjectInputStream objectInputStream) throws IOException {
        return objectInputStream.readInt();
    }

    static <K, V> void i(Map<K, V> map, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    static <K, V> void j(r4<K, V> r4Var, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(r4Var.f().size());
        for (Map.Entry<K, Collection<V>> entry : r4Var.f().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    static <E> void k(u4<E> u4Var, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(u4Var.entrySet().size());
        for (u4.a<E> aVar : u4Var.entrySet()) {
            objectOutputStream.writeObject(aVar.getElement());
            objectOutputStream.writeInt(aVar.getCount());
        }
    }
}

package org.apache.commons.lang3.event;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.lang3.k1;

/* compiled from: EventListenerSupport.java */
/* loaded from: classes6.dex */
public class a<L> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final long f85976e = 3593265990380473632L;

    /* renamed from: b, reason: collision with root package name */
    private List<L> f85977b;

    /* renamed from: c, reason: collision with root package name */
    private transient L f85978c;

    /* renamed from: d, reason: collision with root package name */
    private transient L[] f85979d;

    /* compiled from: EventListenerSupport.java */
    /* renamed from: org.apache.commons.lang3.event.a$a, reason: collision with other inner class name */
    protected class C1338a implements InvocationHandler {
        protected C1338a() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Iterator it = a.this.f85977b.iterator();
            while (it.hasNext()) {
                method.invoke(it.next(), objArr);
            }
            return null;
        }
    }

    public a(Class<L> cls) {
        this(cls, Thread.currentThread().getContextClassLoader());
    }

    public static <T> a<T> d(Class<T> cls) {
        return new a<>(cls);
    }

    private void f(Class<L> cls, ClassLoader classLoader) {
        this.f85978c = cls.cast(Proxy.newProxyInstance(classLoader, new Class[]{cls}, e()));
    }

    private void j(Class<L> cls, ClassLoader classLoader) {
        this.f85979d = (L[]) ((Object[]) Array.newInstance((Class<?>) cls, 0));
        f(cls, classLoader);
    }

    private void k(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        Object[] objArr = (Object[]) objectInputStream.readObject();
        this.f85977b = new CopyOnWriteArrayList(objArr);
        j(objArr.getClass().getComponentType(), Thread.currentThread().getContextClassLoader());
    }

    private void m(ObjectOutputStream objectOutputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new ByteArrayOutputStream());
        for (L l4 : this.f85977b) {
            try {
                objectOutputStream2.writeObject(l4);
                arrayList.add(l4);
            } catch (IOException unused) {
                objectOutputStream2 = new ObjectOutputStream(new ByteArrayOutputStream());
            }
        }
        objectOutputStream.writeObject(arrayList.toArray(this.f85979d));
    }

    public void b(L l4) {
        c(l4, true);
    }

    public void c(L l4, boolean z4) {
        k1.b0(l4, "Listener object cannot be null.", new Object[0]);
        if (z4 || !this.f85977b.contains(l4)) {
            this.f85977b.add(l4);
        }
    }

    protected InvocationHandler e() {
        return new C1338a();
    }

    public L g() {
        return this.f85978c;
    }

    int h() {
        return this.f85977b.size();
    }

    public L[] i() {
        return (L[]) this.f85977b.toArray(this.f85979d);
    }

    public void l(L l4) {
        k1.b0(l4, "Listener object cannot be null.", new Object[0]);
        this.f85977b.remove(l4);
    }

    public a(Class<L> cls, ClassLoader classLoader) {
        this();
        k1.b0(cls, "Listener interface cannot be null.", new Object[0]);
        k1.b0(classLoader, "ClassLoader cannot be null.", new Object[0]);
        k1.B(cls.isInterface(), "Class %s is not an interface", cls.getName());
        j(cls, classLoader);
    }

    private a() {
        this.f85977b = new CopyOnWriteArrayList();
    }
}

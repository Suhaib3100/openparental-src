package com.bumptech.glide.provider;

import androidx.annotation.o0;
import com.bumptech.glide.load.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: ResourceDecoderRegistry.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f11957a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, List<a<?, ?>>> f11958b = new HashMap();

    /* compiled from: ResourceDecoderRegistry.java */
    private static class a<T, R> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f11959a;

        /* renamed from: b, reason: collision with root package name */
        final Class<R> f11960b;

        /* renamed from: c, reason: collision with root package name */
        final k<T, R> f11961c;

        public a(@o0 Class<T> cls, @o0 Class<R> cls2, k<T, R> kVar) {
            this.f11959a = cls;
            this.f11960b = cls2;
            this.f11961c = kVar;
        }

        public boolean a(@o0 Class<?> cls, @o0 Class<?> cls2) {
            return this.f11959a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f11960b);
        }
    }

    @o0
    private synchronized List<a<?, ?>> c(@o0 String str) {
        List<a<?, ?>> list;
        if (!this.f11957a.contains(str)) {
            this.f11957a.add(str);
        }
        list = this.f11958b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f11958b.put(str, list);
        }
        return list;
    }

    public synchronized <T, R> void a(@o0 String str, @o0 k<T, R> kVar, @o0 Class<T> cls, @o0 Class<R> cls2) {
        c(str).add(new a<>(cls, cls2, kVar));
    }

    @o0
    public synchronized <T, R> List<k<T, R>> b(@o0 Class<T> cls, @o0 Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f11957a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f11958b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f11961c);
                    }
                }
            }
        }
        return arrayList;
    }

    @o0
    public synchronized <T, R> List<Class<R>> d(@o0 Class<T> cls, @o0 Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f11957a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f11958b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f11960b)) {
                        arrayList.add(aVar.f11960b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> void e(@o0 String str, @o0 k<T, R> kVar, @o0 Class<T> cls, @o0 Class<R> cls2) {
        c(str).add(0, new a<>(cls, cls2, kVar));
    }

    public synchronized void f(@o0 List<String> list) {
        ArrayList arrayList = new ArrayList(this.f11957a);
        this.f11957a.clear();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f11957a.add(it.next());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (!list.contains(str)) {
                this.f11957a.add(str);
            }
        }
    }
}

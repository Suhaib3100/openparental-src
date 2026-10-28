package com.google.firebase.platforminfo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: GlobalLibraryVersionRegistrar.java */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f60368b;

    /* renamed from: a, reason: collision with root package name */
    private final Set<f> f60369a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f60368b;
        if (dVar == null) {
            synchronized (d.class) {
                try {
                    dVar = f60368b;
                    if (dVar == null) {
                        dVar = new d();
                        f60368b = dVar;
                    }
                } finally {
                }
            }
        }
        return dVar;
    }

    Set<f> b() {
        Set<f> unmodifiableSet;
        synchronized (this.f60369a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f60369a);
        }
        return unmodifiableSet;
    }

    public void c(String str, String str2) {
        synchronized (this.f60369a) {
            this.f60369a.add(new a(str, str2));
        }
    }
}

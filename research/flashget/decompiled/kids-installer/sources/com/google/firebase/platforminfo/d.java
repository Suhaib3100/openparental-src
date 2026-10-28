package com.google.firebase.platforminfo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: GlobalLibraryVersionRegistrar.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f17698b;

    /* renamed from: a, reason: collision with root package name */
    private final Set<f> f17699a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f17698b;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = f17698b;
                if (dVar == null) {
                    dVar = new d();
                    f17698b = dVar;
                }
            }
        }
        return dVar;
    }

    Set<f> b() {
        Set<f> unmodifiableSet;
        synchronized (this.f17699a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f17699a);
        }
        return unmodifiableSet;
    }

    public void c(String str, String str2) {
        synchronized (this.f17699a) {
            this.f17699a.add(new a(str, str2));
        }
    }
}

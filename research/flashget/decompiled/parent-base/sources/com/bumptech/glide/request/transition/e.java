package com.bumptech.glide.request.transition;

import com.bumptech.glide.request.transition.f;

/* compiled from: NoTransition.java */
/* loaded from: classes3.dex */
public class e<R> implements f<R> {

    /* renamed from: a, reason: collision with root package name */
    static final e<?> f44923a = new e<>();

    /* renamed from: b, reason: collision with root package name */
    private static final g<?> f44924b = new a();

    /* compiled from: NoTransition.java */
    public static class a<R> implements g<R> {
        @Override // com.bumptech.glide.request.transition.g
        public f<R> a(com.bumptech.glide.load.a aVar, boolean z4) {
            return e.f44923a;
        }
    }

    public static <R> f<R> b() {
        return f44923a;
    }

    public static <R> g<R> c() {
        return (g<R>) f44924b;
    }

    @Override // com.bumptech.glide.request.transition.f
    public boolean a(Object obj, f.a aVar) {
        return false;
    }
}

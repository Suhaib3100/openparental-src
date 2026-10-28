package com.google.firebase.platforminfo;

import android.content.Context;
import com.google.firebase.components.r;

/* compiled from: LibraryVersionComponent.java */
/* loaded from: classes6.dex */
public class h {

    /* compiled from: LibraryVersionComponent.java */
    public interface a<T> {
        String a(T t4);
    }

    private h() {
    }

    public static com.google.firebase.components.c<?> b(String str, String str2) {
        return com.google.firebase.components.c.p(new com.google.firebase.platforminfo.a(str, str2), f.class);
    }

    public static com.google.firebase.components.c<?> c(final String str, final a<Context> aVar) {
        return com.google.firebase.components.c.r(f.class).b(r.m(Context.class)).f(new com.google.firebase.components.g() { // from class: com.google.firebase.platforminfo.g
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                f d5;
                d5 = h.d(str, aVar, dVar);
                return d5;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static f d(String str, a aVar, com.google.firebase.components.d dVar) {
        return new com.google.firebase.platforminfo.a(str, aVar.a((Context) dVar.a(Context.class)));
    }
}

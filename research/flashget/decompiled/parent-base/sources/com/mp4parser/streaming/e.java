package com.mp4parser.streaming;

/* compiled from: StreamingSampleHelper.java */
/* loaded from: classes6.dex */
public class e {
    static <B extends b> B a(d dVar, Class<B> cls) {
        for (b bVar : dVar.a()) {
            B b5 = (B) bVar;
            if (cls.isAssignableFrom(b5.getClass())) {
                return b5;
            }
        }
        return null;
    }

    static boolean b(d dVar, Class<? extends b> cls) {
        for (b bVar : dVar.a()) {
            if (cls.isAssignableFrom(bVar.getClass())) {
                return true;
            }
        }
        return false;
    }
}

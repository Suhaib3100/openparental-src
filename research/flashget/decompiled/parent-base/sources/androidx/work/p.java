package androidx.work;

import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: InputMergerFactory.java */
/* loaded from: classes3.dex */
public abstract class p {

    /* compiled from: InputMergerFactory.java */
    class a extends p {
        a() {
        }

        @Override // androidx.work.p
        @q0
        public o a(@o0 String className) {
            return null;
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public static p c() {
        return new a();
    }

    @q0
    public abstract o a(@o0 String className);

    @q0
    @c1({c1.a.LIBRARY_GROUP})
    public final o b(@o0 String className) {
        o a5 = a(className);
        return a5 == null ? o.a(className) : a5;
    }
}

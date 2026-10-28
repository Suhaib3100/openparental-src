package dagger.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: MembersInjectors.java */
/* loaded from: classes5.dex */
public final class r {

    /* compiled from: MembersInjectors.java */
    private enum a implements d3.g<Object> {
        INSTANCE;

        @Override // d3.g
        public void injectMembers(Object obj) {
            s.c(obj, ProtectedSandApp.s("㛊"));
        }
    }

    private r() {
    }

    public static <T> d3.g<T> a() {
        return a.INSTANCE;
    }
}

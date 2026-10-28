package dagger.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: MembersInjectors.java */
/* loaded from: classes7.dex */
public final class r {

    /* compiled from: MembersInjectors.java */
    private enum a implements vc.g<Object> {
        INSTANCE;

        @Override // vc.g
        public void injectMembers(Object obj) {
            s.c(obj, ProtectedSandApp.s("役\u0001"));
        }
    }

    private r() {
    }

    public static <T> vc.g<T> a() {
        return a.INSTANCE;
    }
}

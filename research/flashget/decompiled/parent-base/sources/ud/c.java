package ud;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.jvm.internal.l0;

/* compiled from: LookupTracker.kt */
/* loaded from: classes8.dex */
public interface c {

    /* compiled from: LookupTracker.kt */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public static final a f92759a = new a();

        private a() {
        }

        @Override // ud.c
        public boolean a() {
            return false;
        }

        @Override // ud.c
        public void b(@l String str, @l e eVar, @l String str2, @l f fVar, @l String str3) {
            l0.p(str, ProtectedSandApp.s("ꌢ\u0001"));
            l0.p(eVar, ProtectedSandApp.s("ꌣ\u0001"));
            l0.p(str2, ProtectedSandApp.s("ꌤ\u0001"));
            l0.p(fVar, ProtectedSandApp.s("ꌥ\u0001"));
            l0.p(str3, ProtectedSandApp.s("ꌦ\u0001"));
        }
    }

    boolean a();

    void b(@l String str, @l e eVar, @l String str2, @l f fVar, @l String str3);
}

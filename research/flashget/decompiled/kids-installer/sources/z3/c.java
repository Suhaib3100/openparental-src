package z3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: LookupTracker.kt */
/* loaded from: classes5.dex */
public interface c {

    /* compiled from: LookupTracker.kt */
    /* loaded from: classes6.dex */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        public static final a f34404a = new a();

        private a() {
        }

        @Override // z3.c
        public boolean a() {
            return false;
        }

        @Override // z3.c
        public void b(@d5.d String str, @d5.d e eVar, @d5.d String str2, @d5.d f fVar, @d5.d String str3) {
            l0.p(str, ProtectedSandApp.s("钅"));
            l0.p(eVar, ProtectedSandApp.s("钆"));
            l0.p(str2, ProtectedSandApp.s("钇"));
            l0.p(fVar, ProtectedSandApp.s("针"));
            l0.p(str3, ProtectedSandApp.s("钉"));
        }
    }

    boolean a();

    void b(@d5.d String str, @d5.d e eVar, @d5.d String str2, @d5.d f fVar, @d5.d String str3);
}

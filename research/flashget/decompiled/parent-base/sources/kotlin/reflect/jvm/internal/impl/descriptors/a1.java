package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: SourceElement.java */
/* loaded from: classes7.dex */
public interface a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a1 f75900a = new a();

    /* compiled from: SourceElement.java */
    static class a implements a1 {
        a() {
        }

        private static /* synthetic */ void d(int i4) {
            throw new IllegalStateException(String.format(ProtectedSandApp.s("櫘\u0001"), ProtectedSandApp.s("櫖\u0001"), ProtectedSandApp.s("櫗\u0001")));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.a1
        @fg.l
        public b1 b() {
            b1 b1Var = b1.f75928a;
            if (b1Var == null) {
                d(0);
            }
            return b1Var;
        }

        public String toString() {
            return ProtectedSandApp.s("櫙\u0001");
        }
    }

    @fg.l
    b1 b();
}

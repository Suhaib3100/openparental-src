package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: SourceElement.java */
/* loaded from: classes5.dex */
public interface a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a1 f24103a = new a();

    /* compiled from: SourceElement.java */
    static class a implements a1 {
        a() {
        }

        private static /* synthetic */ void d(int i5) {
            throw new IllegalStateException(String.format(ProtectedSandApp.s("䛗"), ProtectedSandApp.s("䛕"), ProtectedSandApp.s("䛖")));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.a1
        @d5.d
        public b1 a() {
            b1 b1Var = b1.f24130a;
            if (b1Var == null) {
                d(0);
            }
            return b1Var;
        }

        public String toString() {
            return ProtectedSandApp.s("䛘");
        }
    }

    @d5.d
    b1 a();
}

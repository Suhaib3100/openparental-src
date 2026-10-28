package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* compiled from: ErrorReporter.java */
/* loaded from: classes7.dex */
public interface r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f78264a = new a();

    /* compiled from: ErrorReporter.java */
    static class a implements r {
        a() {
        }

        private static /* synthetic */ void c(int i4) {
            Object[] objArr = new Object[3];
            if (i4 != 1) {
                objArr[0] = ProtectedSandApp.s("粈\u0001");
            } else {
                objArr[0] = ProtectedSandApp.s("粉\u0001");
            }
            objArr[1] = ProtectedSandApp.s("粊\u0001");
            if (i4 != 2) {
                objArr[2] = ProtectedSandApp.s("粋\u0001");
            } else {
                objArr[2] = ProtectedSandApp.s("粌\u0001");
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("粍\u0001"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.r
        public void a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            if (bVar == null) {
                c(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.r
        public void b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l List<String> list) {
            if (eVar == null) {
                c(0);
            }
            if (list == null) {
                c(1);
            }
        }
    }

    void a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar);

    void b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l List<String> list);
}

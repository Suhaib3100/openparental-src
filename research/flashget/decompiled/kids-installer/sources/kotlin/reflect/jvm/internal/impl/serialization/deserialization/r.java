package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;

/* compiled from: ErrorReporter.java */
/* loaded from: classes5.dex */
public interface r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f26255a = new a();

    /* compiled from: ErrorReporter.java */
    static class a implements r {
        a() {
        }

        private static /* synthetic */ void c(int i5) {
            Object[] objArr = new Object[3];
            if (i5 != 1) {
                objArr[0] = ProtectedSandApp.s("呃");
            } else {
                objArr[0] = ProtectedSandApp.s("呄");
            }
            objArr[1] = ProtectedSandApp.s("呅");
            if (i5 != 2) {
                objArr[2] = ProtectedSandApp.s("呆");
            } else {
                objArr[2] = ProtectedSandApp.s("呇");
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("呈"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.r
        public void a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            if (bVar == null) {
                c(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.r
        public void b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d List<String> list) {
            if (eVar == null) {
                c(0);
            }
            if (list == null) {
                c(1);
            }
        }
    }

    void a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar);

    void b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d List<String> list);
}

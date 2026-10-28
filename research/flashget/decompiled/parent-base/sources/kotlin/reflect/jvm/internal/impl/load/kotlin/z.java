package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;

/* compiled from: PackagePartProvider.kt */
/* loaded from: classes7.dex */
public interface z {

    /* compiled from: PackagePartProvider.kt */
    public static final class a implements z {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final a f76959a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z
        @fg.l
        public List<String> a(@fg.l String str) {
            l0.p(str, ProtectedSandApp.s("瓇\u0001"));
            return j0.f74919b;
        }
    }

    @fg.l
    List<String> a(@fg.l String str);
}

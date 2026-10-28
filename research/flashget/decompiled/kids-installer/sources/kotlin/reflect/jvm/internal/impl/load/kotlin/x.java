package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;

/* compiled from: PackagePartProvider.kt */
/* loaded from: classes5.dex */
public interface x {

    /* compiled from: PackagePartProvider.kt */
    public static final class a implements x {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        public static final a f25077a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x
        @d5.d
        public List<String> a(@d5.d String str) {
            l0.p(str, ProtectedSandApp.s("䳒"));
            return EmptyList.f23167o;
        }
    }

    @d5.d
    List<String> a(@d5.d String str);
}

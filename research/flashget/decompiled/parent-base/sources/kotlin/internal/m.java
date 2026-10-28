package kotlin.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.w0;
import kotlin.y;

/* compiled from: PlatformImplementations.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0003\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0083\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u000f"}, d2 = {"", "T", "instance", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "major", "minor", "patch", "", "a", "(III)Z", "Lkotlin/internal/l;", "Lkotlin/internal/l;", "IMPLEMENTATIONS", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final l f75110a = new kotlin.internal.jdk8.d();

    @c1(version = "1.2")
    @w0
    public static final boolean a(int i4, int i5, int i6) {
        return y.f79243h.f(i4, i5, i6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @f
    private static final <T> T b(Object obj) {
        try {
            l0.P();
            return obj;
        } catch (ClassCastException e4) {
            ClassLoader classLoader = obj.getClass().getClassLoader();
            l0.P();
            ClassLoader classLoader2 = Object.class.getClassLoader();
            if (l0.g(classLoader, classLoader2)) {
                throw e4;
            }
            throw new ClassNotFoundException(ProtectedSandApp.s("掗\u0001") + classLoader + ProtectedSandApp.s("掘\u0001") + classLoader2, e4);
        }
    }
}

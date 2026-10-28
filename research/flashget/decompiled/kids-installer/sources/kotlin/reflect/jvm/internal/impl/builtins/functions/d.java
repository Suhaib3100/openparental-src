package kotlin.reflect.jvm.internal.impl.builtins.functions;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.storage.n;

/* compiled from: FunctionClassScope.kt */
/* loaded from: classes6.dex */
public final class d extends kotlin.reflect.jvm.internal.impl.resolve.scopes.e {

    /* compiled from: FunctionClassScope.kt */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23905a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.Function.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.SuspendFunction.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f23905a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@d5.d n nVar, @d5.d b bVar) {
        super(nVar, bVar);
        l0.p(nVar, ProtectedSandApp.s("聯"));
        l0.p(bVar, ProtectedSandApp.s("聰"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.e
    @d5.d
    protected List<z> j() {
        List<z> k5;
        List<z> k6;
        kotlin.reflect.jvm.internal.impl.descriptors.e m5 = m();
        l0.n(m5, ProtectedSandApp.s("聱"));
        int i5 = a.f23905a[((b) m5).b1().ordinal()];
        if (i5 == 1) {
            k5 = kotlin.collections.z.k(e.S.a((b) m(), false));
            return k5;
        }
        if (i5 != 2) {
            return EmptyList.f23167o;
        }
        k6 = kotlin.collections.z.k(e.S.a((b) m(), true));
        return k6;
    }
}

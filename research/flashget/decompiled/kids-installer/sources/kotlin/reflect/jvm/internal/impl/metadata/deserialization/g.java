package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a0;
import kotlin.collections.b0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.metadata.a;

/* compiled from: TypeTable.kt */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final List<a.q> f25465a;

    public g(@d5.d a.t tVar) {
        int b02;
        l0.p(tVar, ProtectedSandApp.s("䵹"));
        List<a.q> B = tVar.B();
        if (tVar.C()) {
            int w5 = tVar.w();
            List<a.q> B2 = tVar.B();
            l0.o(B2, ProtectedSandApp.s("䵺"));
            b02 = b0.b0(B2, 10);
            ArrayList arrayList = new ArrayList(b02);
            int i5 = 0;
            for (Object obj : B2) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    a0.Z();
                }
                a.q qVar = (a.q) obj;
                if (i5 >= w5) {
                    qVar.getClass();
                    qVar = a.q.z0(qVar).h0(true).build();
                }
                arrayList.add(qVar);
                i5 = i6;
            }
            B = arrayList;
        }
        l0.o(B, ProtectedSandApp.s("䵻"));
        this.f25465a = B;
    }

    @d5.d
    public final a.q a(int i5) {
        return this.f25465a.get(i5);
    }
}

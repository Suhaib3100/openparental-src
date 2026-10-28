package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;
import h4.k;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: MultiFieldValueClassRepresentation.kt */
/* loaded from: classes5.dex */
public final class i0<Type extends h4.k> extends h1<Type> {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final List<Pair<kotlin.reflect.jvm.internal.impl.name.f, Type>> f24139a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final Map<kotlin.reflect.jvm.internal.impl.name.f, Type> f24140b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i0(@d5.d List<? extends Pair<kotlin.reflect.jvm.internal.impl.name.f, ? extends Type>> list) {
        super(null);
        Map<kotlin.reflect.jvm.internal.impl.name.f, Type> B0;
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("䞌"));
        this.f24139a = list;
        B0 = kotlin.collections.f1.B0(list);
        if (!(B0.size() == list.size())) {
            throw new IllegalArgumentException(ProtectedSandApp.s("䞍").toString());
        }
        this.f24140b = B0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h1
    @d5.d
    public List<Pair<kotlin.reflect.jvm.internal.impl.name.f, Type>> a() {
        return this.f24139a;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("䞎") + this.f24139a + ')';
    }
}

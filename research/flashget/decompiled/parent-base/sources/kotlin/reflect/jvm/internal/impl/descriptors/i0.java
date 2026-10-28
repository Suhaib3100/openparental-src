package kotlin.reflect.jvm.internal.impl.descriptors;

import androidx.compose.ui.graphics.l6;
import ce.j;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.r1;

/* compiled from: MultiFieldValueClassRepresentation.kt */
@r1({"SMAP\nMultiFieldValueClassRepresentation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiFieldValueClassRepresentation.kt\norg/jetbrains/kotlin/descriptors/MultiFieldValueClassRepresentation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
/* loaded from: classes7.dex */
public final class i0<Type extends ce.j> extends h1<Type> {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final List<kotlin.q0<kotlin.reflect.jvm.internal.impl.name.f, Type>> f75937a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final Map<kotlin.reflect.jvm.internal.impl.name.f, Type> f75938b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i0(@fg.l List<? extends kotlin.q0<kotlin.reflect.jvm.internal.impl.name.f, ? extends Type>> list) {
        super(null);
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("殏\u0001"));
        this.f75937a = list;
        Map<kotlin.reflect.jvm.internal.impl.name.f, Type> B0 = kotlin.collections.z0.B0(list);
        if (B0.size() != list.size()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("殐\u0001"));
        }
        this.f75938b = B0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h1
    public boolean a(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("殑\u0001"));
        return this.f75938b.containsKey(fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h1
    @fg.l
    public List<kotlin.q0<kotlin.reflect.jvm.internal.impl.name.f, Type>> b() {
        return this.f75937a;
    }

    @fg.l
    public String toString() {
        return l6.a(new StringBuilder(ProtectedSandApp.s("殒\u0001")), this.f75937a, ')');
    }
}

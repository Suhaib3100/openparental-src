package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;

/* compiled from: IntegerValueTypeConstructor.kt */
/* loaded from: classes6.dex */
public final class p implements h1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f25915a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final h0 f25916b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final ArrayList<kotlin.reflect.jvm.internal.impl.types.h0> f25917c;

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    public kotlin.reflect.jvm.internal.impl.builtins.h A() {
        return this.f25916b.A();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    public h1 a(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("虰"));
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    public kotlin.reflect.jvm.internal.impl.descriptors.h b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    public boolean d() {
        return false;
    }

    @d5.e
    public Void f() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.types.h0> m() {
        return this.f25917c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    public List<f1> r() {
        return EmptyList.f23167o;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("虱") + this.f25915a + ')';
    }
}

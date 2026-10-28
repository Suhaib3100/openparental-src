package kotlin.reflect.jvm.internal.impl.types.error;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;

/* compiled from: ErrorTypeConstructor.kt */
/* loaded from: classes6.dex */
public final class i implements h1 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final j f26401a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final String[] f26402b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final String f26403c;

    public i(@d5.d j jVar, @d5.d String... strArr) {
        l0.p(jVar, ProtectedSandApp.s("褤"));
        l0.p(strArr, ProtectedSandApp.s("褥"));
        this.f26401a = jVar;
        this.f26402b = strArr;
        String debugText = b.ERROR_TYPE.getDebugText();
        String debugMessage = jVar.getDebugMessage();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(debugMessage, Arrays.copyOf(copyOf, copyOf.length));
        String s5 = ProtectedSandApp.s("褦");
        l0.o(format, s5);
        String format2 = String.format(debugText, Arrays.copyOf(new Object[]{format}, 1));
        l0.o(format2, s5);
        this.f26403c = format2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    public kotlin.reflect.jvm.internal.impl.builtins.h A() {
        kotlin.reflect.jvm.internal.impl.builtins.e.f23891i.getClass();
        return kotlin.reflect.jvm.internal.impl.builtins.e.f23892j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    public h1 a(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("褧"));
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.h b() {
        return k.f26404a.h();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    public boolean d() {
        return false;
    }

    @d5.d
    public final j f() {
        return this.f26401a;
    }

    @d5.d
    public final String g(int i5) {
        return this.f26402b[i5];
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    public Collection<h0> m() {
        return EmptyList.f23167o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    public List<f1> r() {
        return EmptyList.f23167o;
    }

    @d5.d
    public String toString() {
        return this.f26403c;
    }
}

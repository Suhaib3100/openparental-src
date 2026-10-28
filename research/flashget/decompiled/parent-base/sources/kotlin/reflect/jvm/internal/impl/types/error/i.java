package kotlin.reflect.jvm.internal.impl.types.error;

import androidx.compose.material3.s3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;

/* compiled from: ErrorTypeConstructor.kt */
/* loaded from: classes7.dex */
public final class i implements h1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final j f78410a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final String[] f78411b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final String f78412c;

    public i(@fg.l j jVar, @fg.l String... strArr) {
        l0.p(jVar, ProtectedSandApp.s("繧\u0001"));
        l0.p(strArr, ProtectedSandApp.s("繨\u0001"));
        this.f78410a = jVar;
        this.f78411b = strArr;
        String debugText = b.ERROR_TYPE.getDebugText();
        String debugMessage = jVar.getDebugMessage();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        int length = copyOf.length;
        String s4 = ProtectedSandApp.s("繩\u0001");
        this.f78412c = s3.a(new Object[]{s3.a(copyOf, length, debugMessage, s4)}, 1, debugText, s4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    public h1 a(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("繪\u0001"));
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.h c() {
        return k.f78413a.h();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    public boolean d() {
        return false;
    }

    @fg.l
    public final j e() {
        return this.f78410a;
    }

    @fg.l
    public final String f(int i4) {
        return this.f78411b[i4];
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    public List<f1> getParameters() {
        return j0.f74919b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    public Collection<h0> j() {
        return j0.f74919b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    public kotlin.reflect.jvm.internal.impl.builtins.h p() {
        return kotlin.reflect.jvm.internal.impl.builtins.e.f75667i.a();
    }

    @fg.l
    public String toString() {
        return this.f78412c;
    }
}

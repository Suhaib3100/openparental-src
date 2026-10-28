package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes6.dex */
public final class s extends f implements b4.o {

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final Object f24425c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d Object obj) {
        super(fVar, null);
        l0.p(obj, ProtectedSandApp.s("莱"));
        this.f24425c = obj;
    }

    @Override // b4.o
    @d5.d
    public Object getValue() {
        return this.f24425c;
    }
}

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes7.dex */
public final class s extends f implements wd.o {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final Object f76275c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l Object obj) {
        super(fVar, null);
        l0.p(obj, ProtectedSandApp.s("漆\u0001"));
        this.f76275c = obj;
    }

    @Override // wd.o
    @fg.l
    public Object getValue() {
        return this.f76275c;
    }
}

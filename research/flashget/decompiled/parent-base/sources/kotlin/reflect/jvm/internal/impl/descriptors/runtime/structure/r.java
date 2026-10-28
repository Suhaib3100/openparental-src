package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z;

/* compiled from: ReflectJavaField.kt */
/* loaded from: classes7.dex */
public final class r extends t implements wd.n {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final Field f76274a;

    public r(@fg.l Field field) {
        l0.p(field, ProtectedSandApp.s("漄\u0001"));
        this.f76274a = field;
    }

    @Override // wd.n
    public boolean J() {
        return this.f76274a.isEnumConstant();
    }

    @Override // wd.n
    public boolean M() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t
    public Member P() {
        return this.f76274a;
    }

    @fg.l
    public Field R() {
        return this.f76274a;
    }

    @Override // wd.n
    @fg.l
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public z getType() {
        z.a aVar = z.f76282a;
        Type genericType = this.f76274a.getGenericType();
        l0.o(genericType, ProtectedSandApp.s("漅\u0001"));
        return aVar.a(genericType);
    }
}

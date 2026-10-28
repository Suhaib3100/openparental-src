package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z;

/* compiled from: ReflectJavaField.kt */
/* loaded from: classes6.dex */
public final class r extends t implements b4.n {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final Field f24424a;

    public r(@d5.d Field field) {
        l0.p(field, ProtectedSandApp.s("莯"));
        this.f24424a = field;
    }

    @Override // b4.n
    public boolean J() {
        return this.f24424a.isEnumConstant();
    }

    @Override // b4.n
    public boolean R() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t
    public Member V() {
        return this.f24424a;
    }

    @d5.d
    public Field X() {
        return this.f24424a;
    }

    @Override // b4.n
    @d5.d
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public z getType() {
        z.a aVar = z.f24432a;
        Type genericType = this.f24424a.getGenericType();
        l0.o(genericType, ProtectedSandApp.s("莰"));
        return aVar.a(genericType);
    }
}

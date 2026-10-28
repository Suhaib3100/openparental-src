package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectKotlinClass.kt */
/* loaded from: classes5.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final m f24372a = new m();

    private m() {
    }

    @d5.d
    public final String a(@d5.d Constructor<?> constructor) {
        l0.p(constructor, ProtectedSandApp.s("䡥"));
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䡦"));
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        l0.o(parameterTypes, ProtectedSandApp.s("䡧"));
        for (Class<?> cls : parameterTypes) {
            l0.o(cls, ProtectedSandApp.s("䡨"));
            sb.append(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.b(cls));
        }
        sb.append(ProtectedSandApp.s("䡩"));
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("䡪"));
        return sb2;
    }

    @d5.d
    public final String b(@d5.d Field field) {
        l0.p(field, ProtectedSandApp.s("䡫"));
        Class<?> type = field.getType();
        l0.o(type, ProtectedSandApp.s("䡬"));
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.b(type);
    }

    @d5.d
    public final String c(@d5.d Method method) {
        l0.p(method, ProtectedSandApp.s("䡭"));
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䡮"));
        Class<?>[] parameterTypes = method.getParameterTypes();
        l0.o(parameterTypes, ProtectedSandApp.s("䡯"));
        for (Class<?> cls : parameterTypes) {
            l0.o(cls, ProtectedSandApp.s("䡰"));
            sb.append(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.b(cls));
        }
        sb.append(ProtectedSandApp.s("䡱"));
        Class<?> returnType = method.getReturnType();
        l0.o(returnType, ProtectedSandApp.s("䡲"));
        sb.append(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.b(returnType));
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("䡳"));
        return sb2;
    }
}

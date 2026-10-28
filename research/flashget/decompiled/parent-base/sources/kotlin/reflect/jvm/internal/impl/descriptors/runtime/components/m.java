package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectKotlinClass.kt */
/* loaded from: classes7.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final m f76222a = new m();

    private m() {
    }

    @fg.l
    public final String a(@fg.l Constructor<?> constructor) {
        l0.p(constructor, ProtectedSandApp.s("湷\u0001"));
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("湸\u0001"));
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        l0.o(parameterTypes, ProtectedSandApp.s("湹\u0001"));
        for (Class<?> cls : parameterTypes) {
            l0.m(cls);
            sb.append(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.b(cls));
        }
        sb.append(ProtectedSandApp.s("湺\u0001"));
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("湻\u0001"));
        return sb2;
    }

    @fg.l
    public final String b(@fg.l Field field) {
        l0.p(field, ProtectedSandApp.s("湼\u0001"));
        Class<?> type = field.getType();
        l0.o(type, ProtectedSandApp.s("湽\u0001"));
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.b(type);
    }

    @fg.l
    public final String c(@fg.l Method method) {
        l0.p(method, ProtectedSandApp.s("湾\u0001"));
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("湸\u0001"));
        Class<?>[] parameterTypes = method.getParameterTypes();
        l0.o(parameterTypes, ProtectedSandApp.s("湹\u0001"));
        for (Class<?> cls : parameterTypes) {
            l0.m(cls);
            sb.append(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.b(cls));
        }
        sb.append(ProtectedSandApp.s("湿\u0001"));
        Class<?> returnType = method.getReturnType();
        l0.o(returnType, ProtectedSandApp.s("満\u0001"));
        sb.append(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.b(returnType));
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("湻\u0001"));
        return sb2;
    }
}

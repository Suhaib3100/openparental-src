package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljava/lang/reflect/Method;", "", "b", "(Ljava/lang/reflect/Method;)Ljava/lang/String;", "signature", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class m0 {

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Class;", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Class;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<Class<?>, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f78722b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Class<?> cls) {
            kotlin.jvm.internal.l0.m(cls);
            return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.b(cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        kotlin.jvm.internal.l0.o(parameterTypes, ProtectedSandApp.s("臖\u0001"));
        sb.append(kotlin.collections.l.lh(parameterTypes, "", ProtectedSandApp.s("臗\u0001"), ProtectedSandApp.s("臘\u0001"), 0, null, a.f78722b, 24, null));
        Class<?> returnType = method.getReturnType();
        kotlin.jvm.internal.l0.o(returnType, ProtectedSandApp.s("臙\u0001"));
        sb.append(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.b(returnType));
        return sb.toString();
    }
}

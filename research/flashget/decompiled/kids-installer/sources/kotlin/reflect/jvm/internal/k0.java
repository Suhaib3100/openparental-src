package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljava/lang/reflect/Method;", "", "b", "(Ljava/lang/reflect/Method;)Ljava/lang/String;", "signature", "kotlin-reflection"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class k0 {

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Class;", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Class;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.l<Class<?>, CharSequence> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f26708p = new a();

        a() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence N(Class<?> cls) {
            kotlin.jvm.internal.l0.o(cls, ProtectedSandApp.s("觪"));
            return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.b(cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(Method method) {
        String lh;
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        kotlin.jvm.internal.l0.o(parameterTypes, ProtectedSandApp.s("奤"));
        lh = kotlin.collections.t.lh(parameterTypes, "", ProtectedSandApp.s("奥"), ProtectedSandApp.s("奦"), 0, null, a.f26708p, 24, null);
        sb.append(lh);
        Class<?> returnType = method.getReturnType();
        kotlin.jvm.internal.l0.o(returnType, ProtectedSandApp.s("奧"));
        sb.append(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.b(returnType));
        return sb.toString();
    }
}

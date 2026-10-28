package kotlin.coroutines.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;

/* compiled from: DebugMetadata.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever;", "", "()V", "cache", "Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "notOnJava9", "buildCache", "continuation", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "getModuleName", "", "Cache", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/ModuleNameRetriever\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* renamed from: kotlin.coroutines.jvm.internal.i, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class ModuleNameRetriever {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final ModuleNameRetriever f23315a = new ModuleNameRetriever();

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final a f23316b = new a(null, null, null);

    /* renamed from: c, reason: collision with root package name */
    @d5.e
    private static a f23317c;

    /* compiled from: DebugMetadata.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "", "getModuleMethod", "Ljava/lang/reflect/Method;", "getDescriptorMethod", "nameMethod", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.coroutines.jvm.internal.i$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @d5.e
        @p3.f
        public final Method f23318a;

        /* renamed from: b, reason: collision with root package name */
        @d5.e
        @p3.f
        public final Method f23319b;

        /* renamed from: c, reason: collision with root package name */
        @d5.e
        @p3.f
        public final Method f23320c;

        public a(@d5.e Method method, @d5.e Method method2, @d5.e Method method3) {
            this.f23318a = method;
            this.f23319b = method2;
            this.f23320c = method3;
        }
    }

    private ModuleNameRetriever() {
    }

    private final a a(BaseContinuationImpl baseContinuationImpl) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod(ProtectedSandApp.s("㻨"), new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass(ProtectedSandApp.s("㻩")).getDeclaredMethod(ProtectedSandApp.s("㻪"), new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass(ProtectedSandApp.s("㻫")).getDeclaredMethod(ProtectedSandApp.s("㻬"), new Class[0]));
            f23317c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = f23316b;
            f23317c = aVar2;
            return aVar2;
        }
    }

    @d5.e
    public final String b(@d5.d BaseContinuationImpl baseContinuationImpl) {
        l0.p(baseContinuationImpl, ProtectedSandApp.s("㻭"));
        a aVar = f23317c;
        if (aVar == null) {
            aVar = a(baseContinuationImpl);
        }
        if (aVar == f23316b) {
            return null;
        }
        Method method = aVar.f23318a;
        Object invoke = method != null ? method.invoke(baseContinuationImpl.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar.f23319b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar.f23320c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}

package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.a1;

/* compiled from: CacheByClass.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\"\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"", "V", "Lkotlin/Function1;", "Ljava/lang/Class;", "compute", "Lkotlin/reflect/jvm/internal/a;", "a", "", "Z", "useClassValue", "kotlin-reflection"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f23794a;

    static {
        Object a6;
        try {
            Result.a aVar = Result.f27242p;
            a6 = Result.b(Class.forName(ProtectedSandApp.s("䍙")));
        } catch (Throwable th) {
            Result.a aVar2 = Result.f27242p;
            a6 = a1.a(th);
        }
        if (Result.j(a6)) {
            Result.a aVar3 = Result.f27242p;
            a6 = Boolean.TRUE;
        }
        Boolean bool = Boolean.FALSE;
        if (a6 instanceof Result.b) {
            a6 = bool;
        }
        f23794a = ((Boolean) a6).booleanValue();
    }

    @d5.d
    public static final <V> a<V> a(@d5.d q3.l<? super Class<?>, ? extends V> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("䍚"));
        return f23794a ? new d(lVar) : new f(lVar);
    }
}

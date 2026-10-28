package kotlin.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.MatchResult;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: PlatformImplementations.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lkotlin/internal/l;", "", "<init>", "()V", "", "cause", "exception", "Lkotlin/k2;", "a", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "", "d", "(Ljava/lang/Throwable;)Ljava/util/List;", "Ljava/util/regex/MatchResult;", "matchResult", "", "name", "Lkotlin/text/m;", "c", "(Ljava/util/regex/MatchResult;Ljava/lang/String;)Lkotlin/text/m;", "Lkotlin/random/f;", "b", "()Lkotlin/random/f;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
/* loaded from: classes7.dex */
public class l {

    /* compiled from: PlatformImplementations.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Lkotlin/internal/l$a;", "", "<init>", "()V", "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "addSuppressed", "c", "getSuppressed", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations$ReflectThrowable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final a f75107a = new a();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        @kd.f
        public static final Method addSuppressed;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.m
        @kd.f
        public static final Method getSuppressed;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            l0.m(methods);
            int length = methods.length;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                method = null;
                if (i5 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i5];
                if (l0.g(method2.getName(), ProtectedSandApp.s("掔\u0001"))) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    l0.o(parameterTypes, ProtectedSandApp.s("掕\u0001"));
                    if (l0.g(kotlin.collections.l.Bt(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i5++;
            }
            addSuppressed = method2;
            int length2 = methods.length;
            while (true) {
                if (i4 >= length2) {
                    break;
                }
                Method method3 = methods[i4];
                if (l0.g(method3.getName(), ProtectedSandApp.s("掖\u0001"))) {
                    method = method3;
                    break;
                }
                i4++;
            }
            getSuppressed = method;
        }

        private a() {
        }
    }

    public void a(@fg.l Throwable cause, @fg.l Throwable exception) {
        l0.p(cause, ProtectedSandApp.s("掆\u0001"));
        l0.p(exception, ProtectedSandApp.s("掇\u0001"));
        Method method = a.addSuppressed;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    @fg.l
    public kotlin.random.f b() {
        return new kotlin.random.b();
    }

    @fg.m
    public kotlin.text.m c(@fg.l MatchResult matchResult, @fg.l String name) {
        l0.p(matchResult, ProtectedSandApp.s("授\u0001"));
        l0.p(name, ProtectedSandApp.s("掉\u0001"));
        throw new UnsupportedOperationException(ProtectedSandApp.s("掊\u0001"));
    }

    @fg.l
    public List<Throwable> d(@fg.l Throwable exception) {
        Object invoke;
        List<Throwable> t4;
        l0.p(exception, ProtectedSandApp.s("掇\u0001"));
        Method method = a.getSuppressed;
        return (method == null || (invoke = method.invoke(exception, null)) == null || (t4 = kotlin.collections.l.t((Throwable[]) invoke)) == null) ? j0.f74919b : t4;
    }
}

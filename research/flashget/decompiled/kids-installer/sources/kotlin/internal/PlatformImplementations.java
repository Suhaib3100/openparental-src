package kotlin.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Method;
import java.util.regex.MatchResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.random.FallbackThreadLocalRandom;
import kotlin.random.Random;
import kotlin.text.MatchGroup;

/* compiled from: PlatformImplementations.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0013"}, d2 = {"Lkotlin/internal/PlatformImplementations;", "", "()V", "addSuppressed", "", "cause", "", "exception", "defaultPlatformRandom", "Lkotlin/random/Random;", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", "name", "", "getSuppressed", "", "ReflectThrowable", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
/* renamed from: kotlin.internal.l, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public class PlatformImplementations {

    /* compiled from: PlatformImplementations.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlin/internal/PlatformImplementations$ReflectThrowable;", "", "()V", "addSuppressed", "Ljava/lang/reflect/Method;", "getSuppressed", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations$ReflectThrowable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
    /* renamed from: kotlin.internal.l$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        public static final a f23348a = new a();

        /* renamed from: b, reason: collision with root package name */
        @d5.e
        @p3.f
        public static final Method f23349b;

        /* renamed from: c, reason: collision with root package name */
        @d5.e
        @p3.f
        public static final Method f23350c;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0045 A[LOOP:0: B:2:0x0013->B:10:0x0045, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0049 A[EDGE_INSN: B:11:0x0049->B:12:0x0049 BREAK  A[LOOP:0: B:2:0x0013->B:10:0x0045], SYNTHETIC] */
        static {
            /*
                kotlin.internal.l$a r0 = new kotlin.internal.l$a
                r0.<init>()
                kotlin.internal.PlatformImplementations.a.f23348a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                kotlin.jvm.internal.l0.m(r1)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L13:
                r5 = 0
                if (r4 >= r2) goto L48
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "㽔"
                java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
                boolean r7 = kotlin.jvm.internal.l0.g(r7, r8)
                if (r7 == 0) goto L41
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "㽕"
                java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
                kotlin.jvm.internal.l0.o(r7, r8)
                java.lang.Object r7 = kotlin.collections.l.At(r7)
                boolean r7 = kotlin.jvm.internal.l0.g(r7, r0)
                if (r7 == 0) goto L41
                r7 = 1
                goto L42
            L41:
                r7 = r3
            L42:
                if (r7 == 0) goto L45
                goto L49
            L45:
                int r4 = r4 + 1
                goto L13
            L48:
                r6 = r5
            L49:
                kotlin.internal.PlatformImplementations.a.f23349b = r6
                int r0 = r1.length
            L4c:
                if (r3 >= r0) goto L65
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "㽖"
                java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                boolean r4 = kotlin.jvm.internal.l0.g(r4, r6)
                if (r4 == 0) goto L62
                r5 = r2
                goto L65
            L62:
                int r3 = r3 + 1
                goto L4c
            L65:
                kotlin.internal.PlatformImplementations.a.f23350c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.PlatformImplementations.a.<clinit>():void");
        }

        private a() {
        }
    }

    public void a(@d5.d Throwable th, @d5.d Throwable th2) {
        l0.p(th, ProtectedSandApp.s("㽈"));
        l0.p(th2, ProtectedSandApp.s("㽉"));
        Method method = a.f23349b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    @d5.d
    public Random b() {
        return new FallbackThreadLocalRandom();
    }

    @d5.e
    public MatchGroup c(@d5.d MatchResult matchResult, @d5.d String str) {
        l0.p(matchResult, ProtectedSandApp.s("㽊"));
        l0.p(str, ProtectedSandApp.s("㽋"));
        throw new UnsupportedOperationException(ProtectedSandApp.s("㽌"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        r3 = kotlin.collections.p.t((java.lang.Throwable[]) r3);
     */
    @d5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<java.lang.Throwable> d(@d5.d java.lang.Throwable r3) {
        /*
            r2 = this;
            java.lang.String r0 = "㽍"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r3, r0)
            java.lang.reflect.Method r0 = kotlin.internal.PlatformImplementations.a.f23350c
            if (r0 == 0) goto L1e
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r3 = r0.invoke(r3, r1)
            if (r3 == 0) goto L1e
            java.lang.Throwable[] r3 = (java.lang.Throwable[]) r3
            java.util.List r3 = kotlin.collections.l.t(r3)
            if (r3 != 0) goto L20
        L1e:
            kotlin.collections.m0 r3 = kotlin.collections.EmptyList.f23167o
        L20:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.PlatformImplementations.d(java.lang.Throwable):java.util.List");
    }
}

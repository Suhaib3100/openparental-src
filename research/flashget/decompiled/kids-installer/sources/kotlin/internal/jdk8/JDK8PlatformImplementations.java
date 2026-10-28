package kotlin.internal.jdk8;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.e;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.internal.jdk7.JDK7PlatformImplementations;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.random.FallbackThreadLocalRandom;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.text.MatchGroup;
import p3.f;

/* compiled from: JDK8PlatformImplementations.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u0010"}, d2 = {"Lkotlin/internal/jdk8/JDK8PlatformImplementations;", "Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "()V", "defaultPlatformRandom", "Lkotlin/random/Random;", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", "name", "", "sdkIsNullOrAtLeast", "", "version", "", "ReflectSdkVersion", "kotlin-stdlib-jdk8"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.internal.jdk8.d, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
public class JDK8PlatformImplementations extends JDK7PlatformImplementations {

    /* compiled from: JDK8PlatformImplementations.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion;", "", "()V", "sdkVersion", "", "Ljava/lang/Integer;", "kotlin-stdlib-jdk8"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nJDK8PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK8PlatformImplementations.kt\nkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    /* renamed from: kotlin.internal.jdk8.d$a */
    /* loaded from: classes5.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        public static final a f23346a = new a();

        /* renamed from: b, reason: collision with root package name */
        @e
        @f
        public static final Integer f23347b;

        /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
        static {
            /*
                kotlin.internal.jdk8.d$a r0 = new kotlin.internal.jdk8.d$a
                r0.<init>()
                kotlin.internal.jdk8.JDK8PlatformImplementations.a.f23346a = r0
                r0 = 0
                java.lang.String r1 = "㽒"
                java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)     // Catch: java.lang.Throwable -> L27
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L27
                java.lang.String r2 = "㽓"
                java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L27
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L27
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L27
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L27
                if (r2 == 0) goto L27
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L27
                goto L28
            L27:
                r1 = r0
            L28:
                if (r1 == 0) goto L36
                int r2 = r1.intValue()
                if (r2 <= 0) goto L32
                r2 = 1
                goto L33
            L32:
                r2 = 0
            L33:
                if (r2 == 0) goto L36
                r0 = r1
            L36:
                kotlin.internal.jdk8.JDK8PlatformImplementations.a.f23347b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.jdk8.JDK8PlatformImplementations.a.<clinit>():void");
        }

        private a() {
        }
    }

    private final boolean e(int i5) {
        Integer num = a.f23347b;
        return num == null || num.intValue() >= i5;
    }

    @Override // kotlin.internal.PlatformImplementations
    @d5.d
    public Random b() {
        return e(34) ? new v3.a() : new FallbackThreadLocalRandom();
    }

    @Override // kotlin.internal.PlatformImplementations
    @e
    public MatchGroup c(@d5.d MatchResult matchResult, @d5.d String str) {
        int start;
        int end;
        String group;
        l0.p(matchResult, ProtectedSandApp.s("緉"));
        l0.p(str, ProtectedSandApp.s("緊"));
        Matcher matcher = matchResult instanceof Matcher ? (Matcher) matchResult : null;
        if (matcher == null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("緌"));
        }
        start = matcher.start(str);
        end = matcher.end(str);
        IntRange intRange = new IntRange(start, end - 1);
        if (intRange.f().intValue() < 0) {
            return null;
        }
        group = matcher.group(str);
        l0.o(group, ProtectedSandApp.s("緋"));
        return new MatchGroup(group, intRange);
    }
}

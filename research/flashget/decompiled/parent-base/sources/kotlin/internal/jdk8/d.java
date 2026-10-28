package kotlin.internal.jdk8;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kd.f;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: JDK8PlatformImplementations.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkotlin/internal/jdk8/d;", "Lkotlin/internal/jdk7/a;", "<init>", "()V", "", "version", "", "e", "(I)Z", "Ljava/util/regex/MatchResult;", "matchResult", "", "name", "Lkotlin/text/m;", "c", "(Ljava/util/regex/MatchResult;Ljava/lang/String;)Lkotlin/text/m;", "Lkotlin/random/f;", "b", "()Lkotlin/random/f;", "a", "kotlin-stdlib-jdk8"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public class d extends kotlin.internal.jdk7.a {

    /* compiled from: JDK8PlatformImplementations.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/internal/jdk8/d$a;", "", "<init>", "()V", "", "b", "Ljava/lang/Integer;", "sdkVersion", "kotlin-stdlib-jdk8"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nJDK8PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK8PlatformImplementations.kt\nkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public static final a f75105a = new a();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @m
        @f
        public static final Integer sdkVersion;

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName(ProtectedSandApp.s("掎\u0001")).getField(ProtectedSandApp.s("掏\u0001")).get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                sdkVersion = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            sdkVersion = num2;
        }

        private a() {
        }
    }

    private final boolean e(int version) {
        Integer num = a.sdkVersion;
        return num == null || num.intValue() >= version;
    }

    @Override // kotlin.internal.l
    @l
    public kotlin.random.f b() {
        return e(34) ? new qd.a() : new kotlin.random.b();
    }

    @Override // kotlin.internal.l
    @m
    public kotlin.text.m c(@l MatchResult matchResult, @l String name) {
        int start;
        int end;
        String group;
        l0.p(matchResult, ProtectedSandApp.s("掐\u0001"));
        l0.p(name, ProtectedSandApp.s("掑\u0001"));
        Matcher matcher = matchResult instanceof Matcher ? (Matcher) matchResult : null;
        if (matcher == null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("掓\u0001"));
        }
        start = matcher.start(name);
        end = matcher.end(name);
        kotlin.ranges.l lVar = new kotlin.ranges.l(start, end - 1, 1);
        if (lVar.c().intValue() < 0) {
            return null;
        }
        group = matcher.group(name);
        l0.o(group, ProtectedSandApp.s("排\u0001"));
        return new kotlin.text.m(group, lVar);
    }
}

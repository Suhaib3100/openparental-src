package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import kotlin.ranges.IntRange;

/* compiled from: MatchResult.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0001\u0017J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0000H&R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lkotlin/text/MatchResult;", "", "destructured", "Lkotlin/text/MatchResult$Destructured;", "getDestructured", "()Lkotlin/text/MatchResult$Destructured;", "groupValues", "", "", "getGroupValues", "()Ljava/util/List;", "groups", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "range", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "value", "getValue", "()Ljava/lang/String;", "next", "Destructured", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.text.p, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public interface MatchResult {

    /* compiled from: MatchResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.p$a */
    public static final class a {
        @d5.d
        public static b a(@d5.d MatchResult matchResult) {
            return new b(matchResult);
        }
    }

    /* compiled from: MatchResult.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\bH\u0087\nJ\t\u0010\t\u001a\u00020\bH\u0087\nJ\t\u0010\n\u001a\u00020\bH\u0087\nJ\t\u0010\u000b\u001a\u00020\bH\u0087\nJ\t\u0010\f\u001a\u00020\bH\u0087\nJ\t\u0010\r\u001a\u00020\bH\u0087\nJ\t\u0010\u000e\u001a\u00020\bH\u0087\nJ\t\u0010\u000f\u001a\u00020\bH\u0087\nJ\t\u0010\u0010\u001a\u00020\bH\u0087\nJ\t\u0010\u0011\u001a\u00020\bH\u0087\nJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Lkotlin/text/MatchResult$Destructured;", "", "match", "Lkotlin/text/MatchResult;", "(Lkotlin/text/MatchResult;)V", "getMatch", "()Lkotlin/text/MatchResult;", "component1", "", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "toList", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.p$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        private final MatchResult f27151a;

        public b(@d5.d MatchResult matchResult) {
            kotlin.jvm.internal.l0.p(matchResult, ProtectedSandApp.s("宓"));
            this.f27151a = matchResult;
        }

        @InlineOnly
        private final String a() {
            return this.f27151a.b().get(1);
        }

        @InlineOnly
        private final String b() {
            return this.f27151a.b().get(10);
        }

        @InlineOnly
        private final String c() {
            return this.f27151a.b().get(2);
        }

        @InlineOnly
        private final String d() {
            return this.f27151a.b().get(3);
        }

        @InlineOnly
        private final String e() {
            return this.f27151a.b().get(4);
        }

        @InlineOnly
        private final String f() {
            return this.f27151a.b().get(5);
        }

        @InlineOnly
        private final String g() {
            return this.f27151a.b().get(6);
        }

        @InlineOnly
        private final String h() {
            return this.f27151a.b().get(7);
        }

        @InlineOnly
        private final String i() {
            return this.f27151a.b().get(8);
        }

        @InlineOnly
        private final String j() {
            return this.f27151a.b().get(9);
        }

        @d5.d
        /* renamed from: k, reason: from getter */
        public final MatchResult getF27151a() {
            return this.f27151a;
        }

        @d5.d
        public final List<String> l() {
            return this.f27151a.b().subList(1, this.f27151a.b().size());
        }
    }

    @d5.d
    b a();

    @d5.d
    List<String> b();

    @d5.d
    MatchGroupCollection c();

    @d5.d
    IntRange d();

    @d5.d
    String getValue();

    @d5.e
    MatchResult next();
}

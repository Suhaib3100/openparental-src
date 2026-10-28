package kotlin.text;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MatchResult.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0011J\u0011\u0010\u0002\u001a\u0004\u0018\u00010\u0000H&¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lkotlin/text/p;", "", "next", "()Lkotlin/text/p;", "Lkotlin/ranges/l;", "c", "()Lkotlin/ranges/l;", "range", "", "getValue", "()Ljava/lang/String;", "value", "Lkotlin/text/n;", "d", "()Lkotlin/text/n;", "groups", "", "b", "()Ljava/util/List;", "groupValues", "Lkotlin/text/p$b;", "a", "()Lkotlin/text/p$b;", "destructured", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface p {

    /* compiled from: MatchResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        @fg.l
        public static b a(@fg.l p pVar) {
            return new b(pVar);
        }
    }

    /* compiled from: MatchResult.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\n\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u000b\u0010\bJ\u0010\u0010\f\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\r\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\r\u0010\bJ\u0010\u0010\u000e\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u000e\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u000f\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0010\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0011\u0010\bJ\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkotlin/text/p$b;", "", "Lkotlin/text/p;", "match", "<init>", "(Lkotlin/text/p;)V", "", "a", "()Ljava/lang/String;", "c", "d", "e", "f", "g", "h", "i", "j", "b", "", "l", "()Ljava/util/List;", "Lkotlin/text/p;", "k", "()Lkotlin/text/p;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final p match;

        public b(@fg.l p pVar) {
            kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("蓒\u0001"));
            this.match = pVar;
        }

        @kotlin.internal.f
        private final String a() {
            return this.match.b().get(1);
        }

        @kotlin.internal.f
        private final String b() {
            return this.match.b().get(10);
        }

        @kotlin.internal.f
        private final String c() {
            return this.match.b().get(2);
        }

        @kotlin.internal.f
        private final String d() {
            return this.match.b().get(3);
        }

        @kotlin.internal.f
        private final String e() {
            return this.match.b().get(4);
        }

        @kotlin.internal.f
        private final String f() {
            return this.match.b().get(5);
        }

        @kotlin.internal.f
        private final String g() {
            return this.match.b().get(6);
        }

        @kotlin.internal.f
        private final String h() {
            return this.match.b().get(7);
        }

        @kotlin.internal.f
        private final String i() {
            return this.match.b().get(8);
        }

        @kotlin.internal.f
        private final String j() {
            return this.match.b().get(9);
        }

        @fg.l
        /* renamed from: k, reason: from getter */
        public final p getMatch() {
            return this.match;
        }

        @fg.l
        public final List<String> l() {
            return this.match.b().subList(1, this.match.b().size());
        }
    }

    @fg.l
    b a();

    @fg.l
    List<String> b();

    @fg.l
    kotlin.ranges.l c();

    @fg.l
    n d();

    @fg.l
    String getValue();

    @fg.m
    p next();
}

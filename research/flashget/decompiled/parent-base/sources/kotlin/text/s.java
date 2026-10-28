package kotlin.text;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: Regex.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a4\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0014\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0082\b¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0019\u001a\u00020\u0015*\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"", "Lkotlin/text/i;", "", "k", "(Ljava/lang/Iterable;)I", "", "T", "value", "", "g", "(I)Ljava/util/Set;", "Ljava/util/regex/Matcher;", "from", "", "input", "Lkotlin/text/p;", "f", "(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lkotlin/text/p;", "h", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)Lkotlin/text/p;", "Ljava/util/regex/MatchResult;", "Lkotlin/ranges/l;", "i", "(Ljava/util/regex/MatchResult;)Lkotlin/ranges/l;", "groupIndex", "j", "(Ljava/util/regex/MatchResult;I)Lkotlin/ranges/l;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,397:1\n1789#2,3:398\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n*L\n19#1:398,3\n*E\n"})
/* loaded from: classes7.dex */
public final class s {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/text/i;", "", "T", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Enum;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt$fromInt$1$1\n*L\n1#1,397:1\n*E\n"})
    static final class a<T> extends kotlin.jvm.internal.n0 implements ld.l<T, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f79191b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i4) {
            super(1);
            this.f79191b = i4;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Enum r32) {
            i iVar = (i) r32;
            return Boolean.valueOf((this.f79191b & iVar.getMask()) == iVar.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p f(Matcher matcher, int i4, CharSequence charSequence) {
        if (matcher.find(i4)) {
            return new q(matcher, charSequence);
        }
        return null;
    }

    private static final <T extends Enum<T> & i> Set<T> g(int i4) {
        kotlin.jvm.internal.l0.P();
        EnumSet allOf = EnumSet.allOf(Enum.class);
        kotlin.jvm.internal.l0.m(allOf);
        kotlin.jvm.internal.l0.P();
        kotlin.collections.w.Q0(allOf, new a(i4));
        Set<T> unmodifiableSet = Collections.unmodifiableSet(allOf);
        kotlin.jvm.internal.l0.o(unmodifiableSet, ProtectedSandApp.s("蓶\u0001"));
        return unmodifiableSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p h(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new q(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.ranges.l i(MatchResult matchResult) {
        return kotlin.ranges.s.W1(matchResult.start(), matchResult.end());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.ranges.l j(MatchResult matchResult, int i4) {
        return kotlin.ranges.s.W1(matchResult.start(i4), matchResult.end(i4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(Iterable<? extends i> iterable) {
        Iterator<? extends i> it = iterable.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 |= it.next().getValue();
        }
        return i4;
    }
}

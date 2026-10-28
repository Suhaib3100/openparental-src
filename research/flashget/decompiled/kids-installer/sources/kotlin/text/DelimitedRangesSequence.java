package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;

/* compiled from: Strings.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012:\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000e¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0096\u0002RB\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "input", "", "startIndex", "", "limit", "getNextMatch", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "currentIndex", "Lkotlin/Pair;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.text.h, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class DelimitedRangesSequence implements Sequence<IntRange> {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final CharSequence f27058a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27059b;

    /* renamed from: c, reason: collision with root package name */
    private final int f27060c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final q3.p<CharSequence, Integer, Pair<Integer, Integer>> f27061d;

    /* compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\t\u0010\u0019\u001a\u00020\u001aH\u0096\u0002J\t\u0010\u001b\u001a\u00020\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\b¨\u0006\u001c"}, d2 = {"kotlin/text/DelimitedRangesSequence$iterator$1", "", "Lkotlin/ranges/IntRange;", "counter", "", "getCounter", "()I", "setCounter", "(I)V", "currentStartIndex", "getCurrentStartIndex", "setCurrentStartIndex", "nextItem", "getNextItem", "()Lkotlin/ranges/IntRange;", "setNextItem", "(Lkotlin/ranges/IntRange;)V", "nextSearchIndex", "getNextSearchIndex", "setNextSearchIndex", "nextState", "getNextState", "setNextState", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.h$a */
    public static final class a implements Iterator<IntRange>, r3.a {

        /* renamed from: o, reason: collision with root package name */
        private int f27062o = -1;

        /* renamed from: p, reason: collision with root package name */
        private int f27063p;

        /* renamed from: q, reason: collision with root package name */
        private int f27064q;

        /* renamed from: r, reason: collision with root package name */
        @d5.e
        private IntRange f27065r;

        /* renamed from: s, reason: collision with root package name */
        private int f27066s;

        a() {
            int I;
            I = kotlin.ranges.u.I(DelimitedRangesSequence.this.f27059b, 0, DelimitedRangesSequence.this.f27058a.length());
            this.f27063p = I;
            this.f27064q = I;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r0 < r6.f27067t.f27060c) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.f27064q
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f27062o = r1
                r0 = 0
                r6.f27065r = r0
                goto L9e
            Lc:
                kotlin.text.h r0 = kotlin.text.DelimitedRangesSequence.this
                int r0 = kotlin.text.DelimitedRangesSequence.e(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f27066s
                int r0 = r0 + r3
                r6.f27066s = r0
                kotlin.text.h r4 = kotlin.text.DelimitedRangesSequence.this
                int r4 = kotlin.text.DelimitedRangesSequence.e(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f27064q
                kotlin.text.h r4 = kotlin.text.DelimitedRangesSequence.this
                java.lang.CharSequence r4 = kotlin.text.DelimitedRangesSequence.d(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                kotlin.ranges.l r0 = new kotlin.ranges.l
                int r1 = r6.f27063p
                kotlin.text.h r4 = kotlin.text.DelimitedRangesSequence.this
                java.lang.CharSequence r4 = kotlin.text.DelimitedRangesSequence.d(r4)
                int r4 = kotlin.text.h0.g3(r4)
                r0.<init>(r1, r4)
                r6.f27065r = r0
                r6.f27064q = r2
                goto L9c
            L47:
                kotlin.text.h r0 = kotlin.text.DelimitedRangesSequence.this
                q3.p r0 = kotlin.text.DelimitedRangesSequence.c(r0)
                kotlin.text.h r4 = kotlin.text.DelimitedRangesSequence.this
                java.lang.CharSequence r4 = kotlin.text.DelimitedRangesSequence.d(r4)
                int r5 = r6.f27064q
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.g0(r4, r5)
                kotlin.q0 r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L77
                kotlin.ranges.l r0 = new kotlin.ranges.l
                int r1 = r6.f27063p
                kotlin.text.h r4 = kotlin.text.DelimitedRangesSequence.this
                java.lang.CharSequence r4 = kotlin.text.DelimitedRangesSequence.d(r4)
                int r4 = kotlin.text.h0.g3(r4)
                r0.<init>(r1, r4)
                r6.f27065r = r0
                r6.f27064q = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f27063p
                kotlin.ranges.l r4 = kotlin.ranges.s.W1(r4, r2)
                r6.f27065r = r4
                int r2 = r2 + r0
                r6.f27063p = r2
                if (r0 != 0) goto L99
                r1 = r3
            L99:
                int r2 = r2 + r1
                r6.f27064q = r2
            L9c:
                r6.f27062o = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.DelimitedRangesSequence.a.a():void");
        }

        /* renamed from: d, reason: from getter */
        public final int getF27066s() {
            return this.f27066s;
        }

        /* renamed from: f, reason: from getter */
        public final int getF27063p() {
            return this.f27063p;
        }

        @d5.e
        /* renamed from: g, reason: from getter */
        public final IntRange getF27065r() {
            return this.f27065r;
        }

        /* renamed from: h, reason: from getter */
        public final int getF27064q() {
            return this.f27064q;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f27062o == -1) {
                a();
            }
            return this.f27062o == 1;
        }

        /* renamed from: j, reason: from getter */
        public final int getF27062o() {
            return this.f27062o;
        }

        @Override // java.util.Iterator
        @d5.d
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public IntRange next() {
            if (this.f27062o == -1) {
                a();
            }
            if (this.f27062o == 0) {
                throw new NoSuchElementException();
            }
            IntRange intRange = this.f27065r;
            kotlin.jvm.internal.l0.n(intRange, ProtectedSandApp.s("嫎"));
            this.f27065r = null;
            this.f27062o = -1;
            return intRange;
        }

        public final void l(int i5) {
            this.f27066s = i5;
        }

        public final void m(int i5) {
            this.f27063p = i5;
        }

        public final void n(@d5.e IntRange intRange) {
            this.f27065r = intRange;
        }

        public final void p(int i5) {
            this.f27064q = i5;
        }

        public final void q(int i5) {
            this.f27062o = i5;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("嫏"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DelimitedRangesSequence(@d5.d CharSequence charSequence, int i5, int i6, @d5.d q3.p<? super CharSequence, ? super Integer, Pair<Integer, Integer>> pVar) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("嫐"));
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("嫑"));
        this.f27058a = charSequence;
        this.f27059b = i5;
        this.f27060c = i6;
        this.f27061d = pVar;
    }

    @Override // kotlin.sequences.Sequence
    @d5.d
    public Iterator<IntRange> iterator() {
        return new a();
    }
}

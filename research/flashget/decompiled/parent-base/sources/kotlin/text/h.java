package kotlin.text;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.q0;

/* compiled from: Strings.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B[\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012:\u0010\u000e\u001a6\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f0\b¢\u0006\u0002\b\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017RH\u0010\u000e\u001a6\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f0\b¢\u0006\u0002\b\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lkotlin/text/h;", "Lkotlin/sequences/m;", "Lkotlin/ranges/l;", "", "input", "", "startIndex", "limit", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "currentIndex", "Lkotlin/q0;", "Lkotlin/u;", "getNextMatch", "<init>", "(Ljava/lang/CharSequence;IILld/p;)V", "", "iterator", "()Ljava/util/Iterator;", "a", "Ljava/lang/CharSequence;", "b", "I", "c", "d", "Lld/p;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class h implements kotlin.sequences.m<kotlin.ranges.l> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final CharSequence input;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int startIndex;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int limit;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.p<CharSequence, Integer, q0<Integer, Integer>> getNextMatch;

    /* compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u001e\u0010\u0010¨\u0006 "}, d2 = {"kotlin/text/h$a", "", "Lkotlin/ranges/l;", "Lkotlin/k2;", "b", "()V", "i", "()Lkotlin/ranges/l;", "", "hasNext", "()Z", "", "I", "h", "()I", "p", "(I)V", "nextState", "c", "d", "l", "currentStartIndex", "f", "o", "nextSearchIndex", "e", "Lkotlin/ranges/l;", "m", "(Lkotlin/ranges/l;)V", "nextItem", "j", "counter", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<kotlin.ranges.l>, md.a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int nextState = -1;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int currentStartIndex;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int nextSearchIndex;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private kotlin.ranges.l nextItem;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private int counter;

        a() {
            int I = kotlin.ranges.s.I(h.this.startIndex, 0, h.this.input.length());
            this.currentStartIndex = I;
            this.nextSearchIndex = I;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r0 < r6.f79080g.limit) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void b() {
            /*
                r6 = this;
                int r0 = r6.nextSearchIndex
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.nextState = r1
                r0 = 0
                r6.nextItem = r0
                goto L9e
            Lc:
                kotlin.text.h r0 = kotlin.text.h.this
                int r0 = kotlin.text.h.e(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.counter
                int r0 = r0 + r3
                r6.counter = r0
                kotlin.text.h r4 = kotlin.text.h.this
                int r4 = kotlin.text.h.e(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.nextSearchIndex
                kotlin.text.h r4 = kotlin.text.h.this
                java.lang.CharSequence r4 = kotlin.text.h.d(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                kotlin.ranges.l r0 = new kotlin.ranges.l
                int r1 = r6.currentStartIndex
                kotlin.text.h r4 = kotlin.text.h.this
                java.lang.CharSequence r4 = kotlin.text.h.d(r4)
                int r4 = kotlin.text.h0.g3(r4)
                r0.<init>(r1, r4, r3)
                r6.nextItem = r0
                r6.nextSearchIndex = r2
                goto L9c
            L47:
                kotlin.text.h r0 = kotlin.text.h.this
                ld.p r0 = kotlin.text.h.c(r0)
                kotlin.text.h r4 = kotlin.text.h.this
                java.lang.CharSequence r4 = kotlin.text.h.d(r4)
                int r5 = r6.nextSearchIndex
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.q0 r0 = (kotlin.q0) r0
                if (r0 != 0) goto L77
                kotlin.ranges.l r0 = new kotlin.ranges.l
                int r1 = r6.currentStartIndex
                kotlin.text.h r4 = kotlin.text.h.this
                java.lang.CharSequence r4 = kotlin.text.h.d(r4)
                int r4 = kotlin.text.h0.g3(r4)
                r0.<init>(r1, r4, r3)
                r6.nextItem = r0
                r6.nextSearchIndex = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.currentStartIndex
                kotlin.ranges.l r4 = kotlin.ranges.s.W1(r4, r2)
                r6.nextItem = r4
                int r2 = r2 + r0
                r6.currentStartIndex = r2
                if (r0 != 0) goto L99
                r1 = r3
            L99:
                int r2 = r2 + r1
                r6.nextSearchIndex = r2
            L9c:
                r6.nextState = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.h.a.b():void");
        }

        /* renamed from: c, reason: from getter */
        public final int getCounter() {
            return this.counter;
        }

        /* renamed from: d, reason: from getter */
        public final int getCurrentStartIndex() {
            return this.currentStartIndex;
        }

        @fg.m
        /* renamed from: e, reason: from getter */
        public final kotlin.ranges.l getNextItem() {
            return this.nextItem;
        }

        /* renamed from: f, reason: from getter */
        public final int getNextSearchIndex() {
            return this.nextSearchIndex;
        }

        /* renamed from: h, reason: from getter */
        public final int getNextState() {
            return this.nextState;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextState == -1) {
                b();
            }
            return this.nextState == 1;
        }

        @Override // java.util.Iterator
        @fg.l
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public kotlin.ranges.l next() {
            if (this.nextState == -1) {
                b();
            }
            if (this.nextState == 0) {
                throw new NoSuchElementException();
            }
            kotlin.ranges.l lVar = this.nextItem;
            kotlin.jvm.internal.l0.n(lVar, ProtectedSandApp.s("营\u0001"));
            this.nextItem = null;
            this.nextState = -1;
            return lVar;
        }

        public final void j(int i4) {
            this.counter = i4;
        }

        public final void l(int i4) {
            this.currentStartIndex = i4;
        }

        public final void m(@fg.m kotlin.ranges.l lVar) {
            this.nextItem = lVar;
        }

        public final void o(int i4) {
            this.nextSearchIndex = i4;
        }

        public final void p(int i4) {
            this.nextState = i4;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("萦\u0001"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@fg.l CharSequence charSequence, int i4, int i5, @fg.l ld.p<? super CharSequence, ? super Integer, q0<Integer, Integer>> pVar) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("葉\u0001"));
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("葊\u0001"));
        this.input = charSequence;
        this.startIndex = i4;
        this.limit = i5;
        this.getNextMatch = pVar;
    }

    @Override // kotlin.sequences.m
    @fg.l
    public Iterator<kotlin.ranges.l> iterator() {
        return new a();
    }
}

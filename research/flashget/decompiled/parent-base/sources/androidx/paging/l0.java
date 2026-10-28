package androidx.paging;

import androidx.compose.ui.graphics.k6;
import androidx.paging.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PageEvent.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0003\u000f\u0010\fB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004JG\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0005*\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJM\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0005*\u00020\u00012(\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ=\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\n\u0082\u0001\u0003\u0011\u0012\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/paging/l0;", "", "T", "<init>", "()V", "R", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "transform", "e", "(Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "c", "", "predicate", "a", "b", "Landroidx/paging/l0$b;", "Landroidx/paging/l0$a;", "Landroidx/paging/l0$c;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class l0<T> {

    /* compiled from: PageEvent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ>\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u000fR\u0011\u0010'\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b&\u0010\u000f¨\u0006("}, d2 = {"Landroidx/paging/l0$a;", "", "T", "Landroidx/paging/l0;", "Landroidx/paging/g0;", "loadType", "", "minPageOffset", "maxPageOffset", "placeholdersRemaining", "<init>", "(Landroidx/paging/g0;III)V", "g", "()Landroidx/paging/g0;", "h", "()I", "i", "j", "k", "(Landroidx/paging/g0;III)Landroidx/paging/l0$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/paging/g0;", "m", "b", "I", "o", "c", "n", "d", "q", "p", "pageCount", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class a<T> extends l0<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final g0 loadType;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int minPageOffset;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int maxPageOffset;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int placeholdersRemaining;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@fg.l g0 loadType, int i4, int i5, int i6) {
            super(null);
            kotlin.jvm.internal.l0.p(loadType, "loadType");
            this.loadType = loadType;
            this.minPageOffset = i4;
            this.maxPageOffset = i5;
            this.placeholdersRemaining = i6;
            if (!(loadType != g0.REFRESH)) {
                throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
            }
            if (!(p() > 0)) {
                throw new IllegalArgumentException(kotlin.jvm.internal.l0.C("Drop count must be > 0, but was ", Integer.valueOf(p())).toString());
            }
            if (!(i6 >= 0)) {
                throw new IllegalArgumentException(kotlin.jvm.internal.l0.C("Invalid placeholdersRemaining ", Integer.valueOf(i6)).toString());
            }
        }

        public static /* synthetic */ a l(a aVar, g0 g0Var, int i4, int i5, int i6, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                g0Var = aVar.loadType;
            }
            if ((i7 & 2) != 0) {
                i4 = aVar.minPageOffset;
            }
            if ((i7 & 4) != 0) {
                i5 = aVar.maxPageOffset;
            }
            if ((i7 & 8) != 0) {
                i6 = aVar.placeholdersRemaining;
            }
            return aVar.k(g0Var, i4, i5, i6);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.loadType == aVar.loadType && this.minPageOffset == aVar.minPageOffset && this.maxPageOffset == aVar.maxPageOffset && this.placeholdersRemaining == aVar.placeholdersRemaining;
        }

        @fg.l
        /* renamed from: g, reason: from getter */
        public final g0 getLoadType() {
            return this.loadType;
        }

        /* renamed from: h, reason: from getter */
        public final int getMinPageOffset() {
            return this.minPageOffset;
        }

        public int hashCode() {
            return Integer.hashCode(this.placeholdersRemaining) + androidx.compose.foundation.w1.a(this.maxPageOffset, androidx.compose.foundation.w1.a(this.minPageOffset, this.loadType.hashCode() * 31, 31), 31);
        }

        /* renamed from: i, reason: from getter */
        public final int getMaxPageOffset() {
            return this.maxPageOffset;
        }

        /* renamed from: j, reason: from getter */
        public final int getPlaceholdersRemaining() {
            return this.placeholdersRemaining;
        }

        @fg.l
        public final a<T> k(@fg.l g0 loadType, int minPageOffset, int maxPageOffset, int placeholdersRemaining) {
            kotlin.jvm.internal.l0.p(loadType, "loadType");
            return new a<>(loadType, minPageOffset, maxPageOffset, placeholdersRemaining);
        }

        @fg.l
        public final g0 m() {
            return this.loadType;
        }

        public final int n() {
            return this.maxPageOffset;
        }

        public final int o() {
            return this.minPageOffset;
        }

        public final int p() {
            return (this.maxPageOffset - this.minPageOffset) + 1;
        }

        public final int q() {
            return this.placeholdersRemaining;
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("Drop(loadType=");
            sb.append(this.loadType);
            sb.append(", minPageOffset=");
            sb.append(this.minPageOffset);
            sb.append(", maxPageOffset=");
            sb.append(this.maxPageOffset);
            sb.append(", placeholdersRemaining=");
            return androidx.view.e.a(sb, this.placeholdersRemaining, ')');
        }
    }

    /* compiled from: PageEvent.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\b\u0018\u0000 @*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u001fBI\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J@\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u0011*\u00020\u00012\u001e\u0010\u0013\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00070\u0012H\u0082\b¢\u0006\u0004\b\u0014\u0010\u0015JO\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u0011*\u00020\u00012*\u0010\u0013\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00070\u00060\u0012H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0015JG\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\b\b\u0002\u0010\u0011*\u00020\u00012\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017H\u0096@ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJM\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\b\b\u0002\u0010\u0011*\u00020\u00012(\u0010\u0013\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u001b0\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017H\u0096@ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001aJ=\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\"\u0010\u001e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017H\u0096@ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u001c\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b)\u0010(J`\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b/\u0010%J\u001a\u00101\u001a\u00020\u001d2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u00103\u001a\u0004\b4\u0010!R#\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u00068\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u00108\u001a\u0004\b9\u0010%R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b:\u00108\u001a\u0004\b;\u0010%R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010<\u001a\u0004\b=\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b>\u0010<\u001a\u0004\b?\u0010(\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006A"}, d2 = {"Landroidx/paging/l0$b;", "", "T", "Landroidx/paging/l0;", "Landroidx/paging/g0;", "loadType", "", "Landroidx/paging/t1;", "pages", "", "placeholdersBefore", "placeholdersAfter", "Landroidx/paging/f0;", "sourceLoadStates", "mediatorLoadStates", "<init>", "(Landroidx/paging/g0;Ljava/util/List;IILandroidx/paging/f0;Landroidx/paging/f0;)V", "R", "Lkotlin/Function1;", "transform", "v", "(Lld/l;)Landroidx/paging/l0$b;", "w", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "e", "(Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "c", "", "predicate", "a", "h", "()Landroidx/paging/g0;", "i", "()Ljava/util/List;", "j", "()I", "k", "l", "()Landroidx/paging/f0;", "m", "n", "(Landroidx/paging/g0;Ljava/util/List;IILandroidx/paging/f0;Landroidx/paging/f0;)Landroidx/paging/l0$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/paging/g0;", "p", "b", "Ljava/util/List;", "r", "I", "t", "d", "s", "Landroidx/paging/f0;", "u", "f", "q", "g", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class b<T> extends l0<T> {

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE;

        /* renamed from: h, reason: collision with root package name */
        @fg.l
        private static final b<Object> f31828h;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final g0 loadType;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final List<t1<T>> pages;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int placeholdersBefore;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int placeholdersAfter;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final f0 sourceLoadStates;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private final f0 mediatorLoadStates;

        /* compiled from: PageEvent.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\u000e\"\b\b\u0002\u0010\u0004*\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010JM\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00020\u000e\"\b\b\u0002\u0010\u0004*\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012JM\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00020\u000e\"\b\b\u0002\u0010\u0004*\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0012R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/paging/l0$b$a;", "", "<init>", "()V", "T", "", "Landroidx/paging/t1;", "pages", "", "placeholdersBefore", "placeholdersAfter", "Landroidx/paging/f0;", "sourceLoadStates", "mediatorLoadStates", "Landroidx/paging/l0$b;", "e", "(Ljava/util/List;IILandroidx/paging/f0;Landroidx/paging/f0;)Landroidx/paging/l0$b;", "c", "(Ljava/util/List;ILandroidx/paging/f0;Landroidx/paging/f0;)Landroidx/paging/l0$b;", "a", "EMPTY_REFRESH_LOCAL", "Landroidx/paging/l0$b;", "g", "()Landroidx/paging/l0$b;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: androidx.paging.l0$b$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static /* synthetic */ b b(Companion companion, List list, int i4, f0 f0Var, f0 f0Var2, int i5, Object obj) {
                if ((i5 & 8) != 0) {
                    f0Var2 = null;
                }
                return companion.a(list, i4, f0Var, f0Var2);
            }

            public static /* synthetic */ b d(Companion companion, List list, int i4, f0 f0Var, f0 f0Var2, int i5, Object obj) {
                if ((i5 & 8) != 0) {
                    f0Var2 = null;
                }
                return companion.c(list, i4, f0Var, f0Var2);
            }

            public static /* synthetic */ b f(Companion companion, List list, int i4, int i5, f0 f0Var, f0 f0Var2, int i6, Object obj) {
                if ((i6 & 16) != 0) {
                    f0Var2 = null;
                }
                return companion.e(list, i4, i5, f0Var, f0Var2);
            }

            @fg.l
            public final <T> b<T> a(@fg.l List<t1<T>> pages, int placeholdersAfter, @fg.l f0 sourceLoadStates, @fg.m f0 mediatorLoadStates) {
                kotlin.jvm.internal.l0.p(pages, "pages");
                kotlin.jvm.internal.l0.p(sourceLoadStates, "sourceLoadStates");
                return new b<>(g0.APPEND, pages, -1, placeholdersAfter, sourceLoadStates, mediatorLoadStates, null);
            }

            @fg.l
            public final <T> b<T> c(@fg.l List<t1<T>> pages, int placeholdersBefore, @fg.l f0 sourceLoadStates, @fg.m f0 mediatorLoadStates) {
                kotlin.jvm.internal.l0.p(pages, "pages");
                kotlin.jvm.internal.l0.p(sourceLoadStates, "sourceLoadStates");
                return new b<>(g0.PREPEND, pages, placeholdersBefore, -1, sourceLoadStates, mediatorLoadStates, null);
            }

            @fg.l
            public final <T> b<T> e(@fg.l List<t1<T>> pages, int placeholdersBefore, int placeholdersAfter, @fg.l f0 sourceLoadStates, @fg.m f0 mediatorLoadStates) {
                kotlin.jvm.internal.l0.p(pages, "pages");
                kotlin.jvm.internal.l0.p(sourceLoadStates, "sourceLoadStates");
                return new b<>(g0.REFRESH, pages, placeholdersBefore, placeholdersAfter, sourceLoadStates, mediatorLoadStates, null);
            }

            @fg.l
            public final b<Object> g() {
                return b.f31828h;
            }

            public Companion(kotlin.jvm.internal.w wVar) {
            }
        }

        /* compiled from: PageEvent.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageEvent$Insert", f = "PageEvent.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {104}, m = "filter", n = {"predicate", "this_$iv$iv", "destination$iv$iv$iv", "it", "originalIndices", "data", "t", "index$iv", "index"}, s = {"L$0", "L$1", "L$3", "L$5", "L$6", "L$7", "L$9", "I$0", "I$1"})
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: androidx.paging.l0$b$b, reason: collision with other inner class name */
        static final class C0543b extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            Object f31835b;

            /* renamed from: c, reason: collision with root package name */
            Object f31836c;

            /* renamed from: d, reason: collision with root package name */
            Object f31837d;

            /* renamed from: e, reason: collision with root package name */
            Object f31838e;

            /* renamed from: f, reason: collision with root package name */
            Object f31839f;

            /* renamed from: g, reason: collision with root package name */
            Object f31840g;

            /* renamed from: h, reason: collision with root package name */
            Object f31841h;

            /* renamed from: i, reason: collision with root package name */
            Object f31842i;

            /* renamed from: j, reason: collision with root package name */
            Object f31843j;

            /* renamed from: k, reason: collision with root package name */
            Object f31844k;

            /* renamed from: l, reason: collision with root package name */
            Object f31845l;

            /* renamed from: m, reason: collision with root package name */
            int f31846m;

            /* renamed from: n, reason: collision with root package name */
            int f31847n;

            /* renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f31848o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ b<T> f31849p;

            /* renamed from: q, reason: collision with root package name */
            int f31850q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0543b(b<T> bVar, kotlin.coroutines.d<? super C0543b> dVar) {
                super(dVar);
                this.f31849p = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f31848o = obj;
                this.f31850q |= Integer.MIN_VALUE;
                return this.f31849p.a(null, this);
            }
        }

        /* compiled from: PageEvent.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageEvent$Insert", f = "PageEvent.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {86}, m = "flatMap", n = {"transform", "this_$iv$iv", "destination$iv$iv$iv", "it", "originalIndices", "data", "index$iv", "index"}, s = {"L$0", "L$1", "L$3", "L$5", "L$6", "L$7", "I$0", "I$1"})
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        static final class c<R> extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            Object f31851b;

            /* renamed from: c, reason: collision with root package name */
            Object f31852c;

            /* renamed from: d, reason: collision with root package name */
            Object f31853d;

            /* renamed from: e, reason: collision with root package name */
            Object f31854e;

            /* renamed from: f, reason: collision with root package name */
            Object f31855f;

            /* renamed from: g, reason: collision with root package name */
            Object f31856g;

            /* renamed from: h, reason: collision with root package name */
            Object f31857h;

            /* renamed from: i, reason: collision with root package name */
            Object f31858i;

            /* renamed from: j, reason: collision with root package name */
            Object f31859j;

            /* renamed from: k, reason: collision with root package name */
            Object f31860k;

            /* renamed from: l, reason: collision with root package name */
            Object f31861l;

            /* renamed from: m, reason: collision with root package name */
            int f31862m;

            /* renamed from: n, reason: collision with root package name */
            int f31863n;

            /* renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f31864o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ b<T> f31865p;

            /* renamed from: q, reason: collision with root package name */
            int f31866q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(b<T> bVar, kotlin.coroutines.d<? super c> dVar) {
                super(dVar);
                this.f31865p = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f31864o = obj;
                this.f31866q |= Integer.MIN_VALUE;
                return this.f31865p.c(null, this);
            }
        }

        /* compiled from: PageEvent.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageEvent$Insert", f = "PageEvent.kt", i = {0, 0, 0, 0, 0}, l = {74}, m = "map", n = {"transform", "this_$iv$iv", "destination$iv$iv$iv", "it", "destination$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$5", "L$7"})
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        static final class d<R> extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            Object f31867b;

            /* renamed from: c, reason: collision with root package name */
            Object f31868c;

            /* renamed from: d, reason: collision with root package name */
            Object f31869d;

            /* renamed from: e, reason: collision with root package name */
            Object f31870e;

            /* renamed from: f, reason: collision with root package name */
            Object f31871f;

            /* renamed from: g, reason: collision with root package name */
            Object f31872g;

            /* renamed from: h, reason: collision with root package name */
            Object f31873h;

            /* renamed from: i, reason: collision with root package name */
            Object f31874i;

            /* renamed from: j, reason: collision with root package name */
            Object f31875j;

            /* renamed from: k, reason: collision with root package name */
            Object f31876k;

            /* renamed from: l, reason: collision with root package name */
            Object f31877l;

            /* renamed from: m, reason: collision with root package name */
            /* synthetic */ Object f31878m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ b<T> f31879n;

            /* renamed from: o, reason: collision with root package name */
            int f31880o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(b<T> bVar, kotlin.coroutines.d<? super d> dVar) {
                super(dVar);
                this.f31879n = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f31878m = obj;
                this.f31880o |= Integer.MIN_VALUE;
                return this.f31879n.e(null, this);
            }
        }

        static {
            Companion companion = new Companion();
            INSTANCE = companion;
            t1.INSTANCE.getClass();
            List k4 = kotlin.collections.w.k(t1.f32385f);
            e0.c.Companion companion2 = e0.c.INSTANCE;
            companion2.getClass();
            e0.c cVar = e0.c.f31663d;
            companion2.getClass();
            e0.c cVar2 = e0.c.f31662c;
            companion2.getClass();
            f31828h = Companion.f(companion, k4, 0, 0, new f0(cVar, cVar2, e0.c.f31662c), null, 16, null);
        }

        public /* synthetic */ b(g0 g0Var, List list, int i4, int i5, f0 f0Var, f0 f0Var2, kotlin.jvm.internal.w wVar) {
            this(g0Var, list, i4, i5, f0Var, f0Var2);
        }

        public static /* synthetic */ b o(b bVar, g0 g0Var, List list, int i4, int i5, f0 f0Var, f0 f0Var2, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                g0Var = bVar.loadType;
            }
            if ((i6 & 2) != 0) {
                list = bVar.pages;
            }
            List list2 = list;
            if ((i6 & 4) != 0) {
                i4 = bVar.placeholdersBefore;
            }
            int i7 = i4;
            if ((i6 & 8) != 0) {
                i5 = bVar.placeholdersAfter;
            }
            int i10 = i5;
            if ((i6 & 16) != 0) {
                f0Var = bVar.sourceLoadStates;
            }
            f0 f0Var3 = f0Var;
            if ((i6 & 32) != 0) {
                f0Var2 = bVar.mediatorLoadStates;
            }
            return bVar.n(g0Var, list2, i7, i10, f0Var3, f0Var2);
        }

        private final <R> b<R> v(ld.l<? super t1<T>, t1<R>> transform) {
            g0 g0Var = this.loadType;
            List<t1<T>> list = this.pages;
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(transform.invoke(it.next()));
            }
            return new b<>(g0Var, arrayList, this.placeholdersBefore, this.placeholdersAfter, this.sourceLoadStates, this.mediatorLoadStates);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /* JADX WARN: Type inference failed for: r14v5, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00e7 -> B:10:0x00f0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x008e -> B:19:0x00b2). Please report as a decompilation issue!!! */
        @Override // androidx.paging.l0
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super java.lang.Boolean>, ? extends java.lang.Object> r18, @fg.l kotlin.coroutines.d<? super androidx.paging.l0<T>> r19) {
            /*
                Method dump skipped, instructions count: 326
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.l0.b.a(ld.p, kotlin.coroutines.d):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0124 A[LOOP:0: B:16:0x011a->B:18:0x0124, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r11v9, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r14v6, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00f6 -> B:10:0x0101). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0098 -> B:19:0x00bc). Please report as a decompilation issue!!! */
        @Override // androidx.paging.l0
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <R> java.lang.Object c(@fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super java.lang.Iterable<? extends R>>, ? extends java.lang.Object> r19, @fg.l kotlin.coroutines.d<? super androidx.paging.l0<R>> r20) {
            /*
                Method dump skipped, instructions count: 353
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.l0.b.c(ld.p, kotlin.coroutines.d):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
        /* JADX WARN: Type inference failed for: r13v8, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r7v10, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r9v8, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00d6 -> B:10:0x00de). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0089 -> B:11:0x00ac). Please report as a decompilation issue!!! */
        @Override // androidx.paging.l0
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <R> java.lang.Object e(@fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends java.lang.Object> r18, @fg.l kotlin.coroutines.d<? super androidx.paging.l0<R>> r19) {
            /*
                Method dump skipped, instructions count: 275
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.l0.b.e(ld.p, kotlin.coroutines.d):java.lang.Object");
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.loadType == bVar.loadType && kotlin.jvm.internal.l0.g(this.pages, bVar.pages) && this.placeholdersBefore == bVar.placeholdersBefore && this.placeholdersAfter == bVar.placeholdersAfter && kotlin.jvm.internal.l0.g(this.sourceLoadStates, bVar.sourceLoadStates) && kotlin.jvm.internal.l0.g(this.mediatorLoadStates, bVar.mediatorLoadStates);
        }

        @fg.l
        /* renamed from: h, reason: from getter */
        public final g0 getLoadType() {
            return this.loadType;
        }

        public int hashCode() {
            int hashCode = (this.sourceLoadStates.hashCode() + androidx.compose.foundation.w1.a(this.placeholdersAfter, androidx.compose.foundation.w1.a(this.placeholdersBefore, k6.a(this.pages, this.loadType.hashCode() * 31, 31), 31), 31)) * 31;
            f0 f0Var = this.mediatorLoadStates;
            return hashCode + (f0Var == null ? 0 : f0Var.hashCode());
        }

        @fg.l
        public final List<t1<T>> i() {
            return this.pages;
        }

        /* renamed from: j, reason: from getter */
        public final int getPlaceholdersBefore() {
            return this.placeholdersBefore;
        }

        /* renamed from: k, reason: from getter */
        public final int getPlaceholdersAfter() {
            return this.placeholdersAfter;
        }

        @fg.l
        /* renamed from: l, reason: from getter */
        public final f0 getSourceLoadStates() {
            return this.sourceLoadStates;
        }

        @fg.m
        /* renamed from: m, reason: from getter */
        public final f0 getMediatorLoadStates() {
            return this.mediatorLoadStates;
        }

        @fg.l
        public final b<T> n(@fg.l g0 loadType, @fg.l List<t1<T>> pages, int placeholdersBefore, int placeholdersAfter, @fg.l f0 sourceLoadStates, @fg.m f0 mediatorLoadStates) {
            kotlin.jvm.internal.l0.p(loadType, "loadType");
            kotlin.jvm.internal.l0.p(pages, "pages");
            kotlin.jvm.internal.l0.p(sourceLoadStates, "sourceLoadStates");
            return new b<>(loadType, pages, placeholdersBefore, placeholdersAfter, sourceLoadStates, mediatorLoadStates);
        }

        @fg.l
        public final g0 p() {
            return this.loadType;
        }

        @fg.m
        public final f0 q() {
            return this.mediatorLoadStates;
        }

        @fg.l
        public final List<t1<T>> r() {
            return this.pages;
        }

        public final int s() {
            return this.placeholdersAfter;
        }

        public final int t() {
            return this.placeholdersBefore;
        }

        @fg.l
        public String toString() {
            return "Insert(loadType=" + this.loadType + ", pages=" + this.pages + ", placeholdersBefore=" + this.placeholdersBefore + ", placeholdersAfter=" + this.placeholdersAfter + ", sourceLoadStates=" + this.sourceLoadStates + ", mediatorLoadStates=" + this.mediatorLoadStates + ')';
        }

        @fg.l
        public final f0 u() {
            return this.sourceLoadStates;
        }

        @fg.l
        public final <R> b<R> w(@fg.l ld.l<? super List<t1<T>>, ? extends List<t1<R>>> transform) {
            kotlin.jvm.internal.l0.p(transform, "transform");
            return new b<>(this.loadType, transform.invoke(this.pages), this.placeholdersBefore, this.placeholdersAfter, this.sourceLoadStates, this.mediatorLoadStates);
        }

        /* synthetic */ b(g0 g0Var, List list, int i4, int i5, f0 f0Var, f0 f0Var2, int i6, kotlin.jvm.internal.w wVar) {
            this(g0Var, list, i4, i5, f0Var, (i6 & 32) != 0 ? null : f0Var2);
        }

        private b(g0 g0Var, List<t1<T>> list, int i4, int i5, f0 f0Var, f0 f0Var2) {
            super(null);
            this.loadType = g0Var;
            this.pages = list;
            this.placeholdersBefore = i4;
            this.placeholdersAfter = i5;
            this.sourceLoadStates = f0Var;
            this.mediatorLoadStates = f0Var2;
            boolean z4 = true;
            if (g0Var == g0.APPEND || i4 >= 0) {
                if (g0Var == g0.PREPEND || i5 >= 0) {
                    if (g0Var == g0.REFRESH && list.isEmpty()) {
                        z4 = false;
                    }
                    if (!z4) {
                        throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
                    }
                    return;
                }
                throw new IllegalArgumentException(kotlin.jvm.internal.l0.C("Append insert defining placeholdersAfter must be > 0, but was ", Integer.valueOf(i5)).toString());
            }
            throw new IllegalArgumentException(kotlin.jvm.internal.l0.C("Prepend insert defining placeholdersBefore must be > 0, but was ", Integer.valueOf(i4)).toString());
        }
    }

    /* compiled from: PageEvent.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ,\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\n¨\u0006\u001d"}, d2 = {"Landroidx/paging/l0$c;", "", "T", "Landroidx/paging/l0;", "Landroidx/paging/f0;", "source", "mediator", "<init>", "(Landroidx/paging/f0;Landroidx/paging/f0;)V", "g", "()Landroidx/paging/f0;", "h", "i", "(Landroidx/paging/f0;Landroidx/paging/f0;)Landroidx/paging/l0$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/paging/f0;", "l", "b", "k", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class c<T> extends l0<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final f0 source;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private final f0 mediator;

        public /* synthetic */ c(f0 f0Var, f0 f0Var2, int i4, kotlin.jvm.internal.w wVar) {
            this(f0Var, (i4 & 2) != 0 ? null : f0Var2);
        }

        public static /* synthetic */ c j(c cVar, f0 f0Var, f0 f0Var2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f0Var = cVar.source;
            }
            if ((i4 & 2) != 0) {
                f0Var2 = cVar.mediator;
            }
            return cVar.i(f0Var, f0Var2);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return kotlin.jvm.internal.l0.g(this.source, cVar.source) && kotlin.jvm.internal.l0.g(this.mediator, cVar.mediator);
        }

        @fg.l
        /* renamed from: g, reason: from getter */
        public final f0 getSource() {
            return this.source;
        }

        @fg.m
        /* renamed from: h, reason: from getter */
        public final f0 getMediator() {
            return this.mediator;
        }

        public int hashCode() {
            int hashCode = this.source.hashCode() * 31;
            f0 f0Var = this.mediator;
            return hashCode + (f0Var == null ? 0 : f0Var.hashCode());
        }

        @fg.l
        public final c<T> i(@fg.l f0 source, @fg.m f0 mediator) {
            kotlin.jvm.internal.l0.p(source, "source");
            return new c<>(source, mediator);
        }

        @fg.m
        public final f0 k() {
            return this.mediator;
        }

        @fg.l
        public final f0 l() {
            return this.source;
        }

        @fg.l
        public String toString() {
            return "LoadStateUpdate(source=" + this.source + ", mediator=" + this.mediator + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@fg.l f0 source, @fg.m f0 f0Var) {
            super(null);
            kotlin.jvm.internal.l0.p(source, "source");
            this.source = source;
            this.mediator = f0Var;
        }
    }

    public /* synthetic */ l0(kotlin.jvm.internal.w wVar) {
        this();
    }

    static /* synthetic */ Object b(l0 l0Var, ld.p pVar, kotlin.coroutines.d dVar) {
        return l0Var;
    }

    static /* synthetic */ Object d(l0 l0Var, ld.p pVar, kotlin.coroutines.d dVar) {
        return l0Var;
    }

    static /* synthetic */ Object f(l0 l0Var, ld.p pVar, kotlin.coroutines.d dVar) {
        return l0Var;
    }

    @fg.m
    public Object a(@fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super l0<T>> dVar) {
        return this;
    }

    @fg.m
    public <R> Object c(@fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super Iterable<? extends R>>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super l0<R>> dVar) {
        return this;
    }

    @fg.m
    public <R> Object e(@fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super l0<R>> dVar) {
        return this;
    }

    private l0() {
    }
}

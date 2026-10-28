package androidx.room;

import androidx.annotation.c1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;

/* compiled from: AmbiguousColumnResolver.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u001b\u001d\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJQ\u0010\u0013\u001a\u00020\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042$\u0010\u0012\u001a \u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\u00110\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J]\u0010\u001b\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u00152\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u000b2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00102\u0018\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0004\u0012\u00020\u00110\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/room/a;", "", "<init>", "()V", "", "", "resultColumns", "mappings", "", "d", "([Ljava/lang/String;[[Ljava/lang/String;)[[I", "", "Landroidx/room/a$b;", "content", "pattern", "Lkotlin/Function3;", "", "Lkotlin/k2;", "onHashMatch", "c", "(Ljava/util/List;[Ljava/lang/String;Lld/q;)V", "T", "", "current", "depth", "Lkotlin/Function1;", "block", "a", "(Ljava/util/List;Ljava/util/List;ILld/l;)V", "b", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.c1({c1.a.LIBRARY_GROUP})
@kotlin.jvm.internal.r1({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,253:1\n1#2:254\n13579#3,2:255\n13644#3,3:257\n13644#3,2:260\n11335#3:262\n11670#3,2:263\n11672#3:267\n13646#3:268\n1855#4,2:265\n1726#4,3:269\n1549#4:272\n1620#4,3:273\n1855#4,2:278\n37#5,2:276\n*S KotlinDebug\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver\n*L\n85#1:255,2\n87#1:257,3\n96#1:260,2\n118#1:262\n118#1:263,2\n118#1:267\n96#1:268\n120#1:265,2\n141#1:269,3\n151#1:272\n151#1:273,3\n188#1:278,2\n151#1:276,2\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final a f33493a = new a();

    /* compiled from: AmbiguousColumnResolver.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\t\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/room/a$a;", "", "Lkotlin/ranges/l;", "resultRange", "", "", "resultIndices", "<init>", "(Lkotlin/ranges/l;Ljava/util/List;)V", "a", "Lkotlin/ranges/l;", "b", "()Lkotlin/ranges/l;", "Ljava/util/List;", "()Ljava/util/List;", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.room.a$a, reason: collision with other inner class name */
    private static final class C0599a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final kotlin.ranges.l resultRange;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final List<Integer> resultIndices;

        public C0599a(@fg.l kotlin.ranges.l resultRange, @fg.l List<Integer> resultIndices) {
            kotlin.jvm.internal.l0.p(resultRange, "resultRange");
            kotlin.jvm.internal.l0.p(resultIndices, "resultIndices");
            this.resultRange = resultRange;
            this.resultIndices = resultIndices;
        }

        @fg.l
        public final List<Integer> a() {
            return this.resultIndices;
        }

        @fg.l
        /* renamed from: b, reason: from getter */
        public final kotlin.ranges.l getResultRange() {
            return this.resultRange;
        }
    }

    /* compiled from: AmbiguousColumnResolver.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"Landroidx/room/a$b;", "", "", "name", "", "index", "<init>", "(Ljava/lang/String;I)V", "a", "()Ljava/lang/String;", "b", "()I", "c", "(Ljava/lang/String;I)Landroidx/room/a$b;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "I", "e", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String name;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int index;

        public b(@fg.l String name, int i4) {
            kotlin.jvm.internal.l0.p(name, "name");
            this.name = name;
            this.index = i4;
        }

        public static /* synthetic */ b d(b bVar, String str, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = bVar.name;
            }
            if ((i5 & 2) != 0) {
                i4 = bVar.index;
            }
            return bVar.c(str, i4);
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: b, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        @fg.l
        public final b c(@fg.l String name, int index) {
            kotlin.jvm.internal.l0.p(name, "name");
            return new b(name, index);
        }

        public final int e() {
            return this.index;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return kotlin.jvm.internal.l0.g(this.name, bVar.name) && this.index == bVar.index;
        }

        @fg.l
        public final String f() {
            return this.name;
        }

        public int hashCode() {
            return Integer.hashCode(this.index) + (this.name.hashCode() * 31);
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("ResultColumn(name=");
            sb.append(this.name);
            sb.append(", index=");
            return androidx.view.e.a(sb, this.index, ')');
        }
    }

    /* compiled from: AmbiguousColumnResolver.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/room/a$c;", "", "", "Landroidx/room/a$a;", "matches", "", "coverageOffset", "overlaps", "<init>", "(Ljava/util/List;II)V", "other", "b", "(Landroidx/room/a$c;)I", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "I", "()I", "e", "a", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c implements Comparable<c> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: f, reason: collision with root package name */
        @fg.l
        private static final c f33499f = new c(kotlin.collections.j0.f74919b, Integer.MAX_VALUE, Integer.MAX_VALUE);

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final List<C0599a> matches;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int coverageOffset;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int overlaps;

        /* compiled from: AmbiguousColumnResolver.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/room/a$c$a;", "", "<init>", "()V", "", "Landroidx/room/a$a;", "matches", "Landroidx/room/a$c;", "a", "(Ljava/util/List;)Landroidx/room/a$c;", "NO_SOLUTION", "Landroidx/room/a$c;", "b", "()Landroidx/room/a$c;", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlin.jvm.internal.r1({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$Solution$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,253:1\n1#2:254\n1774#3,3:255\n1855#3,2:258\n1777#3:260\n*S KotlinDebug\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$Solution$Companion\n*L\n232#1:255,3\n234#1:258,2\n232#1:260\n*E\n"})
        /* renamed from: androidx.room.a$c$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @fg.l
            public final c a(@fg.l List<C0599a> matches) {
                kotlin.jvm.internal.l0.p(matches, "matches");
                List<C0599a> list = matches;
                int i4 = 0;
                int i5 = 0;
                for (C0599a c0599a : list) {
                    i5 += ((c0599a.getResultRange().getLast() - c0599a.getResultRange().getFirst()) + 1) - c0599a.a().size();
                }
                Iterator<T> it = list.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                int first = ((C0599a) it.next()).getResultRange().getFirst();
                while (it.hasNext()) {
                    int first2 = ((C0599a) it.next()).getResultRange().getFirst();
                    if (first > first2) {
                        first = first2;
                    }
                }
                Iterator<T> it2 = list.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int last = ((C0599a) it2.next()).getResultRange().getLast();
                while (it2.hasNext()) {
                    int last2 = ((C0599a) it2.next()).getResultRange().getLast();
                    if (last < last2) {
                        last = last2;
                    }
                }
                Iterable lVar = new kotlin.ranges.l(first, last, 1);
                if (!(lVar instanceof Collection) || !((Collection) lVar).isEmpty()) {
                    Iterator it3 = lVar.iterator();
                    int i6 = 0;
                    while (it3.hasNext()) {
                        int c5 = ((kotlin.collections.u0) it3).c();
                        Iterator<T> it4 = list.iterator();
                        int i7 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            if (((C0599a) it4.next()).getResultRange().r(c5)) {
                                i7++;
                            }
                            if (i7 > 1) {
                                i6++;
                                if (i6 < 0) {
                                    kotlin.collections.w.Y();
                                }
                            }
                        }
                    }
                    i4 = i6;
                }
                return new c(matches, i5, i4);
            }

            @fg.l
            public final c b() {
                return c.f33499f;
            }

            public Companion(kotlin.jvm.internal.w wVar) {
            }
        }

        public c(@fg.l List<C0599a> matches, int i4, int i5) {
            kotlin.jvm.internal.l0.p(matches, "matches");
            this.matches = matches;
            this.coverageOffset = i4;
            this.overlaps = i5;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(@fg.l c other) {
            kotlin.jvm.internal.l0.p(other, "other");
            int t4 = kotlin.jvm.internal.l0.t(this.overlaps, other.overlaps);
            return t4 != 0 ? t4 : kotlin.jvm.internal.l0.t(this.coverageOffset, other.coverageOffset);
        }

        /* renamed from: c, reason: from getter */
        public final int getCoverageOffset() {
            return this.coverageOffset;
        }

        @fg.l
        public final List<C0599a> d() {
            return this.matches;
        }

        /* renamed from: e, reason: from getter */
        public final int getOverlaps() {
            return this.overlaps;
        }
    }

    /* compiled from: AmbiguousColumnResolver.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "startIndex", "endIndex", "", "Landroidx/room/a$b;", "resultColumnsSublist", "Lkotlin/k2;", "a", "(IILjava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$resolve$1$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,253:1\n11335#2:254\n11670#2,2:255\n11672#2:259\n288#3,2:257\n*S KotlinDebug\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$resolve$1$1\n*L\n102#1:254\n102#1:255,2\n102#1:259\n103#1:257,2\n*E\n"})
    static final class d extends kotlin.jvm.internal.n0 implements ld.q<Integer, Integer, List<? extends b>, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String[] f33503b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<List<C0599a>> f33504c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f33505d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(String[] strArr, List<? extends List<C0599a>> list, int i4) {
            super(3);
            this.f33503b = strArr;
            this.f33504c = list;
            this.f33505d = i4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(Integer num, Integer num2, List<? extends b> list) {
            a(num.intValue(), num2.intValue(), list);
            return kotlin.k2.f75408a;
        }

        public final void a(int i4, int i5, @fg.l List<b> resultColumnsSublist) {
            Object obj;
            kotlin.jvm.internal.l0.p(resultColumnsSublist, "resultColumnsSublist");
            String[] strArr = this.f33503b;
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                Iterator<T> it = resultColumnsSublist.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (kotlin.jvm.internal.l0.g(str, ((b) obj).getName())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                b bVar = (b) obj;
                if (bVar == null) {
                    return;
                }
                arrayList.add(Integer.valueOf(bVar.e()));
            }
            this.f33504c.get(this.f33505d).add(new C0599a(new kotlin.ranges.l(i4, i5 - 1, 1), arrayList));
        }
    }

    /* compiled from: AmbiguousColumnResolver.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "indices", "Lkotlin/k2;", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$resolve$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,253:1\n1#2:254\n*E\n"})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<List<? extends Integer>, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<List<C0599a>> f33506b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f33507c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(List<? extends List<C0599a>> list, int i4) {
            super(1);
            this.f33506b = list;
            this.f33507c = i4;
        }

        public final void a(@fg.l List<Integer> indices) {
            kotlin.jvm.internal.l0.p(indices, "indices");
            List<Integer> list = indices;
            Iterator<T> it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            int intValue = ((Number) it.next()).intValue();
            while (it.hasNext()) {
                int intValue2 = ((Number) it.next()).intValue();
                if (intValue > intValue2) {
                    intValue = intValue2;
                }
            }
            Iterator<T> it2 = list.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            int intValue3 = ((Number) it2.next()).intValue();
            while (it2.hasNext()) {
                int intValue4 = ((Number) it2.next()).intValue();
                if (intValue3 < intValue4) {
                    intValue3 = intValue4;
                }
            }
            this.f33506b.get(this.f33507c).add(new C0599a(new kotlin.ranges.l(intValue, intValue3, 1), indices));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(List<? extends Integer> list) {
            a(list);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AmbiguousColumnResolver.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Landroidx/room/a$a;", "it", "Lkotlin/k2;", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<List<? extends C0599a>, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h<c> f33508b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(k1.h<c> hVar) {
            super(1);
            this.f33508b = hVar;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.room.a$c] */
        public final void a(@fg.l List<C0599a> it) {
            kotlin.jvm.internal.l0.p(it, "it");
            ?? a5 = c.INSTANCE.a(it);
            if (a5.compareTo(this.f33508b.f75329b) < 0) {
                this.f33508b.f75329b = a5;
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(List<? extends C0599a> list) {
            a(list);
            return kotlin.k2.f75408a;
        }
    }

    private a() {
    }

    private final <T> void a(List<? extends List<? extends T>> content, List<T> current, int depth, ld.l<? super List<? extends T>, kotlin.k2> block) {
        if (depth == content.size()) {
            block.invoke(kotlin.collections.w.V5(current));
            return;
        }
        Iterator<T> it = content.get(depth).iterator();
        while (it.hasNext()) {
            current.add(it.next());
            f33493a.a(content, current, depth + 1, block);
            kotlin.collections.w.O0(current);
        }
    }

    static /* synthetic */ void b(a aVar, List list, List list2, int i4, ld.l lVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            list2 = new ArrayList();
        }
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        aVar.a(list, list2, i4, lVar);
    }

    private final void c(List<b> content, String[] pattern, ld.q<? super Integer, ? super Integer, ? super List<b>, kotlin.k2> onHashMatch) {
        int i4 = 0;
        int i5 = 0;
        for (String str : pattern) {
            i5 += str.hashCode();
        }
        int length = pattern.length;
        Iterator<T> it = content.subList(0, length).iterator();
        int i6 = 0;
        while (it.hasNext()) {
            i6 += ((b) it.next()).f().hashCode();
        }
        while (true) {
            if (i5 == i6) {
                onHashMatch.R(Integer.valueOf(i4), Integer.valueOf(length), content.subList(i4, length));
            }
            int i7 = i4 + 1;
            int i10 = length + 1;
            if (i10 > content.size()) {
                return;
            }
            i6 = (i6 - content.get(i4).f().hashCode()) + content.get(length).f().hashCode();
            i4 = i7;
            length = i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.room.a$c] */
    @fg.l
    @kd.n
    public static final int[][] d(@fg.l String[] resultColumns, @fg.l String[][] mappings) {
        kotlin.jvm.internal.l0.p(resultColumns, "resultColumns");
        kotlin.jvm.internal.l0.p(mappings, "mappings");
        int length = resultColumns.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            String str = resultColumns[i5];
            if (str.charAt(0) == '`' && str.charAt(str.length() - 1) == '`') {
                str = str.substring(1, str.length() - 1);
                kotlin.jvm.internal.l0.o(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Locale US = Locale.US;
            kotlin.jvm.internal.l0.o(US, "US");
            String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            resultColumns[i5] = lowerCase;
        }
        int length2 = mappings.length;
        for (int i6 = 0; i6 < length2; i6++) {
            int length3 = mappings[i6].length;
            for (int i7 = 0; i7 < length3; i7++) {
                String[] strArr = mappings[i6];
                String str2 = strArr[i7];
                Locale US2 = Locale.US;
                kotlin.jvm.internal.l0.o(US2, "US");
                String lowerCase2 = str2.toLowerCase(US2);
                kotlin.jvm.internal.l0.o(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                strArr[i7] = lowerCase2;
            }
        }
        kotlin.collections.builders.j jVar = new kotlin.collections.builders.j();
        for (String[] strArr2 : mappings) {
            kotlin.collections.w.s0(jVar, strArr2);
        }
        Set a5 = kotlin.collections.l1.a(jVar);
        kotlin.collections.builders.b bVar = new kotlin.collections.builders.b();
        int length4 = resultColumns.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length4) {
            String str3 = resultColumns[i10];
            int i12 = i11 + 1;
            if (a5.contains(str3)) {
                bVar.add(new b(str3, i11));
            }
            i10++;
            i11 = i12;
        }
        List<b> a6 = kotlin.collections.w.a(bVar);
        int length5 = mappings.length;
        ArrayList arrayList = new ArrayList(length5);
        for (int i13 = 0; i13 < length5; i13++) {
            arrayList.add(new ArrayList());
        }
        int length6 = mappings.length;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length6) {
            String[] strArr3 = mappings[i14];
            int i16 = i15 + 1;
            f33493a.c(a6, strArr3, new d(strArr3, arrayList, i15));
            if (((List) arrayList.get(i15)).isEmpty()) {
                ArrayList arrayList2 = new ArrayList(strArr3.length);
                int length7 = strArr3.length;
                for (int i17 = i4; i17 < length7; i17++) {
                    String str4 = strArr3[i17];
                    kotlin.collections.builders.b bVar2 = new kotlin.collections.builders.b();
                    for (b bVar3 : a6) {
                        if (kotlin.jvm.internal.l0.g(str4, bVar3.f())) {
                            bVar2.add(Integer.valueOf(bVar3.e()));
                        }
                    }
                    List a7 = kotlin.collections.w.a(bVar2);
                    if (a7.isEmpty()) {
                        throw new IllegalStateException(android.support.v4.media.d.a("Column ", str4, " not found in result").toString());
                    }
                    arrayList2.add(a7);
                }
                b(f33493a, arrayList2, null, 0, new e(arrayList, i15), 6, null);
            }
            i14++;
            i15 = i16;
            i4 = 0;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((List) it.next()).isEmpty()) {
                    throw new IllegalStateException("Failed to find matches for all mappings");
                }
            }
        }
        k1.h hVar = new k1.h();
        c.INSTANCE.getClass();
        hVar.f75329b = c.f33499f;
        b(f33493a, arrayList, null, 0, new f(hVar), 6, null);
        List<C0599a> d5 = ((c) hVar.f75329b).d();
        ArrayList arrayList3 = new ArrayList(kotlin.collections.w.b0(d5, 10));
        Iterator<T> it2 = d5.iterator();
        while (it2.hasNext()) {
            arrayList3.add(kotlin.collections.w.U5(((C0599a) it2.next()).a()));
        }
        return (int[][]) arrayList3.toArray(new int[0][]);
    }
}

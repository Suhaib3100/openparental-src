package androidx.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;

/* compiled from: ObjectList.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003gh^B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0014\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010 \u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f¢\u0006\u0004\b \u0010!J\u001b\u0010#\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\"¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000%¢\u0006\u0004\b&\u0010'J\u001e\u0010(\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b(\u0010)J\u001e\u0010*\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0086\u0002¢\u0006\u0004\b*\u0010+J\u001e\u0010,\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0086\u0002¢\u0006\u0004\b,\u0010-J\u001e\u0010.\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\u0002¢\u0006\u0004\b.\u0010/J\u001e\u00100\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0086\u0002¢\u0006\u0004\b0\u00101J\u001e\u00102\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0086\u0002¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\f¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\f2\b\b\u0002\u00106\u001a\u00020\u0003¢\u0006\u0004\b7\u0010\u0006J\u0015\u00109\u001a\u00020\f2\u0006\u00108\u001a\u00020\u0003¢\u0006\u0004\b9\u0010\u0006J\u0018\u0010:\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b<\u0010;J\u0015\u0010=\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b=\u0010\nJ6\u0010B\u001a\u00020\f2!\u0010A\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0>H\u0086\bø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u001b\u0010D\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\bD\u0010\u001eJ\u001b\u0010E\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\bE\u0010\u0019J\u001b\u0010F\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\bF\u0010\u001cJ\u001b\u0010G\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f¢\u0006\u0004\bG\u0010!J\u001b\u0010H\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\"¢\u0006\u0004\bH\u0010$J\u001b\u0010I\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000%¢\u0006\u0004\bI\u0010'J\u001e\u0010J\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0086\u0002¢\u0006\u0004\bJ\u0010-J\u001e\u0010K\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\bK\u0010)J\u001e\u0010L\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0086\u0002¢\u0006\u0004\bL\u0010+J\u001e\u0010M\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\u0002¢\u0006\u0004\bM\u0010/J\u001e\u0010N\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0086\u0002¢\u0006\u0004\bN\u00101J\u001e\u0010O\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0086\u0002¢\u0006\u0004\bO\u00103J\u0017\u0010P\u001a\u00028\u00002\b\b\u0001\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\bP\u0010QJ!\u0010T\u001a\u00020\f2\b\b\u0001\u0010R\u001a\u00020\u00032\b\b\u0001\u0010S\u001a\u00020\u0003¢\u0006\u0004\bT\u0010UJ\u001b\u0010V\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\bV\u0010\u001eJ\u001b\u0010W\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\bW\u0010\u0019J\u001b\u0010X\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\bX\u0010YJ\u001b\u0010Z\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\"¢\u0006\u0004\bZ\u0010$J\u001b\u0010[\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000%¢\u0006\u0004\b[\u0010'J\"\u0010\\\u001a\u00028\u00002\b\b\u0001\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\\\u0010]J\u0015\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016¢\u0006\u0004\b^\u0010_J\u0013\u0010a\u001a\b\u0012\u0004\u0012\u00028\u00000`¢\u0006\u0004\ba\u0010_R\u001e\u0010d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010cR\u0012\u00108\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\be\u0010f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006i"}, d2 = {"Landroidx/collection/h2;", "E", "Landroidx/collection/p2;", "", "initialCapacity", "<init>", "(I)V", "element", "", "Z", "(Ljava/lang/Object;)Z", "index", "Lkotlin/k2;", "Y", "(ILjava/lang/Object;)V", "", "elements", "c0", "(I[Ljava/lang/Object;)Z", "", "b0", "(ILjava/util/Collection;)Z", "a0", "(ILandroidx/collection/p2;)Z", "d0", "(Landroidx/collection/p2;)Z", "Landroidx/collection/y2;", "e0", "(Landroidx/collection/y2;)Z", "i0", "([Ljava/lang/Object;)Z", "", "g0", "(Ljava/util/List;)Z", "", "f0", "(Ljava/lang/Iterable;)Z", "Lkotlin/sequences/m;", "h0", "(Lkotlin/sequences/m;)Z", "u0", "(Landroidx/collection/p2;)V", "v0", "(Landroidx/collection/y2;)V", "A0", "([Ljava/lang/Object;)V", "y0", "(Ljava/util/List;)V", "w0", "(Ljava/lang/Iterable;)V", "z0", "(Lkotlin/sequences/m;)V", "k0", "()V", "minCapacity", "R0", "capacity", "l0", "x0", "(Ljava/lang/Object;)V", "q0", "B0", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "predicate", "J0", "(Lld/l;)V", "H0", "C0", "D0", "F0", "E0", "G0", "t0", "n0", "o0", "r0", "p0", "s0", "I0", "(I)Ljava/lang/Object;", "start", "end", "K0", "(II)V", "P0", "L0", "N0", "(Ljava/util/Collection;)Z", "M0", "O0", "Q0", "(ILjava/lang/Object;)Ljava/lang/Object;", "c", "()Ljava/util/List;", "", "j0", "Landroidx/collection/h2$b;", "Landroidx/collection/h2$b;", "list", "m0", "()I", "a", "b", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 ObjectList.kt\nandroidx/collection/ObjectList\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1618:1\n948#1,2:1641\n948#1,2:1652\n948#1,2:1656\n652#1:1659\n955#1,2:1662\n955#1,2:1669\n955#1,2:1691\n955#1,2:1701\n955#1,2:1704\n955#1,2:1708\n1864#2,3:1619\n1855#2:1651\n1856#2:1654\n1855#2:1703\n1856#2:1706\n267#3,4:1622\n237#3,7:1626\n248#3,3:1634\n251#3,2:1638\n272#3:1640\n273#3:1643\n254#3,6:1644\n274#3:1650\n267#3,4:1672\n237#3,7:1676\n248#3,3:1684\n251#3,2:1688\n272#3:1690\n273#3:1693\n254#3,6:1694\n274#3:1700\n1826#4:1633\n1688#4:1637\n1826#4:1683\n1688#4:1687\n1295#5:1655\n1296#5:1658\n1295#5:1707\n1296#5:1710\n80#6:1660\n305#6,4:1665\n310#6:1671\n75#6:1711\n75#6:1712\n75#6:1713\n75#6:1714\n75#6:1715\n75#6:1716\n75#6:1717\n75#6:1718\n13579#7:1661\n13580#7:1664\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n864#1:1641,2\n898#1:1652,2\n907#1:1656,2\n927#1:1659\n1050#1:1662,2\n1059#1:1669,2\n1068#1:1691,2\n1077#1:1701,2\n1086#1:1704,2\n1095#1:1708,2\n740#1:1619,3\n897#1:1651\n897#1:1654\n1085#1:1703\n1085#1:1706\n863#1:1622,4\n863#1:1626,7\n863#1:1634,3\n863#1:1638,2\n863#1:1640\n863#1:1643\n863#1:1644,6\n863#1:1650\n1067#1:1672,4\n1067#1:1676,7\n1067#1:1684,3\n1067#1:1688,2\n1067#1:1690\n1067#1:1693\n1067#1:1694,6\n1067#1:1700\n863#1:1633\n863#1:1637\n1067#1:1683\n1067#1:1687\n906#1:1655\n906#1:1658\n1094#1:1707\n1094#1:1710\n979#1:1660\n1058#1:1665,4\n1058#1:1671\n1105#1:1711\n1109#1:1712\n1159#1:1713\n1175#1:1714\n1191#1:1715\n1207#1:1716\n1223#1:1717\n1242#1:1718\n1049#1:1661\n1049#1:1664\n*E\n"})
/* loaded from: classes.dex */
public final class h2<E> extends p2<E> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private b<E> list;

    /* compiled from: ObjectList.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/collection/h2$a;", "T", "", "", "list", "", "index", "<init>", "(Ljava/util/List;I)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "Lkotlin/k2;", "remove", "()V", "hasPrevious", "nextIndex", "()I", "previous", "previousIndex", "element", "add", "(Ljava/lang/Object;)V", "set", "b", "Ljava/util/List;", "c", "I", "prevIndex", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a<T> implements ListIterator<T>, md.f {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final List<T> list;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int prevIndex;

        public a(@fg.l List<T> list, int i4) {
            kotlin.jvm.internal.l0.p(list, "list");
            this.list = list;
            this.prevIndex = i4 - 1;
        }

        @Override // java.util.ListIterator
        public void add(T element) {
            List<T> list = this.list;
            int i4 = this.prevIndex + 1;
            this.prevIndex = i4;
            list.add(i4, element);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.prevIndex < this.list.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.prevIndex >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i4 = this.prevIndex + 1;
            this.prevIndex = i4;
            return list.get(i4);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.prevIndex + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            List<T> list = this.list;
            int i4 = this.prevIndex;
            this.prevIndex = i4 - 1;
            return list.get(i4);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.prevIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.list.remove(this.prevIndex);
            this.prevIndex--;
        }

        @Override // java.util.ListIterator
        public void set(T element) {
            this.list.set(this.prevIndex, element);
        }
    }

    /* compiled from: ObjectList.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0012\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\nJ\u001f\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ%\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\u001e\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010 \u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010%J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b&\u0010\nJ\u001d\u0010'\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b'\u0010\u000eJ\u0017\u0010(\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b(\u0010\u0012J\u001d\u0010)\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b)\u0010\u000eJ \u0010*\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b*\u0010+J%\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00102¨\u00064"}, d2 = {"Landroidx/collection/h2$b;", "T", "", "Landroidx/collection/h2;", "objectList", "<init>", "(Landroidx/collection/h2;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "Lkotlin/k2;", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "c", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "b", "Landroidx/collection/h2;", "()I", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b<T> implements List<T>, md.e {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final h2<T> objectList;

        public b(@fg.l h2<T> objectList) {
            kotlin.jvm.internal.l0.p(objectList, "objectList");
            this.objectList = objectList;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            return this.objectList.Z(element);
        }

        @Override // java.util.List
        public boolean addAll(int index, @fg.l Collection<? extends T> elements) {
            kotlin.jvm.internal.l0.p(elements, "elements");
            return this.objectList.b0(index, elements);
        }

        public int b() {
            return this.objectList._size;
        }

        public T c(int index) {
            s2.d(this, index);
            return this.objectList.I0(index);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.objectList.k0();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            return this.objectList.d(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@fg.l Collection<? extends Object> elements) {
            kotlin.jvm.internal.l0.p(elements, "elements");
            return this.objectList.f(elements);
        }

        @Override // java.util.List
        public T get(int index) {
            s2.d(this, index);
            return this.objectList.y(index);
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            return this.objectList.E(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.objectList.H();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @fg.l
        public Iterator<T> iterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            return this.objectList.T(element);
        }

        @Override // java.util.List
        @fg.l
        public ListIterator<T> listIterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i4) {
            return c(i4);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@fg.l Collection<? extends Object> elements) {
            kotlin.jvm.internal.l0.p(elements, "elements");
            return this.objectList.E0(elements);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@fg.l Collection<? extends Object> elements) {
            kotlin.jvm.internal.l0.p(elements, "elements");
            return this.objectList.N0(elements);
        }

        @Override // java.util.List
        public T set(int index, T element) {
            s2.d(this, index);
            return this.objectList.Q0(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.objectList._size;
        }

        @Override // java.util.List
        @fg.l
        public List<T> subList(int fromIndex, int toIndex) {
            s2.e(this, fromIndex, toIndex);
            return new c(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return kotlin.jvm.internal.v.a(this);
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.objectList.Y(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@fg.l Collection<? extends T> elements) {
            kotlin.jvm.internal.l0.p(elements, "elements");
            return this.objectList.f0(elements);
        }

        @Override // java.util.List
        @fg.l
        public ListIterator<T> listIterator(int index) {
            return new a(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            return this.objectList.B0(element);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            kotlin.jvm.internal.l0.p(array, "array");
            return (T[]) kotlin.jvm.internal.v.b(this, array);
        }
    }

    /* compiled from: ObjectList.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0014\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\fJ\u001f\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ%\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u001f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010\u0010J\u000f\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010&J\u0017\u0010'\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b'\u0010\fJ\u001d\u0010(\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b(\u0010\u0010J\u0017\u0010)\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0013J\u001d\u0010*\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b*\u0010\u0010J \u0010+\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b+\u0010,J%\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00103R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00106\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00105¨\u00067"}, d2 = {"Landroidx/collection/h2$c;", "T", "", "list", "", "start", "end", "<init>", "(Ljava/util/List;II)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "Lkotlin/k2;", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "c", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "b", "Ljava/util/List;", "I", "d", "()I", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1618:1\n1855#2,2:1619\n1855#2,2:1621\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList$SubList\n*L\n1395#1:1619,2\n1477#1:1621,2\n*E\n"})
    private static final class c<T> implements List<T>, md.e {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final List<T> list;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int start;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int end;

        public c(@fg.l List<T> list, int i4, int i5) {
            kotlin.jvm.internal.l0.p(list, "list");
            this.list = list;
            this.start = i4;
            this.end = i5;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            List<T> list = this.list;
            int i4 = this.end;
            this.end = i4 + 1;
            list.add(i4, element);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int index, @fg.l Collection<? extends T> elements) {
            kotlin.jvm.internal.l0.p(elements, "elements");
            this.list.addAll(index + this.start, elements);
            this.end = elements.size() + this.end;
            return elements.size() > 0;
        }

        public int b() {
            return this.end - this.start;
        }

        public T c(int index) {
            s2.d(this, index);
            this.end--;
            return this.list.remove(index + this.start);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i4 = this.end - 1;
            int i5 = this.start;
            if (i5 <= i4) {
                while (true) {
                    this.list.remove(i4);
                    if (i4 == i5) {
                        break;
                    } else {
                        i4--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            int i4 = this.end;
            for (int i5 = this.start; i5 < i4; i5++) {
                if (kotlin.jvm.internal.l0.g(this.list.get(i5), element)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@fg.l Collection<? extends Object> elements) {
            kotlin.jvm.internal.l0.p(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int index) {
            s2.d(this, index);
            return this.list.get(index + this.start);
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            int i4 = this.end;
            for (int i5 = this.start; i5 < i4; i5++) {
                if (kotlin.jvm.internal.l0.g(this.list.get(i5), element)) {
                    return i5 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @fg.l
        public Iterator<T> iterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            int i4 = this.end - 1;
            int i5 = this.start;
            if (i5 > i4) {
                return -1;
            }
            while (!kotlin.jvm.internal.l0.g(this.list.get(i4), element)) {
                if (i4 == i5) {
                    return -1;
                }
                i4--;
            }
            return i4 - this.start;
        }

        @Override // java.util.List
        @fg.l
        public ListIterator<T> listIterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i4) {
            return c(i4);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@fg.l Collection<? extends Object> elements) {
            kotlin.jvm.internal.l0.p(elements, "elements");
            int i4 = this.end;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i4 != this.end;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@fg.l Collection<? extends Object> elements) {
            kotlin.jvm.internal.l0.p(elements, "elements");
            int i4 = this.end;
            int i5 = i4 - 1;
            int i6 = this.start;
            if (i6 <= i5) {
                while (true) {
                    if (!elements.contains(this.list.get(i5))) {
                        this.list.remove(i5);
                        this.end--;
                    }
                    if (i5 == i6) {
                        break;
                    }
                    i5--;
                }
            }
            return i4 != this.end;
        }

        @Override // java.util.List
        public T set(int index, T element) {
            s2.d(this, index);
            return this.list.set(index + this.start, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return b();
        }

        @Override // java.util.List
        @fg.l
        public List<T> subList(int fromIndex, int toIndex) {
            s2.e(this, fromIndex, toIndex);
            return new c(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return kotlin.jvm.internal.v.a(this);
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.list.add(index + this.start, element);
            this.end++;
        }

        @Override // java.util.List
        @fg.l
        public ListIterator<T> listIterator(int index) {
            return new a(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            int i4 = this.end;
            for (int i5 = this.start; i5 < i4; i5++) {
                if (kotlin.jvm.internal.l0.g(this.list.get(i5), element)) {
                    this.list.remove(i5);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            kotlin.jvm.internal.l0.p(array, "array");
            return (T[]) kotlin.jvm.internal.v.b(this, array);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@fg.l Collection<? extends T> elements) {
            kotlin.jvm.internal.l0.p(elements, "elements");
            this.list.addAll(this.end, elements);
            this.end = elements.size() + this.end;
            return elements.size() > 0;
        }
    }

    public h2() {
        this(0, 1, null);
    }

    public static /* synthetic */ void S0(h2 h2Var, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = h2Var._size;
        }
        h2Var.R0(i4);
    }

    public final void A0(@fg.l E[] elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        if (elements.length == 0) {
            return;
        }
        l0(this._size + elements.length);
        kotlin.collections.l.K0(elements, this.content, this._size, 0, 0, 12, null);
        this._size += elements.length;
    }

    public final boolean B0(E element) {
        int E = E(element);
        if (E < 0) {
            return false;
        }
        I0(E);
        return true;
    }

    public final boolean C0(@fg.l p2<E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        n0(elements);
        return i4 != this._size;
    }

    public final boolean D0(@fg.l y2<E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        o0(elements);
        return i4 != this._size;
    }

    public final boolean E0(@fg.l Iterable<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        p0(elements);
        return i4 != this._size;
    }

    public final boolean F0(@fg.l List<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        r0(elements);
        return i4 != this._size;
    }

    public final boolean G0(@fg.l kotlin.sequences.m<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        s0(elements);
        return i4 != this._size;
    }

    public final boolean H0(@fg.l E[] elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        for (E e4 : elements) {
            B0(e4);
        }
        return i4 != this._size;
    }

    public final E I0(@androidx.annotation.g0(from = 0) int index) {
        int i4;
        if (index < 0 || index >= (i4 = this._size)) {
            StringBuilder a5 = s.a("Index ", index, " must be in 0..");
            a5.append(this._size - 1);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        Object[] objArr = this.content;
        E e4 = (E) objArr[index];
        if (index != i4 - 1) {
            kotlin.collections.l.B0(objArr, objArr, index, index + 1, i4);
        }
        int i5 = this._size - 1;
        this._size = i5;
        objArr[i5] = null;
        return e4;
    }

    public final void J0(@fg.l ld.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        int i4 = this._size;
        Object[] objArr = this.content;
        int i5 = 0;
        kotlin.ranges.l W1 = kotlin.ranges.s.W1(0, i4);
        int first = W1.getFirst();
        int last = W1.getLast();
        if (first <= last) {
            while (true) {
                objArr[first - i5] = objArr[first];
                if (predicate.invoke(objArr[first]).booleanValue()) {
                    i5++;
                }
                if (first == last) {
                    break;
                } else {
                    first++;
                }
            }
        }
        kotlin.collections.l.M1(objArr, null, i4 - i5, i4);
        this._size -= i5;
    }

    public final void K0(@androidx.annotation.g0(from = 0) int start, @androidx.annotation.g0(from = 0) int end) {
        int i4;
        if (start < 0 || start > (i4 = this._size) || end < 0 || end > i4) {
            StringBuilder a5 = n1.a("Start (", start, ") and end (", end, ") must be in 0..");
            a5.append(this._size);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        if (end < start) {
            throw new IllegalArgumentException(m1.a("Start (", start, ") is more than end (", end, ')'));
        }
        if (end != start) {
            if (end < i4) {
                Object[] objArr = this.content;
                kotlin.collections.l.B0(objArr, objArr, start, end, i4);
            }
            int i5 = this._size;
            int i6 = i5 - (end - start);
            kotlin.collections.l.M1(this.content, null, i6, i5);
            this._size = i6;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean L0(@fg.l p2<E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        Object[] objArr = this.content;
        for (int i5 = i4 - 1; -1 < i5; i5--) {
            if (!elements.d(objArr[i5])) {
                I0(i5);
            }
        }
        return i4 != this._size;
    }

    public final boolean M0(@fg.l Iterable<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        Object[] objArr = this.content;
        for (int i5 = i4 - 1; -1 < i5; i5--) {
            if (!kotlin.collections.w.W1(elements, objArr[i5])) {
                I0(i5);
            }
        }
        return i4 != this._size;
    }

    public final boolean N0(@fg.l Collection<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        Object[] objArr = this.content;
        for (int i5 = i4 - 1; -1 < i5; i5--) {
            if (!elements.contains(objArr[i5])) {
                I0(i5);
            }
        }
        return i4 != this._size;
    }

    public final boolean O0(@fg.l kotlin.sequences.m<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        Object[] objArr = this.content;
        for (int i5 = i4 - 1; -1 < i5; i5--) {
            if (!kotlin.sequences.p.f0(elements, objArr[i5])) {
                I0(i5);
            }
        }
        return i4 != this._size;
    }

    public final boolean P0(@fg.l E[] elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        Object[] objArr = this.content;
        for (int i5 = i4 - 1; -1 < i5; i5--) {
            if (kotlin.collections.l.If(elements, objArr[i5]) < 0) {
                I0(i5);
            }
        }
        return i4 != this._size;
    }

    public final E Q0(@androidx.annotation.g0(from = 0) int index, E element) {
        if (index < 0 || index >= this._size) {
            StringBuilder a5 = s.a("set index ", index, " must be between 0 .. ");
            a5.append(this._size - 1);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        Object[] objArr = this.content;
        E e4 = (E) objArr[index];
        objArr[index] = element;
        return e4;
    }

    public final void R0(int minCapacity) {
        int max = Math.max(minCapacity, this._size);
        Object[] objArr = this.content;
        if (objArr.length > max) {
            Object[] copyOf = Arrays.copyOf(objArr, max);
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public final void Y(@androidx.annotation.g0(from = 0) int index, E element) {
        int i4;
        if (index < 0 || index > (i4 = this._size)) {
            StringBuilder a5 = s.a("Index ", index, " must be in 0..");
            a5.append(this._size);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        l0(i4 + 1);
        Object[] objArr = this.content;
        int i5 = this._size;
        if (index != i5) {
            kotlin.collections.l.B0(objArr, objArr, index + 1, index, i5);
        }
        objArr[index] = element;
        this._size++;
    }

    public final boolean Z(E element) {
        l0(this._size + 1);
        Object[] objArr = this.content;
        int i4 = this._size;
        objArr[i4] = element;
        this._size = i4 + 1;
        return true;
    }

    public final boolean a0(@androidx.annotation.g0(from = 0) int index, @fg.l p2<E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        if (index < 0 || index > this._size) {
            StringBuilder a5 = s.a("Index ", index, " must be in 0..");
            a5.append(this._size);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        if (elements.H()) {
            return false;
        }
        l0(this._size + elements._size);
        Object[] objArr = this.content;
        int i4 = this._size;
        if (index != i4) {
            kotlin.collections.l.B0(objArr, objArr, elements._size + index, index, i4);
        }
        kotlin.collections.l.B0(elements.content, objArr, index, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean b0(@androidx.annotation.g0(from = 0) int index, @fg.l Collection<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        if (index < 0 || index > this._size) {
            StringBuilder a5 = s.a("Index ", index, " must be in 0..");
            a5.append(this._size);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        int i4 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        l0(elements.size() + this._size);
        Object[] objArr = this.content;
        if (index != this._size) {
            kotlin.collections.l.B0(objArr, objArr, elements.size() + index, index, this._size);
        }
        for (Object obj : elements) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                kotlin.collections.w.Z();
            }
            objArr[i4 + index] = obj;
            i4 = i5;
        }
        this._size = elements.size() + this._size;
        return true;
    }

    @Override // androidx.collection.p2
    @fg.l
    public List<E> c() {
        return j0();
    }

    public final boolean c0(@androidx.annotation.g0(from = 0) int index, @fg.l E[] elements) {
        int i4;
        kotlin.jvm.internal.l0.p(elements, "elements");
        if (index < 0 || index > (i4 = this._size)) {
            StringBuilder a5 = s.a("Index ", index, " must be in 0..");
            a5.append(this._size);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        if (elements.length == 0) {
            return false;
        }
        l0(i4 + elements.length);
        Object[] objArr = this.content;
        int i5 = this._size;
        if (index != i5) {
            kotlin.collections.l.B0(objArr, objArr, elements.length + index, index, i5);
        }
        kotlin.collections.l.K0(elements, objArr, index, 0, 0, 12, null);
        this._size += elements.length;
        return true;
    }

    public final boolean d0(@fg.l p2<E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        u0(elements);
        return i4 != this._size;
    }

    public final boolean e0(@fg.l y2<E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        v0(elements);
        return i4 != this._size;
    }

    public final boolean f0(@fg.l Iterable<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        w0(elements);
        return i4 != this._size;
    }

    public final boolean g0(@fg.l List<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        y0(elements);
        return i4 != this._size;
    }

    public final boolean h0(@fg.l kotlin.sequences.m<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        z0(elements);
        return i4 != this._size;
    }

    public final boolean i0(@fg.l E[] elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        A0(elements);
        return i4 != this._size;
    }

    @fg.l
    public final List<E> j0() {
        b<E> bVar = this.list;
        if (bVar != null) {
            return bVar;
        }
        b<E> bVar2 = new b<>(this);
        this.list = bVar2;
        return bVar2;
    }

    public final void k0() {
        kotlin.collections.l.M1(this.content, null, 0, this._size);
        this._size = 0;
    }

    public final void l0(int capacity) {
        Object[] objArr = this.content;
        if (objArr.length < capacity) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(capacity, (objArr.length * 3) / 2));
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public final int m0() {
        return this.content.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n0(@fg.l p2<E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        Object[] objArr = elements.content;
        int i4 = elements._size;
        for (int i5 = 0; i5 < i4; i5++) {
            B0(objArr[i5]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0(@fg.l y2<E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j4 = jArr[i4];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i4 - length)) >>> 31);
                for (int i6 = 0; i6 < i5; i6++) {
                    if ((255 & j4) < 128) {
                        B0(objArr[(i4 << 3) + i6]);
                    }
                    j4 >>= 8;
                }
                if (i5 != 8) {
                    return;
                }
            }
            if (i4 == length) {
                return;
            } else {
                i4++;
            }
        }
    }

    public final void p0(@fg.l Iterable<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            B0(it.next());
        }
    }

    public final void q0(E element) {
        B0(element);
    }

    public final void r0(@fg.l List<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int size = elements.size();
        for (int i4 = 0; i4 < size; i4++) {
            B0(elements.get(i4));
        }
    }

    public final void s0(@fg.l kotlin.sequences.m<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            B0(it.next());
        }
    }

    public final void t0(@fg.l E[] elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        for (E e4 : elements) {
            B0(e4);
        }
    }

    public final void u0(@fg.l p2<E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        if (elements.H()) {
            return;
        }
        l0(this._size + elements._size);
        kotlin.collections.l.B0(elements.content, this.content, this._size, 0, elements._size);
        this._size += elements._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v0(@fg.l y2<E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        if (elements.r()) {
            return;
        }
        l0(this._size + elements._size);
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j4 = jArr[i4];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i4 - length)) >>> 31);
                for (int i6 = 0; i6 < i5; i6++) {
                    if ((255 & j4) < 128) {
                        Z(objArr[(i4 << 3) + i6]);
                    }
                    j4 >>= 8;
                }
                if (i5 != 8) {
                    return;
                }
            }
            if (i4 == length) {
                return;
            } else {
                i4++;
            }
        }
    }

    public final void w0(@fg.l Iterable<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            Z(it.next());
        }
    }

    public final void x0(E element) {
        Z(element);
    }

    public final void y0(@fg.l List<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int i4 = this._size;
        l0(elements.size() + i4);
        Object[] objArr = this.content;
        int size = elements.size();
        for (int i5 = 0; i5 < size; i5++) {
            objArr[i5 + i4] = elements.get(i5);
        }
        this._size = elements.size() + this._size;
    }

    public final void z0(@fg.l kotlin.sequences.m<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            Z(it.next());
        }
    }

    public h2(int i4) {
        super(i4, null);
    }

    public h2(int i4, int i5, kotlin.jvm.internal.w wVar) {
        super((i5 & 1) != 0 ? 16 : i4, null);
    }
}

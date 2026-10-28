package androidx.collection;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: ObjectList.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJA\u0010\u0010\u001a\u00020\u00072!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0010\u0010\u0011JA\u0010\u0012\u001a\u00020\u00072!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0012\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0003¢\u0006\u0004\b!\u0010\"JA\u0010#\u001a\u00020\u00032!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00028\u0000¢\u0006\u0004\b%\u0010&JA\u0010'\u001a\u00028\u00002!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b)\u0010&JC\u0010*\u001a\u0004\u0018\u00018\u00002!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b*\u0010(Jd\u00100\u001a\u00028\u0001\"\u0004\b\u0001\u0010+2\u0006\u0010,\u001a\u00028\u000126\u0010/\u001a2\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(.\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u00010-H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b0\u00101Jy\u00104\u001a\u00028\u0001\"\u0004\b\u0001\u0010+2\u0006\u0010,\u001a\u00028\u00012K\u0010/\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(3\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(.\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u000102H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b4\u00105Jd\u00106\u001a\u00028\u0001\"\u0004\b\u0001\u0010+2\u0006\u0010,\u001a\u00028\u000126\u0010/\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(.\u0012\u0004\u0012\u00028\u00010-H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b6\u00101Jy\u00107\u001a\u00028\u0001\"\u0004\b\u0001\u0010+2\u0006\u0010,\u001a\u00028\u00012K\u0010/\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(3\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(.\u0012\u0004\u0012\u00028\u000102H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b7\u00105JA\u0010:\u001a\u0002082!\u00109\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002080\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b:\u0010;JV\u0010<\u001a\u00020826\u00109\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(3\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002080-H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b<\u0010=JA\u0010>\u001a\u0002082!\u00109\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002080\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b>\u0010;JV\u0010?\u001a\u00020826\u00109\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(3\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002080-H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b?\u0010=J\u001a\u0010@\u001a\u00028\u00002\b\b\u0001\u00103\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00028\u00002\b\b\u0001\u00103\u001a\u00020\u0003¢\u0006\u0004\bB\u0010AJ@\u0010D\u001a\u00028\u00002\b\b\u0001\u00103\u001a\u00020\u00032!\u0010C\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(3\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u0015\u0010\u0001\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0001\u0010FJA\u0010G\u001a\u00020\u00032!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bG\u0010$JA\u0010H\u001a\u00020\u00032!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bH\u0010$J\r\u0010I\u001a\u00020\u0007¢\u0006\u0004\bI\u0010\tJ\r\u0010J\u001a\u00020\u0007¢\u0006\u0004\bJ\u0010\tJ\r\u0010+\u001a\u00028\u0000¢\u0006\u0004\b+\u0010&JA\u0010K\u001a\u00028\u00002!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bK\u0010(J\u0012\u0010L\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\bL\u0010&JC\u0010M\u001a\u0004\u0018\u00018\u00002!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bM\u0010(J\u0015\u0010N\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\bN\u0010FJY\u0010W\u001a\u00020V2\b\b\u0002\u0010P\u001a\u00020O2\b\b\u0002\u0010Q\u001a\u00020O2\b\b\u0002\u0010R\u001a\u00020O2\b\b\u0002\u0010S\u001a\u00020\u00032\b\b\u0002\u0010T\u001a\u00020O2\u0016\b\u0002\u0010U\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020O\u0018\u00010\u000bH\u0007¢\u0006\u0004\bW\u0010XJ\u0015\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H&¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u0003H\u0016¢\u0006\u0004\b[\u0010\"J\u001a\u0010]\u001a\u00020\u00072\b\u0010\\\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b]\u0010\u0014J\u000f\u0010^\u001a\u00020VH\u0016¢\u0006\u0004\b^\u0010_R$\u0010c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00158\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\n\u0010`\u0012\u0004\ba\u0010bR\u001c\u0010e\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0010\u0010J\u0012\u0004\bd\u0010bR\u0011\u0010g\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\bf\u0010\"R\u0012\u0010i\u001a\u00020\u00038Ç\u0002¢\u0006\u0006\u001a\u0004\bh\u0010\"R\u0012\u0010m\u001a\u00020j8Æ\u0002¢\u0006\u0006\u001a\u0004\bk\u0010l\u0082\u0001\u0001n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006o"}, d2 = {"Landroidx/collection/p2;", "E", "", "", "initialCapacity", "<init>", "(I)V", "", "W", "()Z", "a", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "element", "predicate", "b", "(Lld/l;)Z", "X", "d", "(Ljava/lang/Object;)Z", "", "elements", "h", "([Ljava/lang/Object;)Z", "", "g", "(Ljava/util/List;)Z", "", "f", "(Ljava/lang/Iterable;)Z", "e", "(Landroidx/collection/p2;)Z", "i", "()I", "j", "(Lld/l;)I", "m", "()Ljava/lang/Object;", "n", "(Lld/l;)Ljava/lang/Object;", "o", "p", "R", "initial", "Lkotlin/Function2;", "acc", "operation", "q", "(Ljava/lang/Object;Lld/p;)Ljava/lang/Object;", "Lkotlin/Function3;", "index", "r", "(Ljava/lang/Object;Lld/q;)Ljava/lang/Object;", "s", "t", "Lkotlin/k2;", "block", "u", "(Lld/l;)V", "v", "(Lld/p;)V", "w", "x", "y", "(I)Ljava/lang/Object;", "k", "defaultValue", "l", "(ILld/l;)Ljava/lang/Object;", "(Ljava/lang/Object;)I", "F", "G", "H", "I", "S", "U", "V", "T", "", "separator", "prefix", "postfix", "limit", "truncated", "transform", "", "P", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lld/l;)Ljava/lang/String;", "c", "()Ljava/util/List;", "hashCode", "other", "equals", "toString", "()Ljava/lang/String;", "[Ljava/lang/Object;", "z", "()V", "content", "D", "_size", "C", "size", "B", "lastIndex", "Lkotlin/ranges/l;", "A", "()Lkotlin/ranges/l;", "indices", "Landroidx/collection/h2;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1618:1\n305#1,6:1619\n331#1,6:1625\n305#1,6:1633\n305#1,6:1639\n305#1,6:1645\n305#1,6:1651\n305#1,6:1657\n318#1,6:1663\n331#1,6:1669\n345#1,6:1675\n75#1:1681\n75#1:1682\n318#1,6:1683\n318#1,6:1689\n318#1,6:1695\n345#1,6:1701\n75#1:1707\n331#1,6:1708\n75#1:1714\n331#1,6:1715\n345#1,6:1721\n345#1,6:1727\n318#1,6:1733\n305#1,6:1739\n80#1:1745\n1855#2,2:1631\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n101#1:1619,6\n115#1:1625,6\n168#1:1633,6\n186#1:1639,6\n209#1:1645,6\n227#1:1651,6\n244#1:1657,6\n260#1:1663,6\n277#1:1669,6\n293#1:1675,6\n358#1:1681\n369#1:1682\n399#1:1683,6\n405#1:1689,6\n421#1:1695,6\n435#1:1701,6\n461#1:1707\n472#1:1708,6\n483#1:1714\n492#1:1715,6\n509#1:1721,6\n515#1:1727,6\n545#1:1733,6\n576#1:1739,6\n592#1:1745\n157#1:1631,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class p2<E> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public Object[] content;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public int _size;

    /* compiled from: ObjectList.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "element", "", "a", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<E, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p2<E> f2366b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p2<E> p2Var) {
            super(1);
            this.f2366b = p2Var;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(E e4) {
            return e4 == this.f2366b ? "(this)" : String.valueOf(e4);
        }
    }

    public /* synthetic */ p2(int i4, kotlin.jvm.internal.w wVar) {
        this(i4);
    }

    @kotlin.w0
    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ String Q(p2 p2Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, ld.l lVar, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i5 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i5 & 4) == 0 ? charSequence3 : "";
        if ((i5 & 8) != 0) {
            i4 = -1;
        }
        int i6 = i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i5 & 32) != 0) {
            lVar = null;
        }
        return p2Var.P(charSequence, charSequence5, charSequence6, i6, charSequence7, lVar);
    }

    @kotlin.w0
    public static /* synthetic */ void z() {
    }

    @fg.l
    public final kotlin.ranges.l A() {
        return kotlin.ranges.s.W1(0, this._size);
    }

    @androidx.annotation.g0(from = -1)
    public final int B() {
        return this._size - 1;
    }

    @androidx.annotation.g0(from = 0)
    /* renamed from: C, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final int E(E element) {
        int i4 = 0;
        if (element == null) {
            Object[] objArr = this.content;
            int i5 = this._size;
            while (i4 < i5) {
                if (objArr[i4] == null) {
                    return i4;
                }
                i4++;
            }
            return -1;
        }
        Object[] objArr2 = this.content;
        int i6 = this._size;
        while (i4 < i6) {
            if (element.equals(objArr2[i4])) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public final int F(@fg.l ld.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        Object[] objArr = this.content;
        int i4 = this._size;
        for (int i5 = 0; i5 < i4; i5++) {
            if (predicate.invoke(objArr[i5]).booleanValue()) {
                return i5;
            }
        }
        return -1;
    }

    public final int G(@fg.l ld.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        Object[] objArr = this.content;
        int i4 = this._size;
        do {
            i4--;
            if (-1 >= i4) {
                return -1;
            }
        } while (!predicate.invoke(objArr[i4]).booleanValue());
        return i4;
    }

    public final boolean H() {
        return this._size == 0;
    }

    public final boolean I() {
        return this._size != 0;
    }

    @fg.l
    @kd.j
    public final String J() {
        return Q(this, null, null, null, 0, null, null, 63, null);
    }

    @fg.l
    @kd.j
    public final String K(@fg.l CharSequence separator) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        return Q(this, separator, null, null, 0, null, null, 62, null);
    }

    @fg.l
    @kd.j
    public final String L(@fg.l CharSequence separator, @fg.l CharSequence prefix) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        return Q(this, separator, prefix, null, 0, null, null, 60, null);
    }

    @fg.l
    @kd.j
    public final String M(@fg.l CharSequence separator, @fg.l CharSequence prefix, @fg.l CharSequence postfix) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        kotlin.jvm.internal.l0.p(postfix, "postfix");
        return Q(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    @fg.l
    @kd.j
    public final String N(@fg.l CharSequence separator, @fg.l CharSequence prefix, @fg.l CharSequence postfix, int i4) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        kotlin.jvm.internal.l0.p(postfix, "postfix");
        return Q(this, separator, prefix, postfix, i4, null, null, 48, null);
    }

    @fg.l
    @kd.j
    public final String O(@fg.l CharSequence separator, @fg.l CharSequence prefix, @fg.l CharSequence postfix, int i4, @fg.l CharSequence truncated) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        kotlin.jvm.internal.l0.p(postfix, "postfix");
        kotlin.jvm.internal.l0.p(truncated, "truncated");
        return Q(this, separator, prefix, postfix, i4, truncated, null, 32, null);
    }

    @fg.l
    @kd.j
    public final String P(@fg.l CharSequence separator, @fg.l CharSequence prefix, @fg.l CharSequence postfix, int limit, @fg.l CharSequence truncated, @fg.m ld.l<? super E, ? extends CharSequence> transform) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        StringBuilder a5 = l.a(postfix, "postfix", truncated, "truncated", prefix);
        Object[] objArr = this.content;
        int i4 = this._size;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                a5.append(postfix);
                break;
            }
            Object obj = objArr[i5];
            if (i5 == limit) {
                a5.append(truncated);
                break;
            }
            if (i5 != 0) {
                a5.append(separator);
            }
            if (transform == null) {
                a5.append(obj);
            } else {
                a5.append(transform.invoke(obj));
            }
            i5++;
        }
        String sb = a5.toString();
        kotlin.jvm.internal.l0.o(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }

    public final E R() {
        if (H()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[this._size - 1];
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [E, java.lang.Object] */
    public final E S(@fg.l ld.l<? super E, Boolean> predicate) {
        ?? r22;
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        Object[] objArr = this.content;
        int i4 = this._size;
        do {
            i4--;
            if (-1 >= i4) {
                throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
            }
            r22 = (Object) objArr[i4];
        } while (!predicate.invoke(r22).booleanValue());
        return r22;
    }

    public final int T(E element) {
        if (element == null) {
            Object[] objArr = this.content;
            for (int i4 = this._size - 1; -1 < i4; i4--) {
                if (objArr[i4] == null) {
                    return i4;
                }
            }
        } else {
            Object[] objArr2 = this.content;
            for (int i5 = this._size - 1; -1 < i5; i5--) {
                if (element.equals(objArr2[i5])) {
                    return i5;
                }
            }
        }
        return -1;
    }

    @fg.m
    public final E U() {
        if (H()) {
            return null;
        }
        return (E) this.content[this._size - 1];
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [E, java.lang.Object] */
    @fg.m
    public final E V(@fg.l ld.l<? super E, Boolean> predicate) {
        ?? r22;
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        Object[] objArr = this.content;
        int i4 = this._size;
        do {
            i4--;
            if (-1 >= i4) {
                return null;
            }
            r22 = (Object) objArr[i4];
        } while (!predicate.invoke(r22).booleanValue());
        return r22;
    }

    public final boolean W() {
        return H();
    }

    public final boolean X(@fg.l ld.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        Object[] objArr = this.content;
        for (int i4 = this._size - 1; -1 < i4; i4--) {
            if (predicate.invoke(objArr[i4]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        return I();
    }

    public final boolean b(@fg.l ld.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        Object[] objArr = this.content;
        int i4 = this._size;
        for (int i5 = 0; i5 < i4; i5++) {
            if (predicate.invoke(objArr[i5]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @fg.l
    public abstract List<E> c();

    public final boolean d(E element) {
        return E(element) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e(@fg.l p2<E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        Object[] objArr = elements.content;
        int i4 = elements._size;
        for (int i5 = 0; i5 < i4; i5++) {
            if (!d(objArr[i5])) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof p2) {
            p2 p2Var = (p2) other;
            int i4 = p2Var._size;
            int i5 = this._size;
            if (i4 == i5) {
                Object[] objArr = this.content;
                Object[] objArr2 = p2Var.content;
                kotlin.ranges.l W1 = kotlin.ranges.s.W1(0, i5);
                int first = W1.getFirst();
                int last = W1.getLast();
                if (first > last) {
                    return true;
                }
                while (kotlin.jvm.internal.l0.g(objArr[first], objArr2[first])) {
                    if (first == last) {
                        return true;
                    }
                    first++;
                }
                return false;
            }
        }
        return false;
    }

    public final boolean f(@fg.l Iterable<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!d(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean g(@fg.l List<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int size = elements.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!d(elements.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public final boolean h(@fg.l E[] elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        for (E e4 : elements) {
            if (!d(e4)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = this.content;
        int i4 = this._size;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = objArr[i6];
            i5 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i5;
    }

    public final int i() {
        return this._size;
    }

    public final int j(@fg.l ld.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        Object[] objArr = this.content;
        int i4 = this._size;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            if (predicate.invoke(objArr[i6]).booleanValue()) {
                i5++;
            }
        }
        return i5;
    }

    public final E k(@androidx.annotation.g0(from = 0) int index) {
        if (index >= 0 && index < this._size) {
            return (E) this.content[index];
        }
        StringBuilder a5 = s.a("Index ", index, " must be in 0..");
        a5.append(this._size - 1);
        throw new IndexOutOfBoundsException(a5.toString());
    }

    public final E l(@androidx.annotation.g0(from = 0) int index, @fg.l ld.l<? super Integer, ? extends E> defaultValue) {
        kotlin.jvm.internal.l0.p(defaultValue, "defaultValue");
        return (index < 0 || index >= this._size) ? defaultValue.invoke(Integer.valueOf(index)) : (E) this.content[index];
    }

    public final E m() {
        if (H()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[0];
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [E, java.lang.Object] */
    public final E n(@fg.l ld.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        Object[] objArr = this.content;
        int i4 = this._size;
        for (int i5 = 0; i5 < i4; i5++) {
            ?? r32 = (Object) objArr[i5];
            if (predicate.invoke(r32).booleanValue()) {
                return r32;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    @fg.m
    public final E o() {
        if (H()) {
            return null;
        }
        return y(0);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [E, java.lang.Object] */
    @fg.m
    public final E p(@fg.l ld.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        Object[] objArr = this.content;
        int i4 = this._size;
        for (int i5 = 0; i5 < i4; i5++) {
            ?? r32 = (Object) objArr[i5];
            if (predicate.invoke(r32).booleanValue()) {
                return r32;
            }
        }
        return null;
    }

    public final <R> R q(R initial, @fg.l ld.p<? super R, ? super E, ? extends R> operation) {
        kotlin.jvm.internal.l0.p(operation, "operation");
        Object[] objArr = this.content;
        int i4 = this._size;
        for (int i5 = 0; i5 < i4; i5++) {
            initial = operation.invoke(initial, objArr[i5]);
        }
        return initial;
    }

    public final <R> R r(R initial, @fg.l ld.q<? super Integer, ? super R, ? super E, ? extends R> operation) {
        kotlin.jvm.internal.l0.p(operation, "operation");
        Object[] objArr = this.content;
        int i4 = this._size;
        for (int i5 = 0; i5 < i4; i5++) {
            initial = operation.R(Integer.valueOf(i5), initial, objArr[i5]);
        }
        return initial;
    }

    public final <R> R s(R initial, @fg.l ld.p<? super E, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.l0.p(operation, "operation");
        Object[] objArr = this.content;
        int i4 = this._size;
        while (true) {
            i4--;
            if (-1 >= i4) {
                return initial;
            }
            initial = operation.invoke(objArr[i4], initial);
        }
    }

    public final <R> R t(R initial, @fg.l ld.q<? super Integer, ? super E, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.l0.p(operation, "operation");
        Object[] objArr = this.content;
        int i4 = this._size;
        while (true) {
            i4--;
            if (-1 >= i4) {
                return initial;
            }
            initial = operation.R(Integer.valueOf(i4), objArr[i4], initial);
        }
    }

    @fg.l
    public String toString() {
        return Q(this, null, "[", "]", 0, null, new a(this), 25, null);
    }

    public final void u(@fg.l ld.l<? super E, kotlin.k2> block) {
        kotlin.jvm.internal.l0.p(block, "block");
        Object[] objArr = this.content;
        int i4 = this._size;
        for (int i5 = 0; i5 < i4; i5++) {
            block.invoke(objArr[i5]);
        }
    }

    public final void v(@fg.l ld.p<? super Integer, ? super E, kotlin.k2> block) {
        kotlin.jvm.internal.l0.p(block, "block");
        Object[] objArr = this.content;
        int i4 = this._size;
        for (int i5 = 0; i5 < i4; i5++) {
            block.invoke(Integer.valueOf(i5), objArr[i5]);
        }
    }

    public final void w(@fg.l ld.l<? super E, kotlin.k2> block) {
        kotlin.jvm.internal.l0.p(block, "block");
        Object[] objArr = this.content;
        int i4 = this._size;
        while (true) {
            i4--;
            if (-1 >= i4) {
                return;
            } else {
                block.invoke(objArr[i4]);
            }
        }
    }

    public final void x(@fg.l ld.p<? super Integer, ? super E, kotlin.k2> block) {
        kotlin.jvm.internal.l0.p(block, "block");
        Object[] objArr = this.content;
        int i4 = this._size;
        while (true) {
            i4--;
            if (-1 >= i4) {
                return;
            } else {
                block.invoke(Integer.valueOf(i4), objArr[i4]);
            }
        }
    }

    public final E y(@androidx.annotation.g0(from = 0) int index) {
        if (index >= 0 && index < this._size) {
            return (E) this.content[index];
        }
        StringBuilder a5 = s.a("Index ", index, " must be in 0..");
        a5.append(this._size - 1);
        throw new IndexOutOfBoundsException(a5.toString());
    }

    private p2(int i4) {
        this.content = i4 == 0 ? s2.f2382a : new Object[i4];
    }
}

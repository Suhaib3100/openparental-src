package kotlin.collections.unsigned;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kd.i;
import kotlin.Metadata;
import kotlin.a2;
import kotlin.b2;
import kotlin.c1;
import kotlin.collections.l;
import kotlin.collections.u0;
import kotlin.g2;
import kotlin.h2;
import kotlin.jvm.internal.l0;
import kotlin.k;
import kotlin.n2;
import kotlin.p0;
import kotlin.s1;
import kotlin.t;
import kotlin.t1;
import kotlin.w1;
import kotlin.x0;
import kotlin.x1;

/* compiled from: _UArraysJvm.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u001b\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\f\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\u0010\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012*\u00020\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012*\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012*\u00020\nH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012*\u00020\u000eH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a/\u0010\u001e\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a/\u0010 \u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u0001H\u0007¢\u0006\u0004\b \u0010!\u001a/\u0010\"\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\"\u0010#\u001a/\u0010$\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u0001H\u0007¢\u0006\u0004\b$\u0010%\u001a\u0015\u0010&\u001a\u0004\u0018\u00010\u0003*\u00020\u0000H\u0007¢\u0006\u0004\b&\u0010'\u001a\u0015\u0010(\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0007¢\u0006\u0004\b(\u0010)\u001a\u0015\u0010*\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0007¢\u0006\u0004\b*\u0010+\u001a\u0015\u0010,\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0007¢\u0006\u0004\b,\u0010-\u001a=\u00102\u001a\u0004\u0018\u00010\u0003\"\u000e\b\u0000\u0010/*\b\u0012\u0004\u0012\u00028\u00000.*\u00020\u00002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u000000H\u0087\bø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a=\u00104\u001a\u0004\u0018\u00010\u0007\"\u000e\b\u0000\u0010/*\b\u0012\u0004\u0012\u00028\u00000.*\u00020\u00062\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u000000H\u0087\bø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a=\u00106\u001a\u0004\u0018\u00010\u000b\"\u000e\b\u0000\u0010/*\b\u0012\u0004\u0012\u00028\u00000.*\u00020\n2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u000000H\u0087\bø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a=\u00108\u001a\u0004\u0018\u00010\u000f\"\u000e\b\u0000\u0010/*\b\u0012\u0004\u0012\u00028\u00000.*\u00020\u000e2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u000000H\u0087\bø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a1\u0010=\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u001a\u0010<\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00030:j\n\u0012\u0006\b\u0000\u0012\u00020\u0003`;H\u0007¢\u0006\u0004\b=\u0010>\u001a1\u0010?\u001a\u0004\u0018\u00010\u0007*\u00020\u00062\u001a\u0010<\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00070:j\n\u0012\u0006\b\u0000\u0012\u00020\u0007`;H\u0007¢\u0006\u0004\b?\u0010@\u001a1\u0010A\u001a\u0004\u0018\u00010\u000b*\u00020\n2\u001a\u0010<\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000b0:j\n\u0012\u0006\b\u0000\u0012\u00020\u000b`;H\u0007¢\u0006\u0004\bA\u0010B\u001a1\u0010C\u001a\u0004\u0018\u00010\u000f*\u00020\u000e2\u001a\u0010<\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000f0:j\n\u0012\u0006\b\u0000\u0012\u00020\u000f`;H\u0007¢\u0006\u0004\bC\u0010D\u001a\u0015\u0010E\u001a\u0004\u0018\u00010\u0003*\u00020\u0000H\u0007¢\u0006\u0004\bE\u0010'\u001a\u0015\u0010F\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0007¢\u0006\u0004\bF\u0010)\u001a\u0015\u0010G\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0007¢\u0006\u0004\bG\u0010+\u001a\u0015\u0010H\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0007¢\u0006\u0004\bH\u0010-\u001a=\u0010I\u001a\u0004\u0018\u00010\u0003\"\u000e\b\u0000\u0010/*\b\u0012\u0004\u0012\u00028\u00000.*\u00020\u00002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u000000H\u0087\bø\u0001\u0000¢\u0006\u0004\bI\u00103\u001a=\u0010J\u001a\u0004\u0018\u00010\u0007\"\u000e\b\u0000\u0010/*\b\u0012\u0004\u0012\u00028\u00000.*\u00020\u00062\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u000000H\u0087\bø\u0001\u0000¢\u0006\u0004\bJ\u00105\u001a=\u0010K\u001a\u0004\u0018\u00010\u000b\"\u000e\b\u0000\u0010/*\b\u0012\u0004\u0012\u00028\u00000.*\u00020\n2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u000000H\u0087\bø\u0001\u0000¢\u0006\u0004\bK\u00107\u001a=\u0010L\u001a\u0004\u0018\u00010\u000f\"\u000e\b\u0000\u0010/*\b\u0012\u0004\u0012\u00028\u00000.*\u00020\u000e2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u000000H\u0087\bø\u0001\u0000¢\u0006\u0004\bL\u00109\u001a1\u0010M\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u001a\u0010<\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00030:j\n\u0012\u0006\b\u0000\u0012\u00020\u0003`;H\u0007¢\u0006\u0004\bM\u0010>\u001a1\u0010N\u001a\u0004\u0018\u00010\u0007*\u00020\u00062\u001a\u0010<\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00070:j\n\u0012\u0006\b\u0000\u0012\u00020\u0007`;H\u0007¢\u0006\u0004\bN\u0010@\u001a1\u0010O\u001a\u0004\u0018\u00010\u000b*\u00020\n2\u001a\u0010<\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000b0:j\n\u0012\u0006\b\u0000\u0012\u00020\u000b`;H\u0007¢\u0006\u0004\bO\u0010B\u001a1\u0010P\u001a\u0004\u0018\u00010\u000f*\u00020\u000e2\u001a\u0010<\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000f0:j\n\u0012\u0006\b\u0000\u0012\u00020\u000f`;H\u0007¢\u0006\u0004\bP\u0010D\u001a+\u0010R\u001a\u00020Q*\u00020\u00002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020Q00H\u0087\bø\u0001\u0000¢\u0006\u0004\bR\u0010S\u001a+\u0010T\u001a\u00020Q*\u00020\u00062\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020Q00H\u0087\bø\u0001\u0000¢\u0006\u0004\bT\u0010U\u001a+\u0010V\u001a\u00020Q*\u00020\n2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020Q00H\u0087\bø\u0001\u0000¢\u0006\u0004\bV\u0010W\u001a+\u0010/\u001a\u00020Q*\u00020\u000e2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020Q00H\u0087\bø\u0001\u0000¢\u0006\u0004\b/\u0010X\u001a+\u0010Z\u001a\u00020Y*\u00020\u00002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020Y00H\u0087\bø\u0001\u0000¢\u0006\u0004\bZ\u0010[\u001a+\u0010\\\u001a\u00020Y*\u00020\u00062\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020Y00H\u0087\bø\u0001\u0000¢\u0006\u0004\b\\\u0010]\u001a+\u0010^\u001a\u00020Y*\u00020\n2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020Y00H\u0087\bø\u0001\u0000¢\u0006\u0004\b^\u0010_\u001a+\u0010`\u001a\u00020Y*\u00020\u000e2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020Y00H\u0087\bø\u0001\u0000¢\u0006\u0004\b`\u0010a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006b"}, d2 = {"Lkotlin/x1;", "", "index", "Lkotlin/w1;", "o", "([II)I", "Lkotlin/b2;", "Lkotlin/a2;", "p", "([JI)J", "Lkotlin/t1;", "Lkotlin/s1;", "m", "([BI)B", "Lkotlin/h2;", "Lkotlin/g2;", "n", "([SI)S", "", "a", "([I)Ljava/util/List;", "c", "([J)Ljava/util/List;", "b", "([B)Ljava/util/List;", "d", "([S)Ljava/util/List;", "element", "fromIndex", "toIndex", "e", "([IIII)I", "i", "([JJII)I", "k", "([BBII)I", "g", "([SSII)I", "q", "([I)Lkotlin/w1;", "s", "([J)Lkotlin/a2;", "r", "([B)Lkotlin/s1;", "t", "([S)Lkotlin/g2;", "", "R", "Lkotlin/Function1;", "selector", "w", "([ILld/l;)Lkotlin/w1;", "v", "([JLld/l;)Lkotlin/a2;", "u", "([BLld/l;)Lkotlin/s1;", "x", "([SLld/l;)Lkotlin/g2;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "z", "([ILjava/util/Comparator;)Lkotlin/w1;", "B", "([JLjava/util/Comparator;)Lkotlin/a2;", "y", "([BLjava/util/Comparator;)Lkotlin/s1;", "A", "([SLjava/util/Comparator;)Lkotlin/g2;", "C", "E", "D", "F", "I", "H", "G", "J", "L", "N", "K", "M", "Ljava/math/BigDecimal;", "P", "([ILld/l;)Ljava/math/BigDecimal;", "Q", "([JLld/l;)Ljava/math/BigDecimal;", "O", "([BLld/l;)Ljava/math/BigDecimal;", "([SLld/l;)Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "T", "([ILld/l;)Ljava/math/BigInteger;", "U", "([JLld/l;)Ljava/math/BigInteger;", "S", "([BLld/l;)Ljava/math/BigInteger;", "V", "([SLld/l;)Ljava/math/BigInteger;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/unsigned/UArraysKt")
/* loaded from: classes7.dex */
class f {

    /* compiled from: _UArraysJvm.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0014"}, d2 = {"kotlin/collections/unsigned/f$a", "Lkotlin/collections/c;", "Lkotlin/w1;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "isEmpty", "()Z", "element", "c", "(I)Z", "", "index", "f", "(I)I", "h", "i", "b", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.collections.c<w1> implements RandomAccess {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int[] f74998d;

        a(int[] iArr) {
            this.f74998d = iArr;
        }

        @Override // kotlin.collections.c, kotlin.collections.a
        /* renamed from: b */
        public int getSize() {
            return this.f74998d.length;
        }

        public boolean c(int element) {
            return l.q8(this.f74998d, element);
        }

        @Override // kotlin.collections.a, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (!(obj instanceof w1)) {
                return false;
            }
            return l.q8(this.f74998d, ((w1) obj).getData());
        }

        public int f(int index) {
            return w1.h(this.f74998d[index]);
        }

        @Override // kotlin.collections.c, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i4) {
            return w1.b(f(i4));
        }

        public int h(int element) {
            return l.Gf(this.f74998d, element);
        }

        public int i(int element) {
            return l.Kh(this.f74998d, element);
        }

        @Override // kotlin.collections.c, java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof w1)) {
                return -1;
            }
            return l.Gf(this.f74998d, ((w1) obj).getData());
        }

        @Override // kotlin.collections.a, java.util.Collection
        public boolean isEmpty() {
            return x1.x(this.f74998d);
        }

        @Override // kotlin.collections.c, java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof w1)) {
                return -1;
            }
            return l.Kh(this.f74998d, ((w1) obj).getData());
        }
    }

    /* compiled from: _UArraysJvm.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0015"}, d2 = {"kotlin/collections/unsigned/f$b", "Lkotlin/collections/c;", "Lkotlin/a2;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "isEmpty", "()Z", "element", "c", "(J)Z", "", "index", "f", "(I)J", "h", "(J)I", "i", "b", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.collections.c<a2> implements RandomAccess {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long[] f74999d;

        b(long[] jArr) {
            this.f74999d = jArr;
        }

        @Override // kotlin.collections.c, kotlin.collections.a
        /* renamed from: b */
        public int getSize() {
            return this.f74999d.length;
        }

        public boolean c(long element) {
            return l.r8(this.f74999d, element);
        }

        @Override // kotlin.collections.a, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (!(obj instanceof a2)) {
                return false;
            }
            return l.r8(this.f74999d, ((a2) obj).getData());
        }

        public long f(int index) {
            return a2.h(this.f74999d[index]);
        }

        @Override // kotlin.collections.c, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i4) {
            return a2.b(f(i4));
        }

        public int h(long element) {
            return l.Hf(this.f74999d, element);
        }

        public int i(long element) {
            return l.Lh(this.f74999d, element);
        }

        @Override // kotlin.collections.c, java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof a2)) {
                return -1;
            }
            return l.Hf(this.f74999d, ((a2) obj).getData());
        }

        @Override // kotlin.collections.a, java.util.Collection
        public boolean isEmpty() {
            return b2.x(this.f74999d);
        }

        @Override // kotlin.collections.c, java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof a2)) {
                return -1;
            }
            return l.Lh(this.f74999d, ((a2) obj).getData());
        }
    }

    /* compiled from: _UArraysJvm.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0015"}, d2 = {"kotlin/collections/unsigned/f$c", "Lkotlin/collections/c;", "Lkotlin/s1;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "isEmpty", "()Z", "element", "c", "(B)Z", "", "index", "f", "(I)B", "h", "(B)I", "i", "b", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.collections.c<s1> implements RandomAccess {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ byte[] f75000d;

        c(byte[] bArr) {
            this.f75000d = bArr;
        }

        @Override // kotlin.collections.c, kotlin.collections.a
        /* renamed from: b */
        public int getSize() {
            return this.f75000d.length;
        }

        public boolean c(byte element) {
            return l.m8(this.f75000d, element);
        }

        @Override // kotlin.collections.a, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (!(obj instanceof s1)) {
                return false;
            }
            return l.m8(this.f75000d, ((s1) obj).getData());
        }

        public byte f(int index) {
            return s1.h(this.f75000d[index]);
        }

        @Override // kotlin.collections.c, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i4) {
            return s1.b(f(i4));
        }

        public int h(byte element) {
            return l.Cf(this.f75000d, element);
        }

        public int i(byte element) {
            return l.Gh(this.f75000d, element);
        }

        @Override // kotlin.collections.c, java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof s1)) {
                return -1;
            }
            return l.Cf(this.f75000d, ((s1) obj).getData());
        }

        @Override // kotlin.collections.a, java.util.Collection
        public boolean isEmpty() {
            return t1.x(this.f75000d);
        }

        @Override // kotlin.collections.c, java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof s1)) {
                return -1;
            }
            return l.Gh(this.f75000d, ((s1) obj).getData());
        }
    }

    /* compiled from: _UArraysJvm.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0015"}, d2 = {"kotlin/collections/unsigned/f$d", "Lkotlin/collections/c;", "Lkotlin/g2;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "isEmpty", "()Z", "element", "c", "(S)Z", "", "index", "f", "(I)S", "h", "(S)I", "i", "b", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends kotlin.collections.c<g2> implements RandomAccess {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ short[] f75001d;

        d(short[] sArr) {
            this.f75001d = sArr;
        }

        @Override // kotlin.collections.c, kotlin.collections.a
        /* renamed from: b */
        public int getSize() {
            return this.f75001d.length;
        }

        public boolean c(short element) {
            return l.t8(this.f75001d, element);
        }

        @Override // kotlin.collections.a, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (!(obj instanceof g2)) {
                return false;
            }
            return l.t8(this.f75001d, ((g2) obj).getData());
        }

        public short f(int index) {
            return g2.h(this.f75001d[index]);
        }

        @Override // kotlin.collections.c, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i4) {
            return g2.b(f(i4));
        }

        public int h(short element) {
            return l.Jf(this.f75001d, element);
        }

        public int i(short element) {
            return l.Nh(this.f75001d, element);
        }

        @Override // kotlin.collections.c, java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof g2)) {
                return -1;
            }
            return l.Jf(this.f75001d, ((g2) obj).getData());
        }

        @Override // kotlin.collections.a, java.util.Collection
        public boolean isEmpty() {
            return h2.x(this.f75001d);
        }

        @Override // kotlin.collections.c, java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof g2)) {
                return -1;
            }
            return l.Nh(this.f75001d, ((g2) obj).getData());
        }
    }

    @k(message = "Use maxWithOrNull instead.", replaceWith = @x0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @c1(version = "1.3")
    public static final /* synthetic */ g2 A(short[] sArr, Comparator comparator) {
        l0.p(sArr, ProtectedSandApp.s("战\u0001"));
        l0.p(comparator, ProtectedSandApp.s("戙\u0001"));
        return g.A6(sArr, comparator);
    }

    @k(message = "Use maxWithOrNull instead.", replaceWith = @x0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @c1(version = "1.3")
    public static final /* synthetic */ a2 B(long[] jArr, Comparator comparator) {
        l0.p(jArr, ProtectedSandApp.s("战\u0001"));
        l0.p(comparator, ProtectedSandApp.s("戙\u0001"));
        return g.B6(jArr, comparator);
    }

    @k(message = "Use minOrNull instead.", replaceWith = @x0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @c1(version = "1.3")
    public static final /* synthetic */ w1 C(int[] iArr) {
        l0.p(iArr, ProtectedSandApp.s("戚\u0001"));
        return g.u7(iArr);
    }

    @k(message = "Use minOrNull instead.", replaceWith = @x0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @c1(version = "1.3")
    public static final /* synthetic */ s1 D(byte[] bArr) {
        l0.p(bArr, ProtectedSandApp.s("戚\u0001"));
        return g.v7(bArr);
    }

    @k(message = "Use minOrNull instead.", replaceWith = @x0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @c1(version = "1.3")
    public static final /* synthetic */ a2 E(long[] jArr) {
        l0.p(jArr, ProtectedSandApp.s("戚\u0001"));
        return g.w7(jArr);
    }

    @k(message = "Use minOrNull instead.", replaceWith = @x0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @c1(version = "1.3")
    public static final /* synthetic */ g2 F(short[] sArr) {
        l0.p(sArr, ProtectedSandApp.s("戚\u0001"));
        return g.x7(sArr);
    }

    @k(message = "Use minByOrNull instead.", replaceWith = @x0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> s1 G(byte[] bArr, ld.l<? super s1, ? extends R> lVar) {
        l0.p(bArr, ProtectedSandApp.s("戛\u0001"));
        l0.p(lVar, ProtectedSandApp.s("戜\u0001"));
        if (t1.x(bArr)) {
            return null;
        }
        byte h4 = s1.h(bArr[0]);
        int qe2 = l.qe(bArr);
        if (qe2 != 0) {
            R invoke = lVar.invoke(s1.b(h4));
            u0 a5 = androidx.compose.animation.g.a(1, qe2, 1);
            while (a5.hasNext()) {
                byte h5 = s1.h(bArr[a5.c()]);
                R invoke2 = lVar.invoke(s1.b(h5));
                if (invoke.compareTo(invoke2) > 0) {
                    h4 = h5;
                    invoke = invoke2;
                }
            }
        }
        return s1.b(h4);
    }

    @k(message = "Use minByOrNull instead.", replaceWith = @x0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> a2 H(long[] jArr, ld.l<? super a2, ? extends R> lVar) {
        l0.p(jArr, ProtectedSandApp.s("戛\u0001"));
        l0.p(lVar, ProtectedSandApp.s("戜\u0001"));
        if (b2.x(jArr)) {
            return null;
        }
        long h4 = a2.h(jArr[0]);
        int ve2 = l.ve(jArr);
        if (ve2 != 0) {
            R invoke = lVar.invoke(a2.b(h4));
            u0 a5 = androidx.compose.animation.g.a(1, ve2, 1);
            while (a5.hasNext()) {
                long h5 = a2.h(jArr[a5.c()]);
                R invoke2 = lVar.invoke(a2.b(h5));
                if (invoke.compareTo(invoke2) > 0) {
                    h4 = h5;
                    invoke = invoke2;
                }
            }
        }
        return a2.b(h4);
    }

    @k(message = "Use minByOrNull instead.", replaceWith = @x0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> w1 I(int[] iArr, ld.l<? super w1, ? extends R> lVar) {
        l0.p(iArr, ProtectedSandApp.s("戛\u0001"));
        l0.p(lVar, ProtectedSandApp.s("戜\u0001"));
        if (x1.x(iArr)) {
            return null;
        }
        int h4 = w1.h(iArr[0]);
        int ue2 = l.ue(iArr);
        if (ue2 != 0) {
            R invoke = lVar.invoke(w1.b(h4));
            u0 a5 = androidx.compose.animation.g.a(1, ue2, 1);
            while (a5.hasNext()) {
                int h5 = w1.h(iArr[a5.c()]);
                R invoke2 = lVar.invoke(w1.b(h5));
                if (invoke.compareTo(invoke2) > 0) {
                    h4 = h5;
                    invoke = invoke2;
                }
            }
        }
        return w1.b(h4);
    }

    @k(message = "Use minByOrNull instead.", replaceWith = @x0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> g2 J(short[] sArr, ld.l<? super g2, ? extends R> lVar) {
        l0.p(sArr, ProtectedSandApp.s("戛\u0001"));
        l0.p(lVar, ProtectedSandApp.s("戜\u0001"));
        if (h2.x(sArr)) {
            return null;
        }
        short h4 = g2.h(sArr[0]);
        int xe2 = l.xe(sArr);
        if (xe2 != 0) {
            R invoke = lVar.invoke(g2.b(h4));
            u0 a5 = androidx.compose.animation.g.a(1, xe2, 1);
            while (a5.hasNext()) {
                short h5 = g2.h(sArr[a5.c()]);
                R invoke2 = lVar.invoke(g2.b(h5));
                if (invoke.compareTo(invoke2) > 0) {
                    h4 = h5;
                    invoke = invoke2;
                }
            }
        }
        return g2.b(h4);
    }

    @k(message = "Use minWithOrNull instead.", replaceWith = @x0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @c1(version = "1.3")
    public static final /* synthetic */ s1 K(byte[] bArr, Comparator comparator) {
        l0.p(bArr, ProtectedSandApp.s("戝\u0001"));
        l0.p(comparator, ProtectedSandApp.s("戙\u0001"));
        return g.C7(bArr, comparator);
    }

    @k(message = "Use minWithOrNull instead.", replaceWith = @x0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @c1(version = "1.3")
    public static final /* synthetic */ w1 L(int[] iArr, Comparator comparator) {
        l0.p(iArr, ProtectedSandApp.s("戝\u0001"));
        l0.p(comparator, ProtectedSandApp.s("戙\u0001"));
        return g.D7(iArr, comparator);
    }

    @k(message = "Use minWithOrNull instead.", replaceWith = @x0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @c1(version = "1.3")
    public static final /* synthetic */ g2 M(short[] sArr, Comparator comparator) {
        l0.p(sArr, ProtectedSandApp.s("戝\u0001"));
        l0.p(comparator, ProtectedSandApp.s("戙\u0001"));
        return g.E7(sArr, comparator);
    }

    @k(message = "Use minWithOrNull instead.", replaceWith = @x0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @c1(version = "1.3")
    public static final /* synthetic */ a2 N(long[] jArr, Comparator comparator) {
        l0.p(jArr, ProtectedSandApp.s("戝\u0001"));
        l0.p(comparator, ProtectedSandApp.s("戙\u0001"));
        return g.F7(jArr, comparator);
    }

    @t
    @c1(version = "1.4")
    @i(name = "sumOfBigDecimal")
    @kotlin.internal.f
    @p0
    private static final BigDecimal O(byte[] bArr, ld.l<? super s1, ? extends BigDecimal> lVar) {
        l0.p(bArr, ProtectedSandApp.s("戞\u0001"));
        l0.p(lVar, ProtectedSandApp.s("戜\u0001"));
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        l0.o(valueOf, ProtectedSandApp.s("戟\u0001"));
        for (byte b5 : bArr) {
            valueOf = valueOf.add((BigDecimal) e.a(b5, lVar));
            l0.o(valueOf, ProtectedSandApp.s("戠\u0001"));
        }
        return valueOf;
    }

    @t
    @c1(version = "1.4")
    @i(name = "sumOfBigDecimal")
    @kotlin.internal.f
    @p0
    private static final BigDecimal P(int[] iArr, ld.l<? super w1, ? extends BigDecimal> lVar) {
        l0.p(iArr, ProtectedSandApp.s("戞\u0001"));
        l0.p(lVar, ProtectedSandApp.s("戜\u0001"));
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        l0.o(valueOf, ProtectedSandApp.s("戟\u0001"));
        for (int i4 : iArr) {
            valueOf = valueOf.add((BigDecimal) kotlin.collections.unsigned.d.a(i4, lVar));
            l0.o(valueOf, ProtectedSandApp.s("戠\u0001"));
        }
        return valueOf;
    }

    @t
    @c1(version = "1.4")
    @i(name = "sumOfBigDecimal")
    @kotlin.internal.f
    @p0
    private static final BigDecimal Q(long[] jArr, ld.l<? super a2, ? extends BigDecimal> lVar) {
        l0.p(jArr, ProtectedSandApp.s("戞\u0001"));
        l0.p(lVar, ProtectedSandApp.s("戜\u0001"));
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        l0.o(valueOf, ProtectedSandApp.s("戟\u0001"));
        for (long j4 : jArr) {
            valueOf = valueOf.add((BigDecimal) kotlin.collections.unsigned.b.a(j4, lVar));
            l0.o(valueOf, ProtectedSandApp.s("戠\u0001"));
        }
        return valueOf;
    }

    @t
    @c1(version = "1.4")
    @i(name = "sumOfBigDecimal")
    @kotlin.internal.f
    @p0
    private static final BigDecimal R(short[] sArr, ld.l<? super g2, ? extends BigDecimal> lVar) {
        l0.p(sArr, ProtectedSandApp.s("戞\u0001"));
        l0.p(lVar, ProtectedSandApp.s("戜\u0001"));
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        l0.o(valueOf, ProtectedSandApp.s("戟\u0001"));
        for (short s4 : sArr) {
            valueOf = valueOf.add((BigDecimal) kotlin.collections.unsigned.c.a(s4, lVar));
            l0.o(valueOf, ProtectedSandApp.s("戠\u0001"));
        }
        return valueOf;
    }

    @t
    @c1(version = "1.4")
    @i(name = "sumOfBigInteger")
    @kotlin.internal.f
    @p0
    private static final BigInteger S(byte[] bArr, ld.l<? super s1, ? extends BigInteger> lVar) {
        l0.p(bArr, ProtectedSandApp.s("戞\u0001"));
        l0.p(lVar, ProtectedSandApp.s("戜\u0001"));
        BigInteger valueOf = BigInteger.valueOf(0L);
        l0.o(valueOf, ProtectedSandApp.s("戟\u0001"));
        for (byte b5 : bArr) {
            valueOf = valueOf.add((BigInteger) e.a(b5, lVar));
            l0.o(valueOf, ProtectedSandApp.s("戠\u0001"));
        }
        return valueOf;
    }

    @t
    @c1(version = "1.4")
    @i(name = "sumOfBigInteger")
    @kotlin.internal.f
    @p0
    private static final BigInteger T(int[] iArr, ld.l<? super w1, ? extends BigInteger> lVar) {
        l0.p(iArr, ProtectedSandApp.s("戞\u0001"));
        l0.p(lVar, ProtectedSandApp.s("戜\u0001"));
        BigInteger valueOf = BigInteger.valueOf(0L);
        l0.o(valueOf, ProtectedSandApp.s("戟\u0001"));
        for (int i4 : iArr) {
            valueOf = valueOf.add((BigInteger) kotlin.collections.unsigned.d.a(i4, lVar));
            l0.o(valueOf, ProtectedSandApp.s("戠\u0001"));
        }
        return valueOf;
    }

    @t
    @c1(version = "1.4")
    @i(name = "sumOfBigInteger")
    @kotlin.internal.f
    @p0
    private static final BigInteger U(long[] jArr, ld.l<? super a2, ? extends BigInteger> lVar) {
        l0.p(jArr, ProtectedSandApp.s("戞\u0001"));
        l0.p(lVar, ProtectedSandApp.s("戜\u0001"));
        BigInteger valueOf = BigInteger.valueOf(0L);
        l0.o(valueOf, ProtectedSandApp.s("戟\u0001"));
        for (long j4 : jArr) {
            valueOf = valueOf.add((BigInteger) kotlin.collections.unsigned.b.a(j4, lVar));
            l0.o(valueOf, ProtectedSandApp.s("戠\u0001"));
        }
        return valueOf;
    }

    @t
    @c1(version = "1.4")
    @i(name = "sumOfBigInteger")
    @kotlin.internal.f
    @p0
    private static final BigInteger V(short[] sArr, ld.l<? super g2, ? extends BigInteger> lVar) {
        l0.p(sArr, ProtectedSandApp.s("戞\u0001"));
        l0.p(lVar, ProtectedSandApp.s("戜\u0001"));
        BigInteger valueOf = BigInteger.valueOf(0L);
        l0.o(valueOf, ProtectedSandApp.s("戟\u0001"));
        for (short s4 : sArr) {
            valueOf = valueOf.add((BigInteger) kotlin.collections.unsigned.c.a(s4, lVar));
            l0.o(valueOf, ProtectedSandApp.s("戠\u0001"));
        }
        return valueOf;
    }

    @fg.l
    @c1(version = "1.3")
    @t
    public static final List<w1> a(@fg.l int[] iArr) {
        l0.p(iArr, ProtectedSandApp.s("戡\u0001"));
        return new a(iArr);
    }

    @fg.l
    @c1(version = "1.3")
    @t
    public static final List<s1> b(@fg.l byte[] bArr) {
        l0.p(bArr, ProtectedSandApp.s("戡\u0001"));
        return new c(bArr);
    }

    @fg.l
    @c1(version = "1.3")
    @t
    public static final List<a2> c(@fg.l long[] jArr) {
        l0.p(jArr, ProtectedSandApp.s("戡\u0001"));
        return new b(jArr);
    }

    @fg.l
    @c1(version = "1.3")
    @t
    public static final List<g2> d(@fg.l short[] sArr) {
        l0.p(sArr, ProtectedSandApp.s("戡\u0001"));
        return new d(sArr);
    }

    @c1(version = "1.3")
    @t
    public static final int e(@fg.l int[] iArr, int i4, int i5, int i6) {
        l0.p(iArr, ProtectedSandApp.s("戢\u0001"));
        kotlin.collections.c.INSTANCE.d(i5, i6, iArr.length);
        int i7 = i6 - 1;
        while (i5 <= i7) {
            int i10 = (i5 + i7) >>> 1;
            int c5 = n2.c(iArr[i10], i4);
            if (c5 < 0) {
                i5 = i10 + 1;
            } else {
                if (c5 <= 0) {
                    return i10;
                }
                i7 = i10 - 1;
            }
        }
        return -(i5 + 1);
    }

    public static int f(int[] iArr, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = iArr.length;
        }
        return e(iArr, i4, i5, i6);
    }

    @c1(version = "1.3")
    @t
    public static final int g(@fg.l short[] sArr, short s4, int i4, int i5) {
        l0.p(sArr, ProtectedSandApp.s("戢\u0001"));
        kotlin.collections.c.INSTANCE.d(i4, i5, sArr.length);
        int i6 = s4 & g2.f75095e;
        int i7 = i5 - 1;
        while (i4 <= i7) {
            int i10 = (i4 + i7) >>> 1;
            int c5 = n2.c(sArr[i10], i6);
            if (c5 < 0) {
                i4 = i10 + 1;
            } else {
                if (c5 <= 0) {
                    return i10;
                }
                i7 = i10 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static int h(short[] sArr, short s4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = sArr.length;
        }
        return g(sArr, s4, i4, i5);
    }

    @c1(version = "1.3")
    @t
    public static final int i(@fg.l long[] jArr, long j4, int i4, int i5) {
        l0.p(jArr, ProtectedSandApp.s("戢\u0001"));
        kotlin.collections.c.INSTANCE.d(i4, i5, jArr.length);
        int i6 = i5 - 1;
        while (i4 <= i6) {
            int i7 = (i4 + i6) >>> 1;
            int g4 = n2.g(jArr[i7], j4);
            if (g4 < 0) {
                i4 = i7 + 1;
            } else {
                if (g4 <= 0) {
                    return i7;
                }
                i6 = i7 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static int j(long[] jArr, long j4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = jArr.length;
        }
        return i(jArr, j4, i4, i5);
    }

    @c1(version = "1.3")
    @t
    public static final int k(@fg.l byte[] bArr, byte b5, int i4, int i5) {
        l0.p(bArr, ProtectedSandApp.s("戢\u0001"));
        kotlin.collections.c.INSTANCE.d(i4, i5, bArr.length);
        int i6 = b5 & 255;
        int i7 = i5 - 1;
        while (i4 <= i7) {
            int i10 = (i4 + i7) >>> 1;
            int c5 = n2.c(bArr[i10], i6);
            if (c5 < 0) {
                i4 = i10 + 1;
            } else {
                if (c5 <= 0) {
                    return i10;
                }
                i7 = i10 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static int l(byte[] bArr, byte b5, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = bArr.length;
        }
        return k(bArr, b5, i4, i5);
    }

    @c1(version = "1.3")
    @t
    @kotlin.internal.f
    private static final byte m(byte[] bArr, int i4) {
        l0.p(bArr, ProtectedSandApp.s("戣\u0001"));
        return s1.h(bArr[i4]);
    }

    @c1(version = "1.3")
    @t
    @kotlin.internal.f
    private static final short n(short[] sArr, int i4) {
        l0.p(sArr, ProtectedSandApp.s("戣\u0001"));
        return g2.h(sArr[i4]);
    }

    @c1(version = "1.3")
    @t
    @kotlin.internal.f
    private static final int o(int[] iArr, int i4) {
        l0.p(iArr, ProtectedSandApp.s("戣\u0001"));
        return w1.h(iArr[i4]);
    }

    @c1(version = "1.3")
    @t
    @kotlin.internal.f
    private static final long p(long[] jArr, int i4) {
        l0.p(jArr, ProtectedSandApp.s("戣\u0001"));
        return a2.h(jArr[i4]);
    }

    @k(message = "Use maxOrNull instead.", replaceWith = @x0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @c1(version = "1.3")
    public static final /* synthetic */ w1 q(int[] iArr) {
        l0.p(iArr, ProtectedSandApp.s("戤\u0001"));
        return g.q6(iArr);
    }

    @k(message = "Use maxOrNull instead.", replaceWith = @x0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @c1(version = "1.3")
    public static final /* synthetic */ s1 r(byte[] bArr) {
        l0.p(bArr, ProtectedSandApp.s("戤\u0001"));
        return g.r6(bArr);
    }

    @k(message = "Use maxOrNull instead.", replaceWith = @x0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @c1(version = "1.3")
    public static final /* synthetic */ a2 s(long[] jArr) {
        l0.p(jArr, ProtectedSandApp.s("戤\u0001"));
        return g.s6(jArr);
    }

    @k(message = "Use maxOrNull instead.", replaceWith = @x0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @c1(version = "1.3")
    public static final /* synthetic */ g2 t(short[] sArr) {
        l0.p(sArr, ProtectedSandApp.s("戤\u0001"));
        return g.t6(sArr);
    }

    @k(message = "Use maxByOrNull instead.", replaceWith = @x0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> s1 u(byte[] bArr, ld.l<? super s1, ? extends R> lVar) {
        l0.p(bArr, ProtectedSandApp.s("戥\u0001"));
        l0.p(lVar, ProtectedSandApp.s("戜\u0001"));
        if (t1.x(bArr)) {
            return null;
        }
        byte h4 = s1.h(bArr[0]);
        int qe2 = l.qe(bArr);
        if (qe2 != 0) {
            R invoke = lVar.invoke(s1.b(h4));
            u0 a5 = androidx.compose.animation.g.a(1, qe2, 1);
            while (a5.hasNext()) {
                byte h5 = s1.h(bArr[a5.c()]);
                R invoke2 = lVar.invoke(s1.b(h5));
                if (invoke.compareTo(invoke2) < 0) {
                    h4 = h5;
                    invoke = invoke2;
                }
            }
        }
        return s1.b(h4);
    }

    @k(message = "Use maxByOrNull instead.", replaceWith = @x0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> a2 v(long[] jArr, ld.l<? super a2, ? extends R> lVar) {
        l0.p(jArr, ProtectedSandApp.s("戥\u0001"));
        l0.p(lVar, ProtectedSandApp.s("戜\u0001"));
        if (b2.x(jArr)) {
            return null;
        }
        long h4 = a2.h(jArr[0]);
        int ve2 = l.ve(jArr);
        if (ve2 != 0) {
            R invoke = lVar.invoke(a2.b(h4));
            u0 a5 = androidx.compose.animation.g.a(1, ve2, 1);
            while (a5.hasNext()) {
                long h5 = a2.h(jArr[a5.c()]);
                R invoke2 = lVar.invoke(a2.b(h5));
                if (invoke.compareTo(invoke2) < 0) {
                    h4 = h5;
                    invoke = invoke2;
                }
            }
        }
        return a2.b(h4);
    }

    @k(message = "Use maxByOrNull instead.", replaceWith = @x0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> w1 w(int[] iArr, ld.l<? super w1, ? extends R> lVar) {
        l0.p(iArr, ProtectedSandApp.s("戥\u0001"));
        l0.p(lVar, ProtectedSandApp.s("戜\u0001"));
        if (x1.x(iArr)) {
            return null;
        }
        int h4 = w1.h(iArr[0]);
        int ue2 = l.ue(iArr);
        if (ue2 != 0) {
            R invoke = lVar.invoke(w1.b(h4));
            u0 a5 = androidx.compose.animation.g.a(1, ue2, 1);
            while (a5.hasNext()) {
                int h5 = w1.h(iArr[a5.c()]);
                R invoke2 = lVar.invoke(w1.b(h5));
                if (invoke.compareTo(invoke2) < 0) {
                    h4 = h5;
                    invoke = invoke2;
                }
            }
        }
        return w1.b(h4);
    }

    @k(message = "Use maxByOrNull instead.", replaceWith = @x0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> g2 x(short[] sArr, ld.l<? super g2, ? extends R> lVar) {
        l0.p(sArr, ProtectedSandApp.s("戥\u0001"));
        l0.p(lVar, ProtectedSandApp.s("戜\u0001"));
        if (h2.x(sArr)) {
            return null;
        }
        short h4 = g2.h(sArr[0]);
        int xe2 = l.xe(sArr);
        if (xe2 != 0) {
            R invoke = lVar.invoke(g2.b(h4));
            u0 a5 = androidx.compose.animation.g.a(1, xe2, 1);
            while (a5.hasNext()) {
                short h5 = g2.h(sArr[a5.c()]);
                R invoke2 = lVar.invoke(g2.b(h5));
                if (invoke.compareTo(invoke2) < 0) {
                    h4 = h5;
                    invoke = invoke2;
                }
            }
        }
        return g2.b(h4);
    }

    @k(message = "Use maxWithOrNull instead.", replaceWith = @x0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @c1(version = "1.3")
    public static final /* synthetic */ s1 y(byte[] bArr, Comparator comparator) {
        l0.p(bArr, ProtectedSandApp.s("战\u0001"));
        l0.p(comparator, ProtectedSandApp.s("戙\u0001"));
        return g.y6(bArr, comparator);
    }

    @k(message = "Use maxWithOrNull instead.", replaceWith = @x0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @c1(version = "1.3")
    public static final /* synthetic */ w1 z(int[] iArr, Comparator comparator) {
        l0.p(iArr, ProtectedSandApp.s("战\u0001"));
        l0.p(comparator, ProtectedSandApp.s("戙\u0001"));
        return g.z6(iArr, comparator);
    }
}

package kotlin.collections.unsigned;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.collections.AbstractList;
import kotlin.collections.IntIterator;
import kotlin.collections.o;
import kotlin.collections.t;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.l0;
import kotlin.p2;
import p3.i;
import q3.l;

/* compiled from: _UArraysJvm.kt */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0019\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\n0\u0001*\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001*\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a/\u0010\u0012\u001a\u00020\u0013*\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a/\u0010\u0012\u001a\u00020\u0013*\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a/\u0010\u0012\u001a\u00020\u0013*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a/\u0010\u0012\u001a\u00020\u0013*\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001c\u0010\u001f\u001a\u00020\u0002*\u00020\u00032\u0006\u0010 \u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b!\u0010\"\u001a\u001c\u0010\u001f\u001a\u00020\u0006*\u00020\u00072\u0006\u0010 \u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b#\u0010$\u001a\u001c\u0010\u001f\u001a\u00020\n*\u00020\u000b2\u0006\u0010 \u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b%\u0010&\u001a\u001c\u0010\u001f\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010 \u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b'\u0010(\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\u0002*\u00020\u0003H\u0007¢\u0006\u0004\b*\u0010+\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\u0006*\u00020\u0007H\u0007¢\u0006\u0004\b,\u0010-\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0007¢\u0006\u0004\b.\u0010/\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\u000e*\u00020\u000fH\u0007¢\u0006\u0004\b0\u00101\u001a=\u00102\u001a\u0004\u0018\u00010\u0002\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a=\u00102\u001a\u0004\u0018\u00010\u0006\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a=\u00102\u001a\u0004\u0018\u00010\n\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a=\u00102\u001a\u0004\u0018\u00010\u000e\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a1\u0010?\u001a\u0004\u0018\u00010\u0002*\u00020\u00032\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00020Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0002`BH\u0007¢\u0006\u0004\bC\u0010D\u001a1\u0010?\u001a\u0004\u0018\u00010\u0006*\u00020\u00072\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00060Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0006`BH\u0007¢\u0006\u0004\bE\u0010F\u001a1\u0010?\u001a\u0004\u0018\u00010\n*\u00020\u000b2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\n0Aj\n\u0012\u0006\b\u0000\u0012\u00020\n`BH\u0007¢\u0006\u0004\bG\u0010H\u001a1\u0010?\u001a\u0004\u0018\u00010\u000e*\u00020\u000f2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000e0Aj\n\u0012\u0006\b\u0000\u0012\u00020\u000e`BH\u0007¢\u0006\u0004\bI\u0010J\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\u0002*\u00020\u0003H\u0007¢\u0006\u0004\bL\u0010+\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\u0006*\u00020\u0007H\u0007¢\u0006\u0004\bM\u0010-\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0007¢\u0006\u0004\bN\u0010/\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\u000e*\u00020\u000fH\u0007¢\u0006\u0004\bO\u00101\u001a=\u0010P\u001a\u0004\u0018\u00010\u0002\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\bQ\u00108\u001a=\u0010P\u001a\u0004\u0018\u00010\u0006\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\bR\u0010:\u001a=\u0010P\u001a\u0004\u0018\u00010\n\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\bS\u0010<\u001a=\u0010P\u001a\u0004\u0018\u00010\u000e\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\bT\u0010>\u001a1\u0010U\u001a\u0004\u0018\u00010\u0002*\u00020\u00032\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00020Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0002`BH\u0007¢\u0006\u0004\bV\u0010D\u001a1\u0010U\u001a\u0004\u0018\u00010\u0006*\u00020\u00072\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00060Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0006`BH\u0007¢\u0006\u0004\bW\u0010F\u001a1\u0010U\u001a\u0004\u0018\u00010\n*\u00020\u000b2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\n0Aj\n\u0012\u0006\b\u0000\u0012\u00020\n`BH\u0007¢\u0006\u0004\bX\u0010H\u001a1\u0010U\u001a\u0004\u0018\u00010\u000e*\u00020\u000f2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000e0Aj\n\u0012\u0006\b\u0000\u0012\u00020\u000e`BH\u0007¢\u0006\u0004\bY\u0010J\u001a+\u0010Z\u001a\u00020[*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0000¢\u0006\u0004\b\\\u0010]\u001a+\u0010Z\u001a\u00020^*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020^06H\u0087\bø\u0001\u0000¢\u0006\u0004\b_\u0010`\u001a+\u0010Z\u001a\u00020[*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0000¢\u0006\u0004\b\\\u0010a\u001a+\u0010Z\u001a\u00020^*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020^06H\u0087\bø\u0001\u0000¢\u0006\u0004\b_\u0010b\u001a+\u0010Z\u001a\u00020[*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0000¢\u0006\u0004\b\\\u0010c\u001a+\u0010Z\u001a\u00020^*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020^06H\u0087\bø\u0001\u0000¢\u0006\u0004\b_\u0010d\u001a+\u0010Z\u001a\u00020[*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0000¢\u0006\u0004\b\\\u0010e\u001a+\u0010Z\u001a\u00020^*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020^06H\u0087\bø\u0001\u0000¢\u0006\u0004\b_\u0010f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006g"}, d2 = {"asList", "", "Lkotlin/UByte;", "Lkotlin/UByteArray;", "asList-GBYM_sE", "([B)Ljava/util/List;", "Lkotlin/UInt;", "Lkotlin/UIntArray;", "asList--ajY-9A", "([I)Ljava/util/List;", "Lkotlin/ULong;", "Lkotlin/ULongArray;", "asList-QwZRm1k", "([J)Ljava/util/List;", "Lkotlin/UShort;", "Lkotlin/UShortArray;", "asList-rL5Bavg", "([S)Ljava/util/List;", "binarySearch", "", "element", "fromIndex", "toIndex", "binarySearch-WpHrYlw", "([BBII)I", "binarySearch-2fe2U9s", "([IIII)I", "binarySearch-K6DWlUc", "([JJII)I", "binarySearch-EtDCXyQ", "([SSII)I", "elementAt", "index", "elementAt-PpDY95g", "([BI)B", "elementAt-qFRl0hI", "([II)I", "elementAt-r7IrZao", "([JI)J", "elementAt-nggk6HY", "([SI)S", "max", "max-GBYM_sE", "([B)Lkotlin/UByte;", "max--ajY-9A", "([I)Lkotlin/UInt;", "max-QwZRm1k", "([J)Lkotlin/ULong;", "max-rL5Bavg", "([S)Lkotlin/UShort;", "maxBy", "R", "", "selector", "Lkotlin/Function1;", "maxBy-JOV_ifY", "([BLkotlin/jvm/functions/Function1;)Lkotlin/UByte;", "maxBy-jgv0xPQ", "([ILkotlin/jvm/functions/Function1;)Lkotlin/UInt;", "maxBy-MShoTSo", "([JLkotlin/jvm/functions/Function1;)Lkotlin/ULong;", "maxBy-xTcfx_M", "([SLkotlin/jvm/functions/Function1;)Lkotlin/UShort;", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "maxWith-XMRcp5o", "([BLjava/util/Comparator;)Lkotlin/UByte;", "maxWith-YmdZ_VM", "([ILjava/util/Comparator;)Lkotlin/UInt;", "maxWith-zrEWJaI", "([JLjava/util/Comparator;)Lkotlin/ULong;", "maxWith-eOHTfZs", "([SLjava/util/Comparator;)Lkotlin/UShort;", "min", "min-GBYM_sE", "min--ajY-9A", "min-QwZRm1k", "min-rL5Bavg", "minBy", "minBy-JOV_ifY", "minBy-jgv0xPQ", "minBy-MShoTSo", "minBy-xTcfx_M", "minWith", "minWith-XMRcp5o", "minWith-YmdZ_VM", "minWith-zrEWJaI", "minWith-eOHTfZs", "sumOf", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "sumOfBigInteger", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, pn = "kotlin.collections", xi = 49, xs = "kotlin/collections/unsigned/UArraysKt")
/* loaded from: classes5.dex */
class f {

    /* compiled from: _UArraysJvm.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0017"}, d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$1", "Lkotlin/collections/AbstractList;", "Lkotlin/UInt;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "contains", "", "element", "contains-WZ4Q5Ns", "(I)Z", "get", "index", "get-pVg5ArA", "(I)I", "indexOf", "indexOf-WZ4Q5Ns", "isEmpty", "lastIndexOf", "lastIndexOf-WZ4Q5Ns", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class a extends AbstractList<UInt> implements RandomAccess {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int[] f23237q;

        a(int[] iArr) {
            this.f23237q = iArr;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        /* renamed from: b */
        public int getF23147s() {
            return this.f23237q.length;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof UInt) {
                return f(((UInt) obj).getF27240o());
            }
            return false;
        }

        public boolean f(int i5) {
            boolean q8;
            q8 = t.q8(this.f23237q, i5);
            return q8;
        }

        public int g(int i5) {
            return UIntArray.u(this.f23237q, i5);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i5) {
            return UInt.h(g(i5));
        }

        public int h(int i5) {
            int Gf;
            Gf = t.Gf(this.f23237q, i5);
            return Gf;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof UInt) {
                return h(((UInt) obj).getF27240o());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return UIntArray.A(this.f23237q);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof UInt) {
                return p(((UInt) obj).getF27240o());
            }
            return -1;
        }

        public int p(int i5) {
            int Kh;
            Kh = t.Kh(this.f23237q, i5);
            return Kh;
        }
    }

    /* compiled from: _UArraysJvm.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0018"}, d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$2", "Lkotlin/collections/AbstractList;", "Lkotlin/ULong;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "contains", "", "element", "contains-VKZWuLQ", "(J)Z", "get", "index", "get-s-VKNKU", "(I)J", "indexOf", "indexOf-VKZWuLQ", "(J)I", "isEmpty", "lastIndexOf", "lastIndexOf-VKZWuLQ", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class b extends AbstractList<ULong> implements RandomAccess {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ long[] f23238q;

        b(long[] jArr) {
            this.f23238q = jArr;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        /* renamed from: b */
        public int getF23147s() {
            return this.f23238q.length;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof ULong) {
                return f(((ULong) obj).getF23071o());
            }
            return false;
        }

        public boolean f(long j5) {
            boolean r8;
            r8 = t.r8(this.f23238q, j5);
            return r8;
        }

        public long g(int i5) {
            return ULongArray.u(this.f23238q, i5);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i5) {
            return ULong.h(g(i5));
        }

        public int h(long j5) {
            int Hf;
            Hf = t.Hf(this.f23238q, j5);
            return Hf;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof ULong) {
                return h(((ULong) obj).getF23071o());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return ULongArray.A(this.f23238q);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof ULong) {
                return p(((ULong) obj).getF23071o());
            }
            return -1;
        }

        public int p(long j5) {
            int Lh;
            Lh = t.Lh(this.f23238q, j5);
            return Lh;
        }
    }

    /* compiled from: _UArraysJvm.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0018"}, d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$3", "Lkotlin/collections/AbstractList;", "Lkotlin/UByte;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "contains", "", "element", "contains-7apg3OU", "(B)Z", "get", "index", "get-w2LRezQ", "(I)B", "indexOf", "indexOf-7apg3OU", "(B)I", "isEmpty", "lastIndexOf", "lastIndexOf-7apg3OU", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class c extends AbstractList<UByte> implements RandomAccess {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ byte[] f23239q;

        c(byte[] bArr) {
            this.f23239q = bArr;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        /* renamed from: b */
        public int getF23147s() {
            return this.f23239q.length;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof UByte) {
                return f(((UByte) obj).getF27223o());
            }
            return false;
        }

        public boolean f(byte b6) {
            boolean m8;
            m8 = t.m8(this.f23239q, b6);
            return m8;
        }

        public byte g(int i5) {
            return UByteArray.u(this.f23239q, i5);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i5) {
            return UByte.h(g(i5));
        }

        public int h(byte b6) {
            int Cf;
            Cf = t.Cf(this.f23239q, b6);
            return Cf;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof UByte) {
                return h(((UByte) obj).getF27223o());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return UByteArray.A(this.f23239q);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof UByte) {
                return p(((UByte) obj).getF27223o());
            }
            return -1;
        }

        public int p(byte b6) {
            int Gh;
            Gh = t.Gh(this.f23239q, b6);
            return Gh;
        }
    }

    /* compiled from: _UArraysJvm.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0018"}, d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$4", "Lkotlin/collections/AbstractList;", "Lkotlin/UShort;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "contains", "", "element", "contains-xj2QHRw", "(S)Z", "get", "index", "get-Mh2AYeg", "(I)S", "indexOf", "indexOf-xj2QHRw", "(S)I", "isEmpty", "lastIndexOf", "lastIndexOf-xj2QHRw", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class d extends AbstractList<UShort> implements RandomAccess {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ short[] f23240q;

        d(short[] sArr) {
            this.f23240q = sArr;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        /* renamed from: b */
        public int getF23147s() {
            return this.f23240q.length;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof UShort) {
                return f(((UShort) obj).getF23343o());
            }
            return false;
        }

        public boolean f(short s5) {
            boolean t8;
            t8 = t.t8(this.f23240q, s5);
            return t8;
        }

        public short g(int i5) {
            return UShortArray.u(this.f23240q, i5);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i5) {
            return UShort.h(g(i5));
        }

        public int h(short s5) {
            int Jf;
            Jf = t.Jf(this.f23240q, s5);
            return Jf;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof UShort) {
                return h(((UShort) obj).getF23343o());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return UShortArray.A(this.f23240q);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof UShort) {
                return p(((UShort) obj).getF23343o());
            }
            return -1;
        }

        public int p(short s5) {
            int Nh;
            Nh = t.Nh(this.f23240q, s5);
            return Nh;
        }
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final /* synthetic */ UShort A(short[] sArr, Comparator comparator) {
        l0.p(sArr, ProtectedSandApp.s("㡎"));
        l0.p(comparator, ProtectedSandApp.s("㡏"));
        return g.A6(sArr, comparator);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final /* synthetic */ ULong B(long[] jArr, Comparator comparator) {
        l0.p(jArr, ProtectedSandApp.s("㡐"));
        l0.p(comparator, ProtectedSandApp.s("㡑"));
        return g.B6(jArr, comparator);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final /* synthetic */ UInt C(int[] iArr) {
        l0.p(iArr, ProtectedSandApp.s("㡒"));
        return g.u7(iArr);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final /* synthetic */ UByte D(byte[] bArr) {
        l0.p(bArr, ProtectedSandApp.s("㡓"));
        return g.v7(bArr);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final /* synthetic */ ULong E(long[] jArr) {
        l0.p(jArr, ProtectedSandApp.s("㡔"));
        return g.w7(jArr);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final /* synthetic */ UShort F(short[] sArr) {
        l0.p(sArr, ProtectedSandApp.s("㡕"));
        return g.x7(sArr);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final /* synthetic */ <R extends Comparable<? super R>> UByte G(byte[] bArr, l<? super UByte, ? extends R> lVar) {
        int qe;
        l0.p(bArr, ProtectedSandApp.s("㡖"));
        l0.p(lVar, ProtectedSandApp.s("㡗"));
        if (UByteArray.A(bArr)) {
            return null;
        }
        byte u5 = UByteArray.u(bArr, 0);
        qe = t.qe(bArr);
        if (qe != 0) {
            R N = lVar.N(UByte.h(u5));
            IntIterator a6 = o.a(1, qe);
            while (a6.hasNext()) {
                byte u6 = UByteArray.u(bArr, a6.nextInt());
                R N2 = lVar.N(UByte.h(u6));
                if (N.compareTo(N2) > 0) {
                    u5 = u6;
                    N = N2;
                }
            }
        }
        return UByte.h(u5);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final /* synthetic */ <R extends Comparable<? super R>> ULong H(long[] jArr, l<? super ULong, ? extends R> lVar) {
        int ve;
        l0.p(jArr, ProtectedSandApp.s("㡘"));
        l0.p(lVar, ProtectedSandApp.s("㡙"));
        if (ULongArray.A(jArr)) {
            return null;
        }
        long u5 = ULongArray.u(jArr, 0);
        ve = t.ve(jArr);
        if (ve != 0) {
            R N = lVar.N(ULong.h(u5));
            IntIterator a6 = o.a(1, ve);
            while (a6.hasNext()) {
                long u6 = ULongArray.u(jArr, a6.nextInt());
                R N2 = lVar.N(ULong.h(u6));
                if (N.compareTo(N2) > 0) {
                    u5 = u6;
                    N = N2;
                }
            }
        }
        return ULong.h(u5);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final /* synthetic */ <R extends Comparable<? super R>> UInt I(int[] iArr, l<? super UInt, ? extends R> lVar) {
        int ue;
        l0.p(iArr, ProtectedSandApp.s("㡚"));
        l0.p(lVar, ProtectedSandApp.s("㡛"));
        if (UIntArray.A(iArr)) {
            return null;
        }
        int u5 = UIntArray.u(iArr, 0);
        ue = t.ue(iArr);
        if (ue != 0) {
            R N = lVar.N(UInt.h(u5));
            IntIterator a6 = o.a(1, ue);
            while (a6.hasNext()) {
                int u6 = UIntArray.u(iArr, a6.nextInt());
                R N2 = lVar.N(UInt.h(u6));
                if (N.compareTo(N2) > 0) {
                    u5 = u6;
                    N = N2;
                }
            }
        }
        return UInt.h(u5);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final /* synthetic */ <R extends Comparable<? super R>> UShort J(short[] sArr, l<? super UShort, ? extends R> lVar) {
        int xe;
        l0.p(sArr, ProtectedSandApp.s("㡜"));
        l0.p(lVar, ProtectedSandApp.s("㡝"));
        if (UShortArray.A(sArr)) {
            return null;
        }
        short u5 = UShortArray.u(sArr, 0);
        xe = t.xe(sArr);
        if (xe != 0) {
            R N = lVar.N(UShort.h(u5));
            IntIterator a6 = o.a(1, xe);
            while (a6.hasNext()) {
                short u6 = UShortArray.u(sArr, a6.nextInt());
                R N2 = lVar.N(UShort.h(u6));
                if (N.compareTo(N2) > 0) {
                    u5 = u6;
                    N = N2;
                }
            }
        }
        return UShort.h(u5);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final /* synthetic */ UByte K(byte[] bArr, Comparator comparator) {
        l0.p(bArr, ProtectedSandApp.s("㡞"));
        l0.p(comparator, ProtectedSandApp.s("㡟"));
        return g.C7(bArr, comparator);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final /* synthetic */ UInt L(int[] iArr, Comparator comparator) {
        l0.p(iArr, ProtectedSandApp.s("㡠"));
        l0.p(comparator, ProtectedSandApp.s("㡡"));
        return g.D7(iArr, comparator);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final /* synthetic */ UShort M(short[] sArr, Comparator comparator) {
        l0.p(sArr, ProtectedSandApp.s("㡢"));
        l0.p(comparator, ProtectedSandApp.s("㡣"));
        return g.E7(sArr, comparator);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final /* synthetic */ ULong N(long[] jArr, Comparator comparator) {
        l0.p(jArr, ProtectedSandApp.s("㡤"));
        l0.p(comparator, ProtectedSandApp.s("㡥"));
        return g.F7(jArr, comparator);
    }

    @i(name = "sumOfBigDecimal")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal O(byte[] bArr, l<? super UByte, ? extends BigDecimal> lVar) {
        l0.p(bArr, ProtectedSandApp.s("㡦"));
        l0.p(lVar, ProtectedSandApp.s("㡧"));
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        l0.o(valueOf, ProtectedSandApp.s("㡨"));
        int length = bArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            valueOf = valueOf.add((BigDecimal) kotlin.collections.unsigned.b.a(bArr, i5, lVar));
            l0.o(valueOf, ProtectedSandApp.s("㡩"));
        }
        return valueOf;
    }

    @i(name = "sumOfBigDecimal")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal P(int[] iArr, l<? super UInt, ? extends BigDecimal> lVar) {
        l0.p(iArr, ProtectedSandApp.s("㡪"));
        l0.p(lVar, ProtectedSandApp.s("㡫"));
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        l0.o(valueOf, ProtectedSandApp.s("㡬"));
        int length = iArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            valueOf = valueOf.add((BigDecimal) kotlin.collections.unsigned.d.a(iArr, i5, lVar));
            l0.o(valueOf, ProtectedSandApp.s("㡭"));
        }
        return valueOf;
    }

    @i(name = "sumOfBigDecimal")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal Q(long[] jArr, l<? super ULong, ? extends BigDecimal> lVar) {
        l0.p(jArr, ProtectedSandApp.s("㡮"));
        l0.p(lVar, ProtectedSandApp.s("㡯"));
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        l0.o(valueOf, ProtectedSandApp.s("㡰"));
        int length = jArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            valueOf = valueOf.add((BigDecimal) kotlin.collections.unsigned.c.a(jArr, i5, lVar));
            l0.o(valueOf, ProtectedSandApp.s("㡱"));
        }
        return valueOf;
    }

    @i(name = "sumOfBigDecimal")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal R(short[] sArr, l<? super UShort, ? extends BigDecimal> lVar) {
        l0.p(sArr, ProtectedSandApp.s("㡲"));
        l0.p(lVar, ProtectedSandApp.s("㡳"));
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        l0.o(valueOf, ProtectedSandApp.s("㡴"));
        int length = sArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            valueOf = valueOf.add((BigDecimal) e.a(sArr, i5, lVar));
            l0.o(valueOf, ProtectedSandApp.s("㡵"));
        }
        return valueOf;
    }

    @i(name = "sumOfBigInteger")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger S(byte[] bArr, l<? super UByte, ? extends BigInteger> lVar) {
        l0.p(bArr, ProtectedSandApp.s("㡶"));
        l0.p(lVar, ProtectedSandApp.s("㡷"));
        BigInteger valueOf = BigInteger.valueOf(0L);
        l0.o(valueOf, ProtectedSandApp.s("㡸"));
        int length = bArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            valueOf = valueOf.add((BigInteger) kotlin.collections.unsigned.b.a(bArr, i5, lVar));
            l0.o(valueOf, ProtectedSandApp.s("㡹"));
        }
        return valueOf;
    }

    @i(name = "sumOfBigInteger")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger T(int[] iArr, l<? super UInt, ? extends BigInteger> lVar) {
        l0.p(iArr, ProtectedSandApp.s("㡺"));
        l0.p(lVar, ProtectedSandApp.s("㡻"));
        BigInteger valueOf = BigInteger.valueOf(0L);
        l0.o(valueOf, ProtectedSandApp.s("㡼"));
        int length = iArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            valueOf = valueOf.add((BigInteger) kotlin.collections.unsigned.d.a(iArr, i5, lVar));
            l0.o(valueOf, ProtectedSandApp.s("㡽"));
        }
        return valueOf;
    }

    @i(name = "sumOfBigInteger")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger U(long[] jArr, l<? super ULong, ? extends BigInteger> lVar) {
        l0.p(jArr, ProtectedSandApp.s("㡾"));
        l0.p(lVar, ProtectedSandApp.s("㡿"));
        BigInteger valueOf = BigInteger.valueOf(0L);
        l0.o(valueOf, ProtectedSandApp.s("㢀"));
        int length = jArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            valueOf = valueOf.add((BigInteger) kotlin.collections.unsigned.c.a(jArr, i5, lVar));
            l0.o(valueOf, ProtectedSandApp.s("㢁"));
        }
        return valueOf;
    }

    @i(name = "sumOfBigInteger")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger V(short[] sArr, l<? super UShort, ? extends BigInteger> lVar) {
        l0.p(sArr, ProtectedSandApp.s("㢂"));
        l0.p(lVar, ProtectedSandApp.s("㢃"));
        BigInteger valueOf = BigInteger.valueOf(0L);
        l0.o(valueOf, ProtectedSandApp.s("㢄"));
        int length = sArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            valueOf = valueOf.add((BigInteger) e.a(sArr, i5, lVar));
            l0.o(valueOf, ProtectedSandApp.s("㢅"));
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @d5.d
    public static final List<UInt> a(@d5.d int[] iArr) {
        l0.p(iArr, ProtectedSandApp.s("㢆"));
        return new a(iArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @d5.d
    public static final List<UByte> b(@d5.d byte[] bArr) {
        l0.p(bArr, ProtectedSandApp.s("㢇"));
        return new c(bArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @d5.d
    public static final List<ULong> c(@d5.d long[] jArr) {
        l0.p(jArr, ProtectedSandApp.s("㢈"));
        return new b(jArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @d5.d
    public static final List<UShort> d(@d5.d short[] sArr) {
        l0.p(sArr, ProtectedSandApp.s("㢉"));
        return new d(sArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final int e(@d5.d int[] iArr, int i5, int i6, int i7) {
        l0.p(iArr, ProtectedSandApp.s("㢊"));
        AbstractList.f23126o.d(i6, i7, iArr.length);
        int i8 = i7 - 1;
        while (i6 <= i8) {
            int i9 = (i6 + i8) >>> 1;
            int c6 = p2.c(iArr[i9], i5);
            if (c6 < 0) {
                i6 = i9 + 1;
            } else {
                if (c6 <= 0) {
                    return i9;
                }
                i8 = i9 - 1;
            }
        }
        return -(i6 + 1);
    }

    public static int f(int[] iArr, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i6 = 0;
        }
        if ((i8 & 4) != 0) {
            i7 = iArr.length;
        }
        return e(iArr, i5, i6, i7);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final int g(@d5.d short[] sArr, short s5, int i5, int i6) {
        l0.p(sArr, ProtectedSandApp.s("㢋"));
        AbstractList.f23126o.d(i5, i6, sArr.length);
        int i7 = s5 & UShort.f23340r;
        int i8 = i6 - 1;
        while (i5 <= i8) {
            int i9 = (i5 + i8) >>> 1;
            int c6 = p2.c(sArr[i9], i7);
            if (c6 < 0) {
                i5 = i9 + 1;
            } else {
                if (c6 <= 0) {
                    return i9;
                }
                i8 = i9 - 1;
            }
        }
        return -(i5 + 1);
    }

    public static int h(short[] sArr, short s5, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = sArr.length;
        }
        return g(sArr, s5, i5, i6);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final int i(@d5.d long[] jArr, long j5, int i5, int i6) {
        l0.p(jArr, ProtectedSandApp.s("㢌"));
        AbstractList.f23126o.d(i5, i6, jArr.length);
        int i7 = i6 - 1;
        while (i5 <= i7) {
            int i8 = (i5 + i7) >>> 1;
            int g5 = p2.g(jArr[i8], j5);
            if (g5 < 0) {
                i5 = i8 + 1;
            } else {
                if (g5 <= 0) {
                    return i8;
                }
                i7 = i8 - 1;
            }
        }
        return -(i5 + 1);
    }

    public static int j(long[] jArr, long j5, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = jArr.length;
        }
        return i(jArr, j5, i5, i6);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final int k(@d5.d byte[] bArr, byte b6, int i5, int i6) {
        l0.p(bArr, ProtectedSandApp.s("㢍"));
        AbstractList.f23126o.d(i5, i6, bArr.length);
        int i7 = b6 & UByte.f27220r;
        int i8 = i6 - 1;
        while (i5 <= i8) {
            int i9 = (i5 + i8) >>> 1;
            int c6 = p2.c(bArr[i9], i7);
            if (c6 < 0) {
                i5 = i9 + 1;
            } else {
                if (c6 <= 0) {
                    return i9;
                }
                i8 = i9 - 1;
            }
        }
        return -(i5 + 1);
    }

    public static int l(byte[] bArr, byte b6, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = bArr.length;
        }
        return k(bArr, b6, i5, i6);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte m(byte[] bArr, int i5) {
        l0.p(bArr, ProtectedSandApp.s("㢎"));
        return UByteArray.u(bArr, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short n(short[] sArr, int i5) {
        l0.p(sArr, ProtectedSandApp.s("㢏"));
        return UShortArray.u(sArr, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int o(int[] iArr, int i5) {
        l0.p(iArr, ProtectedSandApp.s("㢐"));
        return UIntArray.u(iArr, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long p(long[] jArr, int i5) {
        l0.p(jArr, ProtectedSandApp.s("㢑"));
        return ULongArray.u(jArr, i5);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final /* synthetic */ UInt q(int[] iArr) {
        l0.p(iArr, ProtectedSandApp.s("㢒"));
        return g.q6(iArr);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final /* synthetic */ UByte r(byte[] bArr) {
        l0.p(bArr, ProtectedSandApp.s("㢓"));
        return g.r6(bArr);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final /* synthetic */ ULong s(long[] jArr) {
        l0.p(jArr, ProtectedSandApp.s("㢔"));
        return g.s6(jArr);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final /* synthetic */ UShort t(short[] sArr) {
        l0.p(sArr, ProtectedSandApp.s("㢕"));
        return g.t6(sArr);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final /* synthetic */ <R extends Comparable<? super R>> UByte u(byte[] bArr, l<? super UByte, ? extends R> lVar) {
        int qe;
        l0.p(bArr, ProtectedSandApp.s("㢖"));
        l0.p(lVar, ProtectedSandApp.s("㢗"));
        if (UByteArray.A(bArr)) {
            return null;
        }
        byte u5 = UByteArray.u(bArr, 0);
        qe = t.qe(bArr);
        if (qe != 0) {
            R N = lVar.N(UByte.h(u5));
            IntIterator a6 = o.a(1, qe);
            while (a6.hasNext()) {
                byte u6 = UByteArray.u(bArr, a6.nextInt());
                R N2 = lVar.N(UByte.h(u6));
                if (N.compareTo(N2) < 0) {
                    u5 = u6;
                    N = N2;
                }
            }
        }
        return UByte.h(u5);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final /* synthetic */ <R extends Comparable<? super R>> ULong v(long[] jArr, l<? super ULong, ? extends R> lVar) {
        int ve;
        l0.p(jArr, ProtectedSandApp.s("㢘"));
        l0.p(lVar, ProtectedSandApp.s("㢙"));
        if (ULongArray.A(jArr)) {
            return null;
        }
        long u5 = ULongArray.u(jArr, 0);
        ve = t.ve(jArr);
        if (ve != 0) {
            R N = lVar.N(ULong.h(u5));
            IntIterator a6 = o.a(1, ve);
            while (a6.hasNext()) {
                long u6 = ULongArray.u(jArr, a6.nextInt());
                R N2 = lVar.N(ULong.h(u6));
                if (N.compareTo(N2) < 0) {
                    u5 = u6;
                    N = N2;
                }
            }
        }
        return ULong.h(u5);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final /* synthetic */ <R extends Comparable<? super R>> UInt w(int[] iArr, l<? super UInt, ? extends R> lVar) {
        int ue;
        l0.p(iArr, ProtectedSandApp.s("㢚"));
        l0.p(lVar, ProtectedSandApp.s("㢛"));
        if (UIntArray.A(iArr)) {
            return null;
        }
        int u5 = UIntArray.u(iArr, 0);
        ue = t.ue(iArr);
        if (ue != 0) {
            R N = lVar.N(UInt.h(u5));
            IntIterator a6 = o.a(1, ue);
            while (a6.hasNext()) {
                int u6 = UIntArray.u(iArr, a6.nextInt());
                R N2 = lVar.N(UInt.h(u6));
                if (N.compareTo(N2) < 0) {
                    u5 = u6;
                    N = N2;
                }
            }
        }
        return UInt.h(u5);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final /* synthetic */ <R extends Comparable<? super R>> UShort x(short[] sArr, l<? super UShort, ? extends R> lVar) {
        int xe;
        l0.p(sArr, ProtectedSandApp.s("㢜"));
        l0.p(lVar, ProtectedSandApp.s("㢝"));
        if (UShortArray.A(sArr)) {
            return null;
        }
        short u5 = UShortArray.u(sArr, 0);
        xe = t.xe(sArr);
        if (xe != 0) {
            R N = lVar.N(UShort.h(u5));
            IntIterator a6 = o.a(1, xe);
            while (a6.hasNext()) {
                short u6 = UShortArray.u(sArr, a6.nextInt());
                R N2 = lVar.N(UShort.h(u6));
                if (N.compareTo(N2) < 0) {
                    u5 = u6;
                    N = N2;
                }
            }
        }
        return UShort.h(u5);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final /* synthetic */ UByte y(byte[] bArr, Comparator comparator) {
        l0.p(bArr, ProtectedSandApp.s("㢞"));
        l0.p(comparator, ProtectedSandApp.s("㢟"));
        return g.y6(bArr, comparator);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    public static final /* synthetic */ UInt z(int[] iArr, Comparator comparator) {
        l0.p(iArr, ProtectedSandApp.s("㢠"));
        l0.p(comparator, ProtectedSandApp.s("㢡"));
        return g.z6(iArr, comparator);
    }
}

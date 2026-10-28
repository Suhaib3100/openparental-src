package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.AbstractList;

/* compiled from: Options.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\r\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u001aB!\b\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002R\"\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lokio/d0;", "Lkotlin/collections/c;", "Lokio/p;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "index", "g", "", "q", "[Lokio/p;", "h", "()[Lokio/p;", "byteStrings", "", "r", "[I", "p", "()[I", "trie", "b", "()I", "size", "<init>", "([Lokio/p;[I)V", "s", "a", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class d0 extends AbstractList<p> implements RandomAccess {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final p[] byteStrings;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final int[] trie;

    /* compiled from: Options.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002J#\u0010\u0012\u001a\u00020\u00112\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0010\"\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u00020\u0002*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lokio/d0$a;", "", "", "nodeOffset", "Lokio/m;", "node", "", "byteStringOffset", "", "Lokio/p;", "byteStrings", "fromIndex", "toIndex", "indexes", "Lkotlin/m2;", "a", "", "Lokio/d0;", "d", "([Lokio/p;)Lokio/d0;", "c", "(Lokio/m;)J", "intCount", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okio.d0$a, reason: from kotlin metadata */
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        private final void a(long j5, m mVar, int i5, List<? extends p> list, int i6, int i7, List<Integer> list2) {
            int i8;
            int i9;
            int i10;
            int i11;
            m mVar2;
            int i12 = i5;
            boolean z5 = i6 < i7;
            String s5 = ProtectedSandApp.s("栙");
            if (!z5) {
                throw new IllegalArgumentException(s5.toString());
            }
            for (int i13 = i6; i13 < i7; i13++) {
                if (!(list.get(i13).i0() >= i12)) {
                    throw new IllegalArgumentException(s5.toString());
                }
            }
            p pVar = list.get(i6);
            p pVar2 = list.get(i7 - 1);
            int i14 = -1;
            if (i12 == pVar.i0()) {
                int intValue = list2.get(i6).intValue();
                int i15 = i6 + 1;
                p pVar3 = list.get(i15);
                i8 = i15;
                i9 = intValue;
                pVar = pVar3;
            } else {
                i8 = i6;
                i9 = -1;
            }
            if (pVar.x(i12) == pVar2.x(i12)) {
                int min = Math.min(pVar.i0(), pVar2.i0());
                int i16 = 0;
                for (int i17 = i12; i17 < min && pVar.x(i17) == pVar2.x(i17); i17++) {
                    i16++;
                }
                long c6 = j5 + c(mVar) + 2 + i16 + 1;
                mVar.writeInt(-i16);
                mVar.writeInt(i9);
                int i18 = i12 + i16;
                while (i12 < i18) {
                    mVar.writeInt(pVar.x(i12) & UByte.f27220r);
                    i12++;
                }
                if (i8 + 1 == i7) {
                    if (!(i18 == list.get(i8).i0())) {
                        throw new IllegalStateException(ProtectedSandApp.s("栚").toString());
                    }
                    mVar.writeInt(list2.get(i8).intValue());
                    return;
                } else {
                    m mVar3 = new m();
                    mVar.writeInt(((int) (c(mVar3) + c6)) * (-1));
                    a(c6, mVar3, i18, list, i8, i7, list2);
                    mVar.v0(mVar3);
                    return;
                }
            }
            int i19 = 1;
            for (int i20 = i8 + 1; i20 < i7; i20++) {
                if (list.get(i20 - 1).x(i12) != list.get(i20).x(i12)) {
                    i19++;
                }
            }
            long c7 = j5 + c(mVar) + 2 + (i19 * 2);
            mVar.writeInt(i19);
            mVar.writeInt(i9);
            for (int i21 = i8; i21 < i7; i21++) {
                byte x5 = list.get(i21).x(i12);
                if (i21 == i8 || x5 != list.get(i21 - 1).x(i12)) {
                    mVar.writeInt(x5 & UByte.f27220r);
                }
            }
            m mVar4 = new m();
            while (i8 < i7) {
                byte x6 = list.get(i8).x(i12);
                int i22 = i8 + 1;
                int i23 = i22;
                while (true) {
                    if (i23 >= i7) {
                        i10 = i7;
                        break;
                    } else {
                        if (x6 != list.get(i23).x(i12)) {
                            i10 = i23;
                            break;
                        }
                        i23++;
                    }
                }
                if (i22 == i10 && i12 + 1 == list.get(i8).i0()) {
                    mVar.writeInt(list2.get(i8).intValue());
                    i11 = i10;
                    mVar2 = mVar4;
                } else {
                    mVar.writeInt(((int) (c7 + c(mVar4))) * i14);
                    i11 = i10;
                    mVar2 = mVar4;
                    a(c7, mVar4, i12 + 1, list, i8, i10, list2);
                }
                mVar4 = mVar2;
                i8 = i11;
                i14 = -1;
            }
            mVar.v0(mVar4);
        }

        static /* synthetic */ void b(Companion companion, long j5, m mVar, int i5, List list, int i6, int i7, List list2, int i8, Object obj) {
            companion.a((i8 & 1) != 0 ? 0L : j5, mVar, (i8 & 4) != 0 ? 0 : i5, list, (i8 & 16) != 0 ? 0 : i6, (i8 & 32) != 0 ? list.size() : i7, list2);
        }

        private final long c(m mVar) {
            return mVar.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x00f3, code lost:
        
            continue;
         */
        @d5.d
        @p3.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okio.d0 d(@d5.d okio.p... r17) {
            /*
                Method dump skipped, instructions count: 352
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.d0.Companion.d(okio.p[]):okio.d0");
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    public /* synthetic */ d0(p[] pVarArr, int[] iArr, kotlin.jvm.internal.w wVar) {
        this(pVarArr, iArr);
    }

    @d5.d
    @p3.n
    public static final d0 s(@d5.d p... pVarArr) {
        return INSTANCE.d(pVarArr);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* renamed from: b */
    public int getF23147s() {
        return this.byteStrings.length;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof p) {
            return super.contains((p) obj);
        }
        return false;
    }

    public /* bridge */ boolean f(p pVar) {
        return super.contains(pVar);
    }

    @d5.d
    public p g(int index) {
        return this.byteStrings[index];
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public Object get(int i5) {
        return this.byteStrings[i5];
    }

    @d5.d
    /* renamed from: h, reason: from getter */
    public final p[] getByteStrings() {
        return this.byteStrings;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof p) {
            return super.indexOf((p) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof p) {
            return super.lastIndexOf((p) obj);
        }
        return -1;
    }

    @d5.d
    /* renamed from: p, reason: from getter */
    public final int[] getTrie() {
        return this.trie;
    }

    public /* bridge */ int q(p pVar) {
        return super.indexOf(pVar);
    }

    public /* bridge */ int r(p pVar) {
        return super.lastIndexOf(pVar);
    }

    private d0(p[] pVarArr, int[] iArr) {
        this.byteStrings = pVarArr;
        this.trie = iArr;
    }
}

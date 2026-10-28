package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;

/* compiled from: Options.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u001aB!\b\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lokio/d0;", "Lkotlin/collections/c;", "Lokio/p;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "byteStrings", "", "trie", "<init>", "([Lokio/p;[I)V", "", "index", "f", "(I)Lokio/p;", "d", "[Lokio/p;", "h", "()[Lokio/p;", "e", "[I", "i", "()[I", "b", "()I", "size", "a", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class d0 extends kotlin.collections.c<p> implements RandomAccess {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final p[] byteStrings;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final int[] trie;

    /* compiled from: Options.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00142\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0013\"\u00020\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u00020\u0004*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lokio/d0$a;", "", "<init>", "()V", "", "nodeOffset", "Lokio/m;", "node", "", "byteStringOffset", "", "Lokio/p;", "byteStrings", "fromIndex", "toIndex", "indexes", "Lkotlin/k2;", "a", "(JLokio/m;ILjava/util/List;IILjava/util/List;)V", "", "Lokio/d0;", "d", "([Lokio/p;)Lokio/d0;", "c", "(Lokio/m;)J", "intCount", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okio.d0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final void a(long nodeOffset, m node, int byteStringOffset, List<? extends p> byteStrings, int fromIndex, int toIndex, List<Integer> indexes) {
            int i4;
            int i5;
            int i6;
            int i7;
            m mVar;
            int i10 = byteStringOffset;
            boolean z4 = fromIndex < toIndex;
            String s4 = ProtectedSandApp.s("ἧ");
            if (!z4) {
                throw new IllegalArgumentException(s4);
            }
            for (int i11 = fromIndex; i11 < toIndex; i11++) {
                if (!(byteStrings.get(i11).q() >= i10)) {
                    throw new IllegalArgumentException(s4);
                }
            }
            p pVar = byteStrings.get(fromIndex);
            p pVar2 = byteStrings.get(toIndex - 1);
            int i12 = -1;
            if (i10 == pVar.q()) {
                int intValue = indexes.get(fromIndex).intValue();
                int i13 = fromIndex + 1;
                p pVar3 = byteStrings.get(i13);
                i4 = i13;
                i5 = intValue;
                pVar = pVar3;
            } else {
                i4 = fromIndex;
                i5 = -1;
            }
            if (pVar.G(i10) == pVar2.G(i10)) {
                int min = Math.min(pVar.q(), pVar2.q());
                int i14 = 0;
                for (int i15 = i10; i15 < min && pVar.G(i15) == pVar2.G(i15); i15++) {
                    i14++;
                }
                long c5 = nodeOffset + c(node) + 2 + i14 + 1;
                node.writeInt(-i14);
                node.writeInt(i5);
                int i16 = i10 + i14;
                while (i10 < i16) {
                    node.writeInt(pVar.G(i10) & 255);
                    i10++;
                }
                if (i4 + 1 == toIndex) {
                    if (!(i16 == byteStrings.get(i4).q())) {
                        throw new IllegalStateException(ProtectedSandApp.s("Ἠ"));
                    }
                    node.writeInt(indexes.get(i4).intValue());
                    return;
                } else {
                    m mVar2 = new m();
                    node.writeInt(((int) (c(mVar2) + c5)) * (-1));
                    a(c5, mVar2, i16, byteStrings, i4, toIndex, indexes);
                    node.b1(mVar2);
                    return;
                }
            }
            int i17 = 1;
            for (int i18 = i4 + 1; i18 < toIndex; i18++) {
                if (byteStrings.get(i18 - 1).G(i10) != byteStrings.get(i18).G(i10)) {
                    i17++;
                }
            }
            long c6 = nodeOffset + c(node) + 2 + (i17 * 2);
            node.writeInt(i17);
            node.writeInt(i5);
            for (int i19 = i4; i19 < toIndex; i19++) {
                byte G = byteStrings.get(i19).G(i10);
                if (i19 == i4 || G != byteStrings.get(i19 - 1).G(i10)) {
                    node.writeInt(G & 255);
                }
            }
            m mVar3 = new m();
            while (i4 < toIndex) {
                byte G2 = byteStrings.get(i4).G(i10);
                int i20 = i4 + 1;
                int i21 = i20;
                while (true) {
                    if (i21 >= toIndex) {
                        i6 = toIndex;
                        break;
                    } else {
                        if (G2 != byteStrings.get(i21).G(i10)) {
                            i6 = i21;
                            break;
                        }
                        i21++;
                    }
                }
                if (i20 == i6 && i10 + 1 == byteStrings.get(i4).q()) {
                    node.writeInt(indexes.get(i4).intValue());
                    i7 = i6;
                    mVar = mVar3;
                } else {
                    node.writeInt(((int) (c6 + c(mVar3))) * i12);
                    i7 = i6;
                    mVar = mVar3;
                    a(c6, mVar3, i10 + 1, byteStrings, i4, i6, indexes);
                }
                mVar3 = mVar;
                i4 = i7;
                i12 = -1;
            }
            node.b1(mVar3);
        }

        static /* synthetic */ void b(Companion companion, long j4, m mVar, int i4, List list, int i5, int i6, List list2, int i7, Object obj) {
            companion.a((i7 & 1) != 0 ? 0L : j4, mVar, (i7 & 4) != 0 ? 0 : i4, list, (i7 & 16) != 0 ? 0 : i5, (i7 & 32) != 0 ? list.size() : i6, list2);
        }

        private final long c(m mVar) {
            return mVar.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x00ec, code lost:
        
            continue;
         */
        @fg.l
        @kd.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okio.d0 d(@fg.l okio.p... r17) {
            /*
                Method dump skipped, instructions count: 333
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

    @fg.l
    @kd.n
    public static final d0 m(@fg.l p... pVarArr) {
        return INSTANCE.d(pVarArr);
    }

    @Override // kotlin.collections.c, kotlin.collections.a
    /* renamed from: b */
    public int getSize() {
        return this.byteStrings.length;
    }

    public /* bridge */ boolean c(p pVar) {
        return super.contains(pVar);
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof p) {
            return super.contains((p) obj);
        }
        return false;
    }

    @fg.l
    public p f(int index) {
        return this.byteStrings[index];
    }

    @Override // kotlin.collections.c, java.util.List
    public Object get(int i4) {
        return this.byteStrings[i4];
    }

    @fg.l
    /* renamed from: h, reason: from getter */
    public final p[] getByteStrings() {
        return this.byteStrings;
    }

    @fg.l
    /* renamed from: i, reason: from getter */
    public final int[] getTrie() {
        return this.trie;
    }

    @Override // kotlin.collections.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof p) {
            return super.indexOf((p) obj);
        }
        return -1;
    }

    public /* bridge */ int j(p pVar) {
        return super.indexOf(pVar);
    }

    public /* bridge */ int l(p pVar) {
        return super.lastIndexOf(pVar);
    }

    @Override // kotlin.collections.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof p) {
            return super.lastIndexOf((p) obj);
        }
        return -1;
    }

    private d0(p[] pVarArr, int[] iArr) {
        this.byteStrings = pVarArr;
        this.trie = iArr;
    }
}

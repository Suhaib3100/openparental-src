package okhttp3.internal.http2;

import androidx.core.view.s1;
import androidx.recyclerview.widget.o;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.l0;
import okio.n;

/* compiled from: Huffman.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\bJ\u001e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001a¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/http2/j;", "", "", "symbol", "code", "codeBitCount", "Lkotlin/m2;", "a", "Lokio/p;", "source", "Lokio/n;", "sink", "c", "bytes", "d", "Lokio/o;", "", "byteCount", "b", "", "[I", "CODES", "", "[B", "CODE_BIT_COUNTS", "Lokhttp3/internal/http2/j$a;", "Lokhttp3/internal/http2/j$a;", "root", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final int[] CODES;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final byte[] CODE_BIT_COUNTS;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final a root;

    /* renamed from: d, reason: collision with root package name */
    public static final j f31242d;

    static {
        j jVar = new j();
        f31242d = jVar;
        CODES = new int[]{8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, s1.f5677r, s1.f5678s, 4090, 8185, 21, 248, 2042, s1.f5679t, s1.f5680u, 249, 2043, o.f.f9513c, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, s1.f5681v, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};
        byte[] bArr = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
        CODE_BIT_COUNTS = bArr;
        root = new a();
        int length = bArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            jVar.a(i5, CODES[i5], CODE_BIT_COUNTS[i5]);
        }
    }

    private j() {
    }

    private final void a(int i5, int i6, int i7) {
        a aVar = new a(i5, i7);
        a aVar2 = root;
        while (i7 > 8) {
            i7 -= 8;
            int i8 = (i6 >>> i7) & 255;
            a[] children = aVar2.getChildren();
            l0.m(children);
            a aVar3 = children[i8];
            if (aVar3 == null) {
                aVar3 = new a();
                children[i8] = aVar3;
            }
            aVar2 = aVar3;
        }
        int i9 = 8 - i7;
        int i10 = (i6 << i9) & 255;
        a[] children2 = aVar2.getChildren();
        l0.m(children2);
        p.M1(children2, aVar, i10, (1 << i9) + i10);
    }

    public final void b(@d5.d okio.o oVar, long j5, @d5.d n nVar) {
        l0.p(oVar, ProtectedSandApp.s("擡"));
        l0.p(nVar, ProtectedSandApp.s("擢"));
        a aVar = root;
        int i5 = 0;
        int i6 = 0;
        for (long j6 = 0; j6 < j5; j6++) {
            i5 = (i5 << 8) | okhttp3.internal.d.b(oVar.readByte(), 255);
            i6 += 8;
            while (i6 >= 8) {
                int i7 = i6 - 8;
                a[] children = aVar.getChildren();
                l0.m(children);
                aVar = children[(i5 >>> i7) & 255];
                l0.m(aVar);
                if (aVar.getChildren() == null) {
                    nVar.writeByte(aVar.getSymbol());
                    i6 -= aVar.getTerminalBitCount();
                    aVar = root;
                } else {
                    i6 = i7;
                }
            }
        }
        while (i6 > 0) {
            a[] children2 = aVar.getChildren();
            l0.m(children2);
            a aVar2 = children2[(i5 << (8 - i6)) & 255];
            l0.m(aVar2);
            if (aVar2.getChildren() != null || aVar2.getTerminalBitCount() > i6) {
                return;
            }
            nVar.writeByte(aVar2.getSymbol());
            i6 -= aVar2.getTerminalBitCount();
            aVar = root;
        }
    }

    public final void c(@d5.d okio.p pVar, @d5.d n nVar) throws IOException {
        l0.p(pVar, ProtectedSandApp.s("擣"));
        l0.p(nVar, ProtectedSandApp.s("擤"));
        int i02 = pVar.i0();
        long j5 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i02; i6++) {
            int b6 = okhttp3.internal.d.b(pVar.x(i6), 255);
            int i7 = CODES[b6];
            byte b7 = CODE_BIT_COUNTS[b6];
            j5 = (j5 << b7) | i7;
            i5 += b7;
            while (i5 >= 8) {
                i5 -= 8;
                nVar.writeByte((int) (j5 >> i5));
            }
        }
        if (i5 > 0) {
            nVar.writeByte((int) ((j5 << (8 - i5)) | (255 >>> i5)));
        }
    }

    public final int d(@d5.d okio.p bytes) {
        l0.p(bytes, ProtectedSandApp.s("擥"));
        long j5 = 0;
        for (int i5 = 0; i5 < bytes.i0(); i5++) {
            j5 += CODE_BIT_COUNTS[okhttp3.internal.d.b(bytes.x(i5), 255)];
        }
        return (int) ((j5 + 7) >> 3);
    }

    /* compiled from: Huffman.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u000e\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u0011R!\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\f\u0010\n¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/http2/j$a;", "", "", "a", "[Lokhttp3/internal/http2/j$a;", "()[Lokhttp3/internal/http2/j$a;", "children", "", "b", "I", "()I", "symbol", "c", "terminalBitCount", "<init>", "()V", "bits", "(II)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private final a[] children;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int symbol;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int terminalBitCount;

        public a() {
            this.children = new a[256];
            this.symbol = 0;
            this.terminalBitCount = 0;
        }

        @d5.e
        /* renamed from: a, reason: from getter */
        public final a[] getChildren() {
            return this.children;
        }

        /* renamed from: b, reason: from getter */
        public final int getSymbol() {
            return this.symbol;
        }

        /* renamed from: c, reason: from getter */
        public final int getTerminalBitCount() {
            return this.terminalBitCount;
        }

        public a(int i5, int i6) {
            this.children = null;
            this.symbol = i5;
            int i7 = i6 & 7;
            this.terminalBitCount = i7 == 0 ? 8 : i7;
        }
    }
}

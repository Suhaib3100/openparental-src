package okhttp3.internal.http2;

import androidx.core.view.h1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.m;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okio.n;
import okio.o;
import okio.p;

/* compiled from: Huffman.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 ¨\u0006\""}, d2 = {"Lokhttp3/internal/http2/j;", "", "<init>", "()V", "", "symbol", "code", "codeBitCount", "Lkotlin/k2;", "a", "(III)V", "Lokio/p;", "source", "Lokio/n;", "sink", "c", "(Lokio/p;Lokio/n;)V", "bytes", "d", "(Lokio/p;)I", "Lokio/o;", "", "byteCount", "b", "(Lokio/o;JLokio/n;)V", "", "[I", "CODES", "", "[B", "CODE_BIT_COUNTS", "Lokhttp3/internal/http2/j$a;", "Lokhttp3/internal/http2/j$a;", "root", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final int[] CODES;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final byte[] CODE_BIT_COUNTS;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final a root;

    /* renamed from: d, reason: collision with root package name */
    public static final j f84782d;

    static {
        j jVar = new j();
        f84782d = jVar;
        CODES = new int[]{8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, h1.f27211r, h1.f27212s, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};
        byte[] bArr = {13, com.google.common.base.c.A, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.B, com.google.common.base.c.H, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.H, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.H, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, com.google.common.base.c.F, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, com.google.common.base.c.f54871q, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, com.google.common.base.c.f54871q, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, com.google.common.base.c.f54871q, 11, 14, 13, com.google.common.base.c.F, com.google.common.base.c.f54878x, com.google.common.base.c.f54880z, com.google.common.base.c.f54878x, com.google.common.base.c.f54878x, com.google.common.base.c.f54880z, com.google.common.base.c.f54880z, com.google.common.base.c.f54880z, com.google.common.base.c.A, com.google.common.base.c.f54880z, com.google.common.base.c.A, com.google.common.base.c.A, com.google.common.base.c.A, com.google.common.base.c.A, com.google.common.base.c.A, com.google.common.base.c.B, com.google.common.base.c.A, com.google.common.base.c.B, com.google.common.base.c.B, com.google.common.base.c.f54880z, com.google.common.base.c.A, com.google.common.base.c.B, com.google.common.base.c.A, com.google.common.base.c.A, com.google.common.base.c.A, com.google.common.base.c.A, com.google.common.base.c.f54879y, com.google.common.base.c.f54880z, com.google.common.base.c.A, com.google.common.base.c.f54880z, com.google.common.base.c.A, com.google.common.base.c.A, com.google.common.base.c.B, com.google.common.base.c.f54880z, com.google.common.base.c.f54879y, com.google.common.base.c.f54878x, com.google.common.base.c.f54880z, com.google.common.base.c.f54880z, com.google.common.base.c.A, com.google.common.base.c.A, com.google.common.base.c.f54879y, com.google.common.base.c.A, com.google.common.base.c.f54880z, com.google.common.base.c.f54880z, com.google.common.base.c.B, com.google.common.base.c.f54879y, com.google.common.base.c.f54880z, com.google.common.base.c.A, com.google.common.base.c.A, com.google.common.base.c.f54879y, com.google.common.base.c.f54879y, com.google.common.base.c.f54880z, com.google.common.base.c.f54879y, com.google.common.base.c.A, com.google.common.base.c.f54880z, com.google.common.base.c.A, com.google.common.base.c.A, com.google.common.base.c.f54878x, com.google.common.base.c.f54880z, com.google.common.base.c.f54880z, com.google.common.base.c.f54880z, com.google.common.base.c.A, com.google.common.base.c.f54880z, com.google.common.base.c.f54880z, com.google.common.base.c.A, 26, 26, com.google.common.base.c.f54878x, 19, com.google.common.base.c.f54880z, com.google.common.base.c.A, com.google.common.base.c.f54880z, com.google.common.base.c.C, 26, 26, 26, 27, 27, 26, com.google.common.base.c.B, com.google.common.base.c.C, 19, com.google.common.base.c.f54879y, 26, 27, 27, 26, 27, com.google.common.base.c.B, com.google.common.base.c.f54879y, com.google.common.base.c.f54879y, 26, 26, com.google.common.base.c.F, 27, 27, 27, com.google.common.base.c.f54878x, com.google.common.base.c.B, com.google.common.base.c.f54878x, com.google.common.base.c.f54879y, com.google.common.base.c.f54880z, com.google.common.base.c.f54879y, com.google.common.base.c.f54879y, com.google.common.base.c.A, com.google.common.base.c.f54880z, com.google.common.base.c.f54880z, com.google.common.base.c.C, com.google.common.base.c.C, com.google.common.base.c.B, com.google.common.base.c.B, 26, com.google.common.base.c.A, 26, 27, 26, 26, 27, 27, 27, 27, 27, com.google.common.base.c.F, 27, 27, 27, 27, 27, 26};
        CODE_BIT_COUNTS = bArr;
        root = new a();
        int length = bArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            jVar.a(i4, CODES[i4], CODE_BIT_COUNTS[i4]);
        }
    }

    private j() {
    }

    private final void a(int symbol, int code, int codeBitCount) {
        a aVar = new a(symbol, codeBitCount);
        a aVar2 = root;
        while (codeBitCount > 8) {
            codeBitCount -= 8;
            int i4 = (code >>> codeBitCount) & 255;
            a[] children = aVar2.getChildren();
            l0.m(children);
            a aVar3 = children[i4];
            if (aVar3 == null) {
                aVar3 = new a();
                children[i4] = aVar3;
            }
            aVar2 = aVar3;
        }
        int i5 = 8 - codeBitCount;
        int i6 = (code << i5) & 255;
        a[] children2 = aVar2.getChildren();
        l0.m(children2);
        kotlin.collections.l.M1(children2, aVar, i6, (1 << i5) + i6);
    }

    public final void b(@fg.l o source, long byteCount, @fg.l n sink) {
        l0.p(source, ProtectedSandApp.s("ᶁ"));
        l0.p(sink, ProtectedSandApp.s("ᶂ"));
        a aVar = root;
        int i4 = 0;
        int i5 = 0;
        for (long j4 = 0; j4 < byteCount; j4++) {
            i4 = (i4 << 8) | okhttp3.internal.d.b(source.readByte(), 255);
            i5 += 8;
            while (i5 >= 8) {
                int i6 = i5 - 8;
                a[] children = aVar.getChildren();
                l0.m(children);
                aVar = children[(i4 >>> i6) & 255];
                l0.m(aVar);
                if (aVar.getChildren() == null) {
                    sink.writeByte(aVar.getSymbol());
                    i5 -= aVar.getTerminalBitCount();
                    aVar = root;
                } else {
                    i5 = i6;
                }
            }
        }
        while (i5 > 0) {
            a[] children2 = aVar.getChildren();
            l0.m(children2);
            a aVar2 = children2[(i4 << (8 - i5)) & 255];
            l0.m(aVar2);
            if (aVar2.getChildren() != null || aVar2.getTerminalBitCount() > i5) {
                return;
            }
            sink.writeByte(aVar2.getSymbol());
            i5 -= aVar2.getTerminalBitCount();
            aVar = root;
        }
    }

    public final void c(@fg.l p source, @fg.l n sink) throws IOException {
        l0.p(source, ProtectedSandApp.s("ᶁ"));
        l0.p(sink, ProtectedSandApp.s("ᶂ"));
        int q4 = source.q();
        long j4 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < q4; i5++) {
            int b5 = okhttp3.internal.d.b(source.G(i5), 255);
            int i6 = CODES[b5];
            byte b6 = CODE_BIT_COUNTS[b5];
            j4 = (j4 << b6) | i6;
            i4 += b6;
            while (i4 >= 8) {
                i4 -= 8;
                sink.writeByte((int) (j4 >> i4));
            }
        }
        if (i4 > 0) {
            sink.writeByte((int) ((j4 << (8 - i4)) | (255 >>> i4)));
        }
    }

    public final int d(@fg.l p bytes) {
        l0.p(bytes, ProtectedSandApp.s("ᶃ"));
        long j4 = 0;
        for (int i4 = 0; i4 < bytes.q(); i4++) {
            j4 += CODE_BIT_COUNTS[okhttp3.internal.d.b(bytes.G(i4), 255)];
        }
        return (int) ((j4 + 7) >> 3);
    }

    /* compiled from: Huffman.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0007R!\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/http2/j$a;", "", "<init>", "()V", "", "symbol", "bits", "(II)V", "", "a", "[Lokhttp3/internal/http2/j$a;", "()[Lokhttp3/internal/http2/j$a;", "children", "b", "I", "()I", "c", "terminalBitCount", "okhttp"}, k = 1, mv = {1, 4, 0})
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @m
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

        @m
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

        public a(int i4, int i5) {
            this.children = null;
            this.symbol = i4;
            int i6 = i5 & 7;
            this.terminalBitCount = i6 == 0 ? 8 : i6;
        }
    }
}

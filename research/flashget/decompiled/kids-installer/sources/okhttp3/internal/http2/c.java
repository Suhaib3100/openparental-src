package okhttp3.internal.http2;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okio.a0;
import okio.m;
import okio.o;
import okio.o0;
import okio.p;

/* compiled from: Hpack.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0007\nB\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\f\u0010\u0017R#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\n\u0010\u001b¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/http2/c;", "", "", "Lokio/p;", "", "d", "name", "a", "I", "PREFIX_4_BITS", "b", "PREFIX_5_BITS", "c", "PREFIX_6_BITS", "PREFIX_7_BITS", "e", "SETTINGS_HEADER_TABLE_SIZE", "f", "SETTINGS_HEADER_TABLE_SIZE_LIMIT", "", "Lokhttp3/internal/http2/b;", "g", "[Lokhttp3/internal/http2/b;", "()[Lokhttp3/internal/http2/b;", "STATIC_HEADER_TABLE", "h", "Ljava/util/Map;", "()Ljava/util/Map;", "NAME_TO_FIRST_INDEX", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final int PREFIX_4_BITS = 15;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final int PREFIX_5_BITS = 31;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final int PREFIX_6_BITS = 63;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final int PREFIX_7_BITS = 127;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private static final okhttp3.internal.http2.b[] STATIC_HEADER_TABLE;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private static final Map<p, Integer> NAME_TO_FIRST_INDEX;

    /* renamed from: i, reason: collision with root package name */
    public static final c f31040i;

    /* compiled from: Hpack.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010%\u001a\u00020/\u0012\u0006\u0010-\u001a\u00020\u0005\u0012\b\b\u0002\u0010.\u001a\u00020\u0005¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0002J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018J\u0006\u0010\u001a\u001a\u00020\u0005J\u0006\u0010\u001b\u001a\u00020\u0002J\u0016\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005J\u0006\u0010\u001f\u001a\u00020\u0010R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00140 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u001e\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140&8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010'R\u0016\u0010*\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0016\u0010+\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u0016\u0010,\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010)R\u0014\u0010-\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010)R\u0016\u0010.\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010)¨\u00062"}, d2 = {"Lokhttp3/internal/http2/c$a;", "", "Lkotlin/m2;", "a", "b", "", "bytesToRecover", "d", "index", "m", "c", "q", "r", "nameIndex", "o", "p", "Lokio/p;", "f", "", "h", "Lokhttp3/internal/http2/b;", "entry", "g", "j", "", "e", "i", "l", "firstByte", "prefixMask", "n", "k", "", "Ljava/util/List;", "headerList", "Lokio/o;", "Lokio/o;", "source", "", "[Lokhttp3/internal/http2/b;", "dynamicTable", "I", "nextHeaderIndex", "headerCount", "dynamicTableByteCount", "headerTableSizeSetting", "maxDynamicTableByteCount", "Lokio/o0;", "<init>", "(Lokio/o0;II)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<okhttp3.internal.http2.b> headerList;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final o source;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public okhttp3.internal.http2.b[] dynamicTable;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int nextHeaderIndex;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @p3.f
        public int headerCount;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @p3.f
        public int dynamicTableByteCount;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final int headerTableSizeSetting;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private int maxDynamicTableByteCount;

        @p3.j
        public a(@d5.d o0 o0Var, int i5) {
            this(o0Var, i5, 0, 4, null);
        }

        private final void a() {
            int i5 = this.maxDynamicTableByteCount;
            int i6 = this.dynamicTableByteCount;
            if (i5 < i6) {
                if (i5 == 0) {
                    b();
                } else {
                    d(i6 - i5);
                }
            }
        }

        private final void b() {
            kotlin.collections.p.V1(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int c(int index) {
            return this.nextHeaderIndex + 1 + index;
        }

        private final int d(int bytesToRecover) {
            int i5;
            int i6 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i5 = this.nextHeaderIndex;
                    if (length < i5 || bytesToRecover <= 0) {
                        break;
                    }
                    okhttp3.internal.http2.b bVar = this.dynamicTable[length];
                    l0.m(bVar);
                    int i7 = bVar.hpackSize;
                    bytesToRecover -= i7;
                    this.dynamicTableByteCount -= i7;
                    this.headerCount--;
                    i6++;
                }
                okhttp3.internal.http2.b[] bVarArr = this.dynamicTable;
                System.arraycopy(bVarArr, i5 + 1, bVarArr, i5 + 1 + i6, this.headerCount);
                this.nextHeaderIndex += i6;
            }
            return i6;
        }

        private final p f(int index) throws IOException {
            if (h(index)) {
                return c.f31040i.c()[index].name;
            }
            int length = this.nextHeaderIndex + 1 + (index - c.f31040i.c().length);
            if (length >= 0) {
                okhttp3.internal.http2.b[] bVarArr = this.dynamicTable;
                if (length < bVarArr.length) {
                    okhttp3.internal.http2.b bVar = bVarArr[length];
                    l0.m(bVar);
                    return bVar.name;
                }
            }
            throw new IOException(ProtectedSandApp.s("探") + (index + 1));
        }

        private final void g(int i5, okhttp3.internal.http2.b bVar) {
            this.headerList.add(bVar);
            int i6 = bVar.hpackSize;
            if (i5 != -1) {
                okhttp3.internal.http2.b bVar2 = this.dynamicTable[this.nextHeaderIndex + 1 + i5];
                l0.m(bVar2);
                i6 -= bVar2.hpackSize;
            }
            int i7 = this.maxDynamicTableByteCount;
            if (i6 > i7) {
                b();
                return;
            }
            int d6 = d((this.dynamicTableByteCount + i6) - i7);
            if (i5 == -1) {
                int i8 = this.headerCount + 1;
                okhttp3.internal.http2.b[] bVarArr = this.dynamicTable;
                if (i8 > bVarArr.length) {
                    okhttp3.internal.http2.b[] bVarArr2 = new okhttp3.internal.http2.b[bVarArr.length * 2];
                    System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = bVarArr2;
                }
                int i9 = this.nextHeaderIndex;
                this.nextHeaderIndex = i9 - 1;
                this.dynamicTable[i9] = bVar;
                this.headerCount++;
            } else {
                this.dynamicTable[this.nextHeaderIndex + 1 + i5 + d6 + i5] = bVar;
            }
            this.dynamicTableByteCount += i6;
        }

        private final boolean h(int index) {
            return index >= 0 && index <= c.f31040i.c().length - 1;
        }

        private final int j() throws IOException {
            return okhttp3.internal.d.b(this.source.readByte(), 255);
        }

        private final void m(int i5) throws IOException {
            if (h(i5)) {
                this.headerList.add(c.f31040i.c()[i5]);
                return;
            }
            int length = this.nextHeaderIndex + 1 + (i5 - c.f31040i.c().length);
            if (length >= 0) {
                okhttp3.internal.http2.b[] bVarArr = this.dynamicTable;
                if (length < bVarArr.length) {
                    List<okhttp3.internal.http2.b> list = this.headerList;
                    okhttp3.internal.http2.b bVar = bVarArr[length];
                    l0.m(bVar);
                    list.add(bVar);
                    return;
                }
            }
            throw new IOException(ProtectedSandApp.s("掣") + (i5 + 1));
        }

        private final void o(int i5) throws IOException {
            g(-1, new okhttp3.internal.http2.b(f(i5), k()));
        }

        private final void p() throws IOException {
            g(-1, new okhttp3.internal.http2.b(c.f31040i.a(k()), k()));
        }

        private final void q(int i5) throws IOException {
            this.headerList.add(new okhttp3.internal.http2.b(f(i5), k()));
        }

        private final void r() throws IOException {
            this.headerList.add(new okhttp3.internal.http2.b(c.f31040i.a(k()), k()));
        }

        @d5.d
        public final List<okhttp3.internal.http2.b> e() {
            List<okhttp3.internal.http2.b> V5;
            V5 = j0.V5(this.headerList);
            this.headerList.clear();
            return V5;
        }

        /* renamed from: i, reason: from getter */
        public final int getMaxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        @d5.d
        public final p k() throws IOException {
            int j5 = j();
            boolean z5 = (j5 & 128) == 128;
            long n5 = n(j5, 127);
            if (!z5) {
                return this.source.v(n5);
            }
            m mVar = new m();
            j.f31242d.b(this.source, n5, mVar);
            return mVar.x0();
        }

        public final void l() throws IOException {
            while (!this.source.M()) {
                int b6 = okhttp3.internal.d.b(this.source.readByte(), 255);
                if (b6 == 128) {
                    throw new IOException(ProtectedSandApp.s("接"));
                }
                if ((b6 & 128) == 128) {
                    m(n(b6, 127) - 1);
                } else if (b6 == 64) {
                    p();
                } else if ((b6 & 64) == 64) {
                    o(n(b6, 63) - 1);
                } else if ((b6 & 32) == 32) {
                    int n5 = n(b6, 31);
                    this.maxDynamicTableByteCount = n5;
                    if (n5 < 0 || n5 > this.headerTableSizeSetting) {
                        throw new IOException(ProtectedSandApp.s("掤") + this.maxDynamicTableByteCount);
                    }
                    a();
                } else if (b6 == 16 || b6 == 0) {
                    r();
                } else {
                    q(n(b6, 15) - 1);
                }
            }
        }

        public final int n(int firstByte, int prefixMask) throws IOException {
            int i5 = firstByte & prefixMask;
            if (i5 < prefixMask) {
                return i5;
            }
            int i6 = 0;
            while (true) {
                int j5 = j();
                if ((j5 & 128) == 0) {
                    return prefixMask + (j5 << i6);
                }
                prefixMask += (j5 & 127) << i6;
                i6 += 7;
            }
        }

        @p3.j
        public a(@d5.d o0 o0Var, int i5, int i6) {
            l0.p(o0Var, ProtectedSandApp.s("採"));
            this.headerTableSizeSetting = i5;
            this.maxDynamicTableByteCount = i6;
            this.headerList = new ArrayList();
            this.source = a0.d(o0Var);
            this.dynamicTable = new okhttp3.internal.http2.b[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        public /* synthetic */ a(o0 o0Var, int i5, int i6, int i7, w wVar) {
            this(o0Var, i5, (i7 & 4) != 0 ? i5 : i6);
        }
    }

    /* compiled from: Hpack.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010$\u001a\u00020\u0019\u0012\u0006\u0010(\u001a\u00020%¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0014\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bJ\u001e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u001e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0016\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0016\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0014\u0010$\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lokhttp3/internal/http2/c$b;", "", "Lkotlin/m2;", "b", "", "bytesToRecover", "c", "Lokhttp3/internal/http2/b;", "entry", "d", "a", "", "headerBlock", "g", "value", "prefixMask", "bits", "h", "Lokio/p;", "data", "f", "headerTableSizeSetting", "e", "I", "smallestHeaderTableSizeSetting", "", "Z", "emitDynamicTableSizeUpdate", "maxDynamicTableByteCount", "", "[Lokhttp3/internal/http2/b;", "dynamicTable", "nextHeaderIndex", "headerCount", "dynamicTableByteCount", "i", "useCompression", "Lokio/m;", "j", "Lokio/m;", "out", "<init>", "(IZLokio/m;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int smallestHeaderTableSizeSetting;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean emitDynamicTableSizeUpdate;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @p3.f
        public int maxDynamicTableByteCount;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public okhttp3.internal.http2.b[] dynamicTable;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int nextHeaderIndex;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @p3.f
        public int headerCount;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @p3.f
        public int dynamicTableByteCount;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @p3.f
        public int headerTableSizeSetting;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final boolean useCompression;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final m out;

        @p3.j
        public b(int i5, @d5.d m mVar) {
            this(i5, false, mVar, 2, null);
        }

        private final void a() {
            int i5 = this.maxDynamicTableByteCount;
            int i6 = this.dynamicTableByteCount;
            if (i5 < i6) {
                if (i5 == 0) {
                    b();
                } else {
                    c(i6 - i5);
                }
            }
        }

        private final void b() {
            kotlin.collections.p.V1(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int c(int bytesToRecover) {
            int i5;
            int i6 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i5 = this.nextHeaderIndex;
                    if (length < i5 || bytesToRecover <= 0) {
                        break;
                    }
                    okhttp3.internal.http2.b bVar = this.dynamicTable[length];
                    l0.m(bVar);
                    bytesToRecover -= bVar.hpackSize;
                    int i7 = this.dynamicTableByteCount;
                    okhttp3.internal.http2.b bVar2 = this.dynamicTable[length];
                    l0.m(bVar2);
                    this.dynamicTableByteCount = i7 - bVar2.hpackSize;
                    this.headerCount--;
                    i6++;
                }
                okhttp3.internal.http2.b[] bVarArr = this.dynamicTable;
                System.arraycopy(bVarArr, i5 + 1, bVarArr, i5 + 1 + i6, this.headerCount);
                okhttp3.internal.http2.b[] bVarArr2 = this.dynamicTable;
                int i8 = this.nextHeaderIndex;
                Arrays.fill(bVarArr2, i8 + 1, i8 + 1 + i6, (Object) null);
                this.nextHeaderIndex += i6;
            }
            return i6;
        }

        private final void d(okhttp3.internal.http2.b bVar) {
            int i5 = bVar.hpackSize;
            int i6 = this.maxDynamicTableByteCount;
            if (i5 > i6) {
                b();
                return;
            }
            c((this.dynamicTableByteCount + i5) - i6);
            int i7 = this.headerCount + 1;
            okhttp3.internal.http2.b[] bVarArr = this.dynamicTable;
            if (i7 > bVarArr.length) {
                okhttp3.internal.http2.b[] bVarArr2 = new okhttp3.internal.http2.b[bVarArr.length * 2];
                System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = bVarArr2;
            }
            int i8 = this.nextHeaderIndex;
            this.nextHeaderIndex = i8 - 1;
            this.dynamicTable[i8] = bVar;
            this.headerCount++;
            this.dynamicTableByteCount += i5;
        }

        public final void e(int i5) {
            this.headerTableSizeSetting = i5;
            int min = Math.min(i5, 16384);
            int i6 = this.maxDynamicTableByteCount;
            if (i6 == min) {
                return;
            }
            if (min < i6) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, min);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = min;
            a();
        }

        public final void f(@d5.d p pVar) throws IOException {
            l0.p(pVar, ProtectedSandApp.s("控"));
            if (this.useCompression) {
                j jVar = j.f31242d;
                if (jVar.d(pVar) < pVar.i0()) {
                    m mVar = new m();
                    jVar.c(pVar, mVar);
                    p x02 = mVar.x0();
                    h(x02.i0(), 127, 128);
                    this.out.S0(x02);
                    return;
                }
            }
            h(pVar.i0(), 127, 0);
            this.out.S0(pVar);
        }

        public final void g(@d5.d List<okhttp3.internal.http2.b> list) throws IOException {
            int i5;
            int i6;
            l0.p(list, ProtectedSandApp.s("推"));
            if (this.emitDynamicTableSizeUpdate) {
                int i7 = this.smallestHeaderTableSizeSetting;
                if (i7 < this.maxDynamicTableByteCount) {
                    h(i7, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                h(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                okhttp3.internal.http2.b bVar = list.get(i8);
                p q02 = bVar.name.q0();
                p pVar = bVar.value;
                c cVar = c.f31040i;
                Integer num = cVar.b().get(q02);
                if (num != null) {
                    i6 = num.intValue() + 1;
                    if (2 <= i6 && 7 >= i6) {
                        if (l0.g(cVar.c()[i6 - 1].value, pVar)) {
                            i5 = i6;
                        } else if (l0.g(cVar.c()[i6].value, pVar)) {
                            i6++;
                            i5 = i6;
                        }
                    }
                    i5 = i6;
                    i6 = -1;
                } else {
                    i5 = -1;
                    i6 = -1;
                }
                if (i6 == -1) {
                    int i9 = this.nextHeaderIndex + 1;
                    int length = this.dynamicTable.length;
                    while (true) {
                        if (i9 >= length) {
                            break;
                        }
                        okhttp3.internal.http2.b bVar2 = this.dynamicTable[i9];
                        l0.m(bVar2);
                        if (l0.g(bVar2.name, q02)) {
                            okhttp3.internal.http2.b bVar3 = this.dynamicTable[i9];
                            l0.m(bVar3);
                            if (l0.g(bVar3.value, pVar)) {
                                i6 = c.f31040i.c().length + (i9 - this.nextHeaderIndex);
                                break;
                            } else if (i5 == -1) {
                                i5 = (i9 - this.nextHeaderIndex) + c.f31040i.c().length;
                            }
                        }
                        i9++;
                    }
                }
                if (i6 != -1) {
                    h(i6, 127, 128);
                } else if (i5 == -1) {
                    this.out.writeByte(64);
                    f(q02);
                    f(pVar);
                    d(bVar);
                } else if (q02.j0(okhttp3.internal.http2.b.f31017d) && (!l0.g(okhttp3.internal.http2.b.f31027n, q02))) {
                    h(i5, 15, 0);
                    f(pVar);
                } else {
                    h(i5, 63, 64);
                    f(pVar);
                    d(bVar);
                }
            }
        }

        public final void h(int i5, int i6, int i7) {
            if (i5 < i6) {
                this.out.writeByte(i5 | i7);
                return;
            }
            this.out.writeByte(i7 | i6);
            int i8 = i5 - i6;
            while (i8 >= 128) {
                this.out.writeByte(128 | (i8 & 127));
                i8 >>>= 7;
            }
            this.out.writeByte(i8);
        }

        @p3.j
        public b(@d5.d m mVar) {
            this(0, false, mVar, 3, null);
        }

        @p3.j
        public b(int i5, boolean z5, @d5.d m mVar) {
            l0.p(mVar, ProtectedSandApp.s("掦"));
            this.headerTableSizeSetting = i5;
            this.useCompression = z5;
            this.out = mVar;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i5;
            this.dynamicTable = new okhttp3.internal.http2.b[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        public /* synthetic */ b(int i5, boolean z5, m mVar, int i6, w wVar) {
            this((i6 & 1) != 0 ? 4096 : i5, (i6 & 2) != 0 ? true : z5, mVar);
        }
    }

    static {
        c cVar = new c();
        f31040i = cVar;
        p pVar = okhttp3.internal.http2.b.f31024k;
        p pVar2 = okhttp3.internal.http2.b.f31025l;
        p pVar3 = okhttp3.internal.http2.b.f31026m;
        p pVar4 = okhttp3.internal.http2.b.f31023j;
        STATIC_HEADER_TABLE = new okhttp3.internal.http2.b[]{new okhttp3.internal.http2.b(okhttp3.internal.http2.b.f31027n, ""), new okhttp3.internal.http2.b(pVar, ProtectedSandApp.s("掩")), new okhttp3.internal.http2.b(pVar, ProtectedSandApp.s("措")), new okhttp3.internal.http2.b(pVar2, ProtectedSandApp.s("掫")), new okhttp3.internal.http2.b(pVar2, ProtectedSandApp.s("掬")), new okhttp3.internal.http2.b(pVar3, ProtectedSandApp.s("掭")), new okhttp3.internal.http2.b(pVar3, ProtectedSandApp.s("掮")), new okhttp3.internal.http2.b(pVar4, ProtectedSandApp.s("掯")), new okhttp3.internal.http2.b(pVar4, ProtectedSandApp.s("掰")), new okhttp3.internal.http2.b(pVar4, ProtectedSandApp.s("掱")), new okhttp3.internal.http2.b(pVar4, ProtectedSandApp.s("掲")), new okhttp3.internal.http2.b(pVar4, ProtectedSandApp.s("掳")), new okhttp3.internal.http2.b(pVar4, ProtectedSandApp.s("掴")), new okhttp3.internal.http2.b(pVar4, ProtectedSandApp.s("掵")), new okhttp3.internal.http2.b(ProtectedSandApp.s("掶"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("掷"), ProtectedSandApp.s("掸")), new okhttp3.internal.http2.b(ProtectedSandApp.s("掹"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("掺"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("掻"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("掼"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("掽"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("掾"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("掿"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揀"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揁"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揂"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揃"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揄"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揅"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揆"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揇"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揈"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揉"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揊"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揋"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揌"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揍"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揎"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("描"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("提"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揑"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("插"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揓"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揔"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揕"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揖"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揗"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揘"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揙"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揚"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("換"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揜"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揝"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揞"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揟"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揠"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("握"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揢"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揣"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揤"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("揥"), "")};
        NAME_TO_FIRST_INDEX = cVar.d();
    }

    private c() {
    }

    private final Map<p, Integer> d() {
        okhttp3.internal.http2.b[] bVarArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bVarArr.length);
        int length = bVarArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            okhttp3.internal.http2.b[] bVarArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(bVarArr2[i5].name)) {
                linkedHashMap.put(bVarArr2[i5].name, Integer.valueOf(i5));
            }
        }
        Map<p, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        l0.o(unmodifiableMap, ProtectedSandApp.s("揦"));
        return unmodifiableMap;
    }

    @d5.d
    public final p a(@d5.d p name) throws IOException {
        l0.p(name, ProtectedSandApp.s("揧"));
        int i02 = name.i0();
        for (int i5 = 0; i5 < i02; i5++) {
            byte b6 = (byte) 65;
            byte b7 = (byte) 90;
            byte x5 = name.x(i5);
            if (b6 <= x5 && b7 >= x5) {
                throw new IOException(ProtectedSandApp.s("揨") + name.t0());
            }
        }
        return name;
    }

    @d5.d
    public final Map<p, Integer> b() {
        return NAME_TO_FIRST_INDEX;
    }

    @d5.d
    public final okhttp3.internal.http2.b[] c() {
        return STATIC_HEADER_TABLE;
    }
}

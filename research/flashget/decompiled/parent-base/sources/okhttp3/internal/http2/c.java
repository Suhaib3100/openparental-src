package okhttp3.internal.http2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import okio.a0;
import okio.m;
import okio.o;
import okio.o0;
import okio.p;

/* compiled from: Hpack.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\n\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0010\u0010\u001bR#\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u000e\u0010\b¨\u0006 "}, d2 = {"Lokhttp3/internal/http2/c;", "", "<init>", "()V", "", "Lokio/p;", "", "d", "()Ljava/util/Map;", "name", "a", "(Lokio/p;)Lokio/p;", "I", "PREFIX_4_BITS", "b", "PREFIX_5_BITS", "c", "PREFIX_6_BITS", "PREFIX_7_BITS", "e", "SETTINGS_HEADER_TABLE_SIZE", "f", "SETTINGS_HEADER_TABLE_SIZE_LIMIT", "", "Lokhttp3/internal/http2/b;", "g", "[Lokhttp3/internal/http2/b;", "()[Lokhttp3/internal/http2/b;", "STATIC_HEADER_TABLE", "h", "Ljava/util/Map;", "NAME_TO_FIRST_INDEX", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
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
    @fg.l
    private static final okhttp3.internal.http2.b[] STATIC_HEADER_TABLE;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final Map<p, Integer> NAME_TO_FIRST_INDEX;

    /* renamed from: i, reason: collision with root package name */
    public static final c f84567i;

    /* compiled from: Hpack.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0%¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0004¢\u0006\u0004\b(\u0010$J\r\u0010)\u001a\u00020\t¢\u0006\u0004\b)\u0010\u000bJ\u001d\u0010,\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0019¢\u0006\u0004\b.\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u001f008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00101R\u0014\u0010\u0003\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00104R\u001e\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u00106R\u0016\u00109\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00108R\u0016\u0010:\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u00108R\u0016\u0010;\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00108R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00108¨\u0006<"}, d2 = {"Lokhttp3/internal/http2/c$a;", "", "Lokio/o0;", "source", "", "headerTableSizeSetting", "maxDynamicTableByteCount", "<init>", "(Lokio/o0;II)V", "Lkotlin/k2;", "a", "()V", "b", "bytesToRecover", "d", "(I)I", "index", "m", "(I)V", "c", "q", "r", "nameIndex", "o", "p", "Lokio/p;", "f", "(I)Lokio/p;", "", "h", "(I)Z", "Lokhttp3/internal/http2/b;", "entry", "g", "(ILokhttp3/internal/http2/b;)V", "j", "()I", "", "e", "()Ljava/util/List;", "i", "l", "firstByte", "prefixMask", "n", "(II)I", "k", "()Lokio/p;", "", "Ljava/util/List;", "headerList", "Lokio/o;", "Lokio/o;", "", "[Lokhttp3/internal/http2/b;", "dynamicTable", "I", "nextHeaderIndex", "headerCount", "dynamicTableByteCount", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<okhttp3.internal.http2.b> headerList;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final o source;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        @kd.f
        public okhttp3.internal.http2.b[] dynamicTable;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int nextHeaderIndex;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public int headerCount;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public int dynamicTableByteCount;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final int headerTableSizeSetting;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private int maxDynamicTableByteCount;

        @kd.j
        public a(@fg.l o0 o0Var, int i4) {
            this(o0Var, i4, 0, 4, null);
        }

        private final void a() {
            int i4 = this.maxDynamicTableByteCount;
            int i5 = this.dynamicTableByteCount;
            if (i4 < i5) {
                if (i4 == 0) {
                    b();
                } else {
                    d(i5 - i4);
                }
            }
        }

        private final void b() {
            kotlin.collections.l.V1(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int c(int index) {
            return this.nextHeaderIndex + 1 + index;
        }

        private final int d(int bytesToRecover) {
            int i4;
            int i5 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i4 = this.nextHeaderIndex;
                    if (length < i4 || bytesToRecover <= 0) {
                        break;
                    }
                    okhttp3.internal.http2.b bVar = this.dynamicTable[length];
                    l0.m(bVar);
                    int i6 = bVar.hpackSize;
                    bytesToRecover -= i6;
                    this.dynamicTableByteCount -= i6;
                    this.headerCount--;
                    i5++;
                }
                okhttp3.internal.http2.b[] bVarArr = this.dynamicTable;
                System.arraycopy(bVarArr, i4 + 1, bVarArr, i4 + 1 + i5, this.headerCount);
                this.nextHeaderIndex += i5;
            }
            return i5;
        }

        private final p f(int index) throws IOException {
            if (h(index)) {
                return c.f84567i.c()[index].name;
            }
            int c5 = c(index - c.f84567i.c().length);
            if (c5 >= 0) {
                okhttp3.internal.http2.b[] bVarArr = this.dynamicTable;
                if (c5 < bVarArr.length) {
                    okhttp3.internal.http2.b bVar = bVarArr[c5];
                    l0.m(bVar);
                    return bVar.name;
                }
            }
            throw new IOException(ProtectedSandApp.s("ᱩ") + (index + 1));
        }

        private final void g(int index, okhttp3.internal.http2.b entry) {
            this.headerList.add(entry);
            int i4 = entry.hpackSize;
            if (index != -1) {
                okhttp3.internal.http2.b bVar = this.dynamicTable[c(index)];
                l0.m(bVar);
                i4 -= bVar.hpackSize;
            }
            int i5 = this.maxDynamicTableByteCount;
            if (i4 > i5) {
                b();
                return;
            }
            int d5 = d((this.dynamicTableByteCount + i4) - i5);
            if (index == -1) {
                int i6 = this.headerCount + 1;
                okhttp3.internal.http2.b[] bVarArr = this.dynamicTable;
                if (i6 > bVarArr.length) {
                    okhttp3.internal.http2.b[] bVarArr2 = new okhttp3.internal.http2.b[bVarArr.length * 2];
                    System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = bVarArr2;
                }
                int i7 = this.nextHeaderIndex;
                this.nextHeaderIndex = i7 - 1;
                this.dynamicTable[i7] = entry;
                this.headerCount++;
            } else {
                this.dynamicTable[c(index) + d5 + index] = entry;
            }
            this.dynamicTableByteCount += i4;
        }

        private final boolean h(int index) {
            return index >= 0 && index <= c.f84567i.c().length - 1;
        }

        private final int j() throws IOException {
            return okhttp3.internal.d.b(this.source.readByte(), 255);
        }

        private final void m(int index) throws IOException {
            if (h(index)) {
                this.headerList.add(c.f84567i.c()[index]);
                return;
            }
            int c5 = c(index - c.f84567i.c().length);
            if (c5 >= 0) {
                okhttp3.internal.http2.b[] bVarArr = this.dynamicTable;
                if (c5 < bVarArr.length) {
                    List<okhttp3.internal.http2.b> list = this.headerList;
                    okhttp3.internal.http2.b bVar = bVarArr[c5];
                    l0.m(bVar);
                    list.add(bVar);
                    return;
                }
            }
            throw new IOException(ProtectedSandApp.s("ᱩ") + (index + 1));
        }

        private final void o(int nameIndex) throws IOException {
            g(-1, new okhttp3.internal.http2.b(f(nameIndex), k()));
        }

        private final void p() throws IOException {
            g(-1, new okhttp3.internal.http2.b(c.f84567i.a(k()), k()));
        }

        private final void q(int index) throws IOException {
            this.headerList.add(new okhttp3.internal.http2.b(f(index), k()));
        }

        private final void r() throws IOException {
            this.headerList.add(new okhttp3.internal.http2.b(c.f84567i.a(k()), k()));
        }

        @fg.l
        public final List<okhttp3.internal.http2.b> e() {
            List<okhttp3.internal.http2.b> V5 = w.V5(this.headerList);
            this.headerList.clear();
            return V5;
        }

        /* renamed from: i, reason: from getter */
        public final int getMaxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        @fg.l
        public final p k() throws IOException {
            int j4 = j();
            boolean z4 = (j4 & 128) == 128;
            long n4 = n(j4, 127);
            if (!z4) {
                return this.source.b2(n4);
            }
            m mVar = new m();
            j.f84782d.b(this.source, n4, mVar);
            return mVar.b3();
        }

        public final void l() throws IOException {
            while (!this.source.t2()) {
                int b5 = okhttp3.internal.d.b(this.source.readByte(), 255);
                if (b5 == 128) {
                    throw new IOException(ProtectedSandApp.s("ᱫ"));
                }
                if ((b5 & 128) == 128) {
                    m(n(b5, 127) - 1);
                } else if (b5 == 64) {
                    p();
                } else if ((b5 & 64) == 64) {
                    o(n(b5, 63) - 1);
                } else if ((b5 & 32) == 32) {
                    int n4 = n(b5, 31);
                    this.maxDynamicTableByteCount = n4;
                    if (n4 < 0 || n4 > this.headerTableSizeSetting) {
                        throw new IOException(ProtectedSandApp.s("ᱪ") + this.maxDynamicTableByteCount);
                    }
                    a();
                } else if (b5 == 16 || b5 == 0) {
                    r();
                } else {
                    q(n(b5, 15) - 1);
                }
            }
        }

        public final int n(int firstByte, int prefixMask) throws IOException {
            int i4 = firstByte & prefixMask;
            if (i4 < prefixMask) {
                return i4;
            }
            int i5 = 0;
            while (true) {
                int j4 = j();
                if ((j4 & 128) == 0) {
                    return prefixMask + (j4 << i5);
                }
                prefixMask += (j4 & 127) << i5;
                i5 += 7;
            }
        }

        @kd.j
        public a(@fg.l o0 o0Var, int i4, int i5) {
            l0.p(o0Var, ProtectedSandApp.s("ᱨ"));
            this.headerTableSizeSetting = i4;
            this.maxDynamicTableByteCount = i5;
            this.headerList = new ArrayList();
            this.source = a0.d(o0Var);
            this.dynamicTable = new okhttp3.internal.http2.b[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        public /* synthetic */ a(o0 o0Var, int i4, int i5, int i6, kotlin.jvm.internal.w wVar) {
            this(o0Var, i4, (i6 & 4) != 0 ? i4 : i5);
        }
    }

    /* compiled from: Hpack.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\t\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u001b\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010$R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0016\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u001e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100)8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010*R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010$R\u0016\u0010-\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010$R\u0016\u0010.\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lokhttp3/internal/http2/c$b;", "", "", "headerTableSizeSetting", "", "useCompression", "Lokio/m;", "out", "<init>", "(IZLokio/m;)V", "Lkotlin/k2;", "b", "()V", "bytesToRecover", "c", "(I)I", "Lokhttp3/internal/http2/b;", "entry", "d", "(Lokhttp3/internal/http2/b;)V", "a", "", "headerBlock", "g", "(Ljava/util/List;)V", "value", "prefixMask", "bits", "h", "(III)V", "Lokio/p;", "data", "f", "(Lokio/p;)V", "e", "(I)V", "I", "smallestHeaderTableSizeSetting", "Z", "emitDynamicTableSizeUpdate", "maxDynamicTableByteCount", "", "[Lokhttp3/internal/http2/b;", "dynamicTable", "nextHeaderIndex", "headerCount", "dynamicTableByteCount", "i", "j", "Lokio/m;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int smallestHeaderTableSizeSetting;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean emitDynamicTableSizeUpdate;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public int maxDynamicTableByteCount;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        @kd.f
        public okhttp3.internal.http2.b[] dynamicTable;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int nextHeaderIndex;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public int headerCount;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public int dynamicTableByteCount;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public int headerTableSizeSetting;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final boolean useCompression;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final m out;

        @kd.j
        public b(int i4, @fg.l m mVar) {
            this(i4, false, mVar, 2, null);
        }

        private final void a() {
            int i4 = this.maxDynamicTableByteCount;
            int i5 = this.dynamicTableByteCount;
            if (i4 < i5) {
                if (i4 == 0) {
                    b();
                } else {
                    c(i5 - i4);
                }
            }
        }

        private final void b() {
            kotlin.collections.l.V1(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int c(int bytesToRecover) {
            int i4;
            int i5 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i4 = this.nextHeaderIndex;
                    if (length < i4 || bytesToRecover <= 0) {
                        break;
                    }
                    okhttp3.internal.http2.b bVar = this.dynamicTable[length];
                    l0.m(bVar);
                    bytesToRecover -= bVar.hpackSize;
                    int i6 = this.dynamicTableByteCount;
                    okhttp3.internal.http2.b bVar2 = this.dynamicTable[length];
                    l0.m(bVar2);
                    this.dynamicTableByteCount = i6 - bVar2.hpackSize;
                    this.headerCount--;
                    i5++;
                }
                okhttp3.internal.http2.b[] bVarArr = this.dynamicTable;
                System.arraycopy(bVarArr, i4 + 1, bVarArr, i4 + 1 + i5, this.headerCount);
                okhttp3.internal.http2.b[] bVarArr2 = this.dynamicTable;
                int i7 = this.nextHeaderIndex;
                Arrays.fill(bVarArr2, i7 + 1, i7 + 1 + i5, (Object) null);
                this.nextHeaderIndex += i5;
            }
            return i5;
        }

        private final void d(okhttp3.internal.http2.b entry) {
            int i4 = entry.hpackSize;
            int i5 = this.maxDynamicTableByteCount;
            if (i4 > i5) {
                b();
                return;
            }
            c((this.dynamicTableByteCount + i4) - i5);
            int i6 = this.headerCount + 1;
            okhttp3.internal.http2.b[] bVarArr = this.dynamicTable;
            if (i6 > bVarArr.length) {
                okhttp3.internal.http2.b[] bVarArr2 = new okhttp3.internal.http2.b[bVarArr.length * 2];
                System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = bVarArr2;
            }
            int i7 = this.nextHeaderIndex;
            this.nextHeaderIndex = i7 - 1;
            this.dynamicTable[i7] = entry;
            this.headerCount++;
            this.dynamicTableByteCount += i4;
        }

        public final void e(int headerTableSizeSetting) {
            this.headerTableSizeSetting = headerTableSizeSetting;
            int min = Math.min(headerTableSizeSetting, 16384);
            int i4 = this.maxDynamicTableByteCount;
            if (i4 == min) {
                return;
            }
            if (min < i4) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, min);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = min;
            a();
        }

        public final void f(@fg.l p data) throws IOException {
            l0.p(data, ProtectedSandApp.s("ᱭ"));
            if (this.useCompression) {
                j jVar = j.f84782d;
                if (jVar.d(data) < data.q()) {
                    m mVar = new m();
                    jVar.c(data, mVar);
                    p b32 = mVar.b3();
                    h(b32.q(), 127, 128);
                    this.out.t3(b32);
                    return;
                }
            }
            h(data.q(), 127, 0);
            this.out.t3(data);
        }

        public final void g(@fg.l List<okhttp3.internal.http2.b> headerBlock) throws IOException {
            int i4;
            int i5;
            l0.p(headerBlock, ProtectedSandApp.s("ᱮ"));
            if (this.emitDynamicTableSizeUpdate) {
                int i6 = this.smallestHeaderTableSizeSetting;
                if (i6 < this.maxDynamicTableByteCount) {
                    h(i6, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                h(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = headerBlock.size();
            for (int i7 = 0; i7 < size; i7++) {
                okhttp3.internal.http2.b bVar = headerBlock.get(i7);
                p l02 = bVar.name.l0();
                p pVar = bVar.value;
                c cVar = c.f84567i;
                Integer num = cVar.b().get(l02);
                if (num != null) {
                    int intValue = num.intValue();
                    i5 = intValue + 1;
                    if (2 <= i5 && 7 >= i5) {
                        if (l0.g(cVar.c()[intValue].value, pVar)) {
                            i4 = i5;
                        } else if (l0.g(cVar.c()[i5].value, pVar)) {
                            i4 = i5;
                            i5 = intValue + 2;
                        }
                    }
                    i4 = i5;
                    i5 = -1;
                } else {
                    i4 = -1;
                    i5 = -1;
                }
                if (i5 == -1) {
                    int i10 = this.nextHeaderIndex + 1;
                    int length = this.dynamicTable.length;
                    while (true) {
                        if (i10 >= length) {
                            break;
                        }
                        okhttp3.internal.http2.b bVar2 = this.dynamicTable[i10];
                        l0.m(bVar2);
                        if (l0.g(bVar2.name, l02)) {
                            okhttp3.internal.http2.b bVar3 = this.dynamicTable[i10];
                            l0.m(bVar3);
                            if (l0.g(bVar3.value, pVar)) {
                                i5 = c.f84567i.c().length + (i10 - this.nextHeaderIndex);
                                break;
                            } else if (i4 == -1) {
                                i4 = (i10 - this.nextHeaderIndex) + c.f84567i.c().length;
                            }
                        }
                        i10++;
                    }
                }
                if (i5 != -1) {
                    h(i5, 127, 128);
                } else if (i4 == -1) {
                    this.out.writeByte(64);
                    f(l02);
                    f(pVar);
                    d(bVar);
                } else if (!l02.e0(okhttp3.internal.http2.b.f84544d) || l0.g(okhttp3.internal.http2.b.f84554n, l02)) {
                    h(i4, 63, 64);
                    f(pVar);
                    d(bVar);
                } else {
                    h(i4, 15, 0);
                    f(pVar);
                }
            }
        }

        public final void h(int value, int prefixMask, int bits) {
            if (value < prefixMask) {
                this.out.writeByte(value | bits);
                return;
            }
            this.out.writeByte(bits | prefixMask);
            int i4 = value - prefixMask;
            while (i4 >= 128) {
                this.out.writeByte(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.out.writeByte(i4);
        }

        @kd.j
        public b(@fg.l m mVar) {
            this(0, false, mVar, 3, null);
        }

        @kd.j
        public b(int i4, boolean z4, @fg.l m mVar) {
            l0.p(mVar, ProtectedSandApp.s("ᱬ"));
            this.headerTableSizeSetting = i4;
            this.useCompression = z4;
            this.out = mVar;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i4;
            this.dynamicTable = new okhttp3.internal.http2.b[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        public /* synthetic */ b(int i4, boolean z4, m mVar, int i5, kotlin.jvm.internal.w wVar) {
            this((i5 & 1) != 0 ? 4096 : i4, (i5 & 2) != 0 ? true : z4, mVar);
        }
    }

    static {
        c cVar = new c();
        f84567i = cVar;
        okhttp3.internal.http2.b bVar = new okhttp3.internal.http2.b(okhttp3.internal.http2.b.f84554n, "");
        p pVar = okhttp3.internal.http2.b.f84551k;
        okhttp3.internal.http2.b bVar2 = new okhttp3.internal.http2.b(pVar, ProtectedSandApp.s("ᱯ"));
        okhttp3.internal.http2.b bVar3 = new okhttp3.internal.http2.b(pVar, ProtectedSandApp.s("ᱰ"));
        p pVar2 = okhttp3.internal.http2.b.f84552l;
        okhttp3.internal.http2.b bVar4 = new okhttp3.internal.http2.b(pVar2, ProtectedSandApp.s("ᱱ"));
        okhttp3.internal.http2.b bVar5 = new okhttp3.internal.http2.b(pVar2, ProtectedSandApp.s("ᱲ"));
        p pVar3 = okhttp3.internal.http2.b.f84553m;
        okhttp3.internal.http2.b bVar6 = new okhttp3.internal.http2.b(pVar3, ProtectedSandApp.s("ᱳ"));
        okhttp3.internal.http2.b bVar7 = new okhttp3.internal.http2.b(pVar3, ProtectedSandApp.s("ᱴ"));
        p pVar4 = okhttp3.internal.http2.b.f84550j;
        STATIC_HEADER_TABLE = new okhttp3.internal.http2.b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, new okhttp3.internal.http2.b(pVar4, ProtectedSandApp.s("ᱵ")), new okhttp3.internal.http2.b(pVar4, ProtectedSandApp.s("ᱶ")), new okhttp3.internal.http2.b(pVar4, ProtectedSandApp.s("ᱷ")), new okhttp3.internal.http2.b(pVar4, ProtectedSandApp.s("ᱸ")), new okhttp3.internal.http2.b(pVar4, ProtectedSandApp.s("ᱹ")), new okhttp3.internal.http2.b(pVar4, ProtectedSandApp.s("ᱺ")), new okhttp3.internal.http2.b(pVar4, ProtectedSandApp.s("ᱻ")), new okhttp3.internal.http2.b(ProtectedSandApp.s("ᱼ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("ᱽ"), ProtectedSandApp.s("᱾")), new okhttp3.internal.http2.b(ProtectedSandApp.s("᱿"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("ᲀ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("ᲁ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("ᲂ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("ᲃ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("ᲄ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("ᲅ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("ᲆ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("ᲇ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("ᲈ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("\u1c89"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("\u1c8a"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("\u1c8b"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("\u1c8c"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("\u1c8d"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("\u1c8e"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("\u1c8f"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Ა"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Ბ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Გ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Დ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Ე"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Ვ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Ზ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Თ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Ი"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Კ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Ლ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Მ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Ნ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Ო"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Პ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Ჟ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Რ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Ს"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Ტ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Უ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Ფ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Ქ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Ღ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Ყ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Შ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Ჩ"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Ც"), ""), new okhttp3.internal.http2.b(ProtectedSandApp.s("Ძ"), "")};
        NAME_TO_FIRST_INDEX = cVar.d();
    }

    private c() {
    }

    private final Map<p, Integer> d() {
        okhttp3.internal.http2.b[] bVarArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bVarArr.length);
        int length = bVarArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            okhttp3.internal.http2.b[] bVarArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(bVarArr2[i4].name)) {
                linkedHashMap.put(bVarArr2[i4].name, Integer.valueOf(i4));
            }
        }
        Map<p, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        l0.o(unmodifiableMap, ProtectedSandApp.s("Წ"));
        return unmodifiableMap;
    }

    @fg.l
    public final p a(@fg.l p name) throws IOException {
        l0.p(name, ProtectedSandApp.s("Ჭ"));
        int q4 = name.q();
        for (int i4 = 0; i4 < q4; i4++) {
            byte b5 = (byte) 65;
            byte b6 = (byte) 90;
            byte G = name.G(i4);
            if (b5 <= G && b6 >= G) {
                throw new IOException(ProtectedSandApp.s("Ხ") + name.o0());
            }
        }
        return name;
    }

    @fg.l
    public final Map<p, Integer> b() {
        return NAME_TO_FIRST_INDEX;
    }

    @fg.l
    public final okhttp3.internal.http2.b[] c() {
        return STATIC_HEADER_TABLE;
    }
}

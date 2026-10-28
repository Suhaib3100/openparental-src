package l1;

import androidx.annotation.c1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.collections.z0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.ranges.s;
import kotlin.text.v;

/* compiled from: Cbor.kt */
@c1({c1.a.LIBRARY})
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0019\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010!\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001a\u0010#\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001a\u0010&\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u001cR\u001a\u0010(\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b'\u0010\u001cR\u001a\u0010*\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b)\u0010\u001cR\u001a\u0010,\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b+\u0010\u001c¨\u0006-"}, d2 = {"Ll1/f;", "", "<init>", "()V", "", "data", "", "offset", "o", "([BI)I", "Ll1/f$a;", "f", "([BI)Ll1/f$a;", "Ll1/f$b;", "p", "([BI)Ll1/f$b;", "type", "", "arg", "b", "(IJ)[B", "c", "([B)Ljava/lang/Object;", "d", "(Ljava/lang/Object;)[B", "a", "I", "n", "()I", "TYPE_UNSIGNED_INT", "k", "TYPE_NEGATIVE_INT", "h", "TYPE_BYTE_STRING", "m", "TYPE_TEXT_STRING", "e", "g", "TYPE_ARRAY", "j", "TYPE_MAP", "l", "TYPE_TAG", "i", "TYPE_FLOAT", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int TYPE_UNSIGNED_INT;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int TYPE_NEGATIVE_INT = 1;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int TYPE_BYTE_STRING = 2;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int TYPE_TEXT_STRING = 3;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int TYPE_ARRAY = 4;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int TYPE_MAP = 5;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int TYPE_TAG = 6;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int TYPE_FLOAT = 7;

    /* compiled from: Cbor.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Ll1/f$a;", "", "", "arg", "", "len", "<init>", "(JI)V", "a", "()J", "b", "()I", "c", "(JI)Ll1/f$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "e", "I", "f", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long arg;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int len;

        public a(long j4, int i4) {
            this.arg = j4;
            this.len = i4;
        }

        public static a d(a aVar, long j4, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                j4 = aVar.arg;
            }
            if ((i5 & 2) != 0) {
                i4 = aVar.len;
            }
            aVar.getClass();
            return new a(j4, i4);
        }

        /* renamed from: a, reason: from getter */
        public final long getArg() {
            return this.arg;
        }

        /* renamed from: b, reason: from getter */
        public final int getLen() {
            return this.len;
        }

        @fg.l
        public final a c(long arg, int len) {
            return new a(arg, len);
        }

        public final long e() {
            return this.arg;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.arg == aVar.arg && this.len == aVar.len;
        }

        public final int f() {
            return this.len;
        }

        public int hashCode() {
            return Integer.hashCode(this.len) + (Long.hashCode(this.arg) * 31);
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("Arg(arg=");
            sb.append(this.arg);
            sb.append(", len=");
            return androidx.view.e.a(sb, this.len, ')');
        }
    }

    /* compiled from: Cbor.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"Ll1/f$b;", "", "item", "", "len", "<init>", "(Ljava/lang/Object;I)V", "a", "()Ljava/lang/Object;", "b", "()I", "c", "(Ljava/lang/Object;I)Ll1/f$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "e", "I", "f", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Object item;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int len;

        public b(@fg.l Object item, int i4) {
            l0.p(item, "item");
            this.item = item;
            this.len = i4;
        }

        public static /* synthetic */ b d(b bVar, Object obj, int i4, int i5, Object obj2) {
            if ((i5 & 1) != 0) {
                obj = bVar.item;
            }
            if ((i5 & 2) != 0) {
                i4 = bVar.len;
            }
            return bVar.c(obj, i4);
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final Object getItem() {
            return this.item;
        }

        /* renamed from: b, reason: from getter */
        public final int getLen() {
            return this.len;
        }

        @fg.l
        public final b c(@fg.l Object item, int len) {
            l0.p(item, "item");
            return new b(item, len);
        }

        @fg.l
        public final Object e() {
            return this.item;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return l0.g(this.item, bVar.item) && this.len == bVar.len;
        }

        public final int f() {
            return this.len;
        }

        public int hashCode() {
            return Integer.hashCode(this.len) + (this.item.hashCode() * 31);
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("Item(item=");
            sb.append(this.item);
            sb.append(", len=");
            return androidx.view.e.a(sb, this.len, ')');
        }
    }

    private final byte[] b(int type, long arg) {
        int i4 = type << 5;
        int i5 = (int) arg;
        if (arg < 24) {
            return new byte[]{(byte) ((i4 | i5) & 255)};
        }
        if (arg <= 255) {
            return new byte[]{(byte) ((i4 | 24) & 255), (byte) (i5 & 255)};
        }
        if (arg <= okhttp3.internal.ws.g.PAYLOAD_SHORT_MAX) {
            return new byte[]{(byte) ((i4 | 25) & 255), (byte) ((i5 >> 8) & 255), (byte) (i5 & 255)};
        }
        if (arg <= 4294967295L) {
            return new byte[]{(byte) ((i4 | 26) & 255), (byte) ((i5 >> 24) & 255), (byte) ((i5 >> 16) & 255), (byte) ((i5 >> 8) & 255), (byte) (i5 & 255)};
        }
        throw new IllegalArgumentException("bad Arg");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(k1.h byteMap, byte[] bArr, byte[] bArr2) {
        l0.p(byteMap, "$byteMap");
        Object obj = ((Map) byteMap.f75329b).get(bArr);
        l0.m(obj);
        byte[] bArr3 = (byte[]) obj;
        Object obj2 = ((Map) byteMap.f75329b).get(bArr2);
        l0.m(obj2);
        byte[] bArr4 = (byte[]) obj2;
        if (bArr.length > bArr2.length) {
            return 1;
        }
        if (bArr.length >= bArr2.length) {
            if (bArr3.length > bArr4.length) {
                return 1;
            }
            if (bArr3.length >= bArr4.length) {
                return 0;
            }
        }
        return -1;
    }

    private final a f(byte[] data, int offset) {
        long j4 = data[offset] & 31;
        if (j4 < 24) {
            return new a(j4, 1);
        }
        if (j4 == 24) {
            return new a(data[offset + 1] & 255, 2);
        }
        if (j4 == 25) {
            return new a((data[offset + 2] & 255) | ((data[offset + 1] & 255) << 8), 3);
        }
        if (j4 != 26) {
            throw new IllegalArgumentException("Bad arg");
        }
        return new a((data[offset + 4] & 255) | ((data[offset + 1] & 255) << 24) | ((data[offset + 2] & 255) << 16) | ((data[offset + 3] & 255) << 8), 5);
    }

    private final int o(byte[] data, int offset) {
        return (data[offset] & 255) >> 5;
    }

    private final b p(byte[] data, int offset) {
        int o4 = o(data, offset);
        a f4 = f(data, offset);
        System.out.println((Object) ("Type " + o4 + ' ' + f4.e() + ' ' + f4.f()));
        if (o4 == this.TYPE_UNSIGNED_INT) {
            return new b(Long.valueOf(f4.e()), f4.f());
        }
        if (o4 == this.TYPE_NEGATIVE_INT) {
            return new b(Long.valueOf((-1) - f4.e()), f4.f());
        }
        if (o4 == this.TYPE_BYTE_STRING) {
            return new b(kotlin.collections.l.Yt(data, s.W1(f4.f() + offset, f4.f() + offset + ((int) f4.e()))), f4.f() + ((int) f4.e()));
        }
        if (o4 == this.TYPE_TEXT_STRING) {
            return new b(new String(kotlin.collections.l.Yt(data, s.W1(f4.f() + offset, f4.f() + offset + ((int) f4.e()))), kotlin.text.f.UTF_8), f4.f() + ((int) f4.e()));
        }
        int i4 = 0;
        if (o4 == this.TYPE_ARRAY) {
            ArrayList arrayList = new ArrayList();
            int f5 = f4.f();
            int e4 = (int) f4.e();
            while (i4 < e4) {
                b p4 = p(data, offset + f5);
                arrayList.add(p4.e());
                f5 += p4.f();
                i4++;
            }
            return new b(w.V5(arrayList), f5);
        }
        if (o4 != this.TYPE_MAP) {
            throw new IllegalArgumentException("Bad type");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int f6 = f4.f();
        int e5 = (int) f4.e();
        while (i4 < e5) {
            b p5 = p(data, offset + f6);
            int f7 = p5.f() + f6;
            b p6 = p(data, offset + f7);
            int f10 = f7 + p6.f();
            linkedHashMap.put(p5.e(), p6.e());
            i4++;
            f6 = f10;
        }
        return new b(z0.D0(linkedHashMap), f6);
    }

    @fg.l
    public final Object c(@fg.l byte[] data) {
        l0.p(data, "data");
        return p(data, 0).e();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.util.LinkedHashMap] */
    @fg.l
    public final byte[] d(@fg.l Object data) {
        l0.p(data, "data");
        if (data instanceof Number) {
            if (data instanceof Double) {
                throw new IllegalArgumentException("Don't support doubles yet");
            }
            long longValue = ((Number) data).longValue();
            return longValue >= 0 ? b(this.TYPE_UNSIGNED_INT, longValue) : b(this.TYPE_NEGATIVE_INT, (-1) - longValue);
        }
        if (data instanceof byte[]) {
            return kotlin.collections.l.g3(b(this.TYPE_BYTE_STRING, r6.length), (byte[]) data);
        }
        if (data instanceof String) {
            return kotlin.collections.l.g3(b(this.TYPE_TEXT_STRING, r6.length()), v.F1((String) data));
        }
        if (data instanceof List) {
            byte[] b5 = b(this.TYPE_ARRAY, r6.size());
            for (Object obj : (List) data) {
                l0.m(obj);
                b5 = kotlin.collections.l.g3(b5, d(obj));
            }
            return b5;
        }
        if (!(data instanceof Map)) {
            throw new IllegalArgumentException("Bad type");
        }
        byte[] b6 = b(this.TYPE_MAP, r6.size());
        final k1.h hVar = new k1.h();
        hVar.f75329b = new LinkedHashMap();
        for (Map.Entry entry : ((Map) data).entrySet()) {
            Map map = (Map) hVar.f75329b;
            Object key = entry.getKey();
            l0.m(key);
            byte[] d5 = d(key);
            Object value = entry.getValue();
            l0.m(value);
            map.put(d5, d(value));
        }
        ArrayList arrayList = new ArrayList(((Map) hVar.f75329b).keySet());
        w.u5(arrayList, new Comparator() { // from class: l1.e
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                int e4;
                e4 = f.e(k1.h.this, (byte[]) obj2, (byte[]) obj3);
                return e4;
            }
        });
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] key2 = (byte[]) it.next();
            l0.o(key2, "key");
            byte[] g32 = kotlin.collections.l.g3(b6, key2);
            Object obj2 = ((Map) hVar.f75329b).get(key2);
            l0.m(obj2);
            b6 = kotlin.collections.l.g3(g32, (byte[]) obj2);
        }
        return b6;
    }

    /* renamed from: g, reason: from getter */
    public final int getTYPE_ARRAY() {
        return this.TYPE_ARRAY;
    }

    /* renamed from: h, reason: from getter */
    public final int getTYPE_BYTE_STRING() {
        return this.TYPE_BYTE_STRING;
    }

    /* renamed from: i, reason: from getter */
    public final int getTYPE_FLOAT() {
        return this.TYPE_FLOAT;
    }

    /* renamed from: j, reason: from getter */
    public final int getTYPE_MAP() {
        return this.TYPE_MAP;
    }

    /* renamed from: k, reason: from getter */
    public final int getTYPE_NEGATIVE_INT() {
        return this.TYPE_NEGATIVE_INT;
    }

    /* renamed from: l, reason: from getter */
    public final int getTYPE_TAG() {
        return this.TYPE_TAG;
    }

    /* renamed from: m, reason: from getter */
    public final int getTYPE_TEXT_STRING() {
        return this.TYPE_TEXT_STRING;
    }

    /* renamed from: n, reason: from getter */
    public final int getTYPE_UNSIGNED_INT() {
        return this.TYPE_UNSIGNED_INT;
    }
}

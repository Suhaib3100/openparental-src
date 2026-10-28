package kotlin.reflect.jvm.internal.impl.protobuf;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.g.b;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.j;
import kotlin.reflect.jvm.internal.impl.protobuf.o;
import kotlin.reflect.jvm.internal.impl.protobuf.w;

/* compiled from: FieldSet.java */
/* loaded from: classes5.dex */
final class g<FieldDescriptorType extends b<FieldDescriptorType>> {

    /* renamed from: d, reason: collision with root package name */
    private static final g f25719d = new g(true);

    /* renamed from: b, reason: collision with root package name */
    private boolean f25721b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f25722c = false;

    /* renamed from: a, reason: collision with root package name */
    private final t<FieldDescriptorType, Object> f25720a = t.r(16);

    /* compiled from: FieldSet.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25723a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f25724b;

        static {
            int[] iArr = new int[w.b.values().length];
            f25724b = iArr;
            try {
                iArr[w.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25724b[w.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25724b[w.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25724b[w.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25724b[w.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25724b[w.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f25724b[w.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f25724b[w.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f25724b[w.b.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f25724b[w.b.BYTES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f25724b[w.b.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f25724b[w.b.SFIXED32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f25724b[w.b.SFIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f25724b[w.b.SINT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f25724b[w.b.SINT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f25724b[w.b.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f25724b[w.b.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f25724b[w.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[w.c.values().length];
            f25723a = iArr2;
            try {
                iArr2[w.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f25723a[w.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f25723a[w.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f25723a[w.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f25723a[w.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f25723a[w.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f25723a[w.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f25723a[w.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f25723a[w.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: FieldSet.java */
    public interface b<T extends b<T>> extends Comparable<T> {
        boolean a();

        w.b b();

        w.c e();

        o.a f(o.a aVar, o oVar);

        int getNumber();

        boolean isPacked();
    }

    private g() {
    }

    private Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int d(w.b bVar, int i5, Object obj) {
        int D = CodedOutputStream.D(i5);
        if (bVar == w.b.GROUP) {
            D *= 2;
        }
        return D + e(bVar, obj);
    }

    private static int e(w.b bVar, Object obj) {
        switch (a.f25724b[bVar.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                return 8;
            case 2:
                ((Float) obj).floatValue();
                return 4;
            case 3:
                return CodedOutputStream.w(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.w(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.p(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                return 8;
            case 7:
                ((Integer) obj).intValue();
                return 4;
            case 8:
                ((Boolean) obj).booleanValue();
                return 1;
            case 9:
                return CodedOutputStream.C((String) obj);
            case 10:
                return obj instanceof d ? CodedOutputStream.e((d) obj) : CodedOutputStream.c((byte[]) obj);
            case 11:
                return CodedOutputStream.v(((Integer) obj).intValue());
            case 12:
                ((Integer) obj).intValue();
                return 4;
            case 13:
                ((Long) obj).longValue();
                return 8;
            case 14:
                return CodedOutputStream.z(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.B(((Long) obj).longValue());
            case 16:
                return ((o) obj).u();
            case 17:
                return obj instanceof j ? CodedOutputStream.r((j) obj) : CodedOutputStream.t((o) obj);
            case 18:
                return obj instanceof i.a ? CodedOutputStream.p(((i.a) obj).getNumber()) : CodedOutputStream.p(((Integer) obj).intValue());
            default:
                throw new RuntimeException(ProtectedSandApp.s("佄"));
        }
    }

    public static int f(b<?> bVar, Object obj) {
        w.b b6 = bVar.b();
        int number = bVar.getNumber();
        if (!bVar.a()) {
            return d(b6, number, obj);
        }
        int i5 = 0;
        if (!bVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i5 += d(b6, number, it.next());
            }
            return i5;
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            i5 += e(b6, it2.next());
        }
        return CodedOutputStream.v(i5) + CodedOutputStream.D(number) + i5;
    }

    public static <T extends b<T>> g<T> g() {
        return f25719d;
    }

    static int l(w.b bVar, boolean z5) {
        if (z5) {
            return 2;
        }
        return bVar.getWireType();
    }

    private boolean o(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.e() == w.c.MESSAGE) {
            if (key.a()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((o) it.next()).l()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof o)) {
                    if (value instanceof j) {
                        return true;
                    }
                    throw new IllegalArgumentException(ProtectedSandApp.s("佅"));
                }
                if (!((o) value).l()) {
                    return false;
                }
            }
        }
        return true;
    }

    private void s(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof j) {
            value = ((j) value).e();
        }
        if (key.a()) {
            Object h5 = h(key);
            if (h5 == null) {
                h5 = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) h5).add(c(it.next()));
            }
            this.f25720a.put(key, h5);
            return;
        }
        if (key.e() != w.c.MESSAGE) {
            this.f25720a.put(key, c(value));
            return;
        }
        Object h6 = h(key);
        if (h6 == null) {
            this.f25720a.put(key, c(value));
        } else {
            this.f25720a.put(key, key.f(((o) h6).n(), (o) value).build());
        }
    }

    public static <T extends b<T>> g<T> t() {
        return new g<>();
    }

    public static Object u(e eVar, w.b bVar, boolean z5) throws IOException {
        switch (a.f25724b[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(eVar.m());
            case 2:
                return Float.valueOf(eVar.q());
            case 3:
                return Long.valueOf(eVar.C());
            case 4:
                return Long.valueOf(eVar.C());
            case 5:
                return Integer.valueOf(eVar.A());
            case 6:
                return Long.valueOf(eVar.z());
            case 7:
                return Integer.valueOf(eVar.y());
            case 8:
                return Boolean.valueOf(eVar.k());
            case 9:
                return z5 ? eVar.J() : eVar.I();
            case 10:
                return eVar.l();
            case 11:
                return Integer.valueOf(eVar.A());
            case 12:
                return Integer.valueOf(eVar.y());
            case 13:
                return Long.valueOf(eVar.z());
            case 14:
                return Integer.valueOf(eVar.G());
            case 15:
                return Long.valueOf(eVar.H());
            case 16:
                throw new IllegalArgumentException(ProtectedSandApp.s("佉"));
            case 17:
                throw new IllegalArgumentException(ProtectedSandApp.s("佈"));
            case 18:
                throw new IllegalArgumentException(ProtectedSandApp.s("佇"));
            default:
                throw new RuntimeException(ProtectedSandApp.s("但"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.i.a) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.j) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void w(kotlin.reflect.jvm.internal.impl.protobuf.w.b r2, java.lang.Object r3) {
        /*
            r3.getClass()
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.f25723a
            kotlin.reflect.jvm.internal.impl.protobuf.w$c r2 = r2.getJavaType()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L42;
                case 2: goto L3f;
                case 3: goto L3c;
                case 4: goto L39;
                case 5: goto L36;
                case 6: goto L33;
                case 7: goto L27;
                case 8: goto L1e;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L44
        L15:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.o
            if (r2 != 0) goto L31
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.j
            if (r2 == 0) goto L30
            goto L31
        L1e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L31
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.i.a
            if (r2 == 0) goto L30
            goto L31
        L27:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.d
            if (r2 != 0) goto L31
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L30
            goto L31
        L30:
            r0 = r1
        L31:
            r1 = r0
            goto L44
        L33:
            boolean r1 = r3 instanceof java.lang.String
            goto L44
        L36:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L44
        L39:
            boolean r1 = r3 instanceof java.lang.Double
            goto L44
        L3c:
            boolean r1 = r3 instanceof java.lang.Float
            goto L44
        L3f:
            boolean r1 = r3 instanceof java.lang.Long
            goto L44
        L42:
            boolean r1 = r3 instanceof java.lang.Integer
        L44:
            if (r1 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "佊"
            java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.g.w(kotlin.reflect.jvm.internal.impl.protobuf.w$b, java.lang.Object):void");
    }

    private static void x(CodedOutputStream codedOutputStream, w.b bVar, int i5, Object obj) throws IOException {
        if (bVar == w.b.GROUP) {
            codedOutputStream.Y(i5, (o) obj);
        } else {
            codedOutputStream.w0(i5, l(bVar, false));
            y(codedOutputStream, bVar, obj);
        }
    }

    private static void y(CodedOutputStream codedOutputStream, w.b bVar, Object obj) throws IOException {
        switch (a.f25724b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.R(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.X(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.p0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.p0(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.b0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.n0(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.m0(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.g0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                codedOutputStream.v0((String) obj);
                break;
            case 10:
                if (!(obj instanceof d)) {
                    codedOutputStream.N((byte[]) obj);
                    break;
                } else {
                    codedOutputStream.P((d) obj);
                    break;
                }
            case 11:
                codedOutputStream.o0(((Integer) obj).intValue());
                break;
            case 12:
                codedOutputStream.m0(((Integer) obj).intValue());
                break;
            case 13:
                codedOutputStream.n0(((Long) obj).longValue());
                break;
            case 14:
                codedOutputStream.s0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.u0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.getClass();
                ((o) obj).a(codedOutputStream);
                break;
            case 17:
                codedOutputStream.e0((o) obj);
                break;
            case 18:
                if (!(obj instanceof i.a)) {
                    codedOutputStream.b0(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.b0(((i.a) obj).getNumber());
                    break;
                }
        }
    }

    public static void z(b<?> bVar, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        w.b b6 = bVar.b();
        int number = bVar.getNumber();
        if (!bVar.a()) {
            if (obj instanceof j) {
                x(codedOutputStream, b6, number, ((j) obj).e());
                return;
            } else {
                x(codedOutputStream, b6, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!bVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                x(codedOutputStream, b6, number, it.next());
            }
            return;
        }
        codedOutputStream.w0(number, 2);
        Iterator it2 = list.iterator();
        int i5 = 0;
        while (it2.hasNext()) {
            i5 += e(b6, it2.next());
        }
        codedOutputStream.o0(i5);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            y(codedOutputStream, b6, it3.next());
        }
    }

    public void a(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (!fielddescriptortype.a()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("佋"));
        }
        w(fielddescriptortype.b(), obj);
        Object h5 = h(fielddescriptortype);
        if (h5 == null) {
            list = new ArrayList();
            this.f25720a.put(fielddescriptortype, list);
        } else {
            list = (List) h5;
        }
        list.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g<FieldDescriptorType> clone() {
        g<FieldDescriptorType> gVar = new g<>();
        for (int i5 = 0; i5 < this.f25720a.l(); i5++) {
            Map.Entry<FieldDescriptorType, Object> k5 = this.f25720a.k(i5);
            gVar.v(k5.getKey(), k5.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f25720a.m()) {
            gVar.v(entry.getKey(), entry.getValue());
        }
        gVar.f25722c = this.f25722c;
        return gVar;
    }

    public Object h(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f25720a.get(fielddescriptortype);
        return obj instanceof j ? ((j) obj).e() : obj;
    }

    public Object i(FieldDescriptorType fielddescriptortype, int i5) {
        if (!fielddescriptortype.a()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("佌"));
        }
        Object h5 = h(fielddescriptortype);
        if (h5 != null) {
            return ((List) h5).get(i5);
        }
        throw new IndexOutOfBoundsException();
    }

    public int j(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.a()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("位"));
        }
        Object h5 = h(fielddescriptortype);
        if (h5 == null) {
            return 0;
        }
        return ((List) h5).size();
    }

    public int k() {
        int i5 = 0;
        for (int i6 = 0; i6 < this.f25720a.l(); i6++) {
            Map.Entry<FieldDescriptorType, Object> k5 = this.f25720a.k(i6);
            i5 += f(k5.getKey(), k5.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f25720a.m()) {
            i5 += f(entry.getKey(), entry.getValue());
        }
        return i5;
    }

    public boolean m(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.a()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("低"));
        }
        return this.f25720a.get(fielddescriptortype) != null;
    }

    public boolean n() {
        for (int i5 = 0; i5 < this.f25720a.l(); i5++) {
            if (!o(this.f25720a.k(i5))) {
                return false;
            }
        }
        Iterator<Map.Entry<FieldDescriptorType, Object>> it = this.f25720a.m().iterator();
        while (it.hasNext()) {
            if (!o(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<FieldDescriptorType, Object>> p() {
        return this.f25722c ? new j.c(this.f25720a.entrySet().iterator()) : this.f25720a.entrySet().iterator();
    }

    public void q() {
        if (this.f25721b) {
            return;
        }
        this.f25720a.q();
        this.f25721b = true;
    }

    public void r(g<FieldDescriptorType> gVar) {
        for (int i5 = 0; i5 < gVar.f25720a.l(); i5++) {
            s(gVar.f25720a.k(i5));
        }
        Iterator<Map.Entry<FieldDescriptorType, Object>> it = gVar.f25720a.m().iterator();
        while (it.hasNext()) {
            s(it.next());
        }
    }

    public void v(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.a()) {
            w(fielddescriptortype.b(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("住"));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                w(fielddescriptortype.b(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof j) {
            this.f25722c = true;
        }
        this.f25720a.put(fielddescriptortype, obj);
    }

    private g(boolean z5) {
        q();
    }
}

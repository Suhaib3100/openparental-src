package kotlin.reflect.jvm.internal.impl.protobuf;

import com.flashget.parentalcontrol.ProtectedSandApp;
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
/* loaded from: classes7.dex */
final class g<FieldDescriptorType extends b<FieldDescriptorType>> {

    /* renamed from: d, reason: collision with root package name */
    private static final g f77701d = new g(true);

    /* renamed from: b, reason: collision with root package name */
    private boolean f77703b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f77704c = false;

    /* renamed from: a, reason: collision with root package name */
    private final t<FieldDescriptorType, Object> f77702a = t.p(16);

    /* compiled from: FieldSet.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f77705a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f77706b;

        static {
            int[] iArr = new int[w.b.values().length];
            f77706b = iArr;
            try {
                iArr[w.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77706b[w.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77706b[w.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f77706b[w.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f77706b[w.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f77706b[w.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f77706b[w.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f77706b[w.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f77706b[w.b.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f77706b[w.b.BYTES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f77706b[w.b.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f77706b[w.b.SFIXED32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f77706b[w.b.SFIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f77706b[w.b.SINT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f77706b[w.b.SINT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f77706b[w.b.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f77706b[w.b.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f77706b[w.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[w.c.values().length];
            f77705a = iArr2;
            try {
                iArr2[w.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f77705a[w.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f77705a[w.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f77705a[w.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f77705a[w.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f77705a[w.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f77705a[w.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f77705a[w.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f77705a[w.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: FieldSet.java */
    public interface b<T extends b<T>> extends Comparable<T> {
        boolean F();

        w.b H();

        w.c O();

        o.a T1(o.a aVar, o oVar);

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

    private static int d(w.b bVar, int i4, Object obj) {
        int D = CodedOutputStream.D(i4);
        if (bVar == w.b.GROUP) {
            D *= 2;
        }
        return D + e(bVar, obj);
    }

    private static int e(w.b bVar, Object obj) {
        switch (a.f77706b[bVar.ordinal()]) {
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
                return ((o) obj).t();
            case 17:
                return obj instanceof j ? CodedOutputStream.r((j) obj) : CodedOutputStream.t((o) obj);
            case 18:
                return obj instanceof i.a ? CodedOutputStream.p(((i.a) obj).getNumber()) : CodedOutputStream.p(((Integer) obj).intValue());
            default:
                throw new RuntimeException(ProtectedSandApp.s("盏\u0001"));
        }
    }

    public static int f(b<?> bVar, Object obj) {
        w.b H = bVar.H();
        int number = bVar.getNumber();
        if (!bVar.F()) {
            return d(H, number, obj);
        }
        int i4 = 0;
        if (!bVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i4 += d(H, number, it.next());
            }
            return i4;
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            i4 += e(H, it2.next());
        }
        return CodedOutputStream.v(i4) + CodedOutputStream.D(number) + i4;
    }

    public static <T extends b<T>> g<T> g() {
        return f77701d;
    }

    static int l(w.b bVar, boolean z4) {
        if (z4) {
            return 2;
        }
        return bVar.getWireType();
    }

    private boolean o(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.O() == w.c.MESSAGE) {
            if (key.F()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((o) it.next()).p()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof o)) {
                    if (value instanceof j) {
                        return true;
                    }
                    throw new IllegalArgumentException(ProtectedSandApp.s("盐\u0001"));
                }
                if (!((o) value).p()) {
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
        if (key.F()) {
            Object h4 = h(key);
            if (h4 == null) {
                h4 = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) h4).add(c(it.next()));
            }
            this.f77702a.put(key, h4);
            return;
        }
        if (key.O() != w.c.MESSAGE) {
            this.f77702a.put(key, c(value));
            return;
        }
        Object h5 = h(key);
        if (h5 == null) {
            this.f77702a.put(key, c(value));
        } else {
            this.f77702a.put(key, key.T1(((o) h5).q(), (o) value).a());
        }
    }

    public static <T extends b<T>> g<T> t() {
        return new g<>();
    }

    public static Object u(e eVar, w.b bVar, boolean z4) throws IOException {
        switch (a.f77706b[bVar.ordinal()]) {
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
                return z4 ? eVar.J() : eVar.I();
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
                throw new IllegalArgumentException(ProtectedSandApp.s("盓\u0001"));
            case 17:
                throw new IllegalArgumentException(ProtectedSandApp.s("盒\u0001"));
            case 18:
                throw new IllegalArgumentException(ProtectedSandApp.s("监\u0001"));
            default:
                throw new RuntimeException(ProtectedSandApp.s("盏\u0001"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.i.a) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.j) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void w(kotlin.reflect.jvm.internal.impl.protobuf.w.b r2, java.lang.Object r3) {
        /*
            r3.getClass()
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.f77705a
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
                case 7: goto L2a;
                case 8: goto L21;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L44
        L15:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.o
            if (r2 != 0) goto L1f
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.j
            if (r2 == 0) goto L1e
            goto L1f
        L1e:
            r0 = r1
        L1f:
            r1 = r0
            goto L44
        L21:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L1f
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.i.a
            if (r2 == 0) goto L1e
            goto L1f
        L2a:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.d
            if (r2 != 0) goto L1f
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L1e
            goto L1f
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
            java.lang.String r3 = "盐\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.g.w(kotlin.reflect.jvm.internal.impl.protobuf.w$b, java.lang.Object):void");
    }

    private static void x(CodedOutputStream codedOutputStream, w.b bVar, int i4, Object obj) throws IOException {
        if (bVar == w.b.GROUP) {
            codedOutputStream.Y(i4, (o) obj);
        } else {
            codedOutputStream.w0(i4, l(bVar, false));
            y(codedOutputStream, bVar, obj);
        }
    }

    private static void y(CodedOutputStream codedOutputStream, w.b bVar, Object obj) throws IOException {
        switch (a.f77706b[bVar.ordinal()]) {
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
                ((o) obj).b(codedOutputStream);
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
        w.b H = bVar.H();
        int number = bVar.getNumber();
        if (!bVar.F()) {
            if (obj instanceof j) {
                x(codedOutputStream, H, number, ((j) obj).e());
                return;
            } else {
                x(codedOutputStream, H, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!bVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                x(codedOutputStream, H, number, it.next());
            }
            return;
        }
        codedOutputStream.w0(number, 2);
        Iterator it2 = list.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            i4 += e(H, it2.next());
        }
        codedOutputStream.o0(i4);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            y(codedOutputStream, H, it3.next());
        }
    }

    public void a(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (!fielddescriptortype.F()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("盔\u0001"));
        }
        w(fielddescriptortype.H(), obj);
        Object h4 = h(fielddescriptortype);
        if (h4 == null) {
            list = new ArrayList();
            this.f77702a.put(fielddescriptortype, list);
        } else {
            list = (List) h4;
        }
        list.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g<FieldDescriptorType> clone() {
        g<FieldDescriptorType> gVar = new g<>();
        for (int i4 = 0; i4 < this.f77702a.k(); i4++) {
            Map.Entry<FieldDescriptorType, Object> j4 = this.f77702a.j(i4);
            gVar.v(j4.getKey(), j4.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f77702a.l()) {
            gVar.v(entry.getKey(), entry.getValue());
        }
        gVar.f77704c = this.f77704c;
        return gVar;
    }

    public Object h(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f77702a.get(fielddescriptortype);
        return obj instanceof j ? ((j) obj).e() : obj;
    }

    public Object i(FieldDescriptorType fielddescriptortype, int i4) {
        if (!fielddescriptortype.F()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("盕\u0001"));
        }
        Object h4 = h(fielddescriptortype);
        if (h4 != null) {
            return ((List) h4).get(i4);
        }
        throw new IndexOutOfBoundsException();
    }

    public int j(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.F()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("盕\u0001"));
        }
        Object h4 = h(fielddescriptortype);
        if (h4 == null) {
            return 0;
        }
        return ((List) h4).size();
    }

    public int k() {
        int i4 = 0;
        for (int i5 = 0; i5 < this.f77702a.k(); i5++) {
            Map.Entry<FieldDescriptorType, Object> j4 = this.f77702a.j(i5);
            i4 += f(j4.getKey(), j4.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f77702a.l()) {
            i4 += f(entry.getKey(), entry.getValue());
        }
        return i4;
    }

    public boolean m(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.F()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("盖\u0001"));
        }
        return this.f77702a.get(fielddescriptortype) != null;
    }

    public boolean n() {
        for (int i4 = 0; i4 < this.f77702a.k(); i4++) {
            if (!o(this.f77702a.j(i4))) {
                return false;
            }
        }
        Iterator<Map.Entry<FieldDescriptorType, Object>> it = this.f77702a.l().iterator();
        while (it.hasNext()) {
            if (!o(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<FieldDescriptorType, Object>> p() {
        return this.f77704c ? new j.c(this.f77702a.entrySet().iterator()) : this.f77702a.entrySet().iterator();
    }

    public void q() {
        if (this.f77703b) {
            return;
        }
        this.f77702a.o();
        this.f77703b = true;
    }

    public void r(g<FieldDescriptorType> gVar) {
        for (int i4 = 0; i4 < gVar.f77702a.k(); i4++) {
            s(gVar.f77702a.j(i4));
        }
        Iterator<Map.Entry<FieldDescriptorType, Object>> it = gVar.f77702a.l().iterator();
        while (it.hasNext()) {
            s(it.next());
        }
    }

    public void v(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.F()) {
            w(fielddescriptortype.H(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("盐\u0001"));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                w(fielddescriptortype.H(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof j) {
            this.f77704c = true;
        }
        this.f77702a.put(fielddescriptortype, obj);
    }

    private g(boolean z4) {
        q();
    }
}

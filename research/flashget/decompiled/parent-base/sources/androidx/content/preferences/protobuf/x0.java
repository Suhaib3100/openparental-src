package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.p1;
import java.lang.reflect.Field;

/* compiled from: FieldInfo.java */
/* loaded from: classes3.dex */
final class x0 implements Comparable<x0> {

    /* renamed from: b, reason: collision with root package name */
    private final Field f29028b;

    /* renamed from: c, reason: collision with root package name */
    private final d1 f29029c;

    /* renamed from: d, reason: collision with root package name */
    private final Class<?> f29030d;

    /* renamed from: e, reason: collision with root package name */
    private final int f29031e;

    /* renamed from: f, reason: collision with root package name */
    private final Field f29032f;

    /* renamed from: g, reason: collision with root package name */
    private final int f29033g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f29034h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f29035i;

    /* renamed from: j, reason: collision with root package name */
    private final z2 f29036j;

    /* renamed from: k, reason: collision with root package name */
    private final Field f29037k;

    /* renamed from: l, reason: collision with root package name */
    private final Class<?> f29038l;

    /* renamed from: m, reason: collision with root package name */
    private final Object f29039m;

    /* renamed from: n, reason: collision with root package name */
    private final p1.e f29040n;

    /* compiled from: FieldInfo.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29041a;

        static {
            int[] iArr = new int[d1.values().length];
            f29041a = iArr;
            try {
                iArr[d1.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29041a[d1.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29041a[d1.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29041a[d1.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: FieldInfo.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Field f29042a;

        /* renamed from: b, reason: collision with root package name */
        private d1 f29043b;

        /* renamed from: c, reason: collision with root package name */
        private int f29044c;

        /* renamed from: d, reason: collision with root package name */
        private Field f29045d;

        /* renamed from: e, reason: collision with root package name */
        private int f29046e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f29047f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f29048g;

        /* renamed from: h, reason: collision with root package name */
        private z2 f29049h;

        /* renamed from: i, reason: collision with root package name */
        private Class<?> f29050i;

        /* renamed from: j, reason: collision with root package name */
        private Object f29051j;

        /* renamed from: k, reason: collision with root package name */
        private p1.e f29052k;

        /* renamed from: l, reason: collision with root package name */
        private Field f29053l;

        private b() {
        }

        public x0 a() {
            z2 z2Var = this.f29049h;
            if (z2Var != null) {
                return x0.f(this.f29044c, this.f29043b, z2Var, this.f29050i, this.f29048g, this.f29052k);
            }
            Object obj = this.f29051j;
            if (obj != null) {
                return x0.e(this.f29042a, this.f29044c, obj, this.f29052k);
            }
            Field field = this.f29045d;
            if (field != null) {
                return this.f29047f ? x0.j(this.f29042a, this.f29044c, this.f29043b, field, this.f29046e, this.f29048g, this.f29052k) : x0.i(this.f29042a, this.f29044c, this.f29043b, field, this.f29046e, this.f29048g, this.f29052k);
            }
            p1.e eVar = this.f29052k;
            if (eVar != null) {
                Field field2 = this.f29053l;
                return field2 == null ? x0.d(this.f29042a, this.f29044c, this.f29043b, eVar) : x0.h(this.f29042a, this.f29044c, this.f29043b, eVar, field2);
            }
            Field field3 = this.f29053l;
            return field3 == null ? x0.c(this.f29042a, this.f29044c, this.f29043b, this.f29048g) : x0.g(this.f29042a, this.f29044c, this.f29043b, field3);
        }

        public b b(Field field) {
            this.f29053l = field;
            return this;
        }

        public b c(boolean z4) {
            this.f29048g = z4;
            return this;
        }

        public b d(p1.e eVar) {
            this.f29052k = eVar;
            return this;
        }

        public b e(Field field) {
            if (this.f29049h != null) {
                throw new IllegalStateException("Cannot set field when building a oneof.");
            }
            this.f29042a = field;
            return this;
        }

        public b f(int i4) {
            this.f29044c = i4;
            return this;
        }

        public b g(Object obj) {
            this.f29051j = obj;
            return this;
        }

        public b h(z2 z2Var, Class<?> cls) {
            if (this.f29042a != null || this.f29045d != null) {
                throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
            }
            this.f29049h = z2Var;
            this.f29050i = cls;
            return this;
        }

        public b i(Field field, int i4) {
            this.f29045d = (Field) p1.e(field, "presenceField");
            this.f29046e = i4;
            return this;
        }

        public b j(boolean z4) {
            this.f29047f = z4;
            return this;
        }

        public b k(d1 d1Var) {
            this.f29043b = d1Var;
            return this;
        }

        b(a aVar) {
        }
    }

    private x0(Field field, int i4, d1 d1Var, Class<?> cls, Field field2, int i5, boolean z4, boolean z5, z2 z2Var, Class<?> cls2, Object obj, p1.e eVar, Field field3) {
        this.f29028b = field;
        this.f29029c = d1Var;
        this.f29030d = cls;
        this.f29031e = i4;
        this.f29032f = field2;
        this.f29033g = i5;
        this.f29034h = z4;
        this.f29035i = z5;
        this.f29036j = z2Var;
        this.f29038l = cls2;
        this.f29039m = obj;
        this.f29040n = eVar;
        this.f29037k = field3;
    }

    public static b A() {
        return new b();
    }

    private static void a(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("fieldNumber must be positive: ", i4));
        }
    }

    public static x0 c(Field field, int i4, d1 d1Var, boolean z4) {
        a(i4);
        p1.e(field, "field");
        p1.e(d1Var, "fieldType");
        if (d1Var == d1.MESSAGE_LIST || d1Var == d1.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new x0(field, i4, d1Var, null, null, 0, false, z4, null, null, null, null, null);
    }

    public static x0 d(Field field, int i4, d1 d1Var, p1.e eVar) {
        a(i4);
        p1.e(field, "field");
        return new x0(field, i4, d1Var, null, null, 0, false, false, null, null, null, eVar, null);
    }

    public static x0 e(Field field, int i4, Object obj, p1.e eVar) {
        p1.e(obj, "mapDefaultEntry");
        a(i4);
        p1.e(field, "field");
        return new x0(field, i4, d1.MAP, null, null, 0, false, true, null, null, obj, eVar, null);
    }

    public static x0 f(int i4, d1 d1Var, z2 z2Var, Class<?> cls, boolean z4, p1.e eVar) {
        a(i4);
        p1.e(d1Var, "fieldType");
        p1.e(z2Var, "oneof");
        p1.e(cls, "oneofStoredType");
        if (d1Var.isScalar()) {
            return new x0(null, i4, d1Var, null, null, 0, false, z4, z2Var, cls, null, eVar, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i4 + " is of type " + d1Var);
    }

    public static x0 g(Field field, int i4, d1 d1Var, Field field2) {
        a(i4);
        p1.e(field, "field");
        p1.e(d1Var, "fieldType");
        if (d1Var == d1.MESSAGE_LIST || d1Var == d1.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new x0(field, i4, d1Var, null, null, 0, false, false, null, null, null, null, field2);
    }

    public static x0 h(Field field, int i4, d1 d1Var, p1.e eVar, Field field2) {
        a(i4);
        p1.e(field, "field");
        return new x0(field, i4, d1Var, null, null, 0, false, false, null, null, null, eVar, field2);
    }

    public static x0 i(Field field, int i4, d1 d1Var, Field field2, int i5, boolean z4, p1.e eVar) {
        a(i4);
        p1.e(field, "field");
        p1.e(d1Var, "fieldType");
        p1.e(field2, "presenceField");
        if (field2 == null || y(i5)) {
            return new x0(field, i4, d1Var, null, field2, i5, false, z4, null, null, null, eVar, null);
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a("presenceMask must have exactly one bit set: ", i5));
    }

    public static x0 j(Field field, int i4, d1 d1Var, Field field2, int i5, boolean z4, p1.e eVar) {
        a(i4);
        p1.e(field, "field");
        p1.e(d1Var, "fieldType");
        p1.e(field2, "presenceField");
        if (field2 == null || y(i5)) {
            return new x0(field, i4, d1Var, null, field2, i5, true, z4, null, null, null, eVar, null);
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a("presenceMask must have exactly one bit set: ", i5));
    }

    public static x0 k(Field field, int i4, d1 d1Var, Class<?> cls) {
        a(i4);
        p1.e(field, "field");
        p1.e(d1Var, "fieldType");
        p1.e(cls, "messageClass");
        return new x0(field, i4, d1Var, cls, null, 0, false, false, null, null, null, null, null);
    }

    private static boolean y(int i4) {
        return i4 != 0 && (i4 & (i4 + (-1))) == 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(x0 x0Var) {
        return this.f29031e - x0Var.f29031e;
    }

    public Field l() {
        return this.f29037k;
    }

    public p1.e m() {
        return this.f29040n;
    }

    public Field n() {
        return this.f29028b;
    }

    public int o() {
        return this.f29031e;
    }

    public Class<?> p() {
        return this.f29030d;
    }

    public Object q() {
        return this.f29039m;
    }

    public Class<?> r() {
        int i4 = a.f29041a[this.f29029c.ordinal()];
        if (i4 == 1 || i4 == 2) {
            Field field = this.f29028b;
            return field != null ? field.getType() : this.f29038l;
        }
        if (i4 == 3 || i4 == 4) {
            return this.f29030d;
        }
        return null;
    }

    public z2 s() {
        return this.f29036j;
    }

    public Class<?> t() {
        return this.f29038l;
    }

    public Field u() {
        return this.f29032f;
    }

    public int v() {
        return this.f29033g;
    }

    public d1 w() {
        return this.f29029c;
    }

    public boolean x() {
        return this.f29035i;
    }

    public boolean z() {
        return this.f29034h;
    }
}

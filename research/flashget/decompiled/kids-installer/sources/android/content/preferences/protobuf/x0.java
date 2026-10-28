package android.content.preferences.protobuf;

import android.content.preferences.protobuf.o1;
import androidx.appcompat.view.menu.s;
import java.lang.reflect.Field;

/* compiled from: FieldInfo.java */
/* loaded from: classes.dex */
final class x0 implements Comparable<x0> {
    private final o1.e A;

    /* renamed from: o, reason: collision with root package name */
    private final Field f7582o;

    /* renamed from: p, reason: collision with root package name */
    private final d1 f7583p;

    /* renamed from: q, reason: collision with root package name */
    private final Class<?> f7584q;

    /* renamed from: r, reason: collision with root package name */
    private final int f7585r;

    /* renamed from: s, reason: collision with root package name */
    private final Field f7586s;

    /* renamed from: t, reason: collision with root package name */
    private final int f7587t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f7588u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f7589v;

    /* renamed from: w, reason: collision with root package name */
    private final w2 f7590w;

    /* renamed from: x, reason: collision with root package name */
    private final Field f7591x;

    /* renamed from: y, reason: collision with root package name */
    private final Class<?> f7592y;

    /* renamed from: z, reason: collision with root package name */
    private final Object f7593z;

    /* compiled from: FieldInfo.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7594a;

        static {
            int[] iArr = new int[d1.values().length];
            f7594a = iArr;
            try {
                iArr[d1.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7594a[d1.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7594a[d1.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7594a[d1.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: FieldInfo.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Field f7595a;

        /* renamed from: b, reason: collision with root package name */
        private d1 f7596b;

        /* renamed from: c, reason: collision with root package name */
        private int f7597c;

        /* renamed from: d, reason: collision with root package name */
        private Field f7598d;

        /* renamed from: e, reason: collision with root package name */
        private int f7599e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f7600f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f7601g;

        /* renamed from: h, reason: collision with root package name */
        private w2 f7602h;

        /* renamed from: i, reason: collision with root package name */
        private Class<?> f7603i;

        /* renamed from: j, reason: collision with root package name */
        private Object f7604j;

        /* renamed from: k, reason: collision with root package name */
        private o1.e f7605k;

        /* renamed from: l, reason: collision with root package name */
        private Field f7606l;

        private b() {
        }

        public x0 a() {
            w2 w2Var = this.f7602h;
            if (w2Var != null) {
                return x0.p(this.f7597c, this.f7596b, w2Var, this.f7603i, this.f7601g, this.f7605k);
            }
            Object obj = this.f7604j;
            if (obj != null) {
                return x0.o(this.f7595a, this.f7597c, obj, this.f7605k);
            }
            Field field = this.f7598d;
            if (field != null) {
                return this.f7600f ? x0.t(this.f7595a, this.f7597c, this.f7596b, field, this.f7599e, this.f7601g, this.f7605k) : x0.s(this.f7595a, this.f7597c, this.f7596b, field, this.f7599e, this.f7601g, this.f7605k);
            }
            o1.e eVar = this.f7605k;
            if (eVar != null) {
                Field field2 = this.f7606l;
                return field2 == null ? x0.l(this.f7595a, this.f7597c, this.f7596b, eVar) : x0.r(this.f7595a, this.f7597c, this.f7596b, eVar, field2);
            }
            Field field3 = this.f7606l;
            return field3 == null ? x0.j(this.f7595a, this.f7597c, this.f7596b, this.f7601g) : x0.q(this.f7595a, this.f7597c, this.f7596b, field3);
        }

        public b b(Field field) {
            this.f7606l = field;
            return this;
        }

        public b c(boolean z5) {
            this.f7601g = z5;
            return this;
        }

        public b d(o1.e eVar) {
            this.f7605k = eVar;
            return this;
        }

        public b e(Field field) {
            if (this.f7602h != null) {
                throw new IllegalStateException("Cannot set field when building a oneof.");
            }
            this.f7595a = field;
            return this;
        }

        public b f(int i5) {
            this.f7597c = i5;
            return this;
        }

        public b g(Object obj) {
            this.f7604j = obj;
            return this;
        }

        public b h(w2 w2Var, Class<?> cls) {
            if (this.f7595a != null || this.f7598d != null) {
                throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
            }
            this.f7602h = w2Var;
            this.f7603i = cls;
            return this;
        }

        public b i(Field field, int i5) {
            this.f7598d = (Field) o1.e(field, "presenceField");
            this.f7599e = i5;
            return this;
        }

        public b j(boolean z5) {
            this.f7600f = z5;
            return this;
        }

        public b k(d1 d1Var) {
            this.f7596b = d1Var;
            return this;
        }

        b(a aVar) {
        }
    }

    private x0(Field field, int i5, d1 d1Var, Class<?> cls, Field field2, int i6, boolean z5, boolean z6, w2 w2Var, Class<?> cls2, Object obj, o1.e eVar, Field field3) {
        this.f7582o = field;
        this.f7583p = d1Var;
        this.f7584q = cls;
        this.f7585r = i5;
        this.f7586s = field2;
        this.f7587t = i6;
        this.f7588u = z5;
        this.f7589v = z6;
        this.f7590w = w2Var;
        this.f7592y = cls2;
        this.f7593z = obj;
        this.A = eVar;
        this.f7591x = field3;
    }

    private static boolean I(int i5) {
        return i5 != 0 && (i5 & (i5 + (-1))) == 0;
    }

    public static b K() {
        return new b(null);
    }

    private static void g(int i5) {
        if (i5 <= 0) {
            throw new IllegalArgumentException(s.a("fieldNumber must be positive: ", i5));
        }
    }

    public static x0 j(Field field, int i5, d1 d1Var, boolean z5) {
        g(i5);
        o1.e(field, "field");
        o1.e(d1Var, "fieldType");
        if (d1Var == d1.MESSAGE_LIST || d1Var == d1.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new x0(field, i5, d1Var, null, null, 0, false, z5, null, null, null, null, null);
    }

    public static x0 l(Field field, int i5, d1 d1Var, o1.e eVar) {
        g(i5);
        o1.e(field, "field");
        return new x0(field, i5, d1Var, null, null, 0, false, false, null, null, null, eVar, null);
    }

    public static x0 o(Field field, int i5, Object obj, o1.e eVar) {
        o1.e(obj, "mapDefaultEntry");
        g(i5);
        o1.e(field, "field");
        return new x0(field, i5, d1.MAP, null, null, 0, false, true, null, null, obj, eVar, null);
    }

    public static x0 p(int i5, d1 d1Var, w2 w2Var, Class<?> cls, boolean z5, o1.e eVar) {
        g(i5);
        o1.e(d1Var, "fieldType");
        o1.e(w2Var, "oneof");
        o1.e(cls, "oneofStoredType");
        if (d1Var.isScalar()) {
            return new x0(null, i5, d1Var, null, null, 0, false, z5, w2Var, cls, null, eVar, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i5 + " is of type " + d1Var);
    }

    public static x0 q(Field field, int i5, d1 d1Var, Field field2) {
        g(i5);
        o1.e(field, "field");
        o1.e(d1Var, "fieldType");
        if (d1Var == d1.MESSAGE_LIST || d1Var == d1.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new x0(field, i5, d1Var, null, null, 0, false, false, null, null, null, null, field2);
    }

    public static x0 r(Field field, int i5, d1 d1Var, o1.e eVar, Field field2) {
        g(i5);
        o1.e(field, "field");
        return new x0(field, i5, d1Var, null, null, 0, false, false, null, null, null, eVar, field2);
    }

    public static x0 s(Field field, int i5, d1 d1Var, Field field2, int i6, boolean z5, o1.e eVar) {
        g(i5);
        o1.e(field, "field");
        o1.e(d1Var, "fieldType");
        o1.e(field2, "presenceField");
        if (field2 == null || I(i6)) {
            return new x0(field, i5, d1Var, null, field2, i6, false, z5, null, null, null, eVar, null);
        }
        throw new IllegalArgumentException(s.a("presenceMask must have exactly one bit set: ", i6));
    }

    public static x0 t(Field field, int i5, d1 d1Var, Field field2, int i6, boolean z5, o1.e eVar) {
        g(i5);
        o1.e(field, "field");
        o1.e(d1Var, "fieldType");
        o1.e(field2, "presenceField");
        if (field2 == null || I(i6)) {
            return new x0(field, i5, d1Var, null, field2, i6, true, z5, null, null, null, eVar, null);
        }
        throw new IllegalArgumentException(s.a("presenceMask must have exactly one bit set: ", i6));
    }

    public static x0 u(Field field, int i5, d1 d1Var, Class<?> cls) {
        g(i5);
        o1.e(field, "field");
        o1.e(d1Var, "fieldType");
        o1.e(cls, "messageClass");
        return new x0(field, i5, d1Var, cls, null, 0, false, false, null, null, null, null, null);
    }

    public Object A() {
        return this.f7593z;
    }

    public Class<?> B() {
        int i5 = a.f7594a[this.f7583p.ordinal()];
        if (i5 == 1 || i5 == 2) {
            Field field = this.f7582o;
            return field != null ? field.getType() : this.f7592y;
        }
        if (i5 == 3 || i5 == 4) {
            return this.f7584q;
        }
        return null;
    }

    public w2 C() {
        return this.f7590w;
    }

    public Class<?> D() {
        return this.f7592y;
    }

    public Field E() {
        return this.f7586s;
    }

    public int F() {
        return this.f7587t;
    }

    public d1 G() {
        return this.f7583p;
    }

    public boolean H() {
        return this.f7589v;
    }

    public boolean J() {
        return this.f7588u;
    }

    @Override // java.lang.Comparable
    public int compareTo(x0 x0Var) {
        return this.f7585r - x0Var.f7585r;
    }

    public int h(x0 x0Var) {
        return this.f7585r - x0Var.f7585r;
    }

    public Field v() {
        return this.f7591x;
    }

    public o1.e w() {
        return this.A;
    }

    public Field x() {
        return this.f7582o;
    }

    public int y() {
        return this.f7585r;
    }

    public Class<?> z() {
        return this.f7584q;
    }
}

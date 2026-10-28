package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.load.java.b0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.t;
import kotlin.reflect.jvm.internal.impl.name.f;

/* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
/* loaded from: classes7.dex */
public class b implements t.c {

    /* renamed from: j, reason: collision with root package name */
    private static boolean f76894j;

    /* renamed from: k, reason: collision with root package name */
    private static final Map<kotlin.reflect.jvm.internal.impl.name.b, a.EnumC1104a> f76895k;

    /* renamed from: a, reason: collision with root package name */
    private int[] f76896a = null;

    /* renamed from: b, reason: collision with root package name */
    private String f76897b = null;

    /* renamed from: c, reason: collision with root package name */
    private int f76898c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f76899d = null;

    /* renamed from: e, reason: collision with root package name */
    private String[] f76900e = null;

    /* renamed from: f, reason: collision with root package name */
    private String[] f76901f = null;

    /* renamed from: g, reason: collision with root package name */
    private String[] f76902g = null;

    /* renamed from: h, reason: collision with root package name */
    private a.EnumC1104a f76903h = null;

    /* renamed from: i, reason: collision with root package name */
    private String[] f76904i = null;

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.b$b, reason: collision with other inner class name */
    private static abstract class AbstractC1106b implements t.b {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f76905a = new ArrayList();

        private static /* synthetic */ void f(int i4) {
            Object[] objArr = new Object[3];
            if (i4 == 1) {
                objArr[0] = ProtectedSandApp.s("琙\u0001");
            } else if (i4 == 2) {
                objArr[0] = ProtectedSandApp.s("琘\u0001");
            } else if (i4 != 3) {
                objArr[0] = ProtectedSandApp.s("琖\u0001");
            } else {
                objArr[0] = ProtectedSandApp.s("琗\u0001");
            }
            objArr[1] = ProtectedSandApp.s("琚\u0001");
            if (i4 == 2) {
                objArr[2] = ProtectedSandApp.s("琝\u0001");
            } else if (i4 != 3) {
                objArr[2] = ProtectedSandApp.s("琛\u0001");
            } else {
                objArr[2] = ProtectedSandApp.s("琜\u0001");
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("琞\u0001"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.b
        public void a() {
            g((String[]) this.f76905a.toArray(new String[0]));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.b
        @m
        public t.a b(@l kotlin.reflect.jvm.internal.impl.name.b bVar) {
            if (bVar != null) {
                return null;
            }
            f(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.b
        public void c(@m Object obj) {
            if (obj instanceof String) {
                this.f76905a.add((String) obj);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.b
        public void d(@l kotlin.reflect.jvm.internal.impl.name.b bVar, @l f fVar) {
            if (bVar == null) {
                f(0);
            }
            if (fVar == null) {
                f(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.b
        public void e(@l kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar) {
            if (fVar == null) {
                f(2);
            }
        }

        protected abstract void g(@l String[] strArr);
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    private class c implements t.a {

        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        class a extends AbstractC1106b {
            a() {
            }

            private static /* synthetic */ void f(int i4) {
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("琢\u0001"), ProtectedSandApp.s("琡\u0001"), ProtectedSandApp.s("琟\u0001"), ProtectedSandApp.s("琠\u0001")));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.b.AbstractC1106b
            protected void g(@l String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f76900e = strArr;
            }
        }

        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.b$c$b, reason: collision with other inner class name */
        class C1107b extends AbstractC1106b {
            C1107b() {
            }

            private static /* synthetic */ void f(int i4) {
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("琦\u0001"), ProtectedSandApp.s("琥\u0001"), ProtectedSandApp.s("琣\u0001"), ProtectedSandApp.s("琤\u0001")));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.b.AbstractC1106b
            protected void g(@l String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f76901f = strArr;
            }
        }

        private c() {
        }

        private static /* synthetic */ void g(int i4) {
            Object[] objArr = new Object[3];
            if (i4 == 1) {
                objArr[0] = ProtectedSandApp.s("琪\u0001");
            } else if (i4 == 2) {
                objArr[0] = ProtectedSandApp.s("琩\u0001");
            } else if (i4 != 3) {
                objArr[0] = ProtectedSandApp.s("琧\u0001");
            } else {
                objArr[0] = ProtectedSandApp.s("琨\u0001");
            }
            objArr[1] = ProtectedSandApp.s("琫\u0001");
            if (i4 == 1 || i4 == 2) {
                objArr[2] = ProtectedSandApp.s("琮\u0001");
            } else if (i4 != 3) {
                objArr[2] = ProtectedSandApp.s("琬\u0001");
            } else {
                objArr[2] = ProtectedSandApp.s("琭\u0001");
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("琯\u0001"), objArr));
        }

        @l
        private t.b h() {
            return new a();
        }

        @l
        private t.b i() {
            return new C1107b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
        public void a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
        public void b(@m f fVar, @l kotlin.reflect.jvm.internal.impl.name.b bVar, @l f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
        @m
        public t.a c(@m f fVar, @l kotlin.reflect.jvm.internal.impl.name.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
        public void d(@m f fVar, @l kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
        public void e(@m f fVar, @m Object obj) {
            if (fVar == null) {
                return;
            }
            String b5 = fVar.b();
            if (ProtectedSandApp.s("琰\u0001").equals(b5)) {
                if (obj instanceof Integer) {
                    b.this.f76903h = a.EnumC1104a.getById(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            if (ProtectedSandApp.s("琱\u0001").equals(b5)) {
                if (obj instanceof int[]) {
                    b.this.f76896a = (int[]) obj;
                    return;
                }
                return;
            }
            if (ProtectedSandApp.s("琲\u0001").equals(b5)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    b.this.f76897b = str;
                    return;
                }
                return;
            }
            if (ProtectedSandApp.s("琳\u0001").equals(b5)) {
                if (obj instanceof Integer) {
                    b.this.f76898c = ((Integer) obj).intValue();
                    return;
                }
                return;
            }
            if (ProtectedSandApp.s("琴\u0001").equals(b5) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (str2.isEmpty()) {
                    return;
                }
                b.this.f76899d = str2;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
        @m
        public t.b f(@m f fVar) {
            String b5 = fVar != null ? fVar.b() : null;
            if (ProtectedSandApp.s("琵\u0001").equals(b5)) {
                return new a();
            }
            if (ProtectedSandApp.s("琶\u0001").equals(b5)) {
                return new C1107b();
            }
            return null;
        }
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    private class d implements t.a {

        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        class a extends AbstractC1106b {
            a() {
            }

            private static /* synthetic */ void f(int i4) {
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("琺\u0001"), ProtectedSandApp.s("琹\u0001"), ProtectedSandApp.s("琷\u0001"), ProtectedSandApp.s("琸\u0001")));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.b.AbstractC1106b
            protected void g(@l String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f76904i = strArr;
            }
        }

        private d() {
        }

        private static /* synthetic */ void g(int i4) {
            Object[] objArr = new Object[3];
            if (i4 == 1) {
                objArr[0] = ProtectedSandApp.s("琾\u0001");
            } else if (i4 == 2) {
                objArr[0] = ProtectedSandApp.s("琽\u0001");
            } else if (i4 != 3) {
                objArr[0] = ProtectedSandApp.s("琻\u0001");
            } else {
                objArr[0] = ProtectedSandApp.s("琼\u0001");
            }
            objArr[1] = ProtectedSandApp.s("琿\u0001");
            if (i4 == 1 || i4 == 2) {
                objArr[2] = ProtectedSandApp.s("瑂\u0001");
            } else if (i4 != 3) {
                objArr[2] = ProtectedSandApp.s("瑀\u0001");
            } else {
                objArr[2] = ProtectedSandApp.s("瑁\u0001");
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("瑃\u0001"), objArr));
        }

        @l
        private t.b h() {
            return new a();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
        public void a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
        public void b(@m f fVar, @l kotlin.reflect.jvm.internal.impl.name.b bVar, @l f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
        @m
        public t.a c(@m f fVar, @l kotlin.reflect.jvm.internal.impl.name.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
        public void d(@m f fVar, @l kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
        public void e(@m f fVar, @m Object obj) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
        @m
        public t.b f(@m f fVar) {
            if (ProtectedSandApp.s("瑄\u0001").equals(fVar != null ? fVar.b() : null)) {
                return new a();
            }
            return null;
        }
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    private class e implements t.a {

        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        class a extends AbstractC1106b {
            a() {
            }

            private static /* synthetic */ void f(int i4) {
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("瑈\u0001"), ProtectedSandApp.s("瑇\u0001"), ProtectedSandApp.s("瑅\u0001"), ProtectedSandApp.s("瑆\u0001")));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.b.AbstractC1106b
            protected void g(@l String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f76900e = strArr;
            }
        }

        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.b$e$b, reason: collision with other inner class name */
        class C1108b extends AbstractC1106b {
            C1108b() {
            }

            private static /* synthetic */ void f(int i4) {
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("瑌\u0001"), ProtectedSandApp.s("瑋\u0001"), ProtectedSandApp.s("瑉\u0001"), ProtectedSandApp.s("瑊\u0001")));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.b.AbstractC1106b
            protected void g(@l String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f76901f = strArr;
            }
        }

        private e() {
        }

        private static /* synthetic */ void g(int i4) {
            Object[] objArr = new Object[3];
            if (i4 == 1) {
                objArr[0] = ProtectedSandApp.s("瑐\u0001");
            } else if (i4 == 2) {
                objArr[0] = ProtectedSandApp.s("瑏\u0001");
            } else if (i4 != 3) {
                objArr[0] = ProtectedSandApp.s("瑍\u0001");
            } else {
                objArr[0] = ProtectedSandApp.s("瑎\u0001");
            }
            objArr[1] = ProtectedSandApp.s("瑑\u0001");
            if (i4 == 1 || i4 == 2) {
                objArr[2] = ProtectedSandApp.s("瑔\u0001");
            } else if (i4 != 3) {
                objArr[2] = ProtectedSandApp.s("瑒\u0001");
            } else {
                objArr[2] = ProtectedSandApp.s("瑓\u0001");
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("瑕\u0001"), objArr));
        }

        @l
        private t.b h() {
            return new a();
        }

        @l
        private t.b i() {
            return new C1108b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
        public void a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
        public void b(@m f fVar, @l kotlin.reflect.jvm.internal.impl.name.b bVar, @l f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
        @m
        public t.a c(@m f fVar, @l kotlin.reflect.jvm.internal.impl.name.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
        public void d(@m f fVar, @l kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
        public void e(@m f fVar, @m Object obj) {
            if (fVar == null) {
                return;
            }
            String b5 = fVar.b();
            if (ProtectedSandApp.s("瑖\u0001").equals(b5)) {
                if (obj instanceof int[]) {
                    b.this.f76896a = (int[]) obj;
                }
            } else if (ProtectedSandApp.s("瑗\u0001").equals(b5)) {
                b.this.f76897b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
        @m
        public t.b f(@m f fVar) {
            String b5 = fVar != null ? fVar.b() : null;
            if (ProtectedSandApp.s("瑘\u0001").equals(b5) || ProtectedSandApp.s("瑙\u0001").equals(b5)) {
                return new a();
            }
            if (ProtectedSandApp.s("瑚\u0001").equals(b5)) {
                return new C1108b();
            }
            return null;
        }
    }

    static {
        try {
            f76894j = ProtectedSandApp.s("瑛\u0001").equals(System.getProperty(ProtectedSandApp.s("瑜\u0001")));
        } catch (AccessControlException unused) {
            f76894j = false;
        }
        HashMap hashMap = new HashMap();
        f76895k = hashMap;
        hashMap.put(kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("瑝\u0001"))), a.EnumC1104a.CLASS);
        hashMap.put(kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("瑞\u0001"))), a.EnumC1104a.FILE_FACADE);
        hashMap.put(kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("瑟\u0001"))), a.EnumC1104a.MULTIFILE_CLASS);
        hashMap.put(kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("瑠\u0001"))), a.EnumC1104a.MULTIFILE_CLASS_PART);
        hashMap.put(kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("瑡\u0001"))), a.EnumC1104a.SYNTHETIC_CLASS);
    }

    private static /* synthetic */ void d(int i4) {
        Object[] objArr = new Object[3];
        if (i4 != 1) {
            objArr[0] = ProtectedSandApp.s("瑢\u0001");
        } else {
            objArr[0] = ProtectedSandApp.s("瑣\u0001");
        }
        objArr[1] = ProtectedSandApp.s("瑤\u0001");
        objArr[2] = ProtectedSandApp.s("瑥\u0001");
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("瑦\u0001"), objArr));
    }

    private boolean o() {
        a.EnumC1104a enumC1104a = this.f76903h;
        return enumC1104a == a.EnumC1104a.CLASS || enumC1104a == a.EnumC1104a.FILE_FACADE || enumC1104a == a.EnumC1104a.MULTIFILE_CLASS_PART;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.c
    public void a() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.c
    @m
    public t.a c(@l kotlin.reflect.jvm.internal.impl.name.b bVar, @l a1 a1Var) {
        a.EnumC1104a enumC1104a;
        if (bVar == null) {
            d(0);
        }
        if (a1Var == null) {
            d(1);
        }
        kotlin.reflect.jvm.internal.impl.name.c b5 = bVar.b();
        if (b5.equals(b0.f76325a)) {
            return new c();
        }
        if (b5.equals(b0.f76344t)) {
            return new d();
        }
        if (f76894j || this.f76903h != null || (enumC1104a = f76895k.get(bVar)) == null) {
            return null;
        }
        this.f76903h = enumC1104a;
        return new e();
    }

    @m
    public kotlin.reflect.jvm.internal.impl.load.kotlin.header.a m(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e eVar) {
        if (this.f76903h == null || this.f76896a == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e eVar2 = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e(this.f76896a, (this.f76898c & 8) != 0);
        if (!eVar2.h(eVar)) {
            this.f76902g = this.f76900e;
            this.f76900e = null;
        } else if (o() && this.f76900e == null) {
            return null;
        }
        String[] strArr = this.f76904i;
        return new kotlin.reflect.jvm.internal.impl.load.kotlin.header.a(this.f76903h, eVar2, this.f76900e, this.f76902g, this.f76901f, this.f76897b, this.f76898c, this.f76899d, strArr != null ? kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.a.e(strArr) : null);
    }

    @m
    public kotlin.reflect.jvm.internal.impl.load.kotlin.header.a n() {
        return m(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e.f77546i);
    }
}

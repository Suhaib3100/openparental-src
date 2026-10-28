package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.load.java.b0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.r;
import kotlin.reflect.jvm.internal.impl.name.f;

/* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
/* loaded from: classes5.dex */
public class b implements r.c {

    /* renamed from: j, reason: collision with root package name */
    private static final boolean f25020j = ProtectedSandApp.s("䲂").equals(System.getProperty(ProtectedSandApp.s("䲁")));

    /* renamed from: k, reason: collision with root package name */
    private static final Map<kotlin.reflect.jvm.internal.impl.name.b, a.EnumC0299a> f25021k;

    /* renamed from: a, reason: collision with root package name */
    private int[] f25022a = null;

    /* renamed from: b, reason: collision with root package name */
    private String f25023b = null;

    /* renamed from: c, reason: collision with root package name */
    private int f25024c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f25025d = null;

    /* renamed from: e, reason: collision with root package name */
    private String[] f25026e = null;

    /* renamed from: f, reason: collision with root package name */
    private String[] f25027f = null;

    /* renamed from: g, reason: collision with root package name */
    private String[] f25028g = null;

    /* renamed from: h, reason: collision with root package name */
    private a.EnumC0299a f25029h = null;

    /* renamed from: i, reason: collision with root package name */
    private String[] f25030i = null;

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.b$b, reason: collision with other inner class name */
    private static abstract class AbstractC0301b implements r.b {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f25031a = new ArrayList();

        private static /* synthetic */ void f(int i5) {
            Object[] objArr = new Object[3];
            if (i5 == 1) {
                objArr[0] = ProtectedSandApp.s("䱓");
            } else if (i5 == 2) {
                objArr[0] = ProtectedSandApp.s("䱒");
            } else if (i5 != 3) {
                objArr[0] = ProtectedSandApp.s("䱐");
            } else {
                objArr[0] = ProtectedSandApp.s("䱑");
            }
            objArr[1] = ProtectedSandApp.s("䱔");
            if (i5 == 2) {
                objArr[2] = ProtectedSandApp.s("䱗");
            } else if (i5 != 3) {
                objArr[2] = ProtectedSandApp.s("䱕");
            } else {
                objArr[2] = ProtectedSandApp.s("䱖");
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("䱘"), objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.b
        public void a() {
            g((String[]) this.f25031a.toArray(new String[0]));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.b
        public void b(@d5.e Object obj) {
            if (obj instanceof String) {
                this.f25031a.add((String) obj);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.b
        public void c(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.d f fVar) {
            if (bVar == null) {
                f(0);
            }
            if (fVar == null) {
                f(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.b
        @d5.e
        public r.a d(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
            if (bVar != null) {
                return null;
            }
            f(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.b
        public void e(@d5.d kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar) {
            if (fVar == null) {
                f(2);
            }
        }

        protected abstract void g(@d5.d String[] strArr);
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    private class c implements r.a {

        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        /* loaded from: classes6.dex */
        class a extends AbstractC0301b {
            a() {
            }

            private static /* synthetic */ void f(int i5) {
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("藳"), ProtectedSandApp.s("藰"), ProtectedSandApp.s("藱"), ProtectedSandApp.s("藲")));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.b.AbstractC0301b
            protected void g(@d5.d String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f25026e = strArr;
            }
        }

        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.b$c$b, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        class C0302b extends AbstractC0301b {
            C0302b() {
            }

            private static /* synthetic */ void f(int i5) {
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("藷"), ProtectedSandApp.s("藴"), ProtectedSandApp.s("藵"), ProtectedSandApp.s("藶")));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.b.AbstractC0301b
            protected void g(@d5.d String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f25027f = strArr;
            }
        }

        private c() {
        }

        private static /* synthetic */ void g(int i5) {
            Object[] objArr = new Object[3];
            if (i5 == 1) {
                objArr[0] = ProtectedSandApp.s("䱜");
            } else if (i5 == 2) {
                objArr[0] = ProtectedSandApp.s("䱛");
            } else if (i5 != 3) {
                objArr[0] = ProtectedSandApp.s("䱙");
            } else {
                objArr[0] = ProtectedSandApp.s("䱚");
            }
            objArr[1] = ProtectedSandApp.s("䱝");
            if (i5 == 1 || i5 == 2) {
                objArr[2] = ProtectedSandApp.s("䱠");
            } else if (i5 != 3) {
                objArr[2] = ProtectedSandApp.s("䱞");
            } else {
                objArr[2] = ProtectedSandApp.s("䱟");
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("䱡"), objArr));
        }

        @d5.d
        private r.b h() {
            return new a();
        }

        @d5.d
        private r.b i() {
            return new C0302b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
        public void a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
        public void b(@d5.e f fVar, @d5.d kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
        public void c(@d5.e f fVar, @d5.e Object obj) {
            if (fVar == null) {
                return;
            }
            String h5 = fVar.h();
            if (ProtectedSandApp.s("䱢").equals(h5)) {
                if (obj instanceof Integer) {
                    b.this.f25029h = a.EnumC0299a.getById(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            if (ProtectedSandApp.s("䱣").equals(h5)) {
                if (obj instanceof int[]) {
                    b.this.f25022a = (int[]) obj;
                    return;
                }
                return;
            }
            if (ProtectedSandApp.s("䱤").equals(h5)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    b.this.f25023b = str;
                    return;
                }
                return;
            }
            if (ProtectedSandApp.s("䱥").equals(h5)) {
                if (obj instanceof Integer) {
                    b.this.f25024c = ((Integer) obj).intValue();
                    return;
                }
                return;
            }
            if (ProtectedSandApp.s("䱦").equals(h5) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (str2.isEmpty()) {
                    return;
                }
                b.this.f25025d = str2;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
        public void d(@d5.e f fVar, @d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.d f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
        @d5.e
        public r.a e(@d5.e f fVar, @d5.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
        @d5.e
        public r.b f(@d5.e f fVar) {
            String h5 = fVar != null ? fVar.h() : null;
            if (ProtectedSandApp.s("䱧").equals(h5)) {
                return new a();
            }
            if (ProtectedSandApp.s("䱨").equals(h5)) {
                return new C0302b();
            }
            return null;
        }
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    private class d implements r.a {

        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        /* loaded from: classes6.dex */
        class a extends AbstractC0301b {
            a() {
            }

            private static /* synthetic */ void f(int i5) {
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("藻"), ProtectedSandApp.s("藸"), ProtectedSandApp.s("藹"), ProtectedSandApp.s("藺")));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.b.AbstractC0301b
            protected void g(@d5.d String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f25030i = strArr;
            }
        }

        private d() {
        }

        private static /* synthetic */ void g(int i5) {
            Object[] objArr = new Object[3];
            if (i5 == 1) {
                objArr[0] = ProtectedSandApp.s("䱬");
            } else if (i5 == 2) {
                objArr[0] = ProtectedSandApp.s("䱫");
            } else if (i5 != 3) {
                objArr[0] = ProtectedSandApp.s("䱩");
            } else {
                objArr[0] = ProtectedSandApp.s("䱪");
            }
            objArr[1] = ProtectedSandApp.s("䱭");
            if (i5 == 1 || i5 == 2) {
                objArr[2] = ProtectedSandApp.s("䱰");
            } else if (i5 != 3) {
                objArr[2] = ProtectedSandApp.s("䱮");
            } else {
                objArr[2] = ProtectedSandApp.s("䱯");
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("䱱"), objArr));
        }

        @d5.d
        private r.b h() {
            return new a();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
        public void a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
        public void b(@d5.e f fVar, @d5.d kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
        public void c(@d5.e f fVar, @d5.e Object obj) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
        public void d(@d5.e f fVar, @d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.d f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
        @d5.e
        public r.a e(@d5.e f fVar, @d5.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
        @d5.e
        public r.b f(@d5.e f fVar) {
            if (ProtectedSandApp.s("䱲").equals(fVar != null ? fVar.h() : null)) {
                return new a();
            }
            return null;
        }
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    private class e implements r.a {

        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        /* loaded from: classes6.dex */
        class a extends AbstractC0301b {
            a() {
            }

            private static /* synthetic */ void f(int i5) {
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("藿"), ProtectedSandApp.s("藼"), ProtectedSandApp.s("藽"), ProtectedSandApp.s("藾")));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.b.AbstractC0301b
            protected void g(@d5.d String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f25026e = strArr;
            }
        }

        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.b$e$b, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        class C0303b extends AbstractC0301b {
            C0303b() {
            }

            private static /* synthetic */ void f(int i5) {
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("蘃"), ProtectedSandApp.s("蘀"), ProtectedSandApp.s("蘁"), ProtectedSandApp.s("蘂")));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.b.AbstractC0301b
            protected void g(@d5.d String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f25027f = strArr;
            }
        }

        private e() {
        }

        private static /* synthetic */ void g(int i5) {
            Object[] objArr = new Object[3];
            if (i5 == 1) {
                objArr[0] = ProtectedSandApp.s("䱶");
            } else if (i5 == 2) {
                objArr[0] = ProtectedSandApp.s("䱵");
            } else if (i5 != 3) {
                objArr[0] = ProtectedSandApp.s("䱳");
            } else {
                objArr[0] = ProtectedSandApp.s("䱴");
            }
            objArr[1] = ProtectedSandApp.s("䱷");
            if (i5 == 1 || i5 == 2) {
                objArr[2] = ProtectedSandApp.s("䱺");
            } else if (i5 != 3) {
                objArr[2] = ProtectedSandApp.s("䱸");
            } else {
                objArr[2] = ProtectedSandApp.s("䱹");
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("䱻"), objArr));
        }

        @d5.d
        private r.b h() {
            return new a();
        }

        @d5.d
        private r.b i() {
            return new C0303b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
        public void a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
        public void b(@d5.e f fVar, @d5.d kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
        public void c(@d5.e f fVar, @d5.e Object obj) {
            if (fVar == null) {
                return;
            }
            String h5 = fVar.h();
            if (ProtectedSandApp.s("䱼").equals(h5)) {
                if (obj instanceof int[]) {
                    b.this.f25022a = (int[]) obj;
                }
            } else if (ProtectedSandApp.s("䱽").equals(h5)) {
                b.this.f25023b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
        public void d(@d5.e f fVar, @d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.d f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
        @d5.e
        public r.a e(@d5.e f fVar, @d5.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
        @d5.e
        public r.b f(@d5.e f fVar) {
            String h5 = fVar != null ? fVar.h() : null;
            if (ProtectedSandApp.s("䱾").equals(h5) || ProtectedSandApp.s("䱿").equals(h5)) {
                return new a();
            }
            if (ProtectedSandApp.s("䲀").equals(h5)) {
                return new C0303b();
            }
            return null;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f25021k = hashMap;
        hashMap.put(kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䲃"))), a.EnumC0299a.CLASS);
        hashMap.put(kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䲄"))), a.EnumC0299a.FILE_FACADE);
        hashMap.put(kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䲅"))), a.EnumC0299a.MULTIFILE_CLASS);
        hashMap.put(kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䲆"))), a.EnumC0299a.MULTIFILE_CLASS_PART);
        hashMap.put(kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䲇"))), a.EnumC0299a.SYNTHETIC_CLASS);
    }

    private static /* synthetic */ void d(int i5) {
        Object[] objArr = new Object[3];
        if (i5 != 1) {
            objArr[0] = ProtectedSandApp.s("䲈");
        } else {
            objArr[0] = ProtectedSandApp.s("䲉");
        }
        objArr[1] = ProtectedSandApp.s("䲊");
        objArr[2] = ProtectedSandApp.s("䲋");
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("䲌"), objArr));
    }

    private boolean n() {
        a.EnumC0299a enumC0299a = this.f25029h;
        return enumC0299a == a.EnumC0299a.CLASS || enumC0299a == a.EnumC0299a.FILE_FACADE || enumC0299a == a.EnumC0299a.MULTIFILE_CLASS_PART;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.c
    public void a() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.c
    @d5.e
    public r.a b(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.d a1 a1Var) {
        a.EnumC0299a enumC0299a;
        if (bVar == null) {
            d(0);
        }
        if (a1Var == null) {
            d(1);
        }
        kotlin.reflect.jvm.internal.impl.name.c b6 = bVar.b();
        if (b6.equals(b0.f24475a)) {
            return new c();
        }
        if (b6.equals(b0.f24493s)) {
            return new d();
        }
        if (f25020j || this.f25029h != null || (enumC0299a = f25021k.get(bVar)) == null) {
            return null;
        }
        this.f25029h = enumC0299a;
        return new e();
    }

    @d5.e
    public kotlin.reflect.jvm.internal.impl.load.kotlin.header.a m() {
        if (this.f25029h == null || this.f25022a == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e eVar = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e(this.f25022a, (this.f25024c & 8) != 0);
        if (!eVar.h()) {
            this.f25028g = this.f25026e;
            this.f25026e = null;
        } else if (n() && this.f25026e == null) {
            return null;
        }
        String[] strArr = this.f25030i;
        return new kotlin.reflect.jvm.internal.impl.load.kotlin.header.a(this.f25029h, eVar, this.f25026e, this.f25028g, this.f25027f, this.f25023b, this.f25024c, this.f25025d, strArr != null ? kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.a.e(strArr) : null);
    }
}

package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.x0;
import androidx.core.content.k;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: IntentSanitizer.java */
/* loaded from: classes3.dex */
public class k {

    /* renamed from: p, reason: collision with root package name */
    private static final String f25987p = "IntentSanitizer";

    /* renamed from: a, reason: collision with root package name */
    private int f25988a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.core.util.c0<String> f25989b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.core.util.c0<Uri> f25990c;

    /* renamed from: d, reason: collision with root package name */
    private androidx.core.util.c0<String> f25991d;

    /* renamed from: e, reason: collision with root package name */
    private androidx.core.util.c0<String> f25992e;

    /* renamed from: f, reason: collision with root package name */
    private androidx.core.util.c0<String> f25993f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.core.util.c0<ComponentName> f25994g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f25995h;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, androidx.core.util.c0<Object>> f25996i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f25997j;

    /* renamed from: k, reason: collision with root package name */
    private androidx.core.util.c0<Uri> f25998k;

    /* renamed from: l, reason: collision with root package name */
    private androidx.core.util.c0<ClipData> f25999l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f26000m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f26001n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f26002o;

    /* compiled from: IntentSanitizer.java */
    @x0(29)
    private static class b {
        private b() {
        }

        static String a(Intent intent) {
            return intent.getIdentifier();
        }

        static Intent b(Intent intent, String str) {
            return intent.setIdentifier(str);
        }
    }

    /* compiled from: IntentSanitizer.java */
    @x0(31)
    private static class c {
        private c() {
        }

        static void a(int i4, ClipData.Item item, androidx.core.util.e<String> eVar) {
            if (item.getHtmlText() == null && item.getIntent() == null && item.getTextLinks() == null) {
                return;
            }
            eVar.accept("ClipData item at position " + i4 + " contains htmlText, textLinks or intent: " + item);
        }
    }

    /* compiled from: IntentSanitizer.java */
    public static final class d {

        /* renamed from: q, reason: collision with root package name */
        private static final int f26003q = 2112614400;

        /* renamed from: r, reason: collision with root package name */
        private static final int f26004r = 2015363072;

        /* renamed from: a, reason: collision with root package name */
        private int f26005a;

        /* renamed from: h, reason: collision with root package name */
        private boolean f26012h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f26013i;

        /* renamed from: n, reason: collision with root package name */
        private boolean f26018n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f26019o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f26020p;

        /* renamed from: b, reason: collision with root package name */
        private androidx.core.util.c0<String> f26006b = new r();

        /* renamed from: c, reason: collision with root package name */
        private androidx.core.util.c0<Uri> f26007c = new s();

        /* renamed from: d, reason: collision with root package name */
        private androidx.core.util.c0<String> f26008d = new r();

        /* renamed from: e, reason: collision with root package name */
        private androidx.core.util.c0<String> f26009e = new r();

        /* renamed from: f, reason: collision with root package name */
        private androidx.core.util.c0<String> f26010f = new r();

        /* renamed from: g, reason: collision with root package name */
        private androidx.core.util.c0<ComponentName> f26011g = new t();

        /* renamed from: j, reason: collision with root package name */
        private Map<String, androidx.core.util.c0<Object>> f26014j = new HashMap();

        /* renamed from: k, reason: collision with root package name */
        private boolean f26015k = false;

        /* renamed from: l, reason: collision with root package name */
        private androidx.core.util.c0<Uri> f26016l = new s();

        /* renamed from: m, reason: collision with root package name */
        private androidx.core.util.c0<ClipData> f26017m = new u();

        private static /* synthetic */ boolean X(ComponentName componentName) {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean Y(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean Z(String str, ComponentName componentName) {
            return str.equals(componentName.getPackageName());
        }

        public static /* synthetic */ boolean a(ComponentName componentName) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean a0(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        public static /* synthetic */ boolean b(String str) {
            return false;
        }

        private static /* synthetic */ boolean b0(Object obj) {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean c0(Class cls, androidx.core.util.c0 c0Var, Object obj) {
            return cls.isInstance(obj) && c0Var.test(cls.cast(obj));
        }

        private static /* synthetic */ boolean d0(Object obj) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean e0(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        public static /* synthetic */ boolean f(String str) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean f0(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        private static /* synthetic */ boolean g0(String str) {
            return false;
        }

        private static /* synthetic */ boolean h0(Uri uri) {
            return false;
        }

        public static /* synthetic */ boolean i(Object obj) {
            return false;
        }

        private static /* synthetic */ boolean i0(String str) {
            return false;
        }

        public static /* synthetic */ boolean j(ComponentName componentName) {
            return true;
        }

        private static /* synthetic */ boolean j0(String str) {
            return false;
        }

        public static /* synthetic */ boolean k(String str) {
            return false;
        }

        private static /* synthetic */ boolean k0(String str) {
            return false;
        }

        public static /* synthetic */ boolean l(Uri uri) {
            return false;
        }

        private static /* synthetic */ boolean l0(ComponentName componentName) {
            return false;
        }

        public static /* synthetic */ boolean m(Uri uri) {
            return false;
        }

        private static /* synthetic */ boolean m0(Uri uri) {
            return false;
        }

        private static /* synthetic */ boolean n0(ClipData clipData) {
            return false;
        }

        public static /* synthetic */ boolean o(Object obj) {
            return true;
        }

        public static /* synthetic */ boolean p(String str) {
            return false;
        }

        public static /* synthetic */ boolean q(ClipData clipData) {
            return false;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d A(@o0 final ComponentName componentName) {
            componentName.getClass();
            return B(new androidx.core.util.c0() { // from class: androidx.core.content.m
                @Override // androidx.core.util.c0
                public final boolean test(Object obj) {
                    return componentName.equals((ComponentName) obj);
                }
            });
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d B(@o0 androidx.core.util.c0<ComponentName> c0Var) {
            c0Var.getClass();
            this.f26013i = true;
            this.f26011g = this.f26011g.e(c0Var);
            return this;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d C(@o0 final String str) {
            str.getClass();
            return B(new androidx.core.util.c0() { // from class: androidx.core.content.x
                @Override // androidx.core.util.c0
                public final boolean test(Object obj) {
                    boolean Z;
                    Z = k.d.Z(str, (ComponentName) obj);
                    return Z;
                }
            });
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d D(@o0 androidx.core.util.c0<Uri> c0Var) {
            c0Var.getClass();
            this.f26007c = this.f26007c.e(c0Var);
            return this;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d E(@o0 final String str) {
            str.getClass();
            D(new androidx.core.util.c0() { // from class: androidx.core.content.y
                @Override // androidx.core.util.c0
                public final boolean test(Object obj) {
                    boolean a02;
                    a02 = k.d.a0(str, (Uri) obj);
                    return a02;
                }
            });
            return this;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d F(@o0 String str, @o0 androidx.core.util.c0<Object> c0Var) {
            str.getClass();
            c0Var.getClass();
            androidx.core.util.c0<Object> c0Var2 = this.f26014j.get(str);
            if (c0Var2 == null) {
                c0Var2 = new p();
            }
            this.f26014j.put(str, c0Var2.e(c0Var));
            return this;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d G(@o0 String str, @o0 Class<?> cls) {
            return H(str, cls, new v());
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public <T> d H(@o0 String str, @o0 final Class<T> cls, @o0 final androidx.core.util.c0<T> c0Var) {
            str.getClass();
            cls.getClass();
            c0Var.getClass();
            return F(str, new androidx.core.util.c0() { // from class: androidx.core.content.z
                @Override // androidx.core.util.c0
                public final boolean test(Object obj) {
                    boolean c02;
                    c02 = k.d.c0(cls, c0Var, obj);
                    return c02;
                }
            });
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d I(@o0 androidx.core.util.c0<Uri> c0Var) {
            H("output", Uri.class, c0Var);
            return this;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d J(@o0 final String str) {
            H("output", Uri.class, new androidx.core.util.c0() { // from class: androidx.core.content.l
                @Override // androidx.core.util.c0
                public final boolean test(Object obj) {
                    boolean e02;
                    e02 = k.d.e0(str, (Uri) obj);
                    return e02;
                }
            });
            return this;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d K(@o0 androidx.core.util.c0<Uri> c0Var) {
            H("android.intent.extra.STREAM", Uri.class, c0Var);
            return this;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d L(@o0 final String str) {
            str.getClass();
            H("android.intent.extra.STREAM", Uri.class, new androidx.core.util.c0() { // from class: androidx.core.content.q
                @Override // androidx.core.util.c0
                public final boolean test(Object obj) {
                    boolean f02;
                    f02 = k.d.f0(str, (Uri) obj);
                    return f02;
                }
            });
            return this;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d M(int i4) {
            this.f26005a = i4 | this.f26005a;
            return this;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d N() {
            this.f26005a |= f26003q;
            return this;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d O() {
            this.f26018n = true;
            return this;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d P(@o0 androidx.core.util.c0<String> c0Var) {
            c0Var.getClass();
            this.f26010f = this.f26010f.e(c0Var);
            return this;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d Q(@o0 String str) {
            str.getClass();
            return P(new w(str));
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d R() {
            this.f26005a |= f26004r;
            return this;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d S() {
            this.f26019o = true;
            return this;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d T() {
            this.f26020p = true;
            return this;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d U(@o0 androidx.core.util.c0<String> c0Var) {
            c0Var.getClass();
            this.f26008d = this.f26008d.e(c0Var);
            return this;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d V(@o0 String str) {
            str.getClass();
            return U(new w(str));
        }

        @o0
        public k W() {
            boolean z4 = this.f26012h;
            if ((z4 && this.f26013i) || (!z4 && !this.f26013i)) {
                throw new SecurityException("You must call either allowAnyComponent or one or more of the allowComponent methods; but not both.");
            }
            k kVar = new k();
            kVar.f25988a = this.f26005a;
            kVar.f25989b = this.f26006b;
            kVar.f25990c = this.f26007c;
            kVar.f25991d = this.f26008d;
            kVar.f25992e = this.f26009e;
            kVar.f25993f = this.f26010f;
            kVar.f25995h = this.f26012h;
            kVar.f25994g = this.f26011g;
            kVar.f25996i = this.f26014j;
            kVar.f25997j = this.f26015k;
            kVar.f25998k = this.f26016l;
            kVar.f25999l = this.f26017m;
            kVar.f26000m = this.f26018n;
            kVar.f26001n = this.f26019o;
            kVar.f26002o = this.f26020p;
            return kVar;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d r(@o0 androidx.core.util.c0<String> c0Var) {
            c0Var.getClass();
            this.f26006b = this.f26006b.e(c0Var);
            return this;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d s(@o0 String str) {
            str.getClass();
            r(new w(str));
            return this;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d t() {
            this.f26012h = true;
            this.f26011g = new n();
            return this;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d u(@o0 androidx.core.util.c0<String> c0Var) {
            c0Var.getClass();
            this.f26009e = this.f26009e.e(c0Var);
            return this;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d v(@o0 String str) {
            str.getClass();
            return u(new w(str));
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d w(@o0 androidx.core.util.c0<ClipData> c0Var) {
            c0Var.getClass();
            this.f26017m = this.f26017m.e(c0Var);
            return this;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d x() {
            this.f26015k = true;
            return this;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d y(@o0 androidx.core.util.c0<Uri> c0Var) {
            c0Var.getClass();
            this.f26016l = this.f26016l.e(c0Var);
            return this;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public d z(@o0 final String str) {
            str.getClass();
            return y(new androidx.core.util.c0() { // from class: androidx.core.content.o
                @Override // androidx.core.util.c0
                public final boolean test(Object obj) {
                    boolean Y;
                    Y = k.d.Y(str, (Uri) obj);
                    return Y;
                }
            });
        }
    }

    private k() {
    }

    public static /* synthetic */ void b(String str) {
    }

    private static void r(int i4, ClipData.Item item, androidx.core.util.e<String> eVar) {
        if (item.getHtmlText() == null && item.getIntent() == null) {
            return;
        }
        eVar.accept("ClipData item at position " + i4 + " contains htmlText, textLinks or intent: " + item);
    }

    private static /* synthetic */ void s(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(String str) {
        throw new SecurityException(str);
    }

    private void u(Intent intent, String str, Object obj) {
        if (obj == null) {
            intent.getExtras().putString(str, null);
            return;
        }
        if (obj instanceof Parcelable) {
            intent.putExtra(str, (Parcelable) obj);
            return;
        }
        if (obj instanceof Parcelable[]) {
            intent.putExtra(str, (Parcelable[]) obj);
        } else if (obj instanceof Serializable) {
            intent.putExtra(str, (Serializable) obj);
        } else {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void y(@androidx.annotation.o0 android.content.Intent r7, android.content.Intent r8, androidx.core.util.c0<android.content.ClipData> r9, boolean r10, androidx.core.util.c0<android.net.Uri> r11, androidx.core.util.e<java.lang.String> r12) {
        /*
            android.content.ClipData r7 = r7.getClipData()
            if (r7 != 0) goto L7
            return
        L7:
            if (r9 == 0) goto L14
            boolean r9 = r9.test(r7)
            if (r9 == 0) goto L14
            r8.setClipData(r7)
            goto Lc0
        L14:
            r9 = 0
            r0 = 0
            r1 = r9
        L17:
            int r2 = r7.getItemCount()
            if (r0 >= r2) goto Lbb
            android.content.ClipData$Item r2 = r7.getItemAt(r0)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r3 < r4) goto L2b
            androidx.core.content.k.c.a(r0, r2, r12)
            goto L2e
        L2b:
            r(r0, r2, r12)
        L2e:
            if (r10 == 0) goto L35
            java.lang.CharSequence r3 = r2.getText()
            goto L52
        L35:
            java.lang.CharSequence r3 = r2.getText()
            if (r3 == 0) goto L51
            java.lang.String r3 = "Item text cannot contain value. Item position: "
            java.lang.String r4 = ". Text: "
            java.lang.StringBuilder r3 = androidx.collection.s.a(r3, r0, r4)
            java.lang.CharSequence r4 = r2.getText()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r12.accept(r3)
        L51:
            r3 = r9
        L52:
            java.lang.String r4 = ". URI: "
            java.lang.String r5 = "Item URI is not allowed. Item position: "
            if (r11 != 0) goto L71
            android.net.Uri r6 = r2.getUri()
            if (r6 == 0) goto L94
            java.lang.StringBuilder r4 = androidx.collection.s.a(r5, r0, r4)
            android.net.Uri r2 = r2.getUri()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r12.accept(r2)
            goto L94
        L71:
            android.net.Uri r6 = r2.getUri()
            if (r6 == 0) goto L96
            android.net.Uri r6 = r2.getUri()
            boolean r6 = r11.test(r6)
            if (r6 == 0) goto L82
            goto L96
        L82:
            java.lang.StringBuilder r4 = androidx.collection.s.a(r5, r0, r4)
            android.net.Uri r2 = r2.getUri()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r12.accept(r2)
        L94:
            r2 = r9
            goto L9a
        L96:
            android.net.Uri r2 = r2.getUri()
        L9a:
            if (r3 != 0) goto L9e
            if (r2 == 0) goto Lb7
        L9e:
            if (r1 != 0) goto Laf
            android.content.ClipData r1 = new android.content.ClipData
            android.content.ClipDescription r4 = r7.getDescription()
            android.content.ClipData$Item r5 = new android.content.ClipData$Item
            r5.<init>(r3, r9, r2)
            r1.<init>(r4, r5)
            goto Lb7
        Laf:
            android.content.ClipData$Item r4 = new android.content.ClipData$Item
            r4.<init>(r3, r9, r2)
            r1.addItem(r4)
        Lb7:
            int r0 = r0 + 1
            goto L17
        Lbb:
            if (r1 == 0) goto Lc0
            r8.setClipData(r1)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.k.y(android.content.Intent, android.content.Intent, androidx.core.util.c0, boolean, androidx.core.util.c0, androidx.core.util.e):void");
    }

    @o0
    public Intent v(@o0 Intent intent, @o0 androidx.core.util.e<String> eVar) {
        Intent intent2 = new Intent();
        ComponentName component = intent.getComponent();
        if ((this.f25995h && component == null) || this.f25994g.test(component)) {
            intent2.setComponent(component);
        } else {
            eVar.accept("Component is not allowed: " + component);
            intent2.setComponent(new ComponentName("android", "java.lang.Void"));
        }
        String str = intent.getPackage();
        if (str == null || this.f25993f.test(str)) {
            intent2.setPackage(str);
        } else {
            eVar.accept("Package is not allowed: ".concat(str));
        }
        int flags = this.f25988a | intent.getFlags();
        int i4 = this.f25988a;
        if (flags == i4) {
            intent2.setFlags(intent.getFlags());
        } else {
            intent2.setFlags(intent.getFlags() & i4);
            eVar.accept("The intent contains flags that are not allowed: 0x" + Integer.toHexString(intent.getFlags() & (~this.f25988a)));
        }
        String action = intent.getAction();
        if (action == null || this.f25989b.test(action)) {
            intent2.setAction(action);
        } else {
            eVar.accept("Action is not allowed: ".concat(action));
        }
        Uri data = intent.getData();
        if (data == null || this.f25990c.test(data)) {
            intent2.setData(data);
        } else {
            eVar.accept("Data is not allowed: " + data);
        }
        String type = intent.getType();
        if (type == null || this.f25991d.test(type)) {
            intent2.setDataAndType(intent2.getData(), type);
        } else {
            eVar.accept("Type is not allowed: ".concat(type));
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            for (String str2 : categories) {
                if (this.f25992e.test(str2)) {
                    intent2.addCategory(str2);
                } else {
                    eVar.accept("Category is not allowed: " + str2);
                }
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str3 : extras.keySet()) {
                if (str3.equals("android.intent.extra.STREAM") && (this.f25988a & 1) == 0) {
                    eVar.accept("Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag.");
                } else if (!str3.equals("output") || ((~this.f25988a) & 3) == 0) {
                    Object obj = extras.get(str3);
                    androidx.core.util.c0<Object> c0Var = this.f25996i.get(str3);
                    if (c0Var == null || !c0Var.test(obj)) {
                        eVar.accept("Extra is not allowed. Key: " + str3 + ". Value: " + obj);
                    } else {
                        u(intent2, str3, obj);
                    }
                } else {
                    eVar.accept("Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags.");
                }
            }
        }
        y(intent, intent2, this.f25999l, this.f25997j, this.f25998k, eVar);
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.f26000m) {
                b.b(intent2, b.a(intent));
            } else if (b.a(intent) != null) {
                eVar.accept("Identifier is not allowed: " + b.a(intent));
            }
        }
        if (this.f26001n) {
            intent2.setSelector(intent.getSelector());
        } else if (intent.getSelector() != null) {
            eVar.accept("Selector is not allowed: " + intent.getSelector());
        }
        if (this.f26002o) {
            intent2.setSourceBounds(intent.getSourceBounds());
        } else if (intent.getSourceBounds() != null) {
            eVar.accept("SourceBounds is not allowed: " + intent.getSourceBounds());
        }
        return intent2;
    }

    @o0
    public Intent w(@o0 Intent intent) {
        return v(intent, new j());
    }

    @o0
    public Intent x(@o0 Intent intent) {
        return v(intent, new i());
    }

    k(a aVar) {
    }
}

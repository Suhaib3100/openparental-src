package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.c1;
import androidx.annotation.j0;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.t0;
import androidx.core.view.r0;
import d.a;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: SupportMenuInflater.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class h extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    static final String f1076e = "SupportMenuInflater";

    /* renamed from: f, reason: collision with root package name */
    private static final String f1077f = "menu";

    /* renamed from: g, reason: collision with root package name */
    private static final String f1078g = "group";

    /* renamed from: h, reason: collision with root package name */
    private static final String f1079h = "item";

    /* renamed from: i, reason: collision with root package name */
    static final int f1080i = 0;

    /* renamed from: j, reason: collision with root package name */
    static final Class<?>[] f1081j;

    /* renamed from: k, reason: collision with root package name */
    static final Class<?>[] f1082k;

    /* renamed from: a, reason: collision with root package name */
    final Object[] f1083a;

    /* renamed from: b, reason: collision with root package name */
    final Object[] f1084b;

    /* renamed from: c, reason: collision with root package name */
    Context f1085c;

    /* renamed from: d, reason: collision with root package name */
    private Object f1086d;

    /* compiled from: SupportMenuInflater.java */
    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        private static final Class<?>[] f1087c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        private Object f1088a;

        /* renamed from: b, reason: collision with root package name */
        private Method f1089b;

        public a(Object obj, String str) {
            this.f1088a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f1089b = cls.getMethod(str, f1087c);
            } catch (Exception e4) {
                StringBuilder a5 = g.a("Couldn't resolve menu item onClick handler ", str, " in class ");
                a5.append(cls.getName());
                InflateException inflateException = new InflateException(a5.toString());
                inflateException.initCause(e4);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f1089b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f1089b.invoke(this.f1088a, menuItem)).booleanValue();
                }
                this.f1089b.invoke(this.f1088a, menuItem);
                return true;
            } catch (Exception e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    /* compiled from: SupportMenuInflater.java */
    private class b {
        private static final int G = 0;
        private static final int H = 0;
        private static final int I = 0;
        private static final int J = 0;
        private static final int K = 0;
        private static final boolean L = false;
        private static final boolean M = true;
        private static final boolean N = true;
        androidx.core.view.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a, reason: collision with root package name */
        private Menu f1090a;

        /* renamed from: b, reason: collision with root package name */
        private int f1091b;

        /* renamed from: c, reason: collision with root package name */
        private int f1092c;

        /* renamed from: d, reason: collision with root package name */
        private int f1093d;

        /* renamed from: e, reason: collision with root package name */
        private int f1094e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f1095f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f1096g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f1097h;

        /* renamed from: i, reason: collision with root package name */
        private int f1098i;

        /* renamed from: j, reason: collision with root package name */
        private int f1099j;

        /* renamed from: k, reason: collision with root package name */
        private CharSequence f1100k;

        /* renamed from: l, reason: collision with root package name */
        private CharSequence f1101l;

        /* renamed from: m, reason: collision with root package name */
        private int f1102m;

        /* renamed from: n, reason: collision with root package name */
        private char f1103n;

        /* renamed from: o, reason: collision with root package name */
        private int f1104o;

        /* renamed from: p, reason: collision with root package name */
        private char f1105p;

        /* renamed from: q, reason: collision with root package name */
        private int f1106q;

        /* renamed from: r, reason: collision with root package name */
        private int f1107r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f1108s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f1109t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f1110u;

        /* renamed from: v, reason: collision with root package name */
        private int f1111v;

        /* renamed from: w, reason: collision with root package name */
        private int f1112w;

        /* renamed from: x, reason: collision with root package name */
        private String f1113x;

        /* renamed from: y, reason: collision with root package name */
        private String f1114y;

        /* renamed from: z, reason: collision with root package name */
        private String f1115z;

        public b(Menu menu) {
            this.f1090a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, h.this.f1085c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z4 = false;
            menuItem.setChecked(this.f1108s).setVisible(this.f1109t).setEnabled(this.f1110u).setCheckable(this.f1107r >= 1).setTitleCondensed(this.f1101l).setIcon(this.f1102m);
            int i4 = this.f1111v;
            if (i4 >= 0) {
                menuItem.setShowAsAction(i4);
            }
            if (this.f1115z != null) {
                if (h.this.f1085c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(h.this.b(), this.f1115z));
            }
            if (this.f1107r >= 2) {
                if (menuItem instanceof k) {
                    ((k) menuItem).w(true);
                } else if (menuItem instanceof l) {
                    ((l) menuItem).j(true);
                }
            }
            String str = this.f1113x;
            if (str != null) {
                menuItem.setActionView((View) e(str, h.f1081j, h.this.f1083a));
                z4 = true;
            }
            int i5 = this.f1112w;
            if (i5 > 0 && !z4) {
                menuItem.setActionView(i5);
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                r0.l(menuItem, bVar);
            }
            r0.p(menuItem, this.B);
            r0.w(menuItem, this.C);
            r0.o(menuItem, this.f1103n, this.f1104o);
            r0.s(menuItem, this.f1105p, this.f1106q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                r0.r(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                r0.q(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f1097h = true;
            i(this.f1090a.add(this.f1091b, this.f1098i, this.f1099j, this.f1100k));
        }

        public SubMenu b() {
            this.f1097h = true;
            SubMenu addSubMenu = this.f1090a.addSubMenu(this.f1091b, this.f1098i, this.f1099j, this.f1100k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f1097h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = h.this.f1085c.obtainStyledAttributes(attributeSet, a.m.f73508d4);
            this.f1091b = obtainStyledAttributes.getResourceId(a.m.f4, 0);
            this.f1092c = obtainStyledAttributes.getInt(a.m.h4, 0);
            this.f1093d = obtainStyledAttributes.getInt(a.m.i4, 0);
            this.f1094e = obtainStyledAttributes.getInt(a.m.j4, 0);
            this.f1095f = obtainStyledAttributes.getBoolean(a.m.g4, true);
            this.f1096g = obtainStyledAttributes.getBoolean(a.m.e4, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            t0 F = t0.F(h.this.f1085c, attributeSet, a.m.k4);
            this.f1098i = F.u(a.m.n4, 0);
            this.f1099j = (F.o(a.m.q4, this.f1092c) & c1.a.f38447c) | (F.o(a.m.r4, this.f1093d) & 65535);
            this.f1100k = F.x(a.m.s4);
            this.f1101l = F.x(a.m.t4);
            this.f1102m = F.u(a.m.l4, 0);
            this.f1103n = c(F.w(a.m.u4));
            this.f1104o = F.o(a.m.B4, 4096);
            this.f1105p = c(F.w(a.m.v4));
            this.f1106q = F.o(a.m.F4, 4096);
            int i4 = a.m.w4;
            if (F.C(i4)) {
                this.f1107r = F.a(i4, false) ? 1 : 0;
            } else {
                this.f1107r = this.f1094e;
            }
            this.f1108s = F.a(a.m.o4, false);
            this.f1109t = F.a(a.m.p4, this.f1095f);
            this.f1110u = F.a(a.m.m4, this.f1096g);
            this.f1111v = F.o(a.m.G4, -1);
            this.f1115z = F.w(a.m.x4);
            this.f1112w = F.u(a.m.y4, 0);
            this.f1113x = F.w(a.m.A4);
            String w4 = F.w(a.m.z4);
            this.f1114y = w4;
            if (w4 != null && this.f1112w == 0 && this.f1113x == null) {
                this.A = (androidx.core.view.b) e(w4, h.f1082k, h.this.f1084b);
            } else {
                this.A = null;
            }
            this.B = F.x(a.m.C4);
            this.C = F.x(a.m.H4);
            int i5 = a.m.E4;
            if (F.C(i5)) {
                this.E = a0.e(F.o(i5, -1), this.E);
            } else {
                this.E = null;
            }
            int i6 = a.m.D4;
            if (F.C(i6)) {
                this.D = F.d(i6);
            } else {
                this.D = null;
            }
            F.I();
            this.f1097h = false;
        }

        public void h() {
            this.f1091b = 0;
            this.f1092c = 0;
            this.f1093d = 0;
            this.f1094e = 0;
            this.f1095f = true;
            this.f1096g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f1081j = clsArr;
        f1082k = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f1085c = context;
        Object[] objArr = {context};
        this.f1083a = objArr;
        this.f1084b = objArr;
    }

    private Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        while (!z4) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z5 && name2.equals(str)) {
                        z5 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            androidx.core.view.b bVar2 = bVar.A;
                            if (bVar2 == null || !bVar2.b()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z4 = true;
                    }
                }
            } else if (!z5) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z5 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f1086d == null) {
            this.f1086d = a(this.f1085c);
        }
        return this.f1086d;
    }

    @Override // android.view.MenuInflater
    public void inflate(@j0 int i4, Menu menu) {
        if (!(menu instanceof c1.a)) {
            super.inflate(i4, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f1085c.getResources().getLayout(i4);
                    c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (IOException e4) {
                    throw new InflateException("Error inflating menu XML", e4);
                }
            } catch (XmlPullParserException e5) {
                throw new InflateException("Error inflating menu XML", e5);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}

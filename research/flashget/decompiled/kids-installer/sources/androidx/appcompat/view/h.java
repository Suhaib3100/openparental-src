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
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.z0;
import androidx.core.view.p0;
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
    static final String f553e = "SupportMenuInflater";

    /* renamed from: f, reason: collision with root package name */
    private static final String f554f = "menu";

    /* renamed from: g, reason: collision with root package name */
    private static final String f555g = "group";

    /* renamed from: h, reason: collision with root package name */
    private static final String f556h = "item";

    /* renamed from: i, reason: collision with root package name */
    static final int f557i = 0;

    /* renamed from: j, reason: collision with root package name */
    static final Class<?>[] f558j;

    /* renamed from: k, reason: collision with root package name */
    static final Class<?>[] f559k;

    /* renamed from: a, reason: collision with root package name */
    final Object[] f560a;

    /* renamed from: b, reason: collision with root package name */
    final Object[] f561b;

    /* renamed from: c, reason: collision with root package name */
    Context f562c;

    /* renamed from: d, reason: collision with root package name */
    private Object f563d;

    /* compiled from: SupportMenuInflater.java */
    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        private static final Class<?>[] f564c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        private Object f565a;

        /* renamed from: b, reason: collision with root package name */
        private Method f566b;

        public a(Object obj, String str) {
            this.f565a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f566b = cls.getMethod(str, f564c);
            } catch (Exception e6) {
                StringBuilder a6 = g.a("Couldn't resolve menu item onClick handler ", str, " in class ");
                a6.append(cls.getName());
                InflateException inflateException = new InflateException(a6.toString());
                inflateException.initCause(e6);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f566b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f566b.invoke(this.f565a, menuItem)).booleanValue();
                }
                this.f566b.invoke(this.f565a, menuItem);
                return true;
            } catch (Exception e6) {
                throw new RuntimeException(e6);
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
        private Menu f567a;

        /* renamed from: b, reason: collision with root package name */
        private int f568b;

        /* renamed from: c, reason: collision with root package name */
        private int f569c;

        /* renamed from: d, reason: collision with root package name */
        private int f570d;

        /* renamed from: e, reason: collision with root package name */
        private int f571e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f572f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f573g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f574h;

        /* renamed from: i, reason: collision with root package name */
        private int f575i;

        /* renamed from: j, reason: collision with root package name */
        private int f576j;

        /* renamed from: k, reason: collision with root package name */
        private CharSequence f577k;

        /* renamed from: l, reason: collision with root package name */
        private CharSequence f578l;

        /* renamed from: m, reason: collision with root package name */
        private int f579m;

        /* renamed from: n, reason: collision with root package name */
        private char f580n;

        /* renamed from: o, reason: collision with root package name */
        private int f581o;

        /* renamed from: p, reason: collision with root package name */
        private char f582p;

        /* renamed from: q, reason: collision with root package name */
        private int f583q;

        /* renamed from: r, reason: collision with root package name */
        private int f584r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f585s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f586t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f587u;

        /* renamed from: v, reason: collision with root package name */
        private int f588v;

        /* renamed from: w, reason: collision with root package name */
        private int f589w;

        /* renamed from: x, reason: collision with root package name */
        private String f590x;

        /* renamed from: y, reason: collision with root package name */
        private String f591y;

        /* renamed from: z, reason: collision with root package name */
        private String f592z;

        public b(Menu menu) {
            this.f567a = menu;
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
                Constructor<?> constructor = Class.forName(str, false, h.this.f562c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z5 = false;
            menuItem.setChecked(this.f585s).setVisible(this.f586t).setEnabled(this.f587u).setCheckable(this.f584r >= 1).setTitleCondensed(this.f578l).setIcon(this.f579m);
            int i5 = this.f588v;
            if (i5 >= 0) {
                menuItem.setShowAsAction(i5);
            }
            if (this.f592z != null) {
                if (h.this.f562c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(h.this.b(), this.f592z));
            }
            if (this.f584r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.j) {
                    ((androidx.appcompat.view.menu.j) menuItem).w(true);
                } else if (menuItem instanceof androidx.appcompat.view.menu.k) {
                    ((androidx.appcompat.view.menu.k) menuItem).j(true);
                }
            }
            String str = this.f590x;
            if (str != null) {
                menuItem.setActionView((View) e(str, h.f558j, h.this.f560a));
                z5 = true;
            }
            int i6 = this.f589w;
            if (i6 > 0 && !z5) {
                menuItem.setActionView(i6);
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                p0.l(menuItem, bVar);
            }
            p0.p(menuItem, this.B);
            p0.w(menuItem, this.C);
            p0.o(menuItem, this.f580n, this.f581o);
            p0.s(menuItem, this.f582p, this.f583q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                p0.r(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                p0.q(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f574h = true;
            i(this.f567a.add(this.f568b, this.f575i, this.f576j, this.f577k));
        }

        public SubMenu b() {
            this.f574h = true;
            SubMenu addSubMenu = this.f567a.addSubMenu(this.f568b, this.f575i, this.f576j, this.f577k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f574h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = h.this.f562c.obtainStyledAttributes(attributeSet, a.n.h5);
            this.f568b = obtainStyledAttributes.getResourceId(a.n.j5, 0);
            this.f569c = obtainStyledAttributes.getInt(a.n.l5, 0);
            this.f570d = obtainStyledAttributes.getInt(a.n.m5, 0);
            this.f571e = obtainStyledAttributes.getInt(a.n.n5, 0);
            this.f572f = obtainStyledAttributes.getBoolean(a.n.k5, true);
            this.f573g = obtainStyledAttributes.getBoolean(a.n.i5, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            z0 F = z0.F(h.this.f562c, attributeSet, a.n.o5);
            this.f575i = F.u(a.n.r5, 0);
            this.f576j = (F.o(a.n.u5, this.f569c) & m.a.f29111c) | (F.o(a.n.v5, this.f570d) & 65535);
            this.f577k = F.x(a.n.w5);
            this.f578l = F.x(a.n.x5);
            this.f579m = F.u(a.n.p5, 0);
            this.f580n = c(F.w(a.n.y5));
            this.f581o = F.o(a.n.F5, 4096);
            this.f582p = c(F.w(a.n.z5));
            this.f583q = F.o(a.n.J5, 4096);
            int i5 = a.n.A5;
            if (F.C(i5)) {
                this.f584r = F.a(i5, false) ? 1 : 0;
            } else {
                this.f584r = this.f571e;
            }
            this.f585s = F.a(a.n.s5, false);
            this.f586t = F.a(a.n.t5, this.f572f);
            this.f587u = F.a(a.n.q5, this.f573g);
            this.f588v = F.o(a.n.K5, -1);
            this.f592z = F.w(a.n.B5);
            this.f589w = F.u(a.n.C5, 0);
            this.f590x = F.w(a.n.E5);
            String w5 = F.w(a.n.D5);
            this.f591y = w5;
            if ((w5 != null) && this.f589w == 0 && this.f590x == null) {
                this.A = (androidx.core.view.b) e(w5, h.f559k, h.this.f561b);
            } else {
                this.A = null;
            }
            this.B = F.x(a.n.G5);
            this.C = F.x(a.n.L5);
            int i6 = a.n.I5;
            if (F.C(i6)) {
                this.E = e0.e(F.o(i6, -1), this.E);
            } else {
                this.E = null;
            }
            int i7 = a.n.H5;
            if (F.C(i7)) {
                this.D = F.d(i7);
            } else {
                this.D = null;
            }
            F.I();
            this.f574h = false;
        }

        public void h() {
            this.f568b = 0;
            this.f569c = 0;
            this.f570d = 0;
            this.f571e = 0;
            this.f572f = true;
            this.f573g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f558j = clsArr;
        f559k = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f562c = context;
        Object[] objArr = {context};
        this.f560a = objArr;
        this.f561b = objArr;
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
        boolean z5 = false;
        boolean z6 = false;
        String str = null;
        while (!z5) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z6 && name2.equals(str)) {
                        z6 = false;
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
                        z5 = true;
                    }
                }
            } else if (!z6) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z6 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f563d == null) {
            this.f563d = a(this.f562c);
        }
        return this.f563d;
    }

    @Override // android.view.MenuInflater
    public void inflate(@j0 int i5, Menu menu) {
        if (!(menu instanceof m.a)) {
            super.inflate(i5, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f562c.getResources().getLayout(i5);
                    c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (XmlPullParserException e6) {
                    throw new InflateException("Error inflating menu XML", e6);
                }
            } catch (IOException e7) {
                throw new InflateException("Error inflating menu XML", e7);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}

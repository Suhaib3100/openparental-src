package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.c1;
import androidx.annotation.o0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuBuilder.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class h implements c1.a {
    private static final String L = "MenuBuilder";
    private static final String M = "android:menu:presenters";
    private static final String N = "android:menu:actionviewstates";
    private static final String O = "android:menu:expandedactionview";
    private static final int[] P = {1, 4, 5, 3, 2, 0};
    View A;
    private k I;
    private boolean K;

    /* renamed from: l, reason: collision with root package name */
    private final Context f1243l;

    /* renamed from: m, reason: collision with root package name */
    private final Resources f1244m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f1245n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f1246o;

    /* renamed from: p, reason: collision with root package name */
    private a f1247p;

    /* renamed from: x, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f1255x;

    /* renamed from: y, reason: collision with root package name */
    CharSequence f1256y;

    /* renamed from: z, reason: collision with root package name */
    Drawable f1257z;

    /* renamed from: w, reason: collision with root package name */
    private int f1254w = 0;
    private boolean B = false;
    private boolean C = false;
    private boolean D = false;
    private boolean E = false;
    private boolean F = false;
    private ArrayList<k> G = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<o>> H = new CopyOnWriteArrayList<>();
    private boolean J = false;

    /* renamed from: q, reason: collision with root package name */
    private ArrayList<k> f1248q = new ArrayList<>();

    /* renamed from: r, reason: collision with root package name */
    private ArrayList<k> f1249r = new ArrayList<>();

    /* renamed from: s, reason: collision with root package name */
    private boolean f1250s = true;

    /* renamed from: t, reason: collision with root package name */
    private ArrayList<k> f1251t = new ArrayList<>();

    /* renamed from: u, reason: collision with root package name */
    private ArrayList<k> f1252u = new ArrayList<>();

    /* renamed from: v, reason: collision with root package name */
    private boolean f1253v = true;

    /* compiled from: MenuBuilder.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public interface a {
        boolean a(@o0 h hVar, @o0 MenuItem menuItem);

        void b(@o0 h hVar);
    }

    /* compiled from: MenuBuilder.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public interface b {
        boolean f(k kVar);
    }

    public h(Context context) {
        this.f1243l = context;
        this.f1244m = context.getResources();
        k0(true);
    }

    private static int E(int i4) {
        int i5 = ((-65536) & i4) >> 16;
        if (i5 >= 0) {
            int[] iArr = P;
            if (i5 < iArr.length) {
                return (i4 & 65535) | (iArr[i5] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void R(int i4, boolean z4) {
        if (i4 < 0 || i4 >= this.f1248q.size()) {
            return;
        }
        this.f1248q.remove(i4);
        if (z4) {
            N(true);
        }
    }

    private void d0(int i4, CharSequence charSequence, int i5, Drawable drawable, View view) {
        Resources F = F();
        if (view != null) {
            this.A = view;
            this.f1256y = null;
            this.f1257z = null;
        } else {
            if (i4 > 0) {
                this.f1256y = F.getText(i4);
            } else if (charSequence != null) {
                this.f1256y = charSequence;
            }
            if (i5 > 0) {
                this.f1257z = androidx.core.content.d.getDrawable(x(), i5);
            } else if (drawable != null) {
                this.f1257z = drawable;
            }
            this.A = null;
        }
        N(false);
    }

    private k h(int i4, int i5, int i6, int i7, CharSequence charSequence, int i10) {
        return new k(this, i4, i5, i6, i7, charSequence, i10);
    }

    private void j(boolean z4) {
        if (this.H.isEmpty()) {
            return;
        }
        m0();
        Iterator<WeakReference<o>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<o> next = it.next();
            o oVar = next.get();
            if (oVar == null) {
                this.H.remove(next);
            } else {
                oVar.k(z4);
            }
        }
        l0();
    }

    private void k(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.H.isEmpty()) {
            return;
        }
        Iterator<WeakReference<o>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<o> next = it.next();
            o oVar = next.get();
            if (oVar == null) {
                this.H.remove(next);
            } else {
                int a5 = oVar.a();
                if (a5 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(a5)) != null) {
                    oVar.g(parcelable);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (androidx.core.view.b2.n(android.view.ViewConfiguration.get(r2.f1243l), r2.f1243l) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f1244m
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f1243l
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f1243l
            boolean r3 = androidx.core.view.b2.n(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f1246o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.h.k0(boolean):void");
    }

    private void l(Bundle bundle) {
        Parcelable j4;
        if (this.H.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<o>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<o> next = it.next();
            o oVar = next.get();
            if (oVar == null) {
                this.H.remove(next);
            } else {
                int a5 = oVar.a();
                if (a5 > 0 && (j4 = oVar.j()) != null) {
                    sparseArray.put(a5, j4);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    private boolean m(t tVar, o oVar) {
        if (this.H.isEmpty()) {
            return false;
        }
        boolean h4 = oVar != null ? oVar.h(tVar) : false;
        Iterator<WeakReference<o>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<o> next = it.next();
            o oVar2 = next.get();
            if (oVar2 == null) {
                this.H.remove(next);
            } else if (!h4) {
                h4 = oVar2.h(tVar);
            }
        }
        return h4;
    }

    private static int q(ArrayList<k> arrayList, int i4) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).i() <= i4) {
                return size + 1;
            }
        }
        return 0;
    }

    public CharSequence A() {
        return this.f1256y;
    }

    public View B() {
        return this.A;
    }

    public ArrayList<k> C() {
        u();
        return this.f1252u;
    }

    boolean D() {
        return this.E;
    }

    Resources F() {
        return this.f1244m;
    }

    public h G() {
        return this;
    }

    @o0
    public ArrayList<k> H() {
        if (!this.f1250s) {
            return this.f1249r;
        }
        this.f1249r.clear();
        int size = this.f1248q.size();
        for (int i4 = 0; i4 < size; i4++) {
            k kVar = this.f1248q.get(i4);
            if (kVar.isVisible()) {
                this.f1249r.add(kVar);
            }
        }
        this.f1250s = false;
        this.f1253v = true;
        return this.f1249r;
    }

    public boolean I() {
        return this.J;
    }

    boolean J() {
        return this.f1245n;
    }

    public boolean K() {
        return this.f1246o;
    }

    void L(k kVar) {
        this.f1253v = true;
        N(true);
    }

    void M(k kVar) {
        this.f1250s = true;
        N(true);
    }

    public void N(boolean z4) {
        if (this.B) {
            this.C = true;
            if (z4) {
                this.D = true;
                return;
            }
            return;
        }
        if (z4) {
            this.f1250s = true;
            this.f1253v = true;
        }
        j(z4);
    }

    public boolean O(MenuItem menuItem, int i4) {
        return P(menuItem, null, i4);
    }

    public boolean P(MenuItem menuItem, o oVar, int i4) {
        k kVar = (k) menuItem;
        if (kVar == null || !kVar.isEnabled()) {
            return false;
        }
        boolean n4 = kVar.n();
        androidx.core.view.b a5 = kVar.a();
        boolean z4 = a5 != null && a5.b();
        if (kVar.m()) {
            n4 |= kVar.expandActionView();
            if (n4) {
                f(true);
            }
        } else if (kVar.hasSubMenu() || z4) {
            if ((i4 & 4) == 0) {
                f(false);
            }
            if (!kVar.hasSubMenu()) {
                kVar.A(new t(x(), this, kVar));
            }
            t tVar = (t) kVar.getSubMenu();
            if (z4) {
                a5.g(tVar);
            }
            n4 |= m(tVar, oVar);
            if (!n4) {
                f(true);
            }
        } else if ((i4 & 1) == 0) {
            f(true);
        }
        return n4;
    }

    public void Q(int i4) {
        R(i4, true);
    }

    public void S(o oVar) {
        Iterator<WeakReference<o>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<o> next = it.next();
            o oVar2 = next.get();
            if (oVar2 == null || oVar2 == oVar) {
                this.H.remove(next);
            }
        }
    }

    public void T(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(w());
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = getItem(i4);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((t) item.getSubMenu()).T(bundle);
            }
        }
        int i5 = bundle.getInt("android:menu:expandedactionview");
        if (i5 <= 0 || (findItem = findItem(i5)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void U(Bundle bundle) {
        k(bundle);
    }

    public void V(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = getItem(i4);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((t) item.getSubMenu()).V(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(w(), sparseArray);
        }
    }

    public void W(Bundle bundle) {
        l(bundle);
    }

    public void X(a aVar) {
        this.f1247p = aVar;
    }

    public void Y(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f1255x = contextMenuInfo;
    }

    public h Z(int i4) {
        this.f1254w = i4;
        return this;
    }

    protected MenuItem a(int i4, int i5, int i6, CharSequence charSequence) {
        int E = E(i6);
        k kVar = new k(this, i4, i5, i6, E, charSequence, this.f1254w);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1255x;
        if (contextMenuInfo != null) {
            kVar.y(contextMenuInfo);
        }
        ArrayList<k> arrayList = this.f1248q;
        arrayList.add(q(arrayList, E), kVar);
        N(true);
        return kVar;
    }

    void a0(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1248q.size();
        m0();
        for (int i4 = 0; i4 < size; i4++) {
            k kVar = this.f1248q.get(i4);
            if (kVar.getGroupId() == groupId && kVar.p() && kVar.isCheckable()) {
                kVar.v(kVar == menuItem);
            }
        }
        l0();
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i4, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        int i10;
        PackageManager packageManager = this.f1243l.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i7 & 1) == 0) {
            removeGroup(i4);
        }
        for (int i11 = 0; i11 < size; i11++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i11);
            int i12 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i12 < 0 ? intent : intentArr[i12]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i4, i5, i6, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i10 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i10] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(o oVar) {
        c(oVar, this.f1243l);
    }

    protected h b0(int i4) {
        d0(0, null, i4, null, null);
        return this;
    }

    public void c(o oVar, Context context) {
        this.H.add(new WeakReference<>(oVar));
        oVar.n(context, this);
        this.f1253v = true;
    }

    protected h c0(Drawable drawable) {
        d0(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        k kVar = this.I;
        if (kVar != null) {
            g(kVar);
        }
        this.f1248q.clear();
        N(true);
    }

    public void clearHeader() {
        this.f1257z = null;
        this.f1256y = null;
        this.A = null;
        N(false);
    }

    @Override // android.view.Menu
    public void close() {
        f(true);
    }

    public void d() {
        a aVar = this.f1247p;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void e() {
        this.B = true;
        clear();
        clearHeader();
        this.H.clear();
        this.B = false;
        this.C = false;
        this.D = false;
        N(true);
    }

    protected h e0(int i4) {
        d0(i4, null, 0, null, null);
        return this;
    }

    public final void f(boolean z4) {
        if (this.F) {
            return;
        }
        this.F = true;
        Iterator<WeakReference<o>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<o> next = it.next();
            o oVar = next.get();
            if (oVar == null) {
                this.H.remove(next);
            } else {
                oVar.d(this, z4);
            }
        }
        this.F = false;
    }

    protected h f0(CharSequence charSequence) {
        d0(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i4) {
        MenuItem findItem;
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            k kVar = this.f1248q.get(i5);
            if (kVar.getItemId() == i4) {
                return kVar;
            }
            if (kVar.hasSubMenu() && (findItem = kVar.getSubMenu().findItem(i4)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public boolean g(k kVar) {
        boolean z4 = false;
        if (!this.H.isEmpty() && this.I == kVar) {
            m0();
            Iterator<WeakReference<o>> it = this.H.iterator();
            while (it.hasNext()) {
                WeakReference<o> next = it.next();
                o oVar = next.get();
                if (oVar == null) {
                    this.H.remove(next);
                } else {
                    z4 = oVar.m(this, kVar);
                    if (z4) {
                        break;
                    }
                }
            }
            l0();
            if (z4) {
                this.I = null;
            }
        }
        return z4;
    }

    protected h g0(View view) {
        d0(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i4) {
        return this.f1248q.get(i4);
    }

    public void h0(boolean z4) {
        this.E = z4;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.K) {
            return true;
        }
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            if (this.f1248q.get(i4).isVisible()) {
                return true;
            }
        }
        return false;
    }

    boolean i(@o0 h hVar, @o0 MenuItem menuItem) {
        a aVar = this.f1247p;
        return aVar != null && aVar.a(hVar, menuItem);
    }

    public void i0(boolean z4) {
        this.K = z4;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return s(i4, keyEvent) != null;
    }

    public void j0(boolean z4) {
        if (this.f1246o == z4) {
            return;
        }
        k0(z4);
        N(false);
    }

    public void l0() {
        this.B = false;
        if (this.C) {
            this.C = false;
            N(this.D);
        }
    }

    public void m0() {
        if (this.B) {
            return;
        }
        this.B = true;
        this.C = false;
        this.D = false;
    }

    public boolean n(k kVar) {
        boolean z4 = false;
        if (this.H.isEmpty()) {
            return false;
        }
        m0();
        Iterator<WeakReference<o>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<o> next = it.next();
            o oVar = next.get();
            if (oVar == null) {
                this.H.remove(next);
            } else {
                z4 = oVar.e(this, kVar);
                if (z4) {
                    break;
                }
            }
        }
        l0();
        if (z4) {
            this.I = kVar;
        }
        return z4;
    }

    public int o(int i4) {
        return p(i4, 0);
    }

    public int p(int i4, int i5) {
        int size = size();
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < size) {
            if (this.f1248q.get(i5).getGroupId() == i4) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i4, int i5) {
        return O(findItem(i4), i5);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        k s4 = s(i4, keyEvent);
        boolean O2 = s4 != null ? O(s4, i5) : false;
        if ((i5 & 2) != 0) {
            f(true);
        }
        return O2;
    }

    public int r(int i4) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            if (this.f1248q.get(i5).getItemId() == i4) {
                return i5;
            }
        }
        return -1;
    }

    @Override // android.view.Menu
    public void removeGroup(int i4) {
        int o4 = o(i4);
        if (o4 >= 0) {
            int size = this.f1248q.size() - o4;
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                if (i5 >= size || this.f1248q.get(o4).getGroupId() != i4) {
                    break;
                }
                R(o4, false);
                i5 = i6;
            }
            N(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i4) {
        R(r(i4), true);
    }

    k s(int i4, KeyEvent keyEvent) {
        ArrayList<k> arrayList = this.G;
        arrayList.clear();
        t(arrayList, i4, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean J = J();
        for (int i5 = 0; i5 < size; i5++) {
            k kVar = arrayList.get(i5);
            char alphabeticShortcut = J ? kVar.getAlphabeticShortcut() : kVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (J && alphabeticShortcut == '\b' && i4 == 67))) {
                return kVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i4, boolean z4, boolean z5) {
        int size = this.f1248q.size();
        for (int i5 = 0; i5 < size; i5++) {
            k kVar = this.f1248q.get(i5);
            if (kVar.getGroupId() == i4) {
                kVar.w(z5);
                kVar.setCheckable(z4);
            }
        }
    }

    @Override // c1.a, android.view.Menu
    public void setGroupDividerEnabled(boolean z4) {
        this.J = z4;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i4, boolean z4) {
        int size = this.f1248q.size();
        for (int i5 = 0; i5 < size; i5++) {
            k kVar = this.f1248q.get(i5);
            if (kVar.getGroupId() == i4) {
                kVar.setEnabled(z4);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i4, boolean z4) {
        int size = this.f1248q.size();
        boolean z5 = false;
        for (int i5 = 0; i5 < size; i5++) {
            k kVar = this.f1248q.get(i5);
            if (kVar.getGroupId() == i4 && kVar.B(z4)) {
                z5 = true;
            }
        }
        if (z5) {
            N(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z4) {
        this.f1245n = z4;
        N(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1248q.size();
    }

    void t(List<k> list, int i4, KeyEvent keyEvent) {
        boolean J = J();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i4 == 67) {
            int size = this.f1248q.size();
            for (int i5 = 0; i5 < size; i5++) {
                k kVar = this.f1248q.get(i5);
                if (kVar.hasSubMenu()) {
                    ((h) kVar.getSubMenu()).t(list, i4, keyEvent);
                }
                char alphabeticShortcut = J ? kVar.getAlphabeticShortcut() : kVar.getNumericShortcut();
                if ((modifiers & c1.a.f38449e) == ((J ? kVar.getAlphabeticModifiers() : kVar.getNumericModifiers()) & c1.a.f38449e) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (J && alphabeticShortcut == '\b' && i4 == 67)) && kVar.isEnabled()) {
                        list.add(kVar);
                    }
                }
            }
        }
    }

    public void u() {
        ArrayList<k> H = H();
        if (this.f1253v) {
            Iterator<WeakReference<o>> it = this.H.iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                WeakReference<o> next = it.next();
                o oVar = next.get();
                if (oVar == null) {
                    this.H.remove(next);
                } else {
                    z4 |= oVar.l();
                }
            }
            if (z4) {
                this.f1251t.clear();
                this.f1252u.clear();
                int size = H.size();
                for (int i4 = 0; i4 < size; i4++) {
                    k kVar = H.get(i4);
                    if (kVar.o()) {
                        this.f1251t.add(kVar);
                    } else {
                        this.f1252u.add(kVar);
                    }
                }
            } else {
                this.f1251t.clear();
                this.f1252u.clear();
                this.f1252u.addAll(H());
            }
            this.f1253v = false;
        }
    }

    public ArrayList<k> v() {
        u();
        return this.f1251t;
    }

    protected String w() {
        return "android:menu:actionviewstates";
    }

    public Context x() {
        return this.f1243l;
    }

    public k y() {
        return this.I;
    }

    public Drawable z() {
        return this.f1257z;
    }

    @Override // android.view.Menu
    public MenuItem add(int i4) {
        return a(0, 0, 0, this.f1244m.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4) {
        return addSubMenu(0, 0, 0, this.f1244m.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i4, int i5, int i6, CharSequence charSequence) {
        return a(i4, i5, i6, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        k kVar = (k) a(i4, i5, i6, charSequence);
        t tVar = new t(this.f1243l, this, kVar);
        kVar.A(tVar);
        return tVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i4, int i5, int i6, int i7) {
        return a(i4, i5, i6, this.f1244m.getString(i7));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4, int i5, int i6, int i7) {
        return addSubMenu(i4, i5, i6, this.f1244m.getString(i7));
    }
}

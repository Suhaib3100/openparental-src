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
/* loaded from: classes2.dex */
public class g implements m.a {
    private static final String L = "MenuBuilder";
    private static final String M = "android:menu:presenters";
    private static final String N = "android:menu:actionviewstates";
    private static final String O = "android:menu:expandedactionview";
    private static final int[] P = {1, 4, 5, 3, 2, 0};
    View A;
    private j I;
    private boolean K;

    /* renamed from: l, reason: collision with root package name */
    private final Context f695l;

    /* renamed from: m, reason: collision with root package name */
    private final Resources f696m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f697n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f698o;

    /* renamed from: p, reason: collision with root package name */
    private a f699p;

    /* renamed from: x, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f707x;

    /* renamed from: y, reason: collision with root package name */
    CharSequence f708y;

    /* renamed from: z, reason: collision with root package name */
    Drawable f709z;

    /* renamed from: w, reason: collision with root package name */
    private int f706w = 0;
    private boolean B = false;
    private boolean C = false;
    private boolean D = false;
    private boolean E = false;
    private boolean F = false;
    private ArrayList<j> G = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<n>> H = new CopyOnWriteArrayList<>();
    private boolean J = false;

    /* renamed from: q, reason: collision with root package name */
    private ArrayList<j> f700q = new ArrayList<>();

    /* renamed from: r, reason: collision with root package name */
    private ArrayList<j> f701r = new ArrayList<>();

    /* renamed from: s, reason: collision with root package name */
    private boolean f702s = true;

    /* renamed from: t, reason: collision with root package name */
    private ArrayList<j> f703t = new ArrayList<>();

    /* renamed from: u, reason: collision with root package name */
    private ArrayList<j> f704u = new ArrayList<>();

    /* renamed from: v, reason: collision with root package name */
    private boolean f705v = true;

    /* compiled from: MenuBuilder.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface a {
        boolean a(@o0 g gVar, @o0 MenuItem menuItem);

        void b(@o0 g gVar);
    }

    /* compiled from: MenuBuilder.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface b {
        boolean a(j jVar);
    }

    public g(Context context) {
        this.f695l = context;
        this.f696m = context.getResources();
        k0(true);
    }

    private static int E(int i5) {
        int i6 = ((-65536) & i5) >> 16;
        if (i6 >= 0) {
            int[] iArr = P;
            if (i6 < iArr.length) {
                return (i5 & 65535) | (iArr[i6] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void R(int i5, boolean z5) {
        if (i5 < 0 || i5 >= this.f700q.size()) {
            return;
        }
        this.f700q.remove(i5);
        if (z5) {
            N(true);
        }
    }

    private void d0(int i5, CharSequence charSequence, int i6, Drawable drawable, View view) {
        Resources F = F();
        if (view != null) {
            this.A = view;
            this.f708y = null;
            this.f709z = null;
        } else {
            if (i5 > 0) {
                this.f708y = F.getText(i5);
            } else if (charSequence != null) {
                this.f708y = charSequence;
            }
            if (i6 > 0) {
                this.f709z = androidx.core.content.d.i(x(), i6);
            } else if (drawable != null) {
                this.f709z = drawable;
            }
            this.A = null;
        }
        N(false);
    }

    private j h(int i5, int i6, int i7, int i8, CharSequence charSequence, int i9) {
        return new j(this, i5, i6, i7, i8, charSequence, i9);
    }

    private void j(boolean z5) {
        if (this.H.isEmpty()) {
            return;
        }
        m0();
        Iterator<WeakReference<n>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                this.H.remove(next);
            } else {
                nVar.d(z5);
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
        Iterator<WeakReference<n>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                this.H.remove(next);
            } else {
                int id = nVar.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    nVar.j(parcelable);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (androidx.core.view.j3.g(android.view.ViewConfiguration.get(r2.f695l), r2.f695l) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f696m
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f695l
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f695l
            boolean r3 = androidx.core.view.j3.g(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f698o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.g.k0(boolean):void");
    }

    private void l(Bundle bundle) {
        Parcelable n5;
        if (this.H.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<n>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                this.H.remove(next);
            } else {
                int id = nVar.getId();
                if (id > 0 && (n5 = nVar.n()) != null) {
                    sparseArray.put(id, n5);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    private boolean m(t tVar, n nVar) {
        if (this.H.isEmpty()) {
            return false;
        }
        boolean l5 = nVar != null ? nVar.l(tVar) : false;
        Iterator<WeakReference<n>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar2 = next.get();
            if (nVar2 == null) {
                this.H.remove(next);
            } else if (!l5) {
                l5 = nVar2.l(tVar);
            }
        }
        return l5;
    }

    private static int q(ArrayList<j> arrayList, int i5) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).i() <= i5) {
                return size + 1;
            }
        }
        return 0;
    }

    public CharSequence A() {
        return this.f708y;
    }

    public View B() {
        return this.A;
    }

    public ArrayList<j> C() {
        u();
        return this.f704u;
    }

    boolean D() {
        return this.E;
    }

    Resources F() {
        return this.f696m;
    }

    public g G() {
        return this;
    }

    @o0
    public ArrayList<j> H() {
        if (!this.f702s) {
            return this.f701r;
        }
        this.f701r.clear();
        int size = this.f700q.size();
        for (int i5 = 0; i5 < size; i5++) {
            j jVar = this.f700q.get(i5);
            if (jVar.isVisible()) {
                this.f701r.add(jVar);
            }
        }
        this.f702s = false;
        this.f705v = true;
        return this.f701r;
    }

    public boolean I() {
        return this.J;
    }

    boolean J() {
        return this.f697n;
    }

    public boolean K() {
        return this.f698o;
    }

    void L(j jVar) {
        this.f705v = true;
        N(true);
    }

    void M(j jVar) {
        this.f702s = true;
        N(true);
    }

    public void N(boolean z5) {
        if (this.B) {
            this.C = true;
            if (z5) {
                this.D = true;
                return;
            }
            return;
        }
        if (z5) {
            this.f702s = true;
            this.f705v = true;
        }
        j(z5);
    }

    public boolean O(MenuItem menuItem, int i5) {
        return P(menuItem, null, i5);
    }

    public boolean P(MenuItem menuItem, n nVar, int i5) {
        j jVar = (j) menuItem;
        if (jVar == null || !jVar.isEnabled()) {
            return false;
        }
        boolean n5 = jVar.n();
        androidx.core.view.b b6 = jVar.b();
        boolean z5 = b6 != null && b6.b();
        if (jVar.m()) {
            n5 |= jVar.expandActionView();
            if (n5) {
                f(true);
            }
        } else if (jVar.hasSubMenu() || z5) {
            if ((i5 & 4) == 0) {
                f(false);
            }
            if (!jVar.hasSubMenu()) {
                jVar.A(new t(x(), this, jVar));
            }
            t tVar = (t) jVar.getSubMenu();
            if (z5) {
                b6.g(tVar);
            }
            n5 |= m(tVar, nVar);
            if (!n5) {
                f(true);
            }
        } else if ((i5 & 1) == 0) {
            f(true);
        }
        return n5;
    }

    public void Q(int i5) {
        R(i5, true);
    }

    public void S(n nVar) {
        Iterator<WeakReference<n>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar2 = next.get();
            if (nVar2 == null || nVar2 == nVar) {
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
        for (int i5 = 0; i5 < size; i5++) {
            MenuItem item = getItem(i5);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((t) item.getSubMenu()).T(bundle);
            }
        }
        int i6 = bundle.getInt("android:menu:expandedactionview");
        if (i6 <= 0 || (findItem = findItem(i6)) == null) {
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
        for (int i5 = 0; i5 < size; i5++) {
            MenuItem item = getItem(i5);
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
        this.f699p = aVar;
    }

    public void Y(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f707x = contextMenuInfo;
    }

    public g Z(int i5) {
        this.f706w = i5;
        return this;
    }

    protected MenuItem a(int i5, int i6, int i7, CharSequence charSequence) {
        int E = E(i7);
        j h5 = h(i5, i6, i7, E, charSequence, this.f706w);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f707x;
        if (contextMenuInfo != null) {
            h5.y(contextMenuInfo);
        }
        ArrayList<j> arrayList = this.f700q;
        arrayList.add(q(arrayList, E), h5);
        N(true);
        return h5;
    }

    void a0(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f700q.size();
        m0();
        for (int i5 = 0; i5 < size; i5++) {
            j jVar = this.f700q.get(i5);
            if (jVar.getGroupId() == groupId && jVar.p() && jVar.isCheckable()) {
                jVar.v(jVar == menuItem);
            }
        }
        l0();
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i5, int i6, int i7, ComponentName componentName, Intent[] intentArr, Intent intent, int i8, MenuItem[] menuItemArr) {
        int i9;
        PackageManager packageManager = this.f695l.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i8 & 1) == 0) {
            removeGroup(i5);
        }
        for (int i10 = 0; i10 < size; i10++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i10);
            int i11 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i11 < 0 ? intent : intentArr[i11]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i5, i6, i7, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i9 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i9] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(n nVar) {
        c(nVar, this.f695l);
    }

    protected g b0(int i5) {
        d0(0, null, i5, null, null);
        return this;
    }

    public void c(n nVar, Context context) {
        this.H.add(new WeakReference<>(nVar));
        nVar.i(context, this);
        this.f705v = true;
    }

    protected g c0(Drawable drawable) {
        d0(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        j jVar = this.I;
        if (jVar != null) {
            g(jVar);
        }
        this.f700q.clear();
        N(true);
    }

    public void clearHeader() {
        this.f709z = null;
        this.f708y = null;
        this.A = null;
        N(false);
    }

    @Override // android.view.Menu
    public void close() {
        f(true);
    }

    public void d() {
        a aVar = this.f699p;
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

    protected g e0(int i5) {
        d0(i5, null, 0, null, null);
        return this;
    }

    public final void f(boolean z5) {
        if (this.F) {
            return;
        }
        this.F = true;
        Iterator<WeakReference<n>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                this.H.remove(next);
            } else {
                nVar.b(this, z5);
            }
        }
        this.F = false;
    }

    protected g f0(CharSequence charSequence) {
        d0(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i5) {
        MenuItem findItem;
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            j jVar = this.f700q.get(i6);
            if (jVar.getItemId() == i5) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (findItem = jVar.getSubMenu().findItem(i5)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public boolean g(j jVar) {
        boolean z5 = false;
        if (!this.H.isEmpty() && this.I == jVar) {
            m0();
            Iterator<WeakReference<n>> it = this.H.iterator();
            while (it.hasNext()) {
                WeakReference<n> next = it.next();
                n nVar = next.get();
                if (nVar == null) {
                    this.H.remove(next);
                } else {
                    z5 = nVar.f(this, jVar);
                    if (z5) {
                        break;
                    }
                }
            }
            l0();
            if (z5) {
                this.I = null;
            }
        }
        return z5;
    }

    protected g g0(View view) {
        d0(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i5) {
        return this.f700q.get(i5);
    }

    public void h0(boolean z5) {
        this.E = z5;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.K) {
            return true;
        }
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            if (this.f700q.get(i5).isVisible()) {
                return true;
            }
        }
        return false;
    }

    boolean i(@o0 g gVar, @o0 MenuItem menuItem) {
        a aVar = this.f699p;
        return aVar != null && aVar.a(gVar, menuItem);
    }

    public void i0(boolean z5) {
        this.K = z5;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i5, KeyEvent keyEvent) {
        return s(i5, keyEvent) != null;
    }

    public void j0(boolean z5) {
        if (this.f698o == z5) {
            return;
        }
        k0(z5);
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

    public boolean n(j jVar) {
        boolean z5 = false;
        if (this.H.isEmpty()) {
            return false;
        }
        m0();
        Iterator<WeakReference<n>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                this.H.remove(next);
            } else {
                z5 = nVar.g(this, jVar);
                if (z5) {
                    break;
                }
            }
        }
        l0();
        if (z5) {
            this.I = jVar;
        }
        return z5;
    }

    public int o(int i5) {
        return p(i5, 0);
    }

    public int p(int i5, int i6) {
        int size = size();
        if (i6 < 0) {
            i6 = 0;
        }
        while (i6 < size) {
            if (this.f700q.get(i6).getGroupId() == i5) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i5, int i6) {
        return O(findItem(i5), i6);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i5, KeyEvent keyEvent, int i6) {
        j s5 = s(i5, keyEvent);
        boolean O2 = s5 != null ? O(s5, i6) : false;
        if ((i6 & 2) != 0) {
            f(true);
        }
        return O2;
    }

    public int r(int i5) {
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            if (this.f700q.get(i6).getItemId() == i5) {
                return i6;
            }
        }
        return -1;
    }

    @Override // android.view.Menu
    public void removeGroup(int i5) {
        int o5 = o(i5);
        if (o5 >= 0) {
            int size = this.f700q.size() - o5;
            int i6 = 0;
            while (true) {
                int i7 = i6 + 1;
                if (i6 >= size || this.f700q.get(o5).getGroupId() != i5) {
                    break;
                }
                R(o5, false);
                i6 = i7;
            }
            N(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i5) {
        R(r(i5), true);
    }

    j s(int i5, KeyEvent keyEvent) {
        ArrayList<j> arrayList = this.G;
        arrayList.clear();
        t(arrayList, i5, keyEvent);
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
        for (int i6 = 0; i6 < size; i6++) {
            j jVar = arrayList.get(i6);
            char alphabeticShortcut = J ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (J && alphabeticShortcut == '\b' && i5 == 67))) {
                return jVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i5, boolean z5, boolean z6) {
        int size = this.f700q.size();
        for (int i6 = 0; i6 < size; i6++) {
            j jVar = this.f700q.get(i6);
            if (jVar.getGroupId() == i5) {
                jVar.w(z6);
                jVar.setCheckable(z5);
            }
        }
    }

    @Override // m.a, android.view.Menu
    public void setGroupDividerEnabled(boolean z5) {
        this.J = z5;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i5, boolean z5) {
        int size = this.f700q.size();
        for (int i6 = 0; i6 < size; i6++) {
            j jVar = this.f700q.get(i6);
            if (jVar.getGroupId() == i5) {
                jVar.setEnabled(z5);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i5, boolean z5) {
        int size = this.f700q.size();
        boolean z6 = false;
        for (int i6 = 0; i6 < size; i6++) {
            j jVar = this.f700q.get(i6);
            if (jVar.getGroupId() == i5 && jVar.B(z5)) {
                z6 = true;
            }
        }
        if (z6) {
            N(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z5) {
        this.f697n = z5;
        N(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f700q.size();
    }

    void t(List<j> list, int i5, KeyEvent keyEvent) {
        boolean J = J();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i5 == 67) {
            int size = this.f700q.size();
            for (int i6 = 0; i6 < size; i6++) {
                j jVar = this.f700q.get(i6);
                if (jVar.hasSubMenu()) {
                    ((g) jVar.getSubMenu()).t(list, i5, keyEvent);
                }
                char alphabeticShortcut = J ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
                if (((modifiers & m.a.f29113e) == ((J ? jVar.getAlphabeticModifiers() : jVar.getNumericModifiers()) & m.a.f29113e)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (J && alphabeticShortcut == '\b' && i5 == 67)) && jVar.isEnabled()) {
                        list.add(jVar);
                    }
                }
            }
        }
    }

    public void u() {
        ArrayList<j> H = H();
        if (this.f705v) {
            Iterator<WeakReference<n>> it = this.H.iterator();
            boolean z5 = false;
            while (it.hasNext()) {
                WeakReference<n> next = it.next();
                n nVar = next.get();
                if (nVar == null) {
                    this.H.remove(next);
                } else {
                    z5 |= nVar.e();
                }
            }
            if (z5) {
                this.f703t.clear();
                this.f704u.clear();
                int size = H.size();
                for (int i5 = 0; i5 < size; i5++) {
                    j jVar = H.get(i5);
                    if (jVar.o()) {
                        this.f703t.add(jVar);
                    } else {
                        this.f704u.add(jVar);
                    }
                }
            } else {
                this.f703t.clear();
                this.f704u.clear();
                this.f704u.addAll(H());
            }
            this.f705v = false;
        }
    }

    public ArrayList<j> v() {
        u();
        return this.f703t;
    }

    protected String w() {
        return "android:menu:actionviewstates";
    }

    public Context x() {
        return this.f695l;
    }

    public j y() {
        return this.I;
    }

    public Drawable z() {
        return this.f709z;
    }

    @Override // android.view.Menu
    public MenuItem add(int i5) {
        return a(0, 0, 0, this.f696m.getString(i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i5) {
        return addSubMenu(0, 0, 0, this.f696m.getString(i5));
    }

    @Override // android.view.Menu
    public MenuItem add(int i5, int i6, int i7, CharSequence charSequence) {
        return a(i5, i6, i7, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i5, int i6, int i7, CharSequence charSequence) {
        j jVar = (j) a(i5, i6, i7, charSequence);
        t tVar = new t(this.f695l, this, jVar);
        jVar.A(tVar);
        return tVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i5, int i6, int i7, int i8) {
        return a(i5, i6, i7, this.f696m.getString(i8));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i5, int i6, int i7, int i8) {
        return addSubMenu(i5, i6, i7, this.f696m.getString(i8));
    }
}

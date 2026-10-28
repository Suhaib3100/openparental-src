package o0;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.u;
import fg.l;
import fg.m;
import i0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: TextActionModeCallback.android.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u00002\u00020\u0001Bk\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0019\u0010\u0018J!\u0010\u001b\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b!\u0010\"R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010#\u001a\u0004\b+\u0010%\"\u0004\b,\u0010-R*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010#\u001a\u0004\b.\u0010%\"\u0004\b/\u0010-R*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010#\u001a\u0004\b0\u0010%\"\u0004\b1\u0010-R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010#\u001a\u0004\b2\u0010%\"\u0004\b3\u0010-¨\u00064"}, d2 = {"Lo0/d;", "", "Lkotlin/Function0;", "Lkotlin/k2;", "onActionModeDestroy", "Li0/i;", "rect", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "<init>", "(Lld/a;Li0/i;Lld/a;Lld/a;Lld/a;Lld/a;)V", "Landroid/view/Menu;", "menu", "Lo0/b;", "item", "callback", "b", "(Landroid/view/Menu;Lo0/b;Lld/a;)V", "Landroid/view/ActionMode;", "mode", "", "j", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "l", "Landroid/view/MenuItem;", "i", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "k", "()V", "r", "(Landroid/view/Menu;)V", "a", "(Landroid/view/Menu;Lo0/b;)V", "Lld/a;", "c", "()Lld/a;", "Li0/i;", "h", "()Li0/i;", "q", "(Li0/i;)V", "d", "m", "(Lld/a;)V", "f", "o", "e", "n", "g", "p", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextActionModeCallback.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextActionModeCallback.android.kt\nandroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
/* loaded from: classes.dex */
public final class d {

    /* renamed from: g, reason: collision with root package name */
    public static final int f83740g = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @m
    private final ld.a<k2> onActionModeDestroy;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private i rect;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private ld.a<k2> onCopyRequested;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private ld.a<k2> onPasteRequested;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @m
    private ld.a<k2> onCutRequested;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @m
    private ld.a<k2> onSelectAllRequested;

    public d() {
        this(null, null, null, null, null, null, 63, null);
    }

    private final void b(Menu menu, b item, ld.a<k2> callback) {
        if (callback != null && menu.findItem(item.getId()) == null) {
            a(menu, item);
        } else {
            if (callback != null || menu.findItem(item.getId()) == null) {
                return;
            }
            menu.removeItem(item.getId());
        }
    }

    public final void a(@l Menu menu, @l b item) {
        menu.add(0, item.getId(), item.getOrder(), item.getTitleResource()).setShowAsAction(1);
    }

    @m
    public final ld.a<k2> c() {
        return this.onActionModeDestroy;
    }

    @m
    public final ld.a<k2> d() {
        return this.onCopyRequested;
    }

    @m
    public final ld.a<k2> e() {
        return this.onCutRequested;
    }

    @m
    public final ld.a<k2> f() {
        return this.onPasteRequested;
    }

    @m
    public final ld.a<k2> g() {
        return this.onSelectAllRequested;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final i getRect() {
        return this.rect;
    }

    public final boolean i(@m ActionMode mode, @m MenuItem item) {
        l0.m(item);
        int itemId = item.getItemId();
        if (itemId == b.Copy.getId()) {
            ld.a<k2> aVar = this.onCopyRequested;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == b.Paste.getId()) {
            ld.a<k2> aVar2 = this.onPasteRequested;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == b.Cut.getId()) {
            ld.a<k2> aVar3 = this.onCutRequested;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else {
            if (itemId != b.SelectAll.getId()) {
                return false;
            }
            ld.a<k2> aVar4 = this.onSelectAllRequested;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        }
        if (mode == null) {
            return true;
        }
        mode.finish();
        return true;
    }

    public final boolean j(@m ActionMode mode, @m Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (mode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (this.onCopyRequested != null) {
            a(menu, b.Copy);
        }
        if (this.onPasteRequested != null) {
            a(menu, b.Paste);
        }
        if (this.onCutRequested != null) {
            a(menu, b.Cut);
        }
        if (this.onSelectAllRequested == null) {
            return true;
        }
        a(menu, b.SelectAll);
        return true;
    }

    public final void k() {
        ld.a<k2> aVar = this.onActionModeDestroy;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final boolean l(@m ActionMode mode, @m Menu menu) {
        if (mode == null || menu == null) {
            return false;
        }
        r(menu);
        return true;
    }

    public final void m(@m ld.a<k2> aVar) {
        this.onCopyRequested = aVar;
    }

    public final void n(@m ld.a<k2> aVar) {
        this.onCutRequested = aVar;
    }

    public final void o(@m ld.a<k2> aVar) {
        this.onPasteRequested = aVar;
    }

    public final void p(@m ld.a<k2> aVar) {
        this.onSelectAllRequested = aVar;
    }

    public final void q(@l i iVar) {
        this.rect = iVar;
    }

    @m1
    public final void r(@l Menu menu) {
        b(menu, b.Copy, this.onCopyRequested);
        b(menu, b.Paste, this.onPasteRequested);
        b(menu, b.Cut, this.onCutRequested);
        b(menu, b.SelectAll, this.onSelectAllRequested);
    }

    public d(@m ld.a<k2> aVar, @l i iVar, @m ld.a<k2> aVar2, @m ld.a<k2> aVar3, @m ld.a<k2> aVar4, @m ld.a<k2> aVar5) {
        this.onActionModeDestroy = aVar;
        this.rect = iVar;
        this.onCopyRequested = aVar2;
        this.onPasteRequested = aVar3;
        this.onCutRequested = aVar4;
        this.onSelectAllRequested = aVar5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(ld.a r6, i0.i r7, ld.a r8, ld.a r9, ld.a r10, ld.a r11, int r12, kotlin.jvm.internal.w r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L7
            r13 = r0
            goto L8
        L7:
            r13 = r6
        L8:
            r6 = r12 & 2
            if (r6 == 0) goto L15
            i0.i$a r6 = i0.i.INSTANCE
            r6.getClass()
            i0.i r7 = i0.i.a()
        L15:
            r1 = r7
            r6 = r12 & 4
            if (r6 == 0) goto L1c
            r2 = r0
            goto L1d
        L1c:
            r2 = r8
        L1d:
            r6 = r12 & 8
            if (r6 == 0) goto L23
            r3 = r0
            goto L24
        L23:
            r3 = r9
        L24:
            r6 = r12 & 16
            if (r6 == 0) goto L2a
            r4 = r0
            goto L2b
        L2a:
            r4 = r10
        L2b:
            r6 = r12 & 32
            if (r6 == 0) goto L31
            r12 = r0
            goto L32
        L31:
            r12 = r11
        L32:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.d.<init>(ld.a, i0.i, ld.a, ld.a, ld.a, ld.a, int, kotlin.jvm.internal.w):void");
    }
}

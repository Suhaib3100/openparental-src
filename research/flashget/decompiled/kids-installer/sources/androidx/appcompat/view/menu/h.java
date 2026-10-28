package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.o0;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.n;
import androidx.core.view.s1;
import d.a;

/* compiled from: MenuDialogHelper.java */
/* loaded from: classes2.dex */
class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, n.a {

    /* renamed from: o, reason: collision with root package name */
    private g f710o;

    /* renamed from: p, reason: collision with root package name */
    private androidx.appcompat.app.c f711p;

    /* renamed from: q, reason: collision with root package name */
    e f712q;

    /* renamed from: r, reason: collision with root package name */
    private n.a f713r;

    public h(g gVar) {
        this.f710o = gVar;
    }

    public void a() {
        androidx.appcompat.app.c cVar = this.f711p;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void b(@o0 g gVar, boolean z5) {
        if (z5 || gVar == this.f710o) {
            a();
        }
        n.a aVar = this.f713r;
        if (aVar != null) {
            aVar.b(gVar, z5);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean c(@o0 g gVar) {
        n.a aVar = this.f713r;
        if (aVar != null) {
            return aVar.c(gVar);
        }
        return false;
    }

    public void d(n.a aVar) {
        this.f713r = aVar;
    }

    public void e(IBinder iBinder) {
        g gVar = this.f710o;
        c.a aVar = new c.a(gVar.x());
        e eVar = new e(aVar.b(), a.k.f21960q);
        this.f712q = eVar;
        eVar.h(this);
        this.f710o.b(this.f712q);
        aVar.c(this.f712q.a(), this);
        View B = gVar.B();
        if (B != null) {
            aVar.f(B);
        } else {
            aVar.h(gVar.z()).K(gVar.A());
        }
        aVar.A(this);
        androidx.appcompat.app.c a6 = aVar.a();
        this.f711p = a6;
        a6.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f711p.getWindow().getAttributes();
        attributes.type = s1.f5665f;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f711p.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i5) {
        this.f710o.O((j) this.f712q.a().getItem(i5), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f712q.b(this.f710o, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i5, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i5 == 82 || i5 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f711p.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f711p.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f710o.f(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f710o.performShortcut(i5, keyEvent, 0);
    }
}

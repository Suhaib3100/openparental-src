package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.o0;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.o;
import d.a;

/* compiled from: MenuDialogHelper.java */
/* loaded from: classes.dex */
class i implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, o.a {

    /* renamed from: b, reason: collision with root package name */
    private h f1258b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.appcompat.app.c f1259c;

    /* renamed from: d, reason: collision with root package name */
    f f1260d;

    /* renamed from: e, reason: collision with root package name */
    private o.a f1261e;

    public i(h hVar) {
        this.f1258b = hVar;
    }

    public void a() {
        androidx.appcompat.app.c cVar = this.f1259c;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    public void b(o.a aVar) {
        this.f1261e = aVar;
    }

    public void c(IBinder iBinder) {
        h hVar = this.f1258b;
        c.a aVar = new c.a(hVar.x());
        f fVar = new f(aVar.b(), a.j.f73315q);
        this.f1260d = fVar;
        fVar.f(this);
        this.f1258b.b(this.f1260d);
        aVar.c(this.f1260d.b(), this);
        View B = hVar.B();
        if (B != null) {
            aVar.f(B);
        } else {
            aVar.h(hVar.z()).K(hVar.A());
        }
        aVar.A(this);
        androidx.appcompat.app.c a5 = aVar.a();
        this.f1259c = a5;
        a5.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1259c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1259c.show();
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void d(@o0 h hVar, boolean z4) {
        if (z4 || hVar == this.f1258b) {
            a();
        }
        o.a aVar = this.f1261e;
        if (aVar != null) {
            aVar.d(hVar, z4);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean e(@o0 h hVar) {
        o.a aVar = this.f1261e;
        if (aVar != null) {
            return aVar.e(hVar);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i4) {
        this.f1258b.O((k) this.f1260d.b().getItem(i4), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1260d.d(this.f1258b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i4 == 82 || i4 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1259c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1259c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1258b.f(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1258b.performShortcut(i4, keyEvent, 0);
    }
}

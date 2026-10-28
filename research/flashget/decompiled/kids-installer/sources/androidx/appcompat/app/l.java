package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.ActionBar;

/* compiled from: NavItemSelectedListener.java */
/* loaded from: classes.dex */
class l implements AdapterView.OnItemSelectedListener {

    /* renamed from: o, reason: collision with root package name */
    private final ActionBar.d f376o;

    public l(ActionBar.d dVar) {
        this.f376o = dVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i5, long j5) {
        ActionBar.d dVar = this.f376o;
        if (dVar != null) {
            dVar.onNavigationItemSelected(i5, j5);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}

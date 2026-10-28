package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.ActionBar;

/* compiled from: NavItemSelectedListener.java */
/* loaded from: classes.dex */
class y implements AdapterView.OnItemSelectedListener {

    /* renamed from: b, reason: collision with root package name */
    private final ActionBar.d f966b;

    public y(ActionBar.d dVar) {
        this.f966b = dVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i4, long j4) {
        ActionBar.d dVar = this.f966b;
        if (dVar != null) {
            dVar.a(i4, j4);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}

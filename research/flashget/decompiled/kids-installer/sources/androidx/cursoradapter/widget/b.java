package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.widget.Filter;

/* compiled from: CursorFilter.java */
/* loaded from: classes.dex */
class b extends Filter {

    /* renamed from: a, reason: collision with root package name */
    a f5936a;

    /* compiled from: CursorFilter.java */
    interface a {
        void a(Cursor cursor);

        Cursor b();

        Cursor c(CharSequence charSequence);

        CharSequence convertToString(Cursor cursor);
    }

    b(a aVar) {
        this.f5936a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f5936a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor c6 = this.f5936a.c(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (c6 != null) {
            filterResults.count = c6.getCount();
            filterResults.values = c6;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b6 = this.f5936a.b();
        Object obj = filterResults.values;
        if (obj == null || obj == b6) {
            return;
        }
        this.f5936a.a((Cursor) obj);
    }
}

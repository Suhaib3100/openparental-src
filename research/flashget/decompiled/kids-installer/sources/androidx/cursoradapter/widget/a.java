package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import androidx.annotation.c1;
import androidx.appcompat.view.menu.s;
import androidx.cursoradapter.widget.b;

/* compiled from: CursorAdapter.java */
/* loaded from: classes3.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: x, reason: collision with root package name */
    @Deprecated
    public static final int f5923x = 1;

    /* renamed from: y, reason: collision with root package name */
    public static final int f5924y = 2;

    /* renamed from: o, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    protected boolean f5925o;

    /* renamed from: p, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    protected boolean f5926p;

    /* renamed from: q, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    protected Cursor f5927q;

    /* renamed from: r, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    protected Context f5928r;

    /* renamed from: s, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    protected int f5929s;

    /* renamed from: t, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    protected C0062a f5930t;

    /* renamed from: u, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    protected DataSetObserver f5931u;

    /* renamed from: v, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    protected androidx.cursoradapter.widget.b f5932v;

    /* renamed from: w, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    protected FilterQueryProvider f5933w;

    /* compiled from: CursorAdapter.java */
    /* renamed from: androidx.cursoradapter.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class C0062a extends ContentObserver {
        C0062a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z5) {
            a.this.j();
        }
    }

    /* compiled from: CursorAdapter.java */
    /* loaded from: classes.dex */
    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f5925o = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f5925o = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    @Deprecated
    public a(Context context, Cursor cursor) {
        f(context, cursor, 1);
    }

    public void a(Cursor cursor) {
        Cursor l5 = l(cursor);
        if (l5 != null) {
            l5.close();
        }
    }

    @Override // androidx.cursoradapter.widget.b.a
    public Cursor b() {
        return this.f5927q;
    }

    public Cursor c(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f5933w;
        return filterQueryProvider != null ? filterQueryProvider.runQuery(charSequence) : this.f5927q;
    }

    public CharSequence convertToString(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public abstract void d(View view, Context context, Cursor cursor);

    public FilterQueryProvider e() {
        return this.f5933w;
    }

    void f(Context context, Cursor cursor, int i5) {
        if ((i5 & 1) == 1) {
            i5 |= 2;
            this.f5926p = true;
        } else {
            this.f5926p = false;
        }
        boolean z5 = cursor != null;
        this.f5927q = cursor;
        this.f5925o = z5;
        this.f5928r = context;
        this.f5929s = z5 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i5 & 2) == 2) {
            this.f5930t = new C0062a();
            this.f5931u = new b();
        } else {
            this.f5930t = null;
            this.f5931u = null;
        }
        if (z5) {
            C0062a c0062a = this.f5930t;
            if (c0062a != null) {
                cursor.registerContentObserver(c0062a);
            }
            DataSetObserver dataSetObserver = this.f5931u;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Deprecated
    protected void g(Context context, Cursor cursor, boolean z5) {
        f(context, cursor, z5 ? 1 : 2);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f5925o || (cursor = this.f5927q) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i5, View view, ViewGroup viewGroup) {
        if (!this.f5925o) {
            return null;
        }
        this.f5927q.moveToPosition(i5);
        if (view == null) {
            view = h(this.f5928r, this.f5927q, viewGroup);
        }
        d(view, this.f5928r, this.f5927q);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f5932v == null) {
            this.f5932v = new androidx.cursoradapter.widget.b(this);
        }
        return this.f5932v;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i5) {
        Cursor cursor;
        if (!this.f5925o || (cursor = this.f5927q) == null) {
            return null;
        }
        cursor.moveToPosition(i5);
        return this.f5927q;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i5) {
        Cursor cursor;
        if (this.f5925o && (cursor = this.f5927q) != null && cursor.moveToPosition(i5)) {
            return this.f5927q.getLong(this.f5929s);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i5, View view, ViewGroup viewGroup) {
        if (!this.f5925o) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f5927q.moveToPosition(i5)) {
            throw new IllegalStateException(s.a("couldn't move cursor to position ", i5));
        }
        if (view == null) {
            view = i(this.f5928r, this.f5927q, viewGroup);
        }
        d(view, this.f5928r, this.f5927q);
        return view;
    }

    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return i(context, cursor, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public abstract View i(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void j() {
        Cursor cursor;
        if (!this.f5926p || (cursor = this.f5927q) == null || cursor.isClosed()) {
            return;
        }
        this.f5925o = this.f5927q.requery();
    }

    public void k(FilterQueryProvider filterQueryProvider) {
        this.f5933w = filterQueryProvider;
    }

    public Cursor l(Cursor cursor) {
        Cursor cursor2 = this.f5927q;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0062a c0062a = this.f5930t;
            if (c0062a != null) {
                cursor2.unregisterContentObserver(c0062a);
            }
            DataSetObserver dataSetObserver = this.f5931u;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f5927q = cursor;
        if (cursor != null) {
            C0062a c0062a2 = this.f5930t;
            if (c0062a2 != null) {
                cursor.registerContentObserver(c0062a2);
            }
            DataSetObserver dataSetObserver2 = this.f5931u;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f5929s = cursor.getColumnIndexOrThrow("_id");
            this.f5925o = true;
            notifyDataSetChanged();
        } else {
            this.f5929s = -1;
            this.f5925o = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    public a(Context context, Cursor cursor, boolean z5) {
        f(context, cursor, z5 ? 1 : 2);
    }

    public a(Context context, Cursor cursor, int i5) {
        f(context, cursor, i5);
    }
}

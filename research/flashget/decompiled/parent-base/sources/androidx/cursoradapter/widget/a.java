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
import androidx.cursoradapter.widget.b;

/* compiled from: CursorAdapter.java */
/* loaded from: classes3.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final int f28303k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f28304l = 2;

    /* renamed from: b, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    protected boolean f28305b;

    /* renamed from: c, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    protected boolean f28306c;

    /* renamed from: d, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    protected Cursor f28307d;

    /* renamed from: e, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    protected Context f28308e;

    /* renamed from: f, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    protected int f28309f;

    /* renamed from: g, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    protected C0456a f28310g;

    /* renamed from: h, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    protected DataSetObserver f28311h;

    /* renamed from: i, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    protected androidx.cursoradapter.widget.b f28312i;

    /* renamed from: j, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    protected FilterQueryProvider f28313j;

    /* compiled from: CursorAdapter.java */
    /* renamed from: androidx.cursoradapter.widget.a$a, reason: collision with other inner class name */
    private class C0456a extends ContentObserver {
        C0456a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z4) {
            a.this.k();
        }
    }

    /* compiled from: CursorAdapter.java */
    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f28305b = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f28305b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    @Deprecated
    public a(Context context, Cursor cursor) {
        g(context, cursor, 1);
    }

    public CharSequence a(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public void b(Cursor cursor) {
        Cursor m4 = m(cursor);
        if (m4 != null) {
            m4.close();
        }
    }

    public Cursor c(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f28313j;
        return filterQueryProvider != null ? filterQueryProvider.runQuery(charSequence) : this.f28307d;
    }

    @Override // androidx.cursoradapter.widget.b.a
    public Cursor d() {
        return this.f28307d;
    }

    public abstract void e(View view, Context context, Cursor cursor);

    public FilterQueryProvider f() {
        return this.f28313j;
    }

    void g(Context context, Cursor cursor, int i4) {
        if ((i4 & 1) == 1) {
            i4 |= 2;
            this.f28306c = true;
        } else {
            this.f28306c = false;
        }
        boolean z4 = cursor != null;
        this.f28307d = cursor;
        this.f28305b = z4;
        this.f28308e = context;
        this.f28309f = z4 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i4 & 2) == 2) {
            this.f28310g = new C0456a();
            this.f28311h = new b();
        } else {
            this.f28310g = null;
            this.f28311h = null;
        }
        if (z4) {
            C0456a c0456a = this.f28310g;
            if (c0456a != null) {
                cursor.registerContentObserver(c0456a);
            }
            DataSetObserver dataSetObserver = this.f28311h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f28305b || (cursor = this.f28307d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        if (!this.f28305b) {
            return null;
        }
        this.f28307d.moveToPosition(i4);
        if (view == null) {
            view = i(this.f28308e, this.f28307d, viewGroup);
        }
        e(view, this.f28308e, this.f28307d);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f28312i == null) {
            this.f28312i = new androidx.cursoradapter.widget.b(this);
        }
        return this.f28312i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        Cursor cursor;
        if (!this.f28305b || (cursor = this.f28307d) == null) {
            return null;
        }
        cursor.moveToPosition(i4);
        return this.f28307d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        Cursor cursor;
        if (this.f28305b && (cursor = this.f28307d) != null && cursor.moveToPosition(i4)) {
            return this.f28307d.getLong(this.f28309f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (!this.f28305b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f28307d.moveToPosition(i4)) {
            throw new IllegalStateException(android.support.v4.media.a.a("couldn't move cursor to position ", i4));
        }
        if (view == null) {
            view = j(this.f28308e, this.f28307d, viewGroup);
        }
        e(view, this.f28308e, this.f28307d);
        return view;
    }

    @Deprecated
    protected void h(Context context, Cursor cursor, boolean z4) {
        g(context, cursor, z4 ? 1 : 2);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public View i(Context context, Cursor cursor, ViewGroup viewGroup) {
        return j(context, cursor, viewGroup);
    }

    public abstract View j(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void k() {
        Cursor cursor;
        if (!this.f28306c || (cursor = this.f28307d) == null || cursor.isClosed()) {
            return;
        }
        this.f28305b = this.f28307d.requery();
    }

    public void l(FilterQueryProvider filterQueryProvider) {
        this.f28313j = filterQueryProvider;
    }

    public Cursor m(Cursor cursor) {
        Cursor cursor2 = this.f28307d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0456a c0456a = this.f28310g;
            if (c0456a != null) {
                cursor2.unregisterContentObserver(c0456a);
            }
            DataSetObserver dataSetObserver = this.f28311h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f28307d = cursor;
        if (cursor != null) {
            C0456a c0456a2 = this.f28310g;
            if (c0456a2 != null) {
                cursor.registerContentObserver(c0456a2);
            }
            DataSetObserver dataSetObserver2 = this.f28311h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f28309f = cursor.getColumnIndexOrThrow("_id");
            this.f28305b = true;
            notifyDataSetChanged();
        } else {
            this.f28309f = -1;
            this.f28305b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    public a(Context context, Cursor cursor, boolean z4) {
        g(context, cursor, z4 ? 1 : 2);
    }

    public a(Context context, Cursor cursor, int i4) {
        g(context, cursor, i4);
    }
}

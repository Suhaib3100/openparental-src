package androidx.databinding.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.databinding.y;
import java.util.List;

/* compiled from: ObservableListAdapter.java */
@c1({c1.a.LIBRARY})
/* loaded from: classes.dex */
class t<T> extends BaseAdapter {

    /* renamed from: o, reason: collision with root package name */
    private List<T> f6076o;

    /* renamed from: p, reason: collision with root package name */
    private y.a f6077p;

    /* renamed from: q, reason: collision with root package name */
    private final Context f6078q;

    /* renamed from: r, reason: collision with root package name */
    private final int f6079r;

    /* renamed from: s, reason: collision with root package name */
    private final int f6080s;

    /* renamed from: t, reason: collision with root package name */
    private final int f6081t;

    /* renamed from: u, reason: collision with root package name */
    private final LayoutInflater f6082u;

    /* compiled from: ObservableListAdapter.java */
    /* loaded from: classes3.dex */
    class a extends y.a {
        a() {
        }

        @Override // androidx.databinding.y.a
        public void a(androidx.databinding.y yVar) {
            t.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.y.a
        public void f(androidx.databinding.y yVar, int i5, int i6) {
            t.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.y.a
        public void g(androidx.databinding.y yVar, int i5, int i6) {
            t.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.y.a
        public void h(androidx.databinding.y yVar, int i5, int i6, int i7) {
            t.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.y.a
        public void i(androidx.databinding.y yVar, int i5, int i6) {
            t.this.notifyDataSetChanged();
        }
    }

    public t(Context context, List<T> list, int i5, int i6, int i7) {
        this.f6078q = context;
        this.f6080s = i5;
        this.f6079r = i6;
        this.f6081t = i7;
        this.f6082u = i5 == 0 ? null : (LayoutInflater) context.getSystemService("layout_inflater");
        b(list);
    }

    public View a(int i5, int i6, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = i5 == 0 ? new TextView(this.f6078q) : this.f6082u.inflate(i5, viewGroup, false);
        }
        int i7 = this.f6081t;
        TextView textView = (TextView) (i7 == 0 ? view : view.findViewById(i7));
        T t5 = this.f6076o.get(i6);
        textView.setText(t5 instanceof CharSequence ? (CharSequence) t5 : String.valueOf(t5));
        return view;
    }

    public void b(List<T> list) {
        List<T> list2 = this.f6076o;
        if (list2 == list) {
            return;
        }
        if (list2 instanceof androidx.databinding.y) {
            ((androidx.databinding.y) list2).n(this.f6077p);
        }
        this.f6076o = list;
        if (list instanceof androidx.databinding.y) {
            if (this.f6077p == null) {
                this.f6077p = new a();
            }
            ((androidx.databinding.y) this.f6076o).J0(this.f6077p);
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f6076o.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i5, View view, ViewGroup viewGroup) {
        return a(this.f6079r, i5, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public Object getItem(int i5) {
        return this.f6076o.get(i5);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i5) {
        return i5;
    }

    @Override // android.widget.Adapter
    public View getView(int i5, View view, ViewGroup viewGroup) {
        return a(this.f6080s, i5, view, viewGroup);
    }
}

package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: PagerAdapter.java */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f10416c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f10417d = -2;

    /* renamed from: a, reason: collision with root package name */
    private final DataSetObservable f10418a = new DataSetObservable();

    /* renamed from: b, reason: collision with root package name */
    private DataSetObserver f10419b;

    @Deprecated
    public void b(@o0 View view, int i5, @o0 Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void e(@o0 ViewGroup viewGroup, int i5, @o0 Object obj) {
        b(viewGroup, i5, obj);
    }

    @Deprecated
    public void f(@o0 View view) {
    }

    public void g(@o0 ViewGroup viewGroup) {
        f(viewGroup);
    }

    public abstract int h();

    public int i(@o0 Object obj) {
        return -1;
    }

    @q0
    public CharSequence j(int i5) {
        return null;
    }

    public float k(int i5) {
        return 1.0f;
    }

    @o0
    @Deprecated
    public Object l(@o0 View view, int i5) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @o0
    public Object m(@o0 ViewGroup viewGroup, int i5) {
        return l(viewGroup, i5);
    }

    public abstract boolean n(@o0 View view, @o0 Object obj);

    public void o() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f10419b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f10418a.notifyChanged();
    }

    public void p(@o0 DataSetObserver dataSetObserver) {
        this.f10418a.registerObserver(dataSetObserver);
    }

    public void q(@q0 Parcelable parcelable, @q0 ClassLoader classLoader) {
    }

    @q0
    public Parcelable r() {
        return null;
    }

    @Deprecated
    public void s(@o0 View view, int i5, @o0 Object obj) {
    }

    public void t(@o0 ViewGroup viewGroup, int i5, @o0 Object obj) {
        s(viewGroup, i5, obj);
    }

    void u(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f10419b = dataSetObserver;
        }
    }

    @Deprecated
    public void v(@o0 View view) {
    }

    public void w(@o0 ViewGroup viewGroup) {
        v(viewGroup);
    }

    public void x(@o0 DataSetObserver dataSetObserver) {
        this.f10418a.unregisterObserver(dataSetObserver);
    }
}

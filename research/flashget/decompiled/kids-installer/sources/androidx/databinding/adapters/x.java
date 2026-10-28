package androidx.databinding.adapters;

import android.annotation.TargetApi;
import android.widget.SearchView;
import androidx.annotation.c1;

/* compiled from: SearchViewBindingAdapter.java */
@c1({c1.a.LIBRARY})
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:onQueryTextFocusChange", method = "setOnQueryTextFocusChangeListener", type = SearchView.class), @androidx.databinding.g(attribute = "android:onSearchClick", method = "setOnSearchClickListener", type = SearchView.class), @androidx.databinding.g(attribute = "android:onClose", method = "setOnCloseListener", type = SearchView.class)})
/* loaded from: classes.dex */
public class x {

    /* compiled from: SearchViewBindingAdapter.java */
    class a implements SearchView.OnQueryTextListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f6088a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f6089b;

        a(d dVar, c cVar) {
            this.f6088a = dVar;
            this.f6089b = cVar;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String str) {
            c cVar = this.f6089b;
            if (cVar != null) {
                return cVar.onQueryTextChange(str);
            }
            return false;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String str) {
            d dVar = this.f6088a;
            if (dVar != null) {
                return dVar.onQueryTextSubmit(str);
            }
            return false;
        }
    }

    /* compiled from: SearchViewBindingAdapter.java */
    class b implements SearchView.OnSuggestionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f6090a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f6091b;

        b(f fVar, e eVar) {
            this.f6090a = fVar;
            this.f6091b = eVar;
        }

        @Override // android.widget.SearchView.OnSuggestionListener
        public boolean onSuggestionClick(int i5) {
            e eVar = this.f6091b;
            if (eVar != null) {
                return eVar.onSuggestionClick(i5);
            }
            return false;
        }

        @Override // android.widget.SearchView.OnSuggestionListener
        public boolean onSuggestionSelect(int i5) {
            f fVar = this.f6090a;
            if (fVar != null) {
                return fVar.onSuggestionSelect(i5);
            }
            return false;
        }
    }

    /* compiled from: SearchViewBindingAdapter.java */
    @TargetApi(11)
    public interface c {
        boolean onQueryTextChange(String str);
    }

    /* compiled from: SearchViewBindingAdapter.java */
    @TargetApi(11)
    public interface d {
        boolean onQueryTextSubmit(String str);
    }

    /* compiled from: SearchViewBindingAdapter.java */
    @TargetApi(11)
    public interface e {
        boolean onSuggestionClick(int i5);
    }

    /* compiled from: SearchViewBindingAdapter.java */
    @TargetApi(11)
    public interface f {
        boolean onSuggestionSelect(int i5);
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onQueryTextSubmit", "android:onQueryTextChange"})
    public static void a(SearchView searchView, d dVar, c cVar) {
        if (dVar == null && cVar == null) {
            searchView.setOnQueryTextListener(null);
        } else {
            searchView.setOnQueryTextListener(new a(dVar, cVar));
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onSuggestionSelect", "android:onSuggestionClick"})
    public static void b(SearchView searchView, f fVar, e eVar) {
        if (fVar == null && eVar == null) {
            searchView.setOnSuggestionListener(null);
        } else {
            searchView.setOnSuggestionListener(new b(fVar, eVar));
        }
    }
}

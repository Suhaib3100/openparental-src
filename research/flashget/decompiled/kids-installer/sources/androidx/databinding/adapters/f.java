package androidx.databinding.adapters;

import android.widget.AutoCompleteTextView;
import androidx.annotation.c1;
import androidx.databinding.adapters.e;

/* compiled from: AutoCompleteTextViewBindingAdapter.java */
@c1({c1.a.LIBRARY})
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:completionThreshold", method = "setThreshold", type = AutoCompleteTextView.class), @androidx.databinding.g(attribute = "android:popupBackground", method = "setDropDownBackgroundDrawable", type = AutoCompleteTextView.class), @androidx.databinding.g(attribute = "android:onDismiss", method = "setOnDismissListener", type = AutoCompleteTextView.class), @androidx.databinding.g(attribute = "android:onItemClick", method = "setOnItemClickListener", type = AutoCompleteTextView.class)})
/* loaded from: classes.dex */
public class f {

    /* compiled from: AutoCompleteTextViewBindingAdapter.java */
    class a implements AutoCompleteTextView.Validator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f6042a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f6043b;

        a(c cVar, b bVar) {
            this.f6042a = cVar;
            this.f6043b = bVar;
        }

        @Override // android.widget.AutoCompleteTextView.Validator
        public CharSequence fixText(CharSequence charSequence) {
            b bVar = this.f6043b;
            return bVar != null ? bVar.fixText(charSequence) : charSequence;
        }

        @Override // android.widget.AutoCompleteTextView.Validator
        public boolean isValid(CharSequence charSequence) {
            c cVar = this.f6042a;
            if (cVar != null) {
                return cVar.isValid(charSequence);
            }
            return true;
        }
    }

    /* compiled from: AutoCompleteTextViewBindingAdapter.java */
    public interface b {
        CharSequence fixText(CharSequence charSequence);
    }

    /* compiled from: AutoCompleteTextViewBindingAdapter.java */
    public interface c {
        boolean isValid(CharSequence charSequence);
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onItemSelected", "android:onNothingSelected"})
    public static void a(AutoCompleteTextView autoCompleteTextView, e.a aVar, e.c cVar) {
        if (aVar == null && cVar == null) {
            autoCompleteTextView.setOnItemSelectedListener(null);
        } else {
            autoCompleteTextView.setOnItemSelectedListener(new e.b(aVar, cVar, null));
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:fixText", "android:isValid"})
    public static void b(AutoCompleteTextView autoCompleteTextView, b bVar, c cVar) {
        if (bVar == null && cVar == null) {
            autoCompleteTextView.setValidator(null);
        } else {
            autoCompleteTextView.setValidator(new a(cVar, bVar));
        }
    }
}

package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.core.util.w;

/* compiled from: EmojiTextViewHelper.java */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final b f29545a;

    /* compiled from: EmojiTextViewHelper.java */
    @x0(19)
    private static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final TextView f29546a;

        /* renamed from: b, reason: collision with root package name */
        private final d f29547b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f29548c = true;

        a(TextView textView) {
            this.f29546a = textView;
            this.f29547b = new d(textView);
        }

        @o0
        private InputFilter[] g(@o0 InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f29547b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f29547b;
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> h(@o0 InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i4 = 0; i4 < inputFilterArr.length; i4++) {
                InputFilter inputFilter = inputFilterArr[i4];
                if (inputFilter instanceof d) {
                    sparseArray.put(i4, inputFilter);
                }
            }
            return sparseArray;
        }

        @o0
        private InputFilter[] i(@o0 InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> h4 = h(inputFilterArr);
            if (h4.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - h4.size()];
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5++) {
                if (h4.indexOfKey(i5) < 0) {
                    inputFilterArr2[i4] = inputFilterArr[i5];
                    i4++;
                }
            }
            return inputFilterArr2;
        }

        @q0
        private TransformationMethod k(@q0 TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void l() {
            this.f29546a.setFilters(a(this.f29546a.getFilters()));
        }

        @o0
        private TransformationMethod m(@q0 TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? transformationMethod : transformationMethod instanceof PasswordTransformationMethod ? transformationMethod : new h(transformationMethod);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        @o0
        InputFilter[] a(@o0 InputFilter[] inputFilterArr) {
            return !this.f29548c ? i(inputFilterArr) : g(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public boolean b() {
            return this.f29548c;
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        void c(boolean z4) {
            if (z4) {
                e();
            }
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        void d(boolean z4) {
            this.f29548c = z4;
            e();
            l();
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        void e() {
            this.f29546a.setTransformationMethod(f(this.f29546a.getTransformationMethod()));
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        @q0
        TransformationMethod f(@q0 TransformationMethod transformationMethod) {
            return this.f29548c ? m(transformationMethod) : k(transformationMethod);
        }

        @c1({c1.a.LIBRARY})
        void j(boolean z4) {
            this.f29548c = z4;
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    static class b {
        b() {
        }

        @o0
        InputFilter[] a(@o0 InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        public boolean b() {
            return false;
        }

        void c(boolean z4) {
        }

        void d(boolean z4) {
        }

        void e() {
        }

        @q0
        TransformationMethod f(@q0 TransformationMethod transformationMethod) {
            return transformationMethod;
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    @x0(19)
    private static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        private final a f29549a;

        c(TextView textView) {
            this.f29549a = new a(textView);
        }

        private boolean g() {
            return !androidx.emoji2.text.g.q();
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        @o0
        InputFilter[] a(@o0 InputFilter[] inputFilterArr) {
            return g() ? inputFilterArr : this.f29549a.a(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public boolean b() {
            return this.f29549a.b();
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        void c(boolean z4) {
            if (g()) {
                return;
            }
            this.f29549a.c(z4);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        void d(boolean z4) {
            if (g()) {
                this.f29549a.j(z4);
            } else {
                this.f29549a.d(z4);
            }
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        void e() {
            if (g()) {
                return;
            }
            this.f29549a.e();
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        @q0
        TransformationMethod f(@q0 TransformationMethod transformationMethod) {
            return g() ? transformationMethod : this.f29549a.f(transformationMethod);
        }
    }

    public f(@o0 TextView textView) {
        this(textView, true);
    }

    @o0
    public InputFilter[] a(@o0 InputFilter[] inputFilterArr) {
        return this.f29545a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f29545a.b();
    }

    public void c(boolean z4) {
        this.f29545a.c(z4);
    }

    public void d(boolean z4) {
        this.f29545a.d(z4);
    }

    public void e() {
        this.f29545a.e();
    }

    @q0
    public TransformationMethod f(@q0 TransformationMethod transformationMethod) {
        return this.f29545a.f(transformationMethod);
    }

    public f(@o0 TextView textView, boolean z4) {
        w.m(textView, "textView cannot be null");
        if (z4) {
            this.f29545a = new a(textView);
        } else {
            this.f29545a = new c(textView);
        }
    }
}

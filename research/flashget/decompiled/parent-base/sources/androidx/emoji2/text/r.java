package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.util.w;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SpannableBuilder.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class r extends SpannableStringBuilder {

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final Class<?> f29514b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private final List<a> f29515c;

    /* compiled from: SpannableBuilder.java */
    private static class a implements TextWatcher, SpanWatcher {

        /* renamed from: b, reason: collision with root package name */
        final Object f29516b;

        /* renamed from: c, reason: collision with root package name */
        private final AtomicInteger f29517c = new AtomicInteger(0);

        a(Object obj) {
            this.f29516b = obj;
        }

        private boolean b(Object obj) {
            return obj instanceof l;
        }

        final void a() {
            this.f29517c.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f29516b).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            ((TextWatcher) this.f29516b).beforeTextChanged(charSequence, i4, i5, i6);
        }

        final void c() {
            this.f29517c.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i4, int i5) {
            if (this.f29517c.get() <= 0 || !(obj instanceof l)) {
                ((SpanWatcher) this.f29516b).onSpanAdded(spannable, obj, i4, i5);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i4, int i5, int i6, int i7) {
            int i10;
            int i11;
            if (this.f29517c.get() <= 0 || !(obj instanceof l)) {
                if (Build.VERSION.SDK_INT < 28) {
                    if (i4 > i5) {
                        i4 = 0;
                    }
                    if (i6 > i7) {
                        i10 = i4;
                        i11 = 0;
                        ((SpanWatcher) this.f29516b).onSpanChanged(spannable, obj, i10, i5, i11, i7);
                    }
                }
                i10 = i4;
                i11 = i6;
                ((SpanWatcher) this.f29516b).onSpanChanged(spannable, obj, i10, i5, i11, i7);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i4, int i5) {
            if (this.f29517c.get() <= 0 || !(obj instanceof l)) {
                ((SpanWatcher) this.f29516b).onSpanRemoved(spannable, obj, i4, i5);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            ((TextWatcher) this.f29516b).onTextChanged(charSequence, i4, i5, i6);
        }
    }

    @c1({c1.a.LIBRARY})
    r(@o0 Class<?> cls) {
        this.f29515c = new ArrayList();
        w.m(cls, "watcherClass cannot be null");
        this.f29514b = cls;
    }

    private void e() {
        for (int i4 = 0; i4 < this.f29515c.size(); i4++) {
            this.f29515c.get(i4).a();
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public static r f(@o0 Class<?> cls, @o0 CharSequence charSequence) {
        return new r(cls, charSequence);
    }

    private void h() {
        for (int i4 = 0; i4 < this.f29515c.size(); i4++) {
            this.f29515c.get(i4).onTextChanged(this, 0, length(), length());
        }
    }

    private a i(Object obj) {
        for (int i4 = 0; i4 < this.f29515c.size(); i4++) {
            a aVar = this.f29515c.get(i4);
            if (aVar.f29516b == obj) {
                return aVar;
            }
        }
        return null;
    }

    private boolean j(@o0 Class<?> cls) {
        return this.f29514b == cls;
    }

    private boolean k(@q0 Object obj) {
        return obj != null && j(obj.getClass());
    }

    private void l() {
        for (int i4 = 0; i4 < this.f29515c.size(); i4++) {
            this.f29515c.get(i4).c();
        }
    }

    @c1({c1.a.LIBRARY})
    public void a() {
        e();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @o0
    public Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public Editable delete(int i4, int i5) {
        super.delete(i4, i5);
        return this;
    }

    @c1({c1.a.LIBRARY})
    public void g() {
        l();
        h();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(@q0 Object obj) {
        a i4;
        if (k(obj) && (i4 = i(obj)) != null) {
            obj = i4;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(@q0 Object obj) {
        a i4;
        if (k(obj) && (i4 = i(obj)) != null) {
            obj = i4;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(@q0 Object obj) {
        a i4;
        if (k(obj) && (i4 = i(obj)) != null) {
            obj = i4;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i4, int i5, @o0 Class<T> cls) {
        if (!j(cls)) {
            return (T[]) super.getSpans(i4, i5, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i4, i5, a.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
        for (int i6 = 0; i6 < aVarArr.length; i6++) {
            tArr[i6] = aVarArr[i6].f29516b;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public Editable insert(int i4, CharSequence charSequence) {
        super.insert(i4, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i4, int i5, @q0 Class cls) {
        if (cls == null || j(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i4, i5, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(@q0 Object obj) {
        a aVar;
        if (k(obj)) {
            aVar = i(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f29515c.remove(aVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(@q0 Object obj, int i4, int i5, int i6) {
        if (k(obj)) {
            a aVar = new a(obj);
            this.f29515c.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i4, i5, i6);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i4, int i5) {
        return new r(this.f29514b, this, i4, i5);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @o0
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i4, int i5) {
        super.delete(i4, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i4, CharSequence charSequence) {
        super.insert(i4, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @o0
    public Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) throws IOException {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public Editable insert(int i4, CharSequence charSequence, int i5, int i6) {
        super.insert(i4, charSequence, i5, i6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i4, int i5, CharSequence charSequence) {
        e();
        super.replace(i4, i5, charSequence);
        l();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @o0
    public Editable append(char c5) {
        super.append(c5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i4, CharSequence charSequence, int i5, int i6) {
        super.insert(i4, charSequence, i5, i6);
        return this;
    }

    @c1({c1.a.LIBRARY})
    r(@o0 Class<?> cls, @o0 CharSequence charSequence) {
        super(charSequence);
        this.f29515c = new ArrayList();
        w.m(cls, "watcherClass cannot be null");
        this.f29514b = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @o0
    public SpannableStringBuilder append(char c5) {
        super.append(c5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @o0
    public Appendable append(char c5) throws IOException {
        super.append(c5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i4, int i5, CharSequence charSequence, int i6, int i7) {
        e();
        super.replace(i4, i5, charSequence, i6, i7);
        l();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @o0
    public Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i4, int i5) {
        super.append(charSequence, i4, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @o0
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i4, int i5) {
        super.append(charSequence, i4, i5);
        return this;
    }

    @c1({c1.a.LIBRARY})
    r(@o0 Class<?> cls, @o0 CharSequence charSequence, int i4, int i5) {
        super(charSequence, i4, i5);
        this.f29515c = new ArrayList();
        w.m(cls, "watcherClass cannot be null");
        this.f29514b = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @o0
    public Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i4, int i5) throws IOException {
        super.append(charSequence, i4, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i4) {
        super.append(charSequence, obj, i4);
        return this;
    }
}

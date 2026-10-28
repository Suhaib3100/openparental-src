package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.m2;

/* compiled from: TextView.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001av\u0010\r\u001a\u00020\f*\u00020\u00002d\b\u0004\u0010\u000b\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0001H\u0086\bø\u0001\u0000\u001av\u0010\u000f\u001a\u00020\f*\u00020\u00002d\b\u0004\u0010\u000b\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\n0\u0001H\u0086\bø\u0001\u0000\u001a7\u0010\u0012\u001a\u00020\f*\u00020\u00002%\b\u0004\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\n0\u0010H\u0086\bø\u0001\u0000\u001a\u0083\u0002\u0010\u0016\u001a\u00020\f*\u00020\u00002d\b\u0006\u0010\u0013\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00012d\b\u0006\u0010\u0014\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\n0\u00012%\b\u0006\u0010\u0015\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\n0\u0010H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Landroid/widget/TextView;", "Lkotlin/Function4;", "", "Lkotlin/r0;", "name", "text", "", "start", "count", "after", "Lkotlin/m2;", "action", "Landroid/text/TextWatcher;", "d", "before", "e", "Lkotlin/Function1;", "Landroid/text/Editable;", "c", "beforeTextChanged", "onTextChanged", "afterTextChanged", "a", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class b0 {

    /* compiled from: TextView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n"}, d2 = {"", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a extends Lambda implements q3.r<CharSequence, Integer, Integer, Integer, m2> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f5875p = new a();

        public a() {
            super(4);
        }

        @Override // q3.r
        public m2 S(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            num.intValue();
            num2.intValue();
            num3.intValue();
            return m2.f23662a;
        }

        public final void a(@d5.e CharSequence charSequence, int i5, int i6, int i7) {
        }
    }

    /* compiled from: TextView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n"}, d2 = {"", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class b extends Lambda implements q3.r<CharSequence, Integer, Integer, Integer, m2> {

        /* renamed from: p, reason: collision with root package name */
        public static final b f5876p = new b();

        public b() {
            super(4);
        }

        @Override // q3.r
        public m2 S(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            num.intValue();
            num2.intValue();
            num3.intValue();
            return m2.f23662a;
        }

        public final void a(@d5.e CharSequence charSequence, int i5, int i6, int i7) {
        }
    }

    /* compiled from: TextView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/text/Editable;", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class c extends Lambda implements q3.l<Editable, m2> {

        /* renamed from: p, reason: collision with root package name */
        public static final c f5877p = new c();

        public c() {
            super(1);
        }

        @Override // q3.l
        public m2 N(Editable editable) {
            return m2.f23662a;
        }

        public final void a(@d5.e Editable editable) {
        }
    }

    /* compiled from: TextView.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, d2 = {"androidx/core/widget/b0$d", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lkotlin/m2;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class d implements TextWatcher {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.l<Editable, m2> f5878o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.r<CharSequence, Integer, Integer, Integer, m2> f5879p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ q3.r<CharSequence, Integer, Integer, Integer, m2> f5880q;

        /* JADX WARN: Multi-variable type inference failed */
        public d(q3.l<? super Editable, m2> lVar, q3.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, m2> rVar, q3.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, m2> rVar2) {
            this.f5878o = lVar;
            this.f5879p = rVar;
            this.f5880q = rVar2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@d5.e Editable editable) {
            this.f5878o.N(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@d5.e CharSequence charSequence, int i5, int i6, int i7) {
            this.f5879p.S(charSequence, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7));
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@d5.e CharSequence charSequence, int i5, int i6, int i7) {
            this.f5880q.S(charSequence, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7));
        }
    }

    /* compiled from: TextView.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/widget/b0$d", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lkotlin/m2;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class e implements TextWatcher {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.l f5881o;

        public e(q3.l lVar) {
            this.f5881o = lVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@d5.e Editable editable) {
            this.f5881o.N(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@d5.e CharSequence charSequence, int i5, int i6, int i7) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@d5.e CharSequence charSequence, int i5, int i6, int i7) {
        }
    }

    /* compiled from: TextView.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/widget/b0$d", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lkotlin/m2;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class f implements TextWatcher {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.r f5882o;

        public f(q3.r rVar) {
            this.f5882o = rVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@d5.e Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@d5.e CharSequence charSequence, int i5, int i6, int i7) {
            this.f5882o.S(charSequence, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7));
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@d5.e CharSequence charSequence, int i5, int i6, int i7) {
        }
    }

    /* compiled from: TextView.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/widget/b0$d", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lkotlin/m2;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class g implements TextWatcher {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.r f5883o;

        public g(q3.r rVar) {
            this.f5883o = rVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@d5.e Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@d5.e CharSequence charSequence, int i5, int i6, int i7) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@d5.e CharSequence charSequence, int i5, int i6, int i7) {
            this.f5883o.S(charSequence, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7));
        }
    }

    @d5.d
    public static final TextWatcher a(@d5.d TextView textView, @d5.d q3.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, m2> beforeTextChanged, @d5.d q3.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, m2> onTextChanged, @d5.d q3.l<? super Editable, m2> afterTextChanged) {
        l0.p(textView, "<this>");
        l0.p(beforeTextChanged, "beforeTextChanged");
        l0.p(onTextChanged, "onTextChanged");
        l0.p(afterTextChanged, "afterTextChanged");
        d dVar = new d(afterTextChanged, beforeTextChanged, onTextChanged);
        textView.addTextChangedListener(dVar);
        return dVar;
    }

    public static /* synthetic */ TextWatcher b(TextView textView, q3.r beforeTextChanged, q3.r onTextChanged, q3.l afterTextChanged, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            beforeTextChanged = a.f5875p;
        }
        if ((i5 & 2) != 0) {
            onTextChanged = b.f5876p;
        }
        if ((i5 & 4) != 0) {
            afterTextChanged = c.f5877p;
        }
        l0.p(textView, "<this>");
        l0.p(beforeTextChanged, "beforeTextChanged");
        l0.p(onTextChanged, "onTextChanged");
        l0.p(afterTextChanged, "afterTextChanged");
        d dVar = new d(afterTextChanged, beforeTextChanged, onTextChanged);
        textView.addTextChangedListener(dVar);
        return dVar;
    }

    @d5.d
    public static final TextWatcher c(@d5.d TextView textView, @d5.d q3.l<? super Editable, m2> action) {
        l0.p(textView, "<this>");
        l0.p(action, "action");
        e eVar = new e(action);
        textView.addTextChangedListener(eVar);
        return eVar;
    }

    @d5.d
    public static final TextWatcher d(@d5.d TextView textView, @d5.d q3.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, m2> action) {
        l0.p(textView, "<this>");
        l0.p(action, "action");
        f fVar = new f(action);
        textView.addTextChangedListener(fVar);
        return fVar;
    }

    @d5.d
    public static final TextWatcher e(@d5.d TextView textView, @d5.d q3.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, m2> action) {
        l0.p(textView, "<this>");
        l0.p(action, "action");
        g gVar = new g(action);
        textView.addTextChangedListener(gVar);
        return gVar;
    }
}

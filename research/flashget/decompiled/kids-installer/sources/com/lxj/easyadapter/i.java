package com.lxj.easyadapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: ViewHolder.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\u0007J\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/lxj/easyadapter/i;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "T", "", "viewId", "S", "(I)Landroid/view/View;", "", "text", "V", "resId", "U", "I", "Landroid/view/View;", "R", "()Landroid/view/View;", "convertView", "Landroid/util/SparseArray;", "J", "Landroid/util/SparseArray;", "mViews", "<init>", "(Landroid/view/View;)V", "K", "a", "easy-adapter_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class i extends RecyclerView.d0 {

    /* renamed from: K, reason: from kotlin metadata */
    @d5.d
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: I, reason: from kotlin metadata */
    @d5.d
    private final View convertView;

    /* renamed from: J, reason: from kotlin metadata */
    @d5.d
    private final SparseArray<View> mViews;

    /* compiled from: ViewHolder.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u000f"}, d2 = {"Lcom/lxj/easyadapter/i$a;", "", "Landroid/view/View;", "itemView", "Lcom/lxj/easyadapter/i;", "b", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "parent", "", "layoutId", "a", "<init>", "()V", "easy-adapter_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.lxj.easyadapter.i$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @d5.d
        public final i a(@d5.d Context context, @d5.d ViewGroup parent, int layoutId) {
            l0.p(context, ProtectedSandApp.s("㓱"));
            l0.p(parent, ProtectedSandApp.s("㓲"));
            View inflate = LayoutInflater.from(context).inflate(layoutId, parent, false);
            l0.o(inflate, ProtectedSandApp.s("㓳"));
            return new i(inflate);
        }

        @d5.d
        public final i b(@d5.d View itemView) {
            l0.p(itemView, ProtectedSandApp.s("㓴"));
            return new i(itemView);
        }

        public Companion(w wVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@d5.d View view) {
        super(view);
        l0.p(view, ProtectedSandApp.s("㓵"));
        this.convertView = view;
        this.mViews = new SparseArray<>();
    }

    @d5.d
    /* renamed from: R, reason: from getter */
    public final View getConvertView() {
        return this.convertView;
    }

    @d5.d
    public final <T extends View> T S(int viewId) {
        T t5 = (T) this.mViews.get(viewId);
        if (t5 == null) {
            t5 = (T) this.convertView.findViewById(viewId);
            this.mViews.put(viewId, t5);
        }
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(ProtectedSandApp.s("㓶"));
    }

    @d5.e
    public final <T extends View> T T(int viewId) {
        T t5 = (T) this.mViews.get(viewId);
        if (t5 == null) {
            t5 = (T) this.convertView.findViewById(viewId);
            this.mViews.put(viewId, t5);
        }
        if (t5 instanceof View) {
            return t5;
        }
        return null;
    }

    @d5.d
    public final i U(int viewId, int resId) {
        ImageView imageView = (ImageView) S(viewId);
        if (imageView != null) {
            imageView.setImageResource(resId);
        }
        return this;
    }

    @d5.d
    public final i V(int viewId, @d5.d CharSequence text) {
        l0.p(text, ProtectedSandApp.s("㓷"));
        TextView textView = (TextView) S(viewId);
        if (textView != null) {
            textView.setText(text);
        }
        return this;
    }
}
